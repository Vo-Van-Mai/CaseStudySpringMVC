/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.vvm.repositories;

import com.vvm.pojo.User;

/**
 *
 * @author BRAVO15
 */
public interface UserRepository{
    User getUserByUsername(String username);
}
