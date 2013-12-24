package br.com.fubica.core.service;

import br.com.fubica.core.model.Usuario;

public interface SegurancaService {
	Usuario autenticar(String email, String senha) throws IllegalArgumentException;
}
