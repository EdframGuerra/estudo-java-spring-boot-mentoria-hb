package com.myProject.mentoriaHB.estudoDeCaso.repository;

import com.myProject.mentoriaHB.estudoDeCaso.model.PeopleModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PeopleRepository extends JpaRepository<PeopleModel, Long> {
}
