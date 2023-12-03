package com.ssIndiaPayAuthentication.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "MERCHANT_INFO")
@Entity
public class MerchantInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false)
    private long id;
    @Column(name = "ENCRYPTED_ID" )
    private String encryptedId;
    @Column(name = "FIRST_NAME")
    private String firstName;
    @Column(name = "LAST_NAME")
    private String lastName;
    @Column(name = "EMAIL")
    private String email;
    @Column(name = "PHONE_NUMBER")
    private String phoneNumber;
    @Column(name = "ADDRESS")
    private String address;
    @Column(name = "FALSE_ATTEMPTED")
    private Integer falseAttempted;
    @Column(name = "IS_ACTIVE")
    private boolean isActive;
    @Column(name = "CREATED_DATE")
    private LocalDateTime createdDate;
    @Column(name = "CREATED_BY")
    private Integer createdBy;
    @Column(name = "MODIFIED-DATE")
    private LocalDateTime modifiedDate;
    @Column(name = "MODIFIED_BY" )
    private Integer modifiedBy;


}
