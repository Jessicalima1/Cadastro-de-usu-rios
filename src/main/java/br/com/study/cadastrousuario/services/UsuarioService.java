package br.com.study.cadastrousuario.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import br.com.study.cadastrousuario.models.Usuario;

@Service
public class UsuarioService {

	public List<Usuario> getUsuarios() {
		Usuario usuario = new Usuario("Jessy", "cpf da Jessy");
		Usuario usuario2 = new Usuario("Jeff", "cpf da Jeff");

		List<Usuario> usuarios = new ArrayList<>();
		usuarios.add(usuario);
		usuarios.add(usuario2);
		return usuarios;
	}

}
