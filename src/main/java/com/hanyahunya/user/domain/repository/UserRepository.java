package com.hanyahunya.user.domain.repository;

import com.hanyahunya.user.domain.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UserRepository extends JpaRepository<User, UUID> {
}
