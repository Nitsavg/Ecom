package com.ecom.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecom.models.AdminUser;

@Repository
public interface AdminRepository extends JpaRepository<AdminUser, String>{

}
