package com.seymour.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.seymour.entities.ReportTemplate;

@Repository
public interface ReportTemplateRepository extends JpaRepository<ReportTemplate, Integer> {

	public ReportTemplate findById(int i);
}
