package com.telefonica.so.enums;

public enum RequestParamsEnum {
	
    type("type"),
    correlationId("correlationId"),
    name("name"),
    isBundle("isBundle"),
    lifeCycleStatus("lifeCycleStatus"),
    categoryId("categoryId"),
    categoryName("categoryName"),
    subcategoryId("subcategoryId"),
    subcategoryName("subcategoryName"),
    channelId("channelId"),
    channelName("channelName"),
    productSpecificationId("productSpecificationId"),
    productSpecificationName("productSpecificationName"),
    frameworkAgreeementId("frameworkAgreeementId"),
    customerId("customerId"),
    accountId("accountId"),
    productType("productType"),
    productId("productId"),
    productPublicId("productPublicId"),
    startDate("startDate"),
    endDate("endDate"),
    limit("limit"),
    offset("offset"),
    productOfferingPricePriceUnits("productOfferingPricePriceUnits"),
    productOfferingPriceCurrencyChangeDate("productOfferingPriceCurrencyChangeDate"),
    productOfferingPriceStartPriceDate("productOfferingPriceStartPriceDate"),
    productOfferingPriceEndPriceDate("productOfferingPriceEndPriceDate"),
    productOfferingPricePriceConsumerEntityType("productOfferingPricePriceConsumerEntityType"),
    productOfferingPricePriceConsumerId("productOfferingPricePriceConsumerId"),
    productOfferingPricePriceLocation("productOfferingPricePriceLocation"),
    productOfferingPriceStartPriceAmout("productOfferingPriceStartPriceAmout"),
    productOfferingPriceEndPriceAmout("productOfferingPriceEndPriceAmout"),
    fields("fields"),
    creditScore("creditScore"),
    creditLimit("creditLimit"),
    siteId("siteId"),
    region("region"),
    stateOrProvince("stateOrProvince"),
    customerSegment("customerSegment"),
    customerSubsegment("customerSubsegment"),
    isPortability("isPortability"),
    portabilityCurrentPlanType("portabilityCurrentPlanType"),
    portabilityCustomerSince("portabilityCustomerSince"),
    portabilityCurrentCompany("portabilityCurrentCompany"),
    dealerId("dealerId"),
    broadbandMinDlDataRate("broadbandMinDlDataRate"),
    broadbandMaxDlDataRate("broadbandMaxDlDataRate"),
    broadbandConnection("broadbandConnection"),
    isRetention("isRetention"),
    productOfferingCatalogId("productOfferingCatalogId"),
    currentOffering("currentOffering"),
    isUpgrade("isUpgrade"),
    action("action"),
    commercialAreaId("commercialAreaId"),
    productOrderId("productOrderId"),
    planId("planId"),
    product("product"),
    sourceType("sourceType"),
    networkTechnology("networkTechnology"),
    serviceabilityMaxSpeed("serviceabilityMaxSpeed"),
    serviceabilityId("serviceabilityId"),
    planGroup("planGroup"),
    planRankInitial("planRankInitial"),
    planRank("planRank"),
    planCommitmentDuration("planCommitmentDuration"),
    invoiceCompany("invoiceCompany"),
    orderSubType("orderSubType"),
    subscriberGroupValue("subscriberGroupValue"),
    excludeOffersId("excludeOffersId"),
    installationAddressDepartment("installationAddressDepartment"),
    nationalID("nationalID"),
    nationalIDType("nationalIDType"),
    paginationInfoSize("paginationInfoSize"),
    paginationInfoPageCount("paginationInfoPageCount"),
    paginationInfoPage("paginationInfoPage"),
    paginationInfoMaxResultCount("paginationInfoMaxResultCount"),
    sortCriteriaName("sortCriteriaName"),
    sortCriteriaAscending("sortCriteriaAscending");

	private String value;

	private RequestParamsEnum(String value) {
		this.value = value;
	}

	public static String getValue(String text) {
		for (RequestParamsEnum b : RequestParamsEnum.values()) {
			if (String.valueOf(b).equals(text)) {
				return b.value;
			}
		}
		return null;
	}
}
