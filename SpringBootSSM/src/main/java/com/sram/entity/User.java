package com.sram.entity;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

@Data
@ToString
public class User implements Serializable {
    private Integer id;
    private String userName;
    private String passWord;
    private String school;
    private String phone;
}
