package com.shib.batch.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Data
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="user_id")
    private Integer uaserId;

    @Column(name="first_name")
    private String firstName;

    @Column(name="last_name")
    private String lastName;

//    @Column(name="dob")
//    private Date dob;

    @Column(name="email_id")
    private String emailId;

    @Column(name="mobile_number")
    private String mobileNumber;

    @Column(name="country")
    private String country;

    @Column(name="state")
    private String state;

    @Column(name="city")
    private String city;

    @Column(name="address")
    private String address;

    @Column(name="postal_code")
    private String postalCode;

}
