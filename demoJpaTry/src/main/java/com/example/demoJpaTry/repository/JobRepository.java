package com.example.demoJpaTry.repository;

import com.example.demoJpaTry.identities.JobName;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobRepository extends JpaRepository<JobName, Integer> {
}
