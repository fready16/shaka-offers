package com.telefonica.so.pojo;

import java.time.LocalDate;

import lombok.Data;

/**
*
* @Author: Jose Plaza Hoyos
* @Datecreation: October 2020
* @FileName: Portability.java
* @AuthorCompany: Telefonica
* @version: 0.1
* @Description: Pojo del objeto Portability. 
*/
@Data
public class Portability {
	
    private String currentPlanType;
    private LocalDate customerSince;
    private String currentCompany;

}
