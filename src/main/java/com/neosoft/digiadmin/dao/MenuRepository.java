package com.neosoft.digiadmin.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.neosoft.digiadmin.entity.MenuDetails;

@Repository
public interface MenuRepository extends JpaRepository<MenuDetails, Long> {
	
	@Query(value="select * from menu where status =:status",nativeQuery = true)
	public Optional<List<MenuDetails>> getMenuDataByStatus(@Param("status") int status);
	
	

}
