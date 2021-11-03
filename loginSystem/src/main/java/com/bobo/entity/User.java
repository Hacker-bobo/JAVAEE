package com.bobo.entity;

import lombok.Data;

@Data
public class User {

    private Integer id;
    private String name;
    private String pwd;
//    private Integer card_id;
    private Card card;
}
