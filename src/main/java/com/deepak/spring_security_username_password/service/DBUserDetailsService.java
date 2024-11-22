package com.deepak.spring_security_username_password.service;

import com.deepak.spring_security_username_password.domain.DBUserDetails;
import com.deepak.spring_security_username_password.repository.DBUserDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DBUserDetailsService implements UserDetailsService {

    @Autowired
    private DBUserDetailsRepository DBUserDetailsRepository;

    public List<DBUserDetails> getAllUsers() {
        return DBUserDetailsRepository.findAll();
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return createUserDetailsFromDbUserDetails(username);
    }

    private UserDetails createUserDetailsFromDbUserDetails(String username) {
        DBUserDetails dbUserDetails = DBUserDetailsRepository.findByUserName(username);
        UserDetails userDetails = User.builder()
                .username(username)
                .password(dbUserDetails.getPassword())
                .roles(dbUserDetails.getUserRole())
                .build();
        return userDetails;
    }
}
