package com.project.ums.repo;

import com.project.ums.model.Facultate ;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FacultateRepo extends JpaRepository<Facultate,Long> {

}
