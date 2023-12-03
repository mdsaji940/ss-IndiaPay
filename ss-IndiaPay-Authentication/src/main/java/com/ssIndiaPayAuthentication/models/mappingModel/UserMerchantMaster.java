package com.ssIndiaPayAuthentication.models.mappingModel;

import com.ssIndiaPayAuthentication.models.MerchantInfo;
import com.ssIndiaPayAuthentication.models.UserMaster;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "USER_MERCHANT_MASTER")
public class UserMerchantMaster {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private long id;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "USER_ID")
    private UserMaster userMaster;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "MERCHANT_ID")
    private MerchantInfo merchantInfo;
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
