package com.gt.proyect.RegistroGT.service;

import com.gt.proyect.RegistroGT.model.Usuario;
import com.gt.proyect.RegistroGT.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl extends GenericServiceImpl<Usuario, Integer> implements UserService{

    @Autowired
    private UserRepository userRepository;

    @Override
    public CrudRepository<Usuario, Integer> getDao() {
        return userRepository;
    }
}
