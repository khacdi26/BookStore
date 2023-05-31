package com.example.TruongKhacDi_BookStore.services;

import com.example.TruongKhacDi_BookStore.entity.User;
import com.example.TruongKhacDi_BookStore.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private IUserRepository userRepository;
    public void  save(User user){
        userRepository.save(user);
    }
}
