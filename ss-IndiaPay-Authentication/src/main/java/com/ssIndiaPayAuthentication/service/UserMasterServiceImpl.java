package com.ssIndiaPayAuthentication.service;

import com.ssIndiaPayAuthentication.models.RoleMaster;
import com.ssIndiaPayAuthentication.models.UserMaster;
import com.ssIndiaPayAuthentication.models.mappingModel.UserRoleMaster;
import com.ssIndiaPayAuthentication.repository.RoleMasterRepository;
import com.ssIndiaPayAuthentication.repository.UserMasterRepository;
import com.ssIndiaPayAuthentication.repository.UserRoleMasterRepository;
import com.ssIndiaPayAuthentication.service.impl.UserMasterService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@AllArgsConstructor
public class UserMasterServiceImpl implements UserMasterService {
    private final UserMasterRepository userMasterRepo;
    private final UserRoleMasterRepository userRoleMasterRepo;
    private final RoleMasterRepository roleMasterRepo;

    @Override
    public Long insertUser(UserMaster userMaster){
        try{
            LocalDateTime curDate = LocalDateTime.now();
            userMaster.setFalseAttempted(0);
            userMaster.setCreatedDate(curDate);
            userMaster.setCreatedBy(0);
            userMaster.setModifiedDate(curDate);
            userMaster.setModifiedBy(0);

            // get RollMaster of Admin
            RoleMaster roleMaster = roleMasterRepo.findById(1l).get();

            UserRoleMaster urm = new UserRoleMaster();
            urm.setUserMaster(userMaster);
            urm.setRoleMaster(roleMaster);
            urm.setCreatedDate(curDate);
            urm.setCreatedBy(0);
            urm.setModifiedDate(curDate);
            urm.setModifiedBy(0);

            UserMaster user = userMasterRepo.save(userMaster);
            userRoleMasterRepo.save(urm);
            return user.getId();
        }catch (Exception ex){
            ex.getLocalizedMessage();
            return 0l;
        }
    }
}
