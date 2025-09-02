/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.vvm.services;

import com.vvm.pojo.User;
import org.springframework.security.core.userdetails.UserDetailsService;

/**
 *
 * @author BRAVO15
 */
public interface UserServives extends UserDetailsService{
    User getUserByUsername(String username);
}
