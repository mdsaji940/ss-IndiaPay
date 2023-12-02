package com.ssIndiaPayAuthentication.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.persistence.*;
import java.util.Date;

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
    @Column(name = "FALSE_ATTEMPTED", nullable = false, unique = true)
    private Integer falseAttempted;
    @Column(name = "IS_ACTIVE", nullable = false, unique = true)
    private boolean isActive;
    @Column(name = "CREATED_DATE", nullable = false, unique = true)
    private Date createdDate;
    @Column(name = "CREATED_BY", nullable = false, unique = true)
    private Integer createdBy;
    @Column(name = "MODIFIED-DATE", nullable = false, unique = true)
    private Date modifiedDate;
    @Column(name = "MODIFIED_BY", nullable = false, unique = true)
    private Integer modifiedBy;
}
