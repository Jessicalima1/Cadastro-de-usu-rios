package br.com.study.cadastrousuario.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.study.cadastrousuario.models.Usuario;
import br.com.study.cadastrousuario.services.UsuarioService;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

	@Autowired
	private UsuarioService usuarioService;
	
	@GetMapping
	public List<Usuario> getUsuarios() {
		return usuarioService.getUsuarios();
		
	}
}
