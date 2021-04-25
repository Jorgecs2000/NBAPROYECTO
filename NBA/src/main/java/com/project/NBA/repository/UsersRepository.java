package com.project.NBA.repository;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.project.NBA.model.User;

public interface UsersRepository extends CrudRepository<User, String> {

	@Query("SELECT * FROM USUARIOS WHERE USERID= :user AND PASSWORD= :password")
	User findByUseridAndPassword(@Param("user") String user, @Param("password") String password);
}
