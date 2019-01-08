package com.curso.resources;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.curso.domain.Categoria;
import com.curso.services.CategoriaService;

@RestController
@RequestMapping("/categorias")
public class CategoriaResource {
 
private CategoriaService catServ;	

public CategoriaResource(CategoriaService service) {
	this.catServ=service;
}
	
@GetMapping("/{id}")
	public ResponseEntity<?> find(@PathVariable(name="id") Long id) {
    Optional<Categoria> cat=catServ.buscar(id);  	

		
	return ResponseEntity.ok().body(cat) ;
		
	}

}
