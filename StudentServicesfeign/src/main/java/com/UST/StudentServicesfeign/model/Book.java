package com.UST.StudentServicesfeign.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book {
    private Integer booId;
    private  String bookName;
    private Double bookCost;
}
