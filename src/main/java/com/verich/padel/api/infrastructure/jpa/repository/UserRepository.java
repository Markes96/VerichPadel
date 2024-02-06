package com.verich.padel.api.infrastructure.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.verich.padel.api.infrastructure.jpa.entity.UserEntity;

@Repository
public interface UserRepository
    extends JpaRepository<UserEntity, String> {}
