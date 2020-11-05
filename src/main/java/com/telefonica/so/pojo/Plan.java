package com.telefonica.so.pojo;

import lombok.Data;

/**
*
* @Author: Jose Plaza Hoyos
* @Datecreation: October 2020
* @FileName: Plan.java
* @AuthorCompany: Telefonica
* @version: 0.1
* @Description: Pojo del objeto Plan. 
*/
@Data
public class Plan {
	
    private String id;
    private String group;
    private String rankInitial;
    private String rank;
    private String commitmentDuration;

}
