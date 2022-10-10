package com.mystarter.StarterSpring.dao;

import com.mystarter.StarterSpring.model.Role;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleDao extends CrudRepository<Role, String> {

}
