package com.basicsecurity.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.basicsecurity.model.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Integer> {

}
