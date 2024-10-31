package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import com.example.demo.Entity.Doctor;

public interface DoctorService {

	Doctor create(Doctor c);
	Doctor uptade(Doctor c);
	void delete(Long id);
	Optional<Doctor> read(Long id);
	List<Doctor> readAll();
}
