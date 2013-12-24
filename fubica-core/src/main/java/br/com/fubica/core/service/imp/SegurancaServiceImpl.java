package br.com.fubica.core.service.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.fubica.core.dao.UsuarioDao;
import br.com.fubica.core.model.Usuario;
import br.com.fubica.core.service.SegurancaService;

@Service
@Transactional
public class SegurancaServiceImpl implements SegurancaService{

	@Autowired
    private UsuarioDao dao;
	
	@Override
	public Usuario autenticar(String email, String senha)
			throws IllegalArgumentException {
		if (isEmptyOrNull(email) || isEmptyOrNull(senha)) {
			throw new IllegalArgumentException(
                    "Atenção, usuário ou senha vazios!");
		}
		
		Usuario u = dao.autenticar(email, senha);
		
		if (u == null) {
			 throw new IllegalArgumentException(
	                    "Erro: username ou password incorretos!");
		}
		return u;
	}

	private boolean isEmptyOrNull(String s) {
        return s == null || s.equals("");
    }	
}
