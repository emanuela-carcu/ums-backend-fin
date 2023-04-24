package com.project.ums.repo;

import com.project.ums.model.Facultate;
import com.project.ums.model.Specializare;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpecializareRepo extends JpaRepository<Specializare,Long> {

    public void deleteByFacultateId(Long id);
}
