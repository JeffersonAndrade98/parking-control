package com.api.parkingcontrol.repository;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.parkingcontrol.model.UserModel;

@Repository
public interface UserRepository extends JpaRepository<UserModel, UUID> {

	Optional<UserModel> findByUsername(String username);
}
