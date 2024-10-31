package com.example.demo.SeriviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Especialidad;
import com.example.demo.Repository.EspecialidadRepository;
import com.example.demo.Service.EspecialidadService;

@Service

public class EspecialidadServiceImpl implements EspecialidadService {

	@Autowired
	private EspecialidadRepository  especialidadRepository; 
	
	@Override
	public Especialidad create(Especialidad c) {
		// TODO Auto-generated method stub
		return especialidadRepository.save(c);
	}

	@Override
	public Especialidad update(Especialidad c) {
		// TODO Auto-generated method stub
		return especialidadRepository.save(c);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		especialidadRepository.deleteById(id);
	}

	@Override
	public Optional<Especialidad> read(Long id) {
		// TODO Auto-generated method stub
		return especialidadRepository.findById(id);
	}

	@Override
	public List<Especialidad> readAll() {
		// TODO Auto-generated method stub
		return especialidadRepository.findAll();
	}

}
