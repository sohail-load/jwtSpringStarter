package com.mystarter.StarterSpring.service;

import com.mystarter.StarterSpring.dao.RoleDao;
import com.mystarter.StarterSpring.model.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleService {

    @Autowired
    private RoleDao roleDao;

    public Role createNewRole(Role role) {
        return roleDao.save(role);
    }
}
