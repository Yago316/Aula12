package com.example.almoco.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.almoco.model.prato.Prato;
import com.example.almoco.repository.PratoRepository;

@RestController
@RequestMapping("/almoco")
public class Controller {
	

	 @Autowired
	    private PratoRepository pratoRepository;

	
	 @PutMapping
	    public List<Prato> getAllUsers() {
	        return pratoRepository.findAll();
	 }

	 @PutMapping
	 public Prato createPrato(@RequestBody Prato prato) {
		 return pratoRepository.save(prato);
	 }
	 
}
