package dmacc.repository;

import org.springframework.stereotype.Repository;

import dmacc.bean.Vacation;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface VacationRepository extends
JpaRepository<Vacation, Long>{}
