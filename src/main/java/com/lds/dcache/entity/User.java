package com.lds.dcache.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

@Data
@AllArgsConstructor
public class User implements Serializable {

    private static final long serialVersionUID = -1L;

    private String userName;
    private String password;
    private String address;
    private int age;
}
