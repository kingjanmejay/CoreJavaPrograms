package com.app.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.model.HostelBlock;
import com.app.repository.HostelBlockRepository;
import com.app.services.HostelBlockService;
@Service
public class HostelBlockServiceImpl implements HostelBlockService {
	@Autowired
   HostelBlockRepository hostelBlockRepository;
	@Override
	public void save(HostelBlock h) {
		hostelBlockRepository.save(h);
		
	}
	
	

}
