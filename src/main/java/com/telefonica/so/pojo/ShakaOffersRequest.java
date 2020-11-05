package com.telefonica.so.pojo;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
*
* @Author: Jose Plaza Hoyos
* @Datecreation: October 2020
* @FileName: ShakaOffersRequest.java
* @AuthorCompany: Telefonica
* @version: 0.1
* @Description: Pojo del objeto ShakaOffersRequest. 
*/
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ShakaOffersRequest {
	
    private String type;
    private String correlationId;
    private String name;
    private Boolean isBundle;
    private String lifeCycleStatus;
    private String categoryId;
    private String categoryName;
    private String subcategoryId;
    private String subcategoryName;
    private String channelId;
    private String channelName;
    private String productSpecificationId;
    private String productSpecificationName;
    private String frameworkAgreeementId;
    private String customerId;
    private String accountId;
    private String productType;
    private String productId;
    private String productPublicId;
    private OffsetDateTime startDate;
    private OffsetDateTime endDate;
    private String limit;
    private String offset;
    private String productOfferingPricePriceUnits;
    private OffsetDateTime productOfferingPriceCurrencyChangeDate;
    private OffsetDateTime productOfferingPriceStartPriceDate;
    private OffsetDateTime productOfferingPriceEndPriceDate;
    private String productOfferingPricePriceConsumerEntityType;
    private String productOfferingPricePriceConsumerId;
    private String productOfferingPricePriceLocation;
    private BigDecimal productOfferingPriceStartPriceAmout;
    private BigDecimal productOfferingPriceEndPriceAmout;
    private String fields;
    private Integer creditScore;
    private BigDecimal creditLimit;
    private String siteId;
    private String region;
    private String stateOrProvince;
    private String customerSegment;
    private String customerSubsegment;
    private Boolean isPortability;
    private String portabilityCurrentPlanType;
    private LocalDate portabilityCustomerSince;
    private String portabilityCurrentCompany;
    private String dealerId;
    private Integer broadbandMinDlDataRate;
    private Integer broadbandMaxDlDataRate;
    private String broadbandConnection;
    private Boolean isRetention;
    private String productOfferingCatalogId;
    private String currentOffering;
    private Boolean isUpgrade;
    private String action;
    private String commercialAreaId;
    private String productOrderId;
    private String planId;
    private String product;
    private String sourceType;
    private String networkTechnology;
    private String serviceabilityMaxSpeed;
    private String serviceabilityId;
    private String planGroup;
    private String planRankInitial;
    private String planRank;
    private String planCommitmentDuration;
    private String invoiceCompany;
    private String orderSubType;
    private String subscriberGroupValue;
    private String excludeOffersId;
    private String installationAddressDepartment;
    private String nationalID;
    private String nationalIDType;
    private Integer paginationInfoSize;
    private Integer paginationInfoPageCount;
    private Integer paginationInfoPage;
    private Integer paginationInfoMaxResultCount;
    private String sortCriteriaName;
    private Boolean sortCriteriaAscending;

}
