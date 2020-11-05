package com.telefonica.so.service;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.telefonica.so.commons.Constants;
import com.telefonica.so.commons.WsProperties;
import com.telefonica.so.generated.model.ResponseType;
import com.telefonica.so.pojo.ShakaOffersRequest;
import com.telefonica.so.proxy.OffersConnection;


/**
 * 
 * @Author: Jose Plaza Hoyos.
 * @Datecreation: October 2020
 * @FileName: SuggestedOfferFiService.java
 * @AuthorCompany: Telefónica
 * @version: 0.1
 * @Description: Representa los metodos de para obtener las ofertas sugeridas
 *               fijas
 */
@Service
public class ShakaOfferService {

    @Autowired
    OffersConnection oConnection;
    @Autowired
    WsProperties properties;
    
    /**
     * Devuelve y establece los datos en el response.
     * 
     * @param request
     * @return
     * @throws NotFoundException 
     * @throws Exception 
     */
    public ResponseType getOffer(ShakaOffersRequest request) {

	ResponseType response = new ResponseType();
	String testCase = getValueFromProductType(request.getProductType());
	
	if (StringUtils.equals(request.getType(), Constants.ELEGIBLES)) {
	    switch (testCase) {
	    case Constants.MOBILE:
		return oConnection.callRestService(request, properties.getUrlElegibleMo());
	    case Constants.LANDLINE:
		return oConnection.callRestService(request, properties.getUrlElegibleFi());
	    case Constants.MT:
		return oConnection.callRestService(request, properties.getUrlElegibleMt());
	    default:
		break;
	    }
	} else if (StringUtils.equals(request.getType(), Constants.SUGERIDAS)) {
	    switch (testCase) {
	    case Constants.MOBILE:
		return oConnection.callRestService(request, properties.getUrlSuggestedMo());
	    case Constants.LANDLINE:
		return oConnection.callRestService(request, properties.getUrlSuggestedFi());
	    case Constants.MT:
		return oConnection.callRestService(request, properties.getUrlSuggestedMt());
	    default:
		break;
	    }
	}
	return response;
    }

    
    public String getValueFromProductType(String productType) {
	if (StringUtils.contains(productType, Constants.SVA) &&
		StringUtils.contains(productType, Constants.LANDLINE)) {
	    return Constants.LANDLINE;
	}
	
	if (StringUtils.contains(productType, Constants.SVA) &&
		StringUtils.contains(productType, Constants.MOBILE)) {
	    return Constants.MOBILE;
	}
	
	if (StringUtils.contains(productType, Constants.LANDLINE)) {
	    return Constants.LANDLINE;
	}
	return productType;
    }

}
