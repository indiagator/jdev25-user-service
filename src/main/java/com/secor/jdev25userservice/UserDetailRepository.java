package com.secor.jdev25userservice;

import com.secor.jdev25userservice.UserDetail;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface UserDetailRepository extends MongoRepository<UserDetail, String> {
    List<UserDetail> findByFirstName(String firstName);
}
