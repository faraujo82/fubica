package br.com.fubica.web.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;

import br.com.fubica.core.model.Usuario;
import br.com.fubica.core.service.SegurancaService;

public class BaseBean {

	@Autowired
	protected SegurancaService segurancaService;	
	@Autowired
	protected UsuarioBean usuarioBean;
	
	@SuppressWarnings("unused")
	protected void autenticaSpringSecurity(Usuario usuario) {
        UsernamePasswordAuthenticationToken token = new UsernamePasswordAuthenticationToken(
        		usuario.getEmail(), null, usuario.getPermissao());
        token.setDetails(usuario);
 
        SecurityContextHolder.createEmptyContext();
        SecurityContextHolder.getContext().setAuthentication(token);
    }	
}
