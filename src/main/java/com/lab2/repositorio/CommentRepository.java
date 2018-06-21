package com.lab2.repositorio;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lab2.modelo.Comment;

@Repository("commentRepository")
public interface CommentRepository extends JpaRepository<Comment, Integer>{
	//Game findByRole(String role);

}