package com.lab2.repositorio;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
//import org.springframework.data.repository.CrudRepository;
import com.lab2.modelo.User;

@Repository
public interface UserRepository  extends JpaRepository<User, Long>{
    List<User> findByName(String name);
    User findByEmail(String email);

}