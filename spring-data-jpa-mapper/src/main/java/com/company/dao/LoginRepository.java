package com.company.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.company.model.Login;


@Repository
public interface LoginRepository extends JpaRepository<Login, Integer>{


}
