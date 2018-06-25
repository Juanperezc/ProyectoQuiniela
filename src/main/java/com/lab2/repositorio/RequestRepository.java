package com.lab2.repositorio;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
//import org.springframework.data.repository.CrudRepository;
import com.lab2.modelo.Request;
import com.lab2.modelo.User;

@Repository
public interface RequestRepository  extends JpaRepository<Request, Long>{
    //List<Request> findByName(String name);
    //User findByEmail(String email);
    Request findByid(Integer id);
    List<Request> findByFromid(User user);
    List<Request> findByToid(User user);
}