package com.ssIndiaPayAuthentication.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "ROLE_MASTER")
public class RoleMaster {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false, unique = true)
    private long id;
    @Column(name = "ROLE_ID", nullable = false, unique = true)
    private long roleId;
    @Column(name = "ROLE_NAME", nullable = false, unique = true)
    private String roleName;
    @Column(name = "IS_ACTIVE")
    private boolean isActive;
    @Column(name = "CREATED_DATE")
    private LocalDateTime createdDate;
    @Column(name = "CREATED_BY")
    private Integer createdBy;
    @Column(name = "MODIFIED-DATE")
    private LocalDateTime modifiedDate;
    @Column(name = "MODIFIED_BY")
    private Integer modifiedBy;
}
