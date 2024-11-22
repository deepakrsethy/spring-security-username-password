package com.deepak.spring_security_username_password.repository;

import com.deepak.spring_security_username_password.domain.DBUserDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface DBUserDetailsRepository extends JpaRepository<DBUserDetails, UUID> {
    DBUserDetails findByUserName(String username);
}
