package br.com.fubica.web.bean; 

import javax.faces.bean.SessionScoped;

import org.springframework.stereotype.Component;

import br.com.fubica.core.model.Usuario;

@Component
@SessionScoped
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
