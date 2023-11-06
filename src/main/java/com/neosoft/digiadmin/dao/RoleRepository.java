package com.neosoft.digiadmin.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.neosoft.digiadmin.entity.RoleDetails;

public interface RoleRepository extends JpaRepository<RoleDetails, Long> {

}
