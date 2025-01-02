package com.pro.oauth2.service;

import com.pro.oauth2.dto.UserSignUpDto;
import com.pro.oauth2.entity.User;
import com.pro.oauth2.repository.UserRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@Transactional
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    public void SignUp(UserSignUpDto userSignUpDto){
        if(userRepository.findByEmail(userSignUpDto.getEmail()).isPresent()){
            // 이미 존재하는 이메일 입니다
        }

        User user = User.builder()
                .email(userSignUpDto.getEmail())
                .password(userSignUpDto.getPassword())
                .name(userSignUpDto.getName()).build();

        user.passwordEncode(passwordEncoder);
        userRepository.save(user);
    }
}