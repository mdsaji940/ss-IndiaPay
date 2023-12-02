package com.ssIndiaPayAuthentication.models.mappingModel;

import com.ssIndiaPayAuthentication.models.RoleMaster;
import com.ssIndiaPayAuthentication.models.UserMaster;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.persistence.*;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "USER_ROLE_MASTER")
public class UserRoleMaster {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "USER_ID")
    private UserMaster userMaster;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "ROLE_ID")
    private RoleMaster roleMaster;
    @Column(name = "IS_ACTIVE")
    private boolean isActive;
    @Column(name = "CREATED_DATE")
    private Date createdDate;
    @Column(name = "CREATED_BY")
    private Integer createdBy;
    @Column(name = "MODIFIED-DATE")
    private Date modifiedDate;
    @Column(name = "MODIFIED_BY")
    private Integer modifiedBy;

}
