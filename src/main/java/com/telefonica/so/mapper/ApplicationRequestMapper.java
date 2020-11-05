package com.telefonica.so.mapper;

import java.math.BigDecimal;
import org.springframework.stereotype.Service;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import com.telefonica.so.pojo.ShakaOffersRequest;

/**
 *
 * @Author: Jose Plaza Hoyos
 * @Datecreation: October 2020
 * @FileName: ApplicationRequestMapper.java
 * @AuthorCompany: Telefonica
 * @version: 0.1
 * @Description: Clase Service para generar objeto del request.
 * 
 */
@Service
public class ApplicationRequestMapper {

    public ShakaOffersRequest fromParamstoBody(String type, String correlationId, String name, Boolean isBundle, String lifeCycleStatus,
	    String categoryId, String categoryName, String subcategoryId, String subcategoryName, String channelId, String channelName,
	    String productSpecificationId, String productSpecificationName, String frameworkAgreeementId, String customerId,
	    String accountId, String productType, String productId, String productPublicId, OffsetDateTime startDate,
	    OffsetDateTime endDate, String limit, String offset, String productOfferingPricePriceUnits,
	    OffsetDateTime productOfferingPriceCurrencyChangeDate, OffsetDateTime productOfferingPriceStartPriceDate,
	    OffsetDateTime productOfferingPriceEndPriceDate, String productOfferingPricePriceConsumerEntityType,
	    String productOfferingPricePriceConsumerId, String productOfferingPricePriceLocation,
	    BigDecimal productOfferingPriceStartPriceAmout, BigDecimal productOfferingPriceEndPriceAmout, String fields,
	    Integer creditScore, BigDecimal creditLimit, String siteId, String region, String stateOrProvince, String customerSegment,
	    String customerSubsegment, Boolean isPortability, String portabilityCurrentPlanType, LocalDate portabilityCustomerSince,
	    String portabilityCurrentCompany, String dealerId, Integer broadbandMinDlDataRate, Integer broadbandMaxDlDataRate,
	    String broadbandConnection, Boolean isRetention, String productOfferingCatalogId, String currentOffering, Boolean isUpgrade,
	    String action, String commercialAreaId, String productOrderId, String planId, String product, String sourceType,
	    String networkTechnology, String serviceabilityMaxSpeed, String serviceabilityId, String planGroup, String planRankInitial,
	    String planRank, String planCommitmentDuration, String invoiceCompany, String orderSubType, String subscriberGroupValue,
	    String excludeOffersId, String installationAddressDepartment, String nationalID, String nationalIDType,
	    Integer paginationInfoSize, Integer paginationInfoPageCount, Integer paginationInfoPage, Integer paginationInfoMaxResultCount,
	    String sortCriteriaName, Boolean sortCriteriaAscending) {

	return ShakaOffersRequest.builder()
		.type(type)
		.correlationId(correlationId)
		.name(name)
		.isBundle(isBundle)
		.lifeCycleStatus(lifeCycleStatus)
		.categoryId(categoryId)
		.categoryName(categoryName)
		.subcategoryId(subcategoryId)
		.subcategoryName(subcategoryName)
		.channelId(channelId)
		.channelName(channelName)
		.productSpecificationId(productSpecificationId)
		.productSpecificationName(productSpecificationName)
		.frameworkAgreeementId(frameworkAgreeementId)
		.customerId(customerId).accountId(accountId)
		.productType(productType)
		.productId(productId)
		.productPublicId(productPublicId)
		.startDate(startDate)
		.endDate(endDate)
		.limit(limit)
		.offset(offset)
		.productOfferingPricePriceUnits(productOfferingPricePriceUnits)
		.productOfferingPriceCurrencyChangeDate(productOfferingPriceCurrencyChangeDate)
		.productOfferingPriceStartPriceDate(productOfferingPriceStartPriceDate)
		.productOfferingPriceEndPriceDate(productOfferingPriceEndPriceDate)
		.productOfferingPricePriceConsumerEntityType(productOfferingPricePriceConsumerEntityType)
		.productOfferingPricePriceConsumerId(productOfferingPricePriceConsumerId)
		.productOfferingPricePriceLocation(productOfferingPricePriceLocation)
		.productOfferingPriceStartPriceAmout(productOfferingPriceStartPriceAmout)
		.productOfferingPriceEndPriceAmout(productOfferingPriceEndPriceAmout)
		.fields(fields)
		.creditScore(creditScore)
		.creditLimit(creditLimit)
		.siteId(siteId)
		.region(region)
		.stateOrProvince(stateOrProvince)
		.customerSegment(customerSegment)
		.customerSubsegment(customerSubsegment)
		.isPortability(isPortability)
		.portabilityCurrentPlanType(portabilityCurrentPlanType)
		.portabilityCustomerSince(portabilityCustomerSince)
		.portabilityCurrentCompany(portabilityCurrentCompany)
		.dealerId(dealerId)
		.broadbandMinDlDataRate(broadbandMinDlDataRate)
		.broadbandMaxDlDataRate(broadbandMaxDlDataRate)
		.broadbandConnection(broadbandConnection)
		.isRetention(isRetention)
		.productOfferingCatalogId(productOfferingCatalogId)
		.currentOffering(currentOffering)
		.isUpgrade(isUpgrade)
		.action(action)
		.commercialAreaId(commercialAreaId)
		.productOrderId(productOrderId)
		.planId(planId).sourceType(sourceType)
		.networkTechnology(networkTechnology)
		.serviceabilityMaxSpeed(serviceabilityMaxSpeed)
		.serviceabilityId(serviceabilityId)
		.product(product)
		.planGroup(planGroup)
		.planRankInitial(planRankInitial)
		.planRank(planRank)
		.planCommitmentDuration(planCommitmentDuration)
		.invoiceCompany(invoiceCompany)
		.orderSubType(orderSubType)
		.subscriberGroupValue(subscriberGroupValue)
		.excludeOffersId(excludeOffersId)
		.installationAddressDepartment(installationAddressDepartment)
		.nationalID(nationalID)
		.nationalIDType(nationalIDType)
		.paginationInfoSize(paginationInfoSize)
		.paginationInfoPageCount(paginationInfoPageCount)
		.paginationInfoPage(paginationInfoPage)
		.paginationInfoMaxResultCount(paginationInfoMaxResultCount)
		.sortCriteriaName(sortCriteriaName)
		.sortCriteriaAscending(sortCriteriaAscending)
		.build();
    }

}
