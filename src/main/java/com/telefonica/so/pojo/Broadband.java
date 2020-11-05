package com.telefonica.so.pojo;

import lombok.Data;

/**
*
* @Author: Jose Plaza Hoyos
* @Datecreation: October 2020
* @FileName: Broadband.java
* @AuthorCompany: Telefonica
* @version: 0.1
* @Description: Pojo del objeto Broadband. 
*/
@Data
public class Broadband {
	
    private Integer minDlDataRate;
    private Integer maxDlDataRate;
    private String connection;

}
