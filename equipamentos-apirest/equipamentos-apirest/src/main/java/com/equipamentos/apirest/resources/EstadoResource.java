package com.equipamentos.apirest.resources;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.equipamentos.apirest.models.Cliente;
import com.equipamentos.apirest.models.Estado;
import com.equipamentos.apirest.repository.EstadoRepository;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value="/api")
@Api(value="API REST Estados")
public class EstadoResource {
	
	@Autowired
	EstadoRepository estadoRepository;
	
	@ApiOperation(value="Retorna uma lista de estados")
	@GetMapping("/estados")
	public List<Estado> listaEstados(){
		return estadoRepository.findAll();
	}
	
	@ApiOperation(value="Salva um estado")
	@PostMapping("/estado")
	public Estado salvaEstado(@RequestBody @Valid Estado estado) {
		return estadoRepository.save(estado);
	}
	
	

}