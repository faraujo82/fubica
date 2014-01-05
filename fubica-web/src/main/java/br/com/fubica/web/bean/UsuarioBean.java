package br.com.fubica.web.bean; 

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import br.com.fubica.core.model.Usuario;

@Component
@Scope("session")
public class UsuarioBean {
	private Usuario usuario;

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	} 
	
	public boolean isLoggedIn(){
        return usuario != null;
    }	
	
}
