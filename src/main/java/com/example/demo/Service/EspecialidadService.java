package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import com.example.demo.Entity.Especialidad;

public interface EspecialidadService {
	
	Especialidad create(Especialidad c);
	Especialidad update(Especialidad c);
	void delete(Long id);
	Optional<Especialidad> read(Long id);
	List<Especialidad> readAll();

}
