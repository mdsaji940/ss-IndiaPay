package com.ssIndiaPayAuthentication.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "USER_MASTER")
public class UserMaster {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false, unique = true)
    private long id;
    @Column(name = "USER_ID", nullable = false, unique = true, updatable = false)
    private String userId;
    @Column(name = "USERNAME", nullable = false, unique = true)
    private String username;
    @Column(name = "PASSWORD", nullable = false, unique = true)
    private String password;
    @Column(name = "EMAIL", nullable = false, unique = true)
    private String email;
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
