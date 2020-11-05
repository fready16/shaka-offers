package com.telefonica.so.proxy;

import java.net.URI;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.telefonica.so.enums.RequestParamsEnum;
import com.telefonica.so.generated.model.OfferingType;
import com.telefonica.so.generated.model.ResponseType;
import com.telefonica.so.pojo.ShakaOffersRequest;


@Service
public class OffersConnection {

    @Autowired
    private RestTemplate restTemplate;

    public ResponseType callRestService(ShakaOffersRequest sor, String service) {	
	 return restTemplate.exchange
		(this.getURI(sor, service), HttpMethod.GET, null,new ParameterizedTypeReference<ResponseType>() {
		}).getBody();

    }

    private URI getURI(ShakaOffersRequest sor, String service) {
	UriComponentsBuilder builder = UriComponentsBuilder.fromUriString(service);
	this.addQueryParams(sor, builder);
	return builder.build().encode().toUri();
    }

    private void addQueryParams(ShakaOffersRequest sor, UriComponentsBuilder builder) {

	ObjectMapper mapper = new ObjectMapper();
	Map<String, Object> map = mapper.convertValue(sor, new TypeReference<Map<String, Object>>() {
	});
	map.values().removeIf(Objects::isNull);
	map.entrySet().forEach(entry -> builder.queryParam
		(RequestParamsEnum.getValue(entry.getKey()), entry.getValue()));
    }
}
