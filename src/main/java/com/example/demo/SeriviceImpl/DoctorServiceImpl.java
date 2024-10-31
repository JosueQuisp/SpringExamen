package com.example.demo.SeriviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Doctor;
import com.example.demo.Repository.DoctorRepository;
import com.example.demo.Service.DoctorService;

@Service

public class DoctorServiceImpl implements DoctorService {
	
	@Autowired
	
	private DoctorRepository doctorRepository;
	

	@Override
	public Doctor create(Doctor c) {
		// TODO Auto-generated method stub
		return doctorRepository.save(c);
	}

	@Override
	public Doctor uptade(Doctor c) {
		// TODO Auto-generated method stub
		return doctorRepository.save(c);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		doctorRepository.deleteById(id);
	}

	@Override
	public Optional<Doctor> read(Long id) {
		// TODO Auto-generated method stub
		return doctorRepository.findById(id); 
	}

	@Override
	public List<Doctor> readAll() {
		// TODO Auto-generated method stub
		return doctorRepository.findAll();
	}
	
	

}
