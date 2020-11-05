package com.telefonica.so.pojo;

import lombok.Data;

/**
*
* @Author: Jose Plaza Hoyos
* @Datecreation: October 2020
* @FileName: BillingAccount.java
* @AuthorCompany: Telefonica
* @version: 0.1
* @Description: Pojo del objeto BillingAccount. 
*/
@Data
public class BillingAccount {

    private String id;
    private String href;
    private String name;
    private String billingMethod;
    
}
