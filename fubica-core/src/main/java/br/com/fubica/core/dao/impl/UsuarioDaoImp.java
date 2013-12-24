package br.com.fubica.core.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import br.com.fubica.core.dao.UsuarioDao;
import br.com.fubica.core.model.Usuario;

@Repository
public class UsuarioDaoImp implements UsuarioDao{
	
	@PersistenceContext
    private EntityManager entityManager;
	
	@Override
	public List<Usuario> buscarTodos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void salvar(Usuario user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void atualizar(Usuario user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void excluir(Usuario user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Usuario usuarioPorId(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@SuppressWarnings("rawtypes")
	@Override
	public Usuario autenticar(String email, String senha) {
		String query = "from Usuario u where u.email = ? and u.senha=?";
		Query q = entityManager.createQuery(query);
		q.setParameter(1, email);
		q.setParameter(2, senha);
		
		List l = q.getResultList();
		
		if (l == null || l.isEmpty() || l.size() > 1) {
			return null;
		}
		return (Usuario) l.get(0);
	}

	
	
}
