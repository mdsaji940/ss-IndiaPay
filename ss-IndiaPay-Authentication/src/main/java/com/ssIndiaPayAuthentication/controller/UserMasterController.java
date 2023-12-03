package com.ssIndiaPayAuthentication.controller;

import com.ssIndiaPayAuthentication.models.UserMaster;
import com.ssIndiaPayAuthentication.service.impl.UserMasterService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class UserMasterController {
    private static final Logger log = LoggerFactory.getLogger(UserMasterController.class);
    private final UserMasterService userMasterService;

    @PostMapping("/insertUser")
    public ResponseEntity<String> insertUser(@RequestBody UserMaster userMaster, HttpServletRequest request, HttpSession session){
        String message = "";
        try{
            String curUser = request.getRemoteUser();
            String ipAddress = request.getRemoteAddr();

            log.info("user called by curUser : "+curUser+ " and ipAddress : "+ipAddress );
            Long result = userMasterService.insertUser(userMaster);
            if (result != null){
                message = "User Signup successfully";
                return new ResponseEntity<>(message,HttpStatus.CREATED) ;
            }
            message = "Unable to signup..";
            log.info("Unable to signup..");
            return new ResponseEntity<>(message,HttpStatus.BAD_REQUEST) ;

        }catch (Exception e){
            log.error(e.getLocalizedMessage());
            return new ResponseEntity<>(e.getLocalizedMessage(), HttpStatus.BAD_REQUEST);
        }
    }
}
