package com.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.model.HostelBlock;
@Repository
public interface HostelBlockRepository extends JpaRepository<HostelBlock, Long> {
	

}
