package com.ganesh.rentcloud.authorization.server.repository;

import javax.jws.soap.SOAPBinding;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ganesh.rentcloud.authorization.server.model.User;

import java.util.Optional;

public interface UserDetailRepository extends JpaRepository<User,Integer> {


    Optional<User> findByUsername(String name);

}
