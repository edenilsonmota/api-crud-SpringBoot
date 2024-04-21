package com.esm.apisimple.repositories;

import com.esm.apisimple.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
