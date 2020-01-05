package com.scrollboard.springboot.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.scrollboard.springboot.model.Users;

@Repository
public interface UsersRepository extends JpaRepository<Users, String> {

}
