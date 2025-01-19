package com.secor.jdev25userservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1")
public class MainRestController {


    @Autowired
    UserDetailRepository userDetailRepository;

    @PostMapping("update/user/details")
    public ResponseEntity<UserDetail> updateUserDetails(@RequestBody UserDetail userDetail)
    {
        userDetailRepository.save(userDetail);
        return ResponseEntity.ok(userDetail);
    }

    @GetMapping("get/user/details")
    public ResponseEntity<UserDetail> getUserDetails(@RequestHeader String username)
    {
        if(!userDetailRepository.existsById(username))
        {
            return ResponseEntity.notFound().build();
        }

        UserDetail userDetail = userDetailRepository.findById(username).get();
        return ResponseEntity.ok(userDetail);
    }


}
