package com.example.demo.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Especialidad;
import com.example.demo.Service.EspecialidadService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/especialidades")
@CrossOrigin(origins = "http://localhost:4200")


public class EspecialidadController {
	
	@Autowired
	private EspecialidadService espe; 
	
	
	@GetMapping
	public ResponseEntity<List<Especialidad>> readAll(){
		try {
			List<Especialidad> alma= espe.readAll(); 
			if (alma.isEmpty()) {
				return new  ResponseEntity<>(HttpStatus.NO_CONTENT); 
			}
			return new ResponseEntity<>(alma, HttpStatus.OK); 
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR); 
		}
	}
	
	
	@PostMapping
	public ResponseEntity<Especialidad> crearespecialidad(@Valid @RequestBody Especialidad c){
		try {
			Especialidad  alms= espe.create(c); 
			return new ResponseEntity<>(alms, HttpStatus.CREATED);  
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Especialidad> bucarespecialiad(@PathVariable("id") Long id){
		Optional<Especialidad> alms= espe.read(id); 
		return alms.map(vale -> new ResponseEntity<>(vale, HttpStatus.OK) )
				.orElseGet(()-> new ResponseEntity<>(HttpStatus.NOT_FOUND)); 
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Especialidad> ediatarespecialidad(@PathVariable("id") Long id, @Valid @RequestBody Especialidad almas){
		 Optional<Especialidad> existing = espe.read(id);
	        if (existing.isPresent()) {
	            almas.setId(id);
	            return new ResponseEntity<>(espe.update(almas), HttpStatus.OK);
	        } else {
	            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	        }
	}
	
	
	
	@DeleteMapping("/{id}")
    public ResponseEntity<HttpStatus> elimiarespecialidad(@PathVariable("id") Long id) {
        try {
            espe.delete(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
	
	
	
	
	
	
	
	
	
	

}
