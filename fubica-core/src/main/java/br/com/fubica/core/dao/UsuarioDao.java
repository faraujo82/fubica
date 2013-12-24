package br.com.fubica.core.dao;

import java.util.List;

import br.com.fubica.core.model.Usuario;

public interface UsuarioDao {
		
	List<Usuario> buscarTodos();
	 
	void salvar(Usuario user);
	 
	void atualizar(Usuario user);
	 
	void excluir(Usuario user);
	 
	Usuario usuarioPorId(Long id);
	     
	Usuario autenticar(String email, String senha);	
}
