package br.com.fubica.web.bean;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;

import br.com.fubica.core.model.Usuario;
import br.com.fubica.core.service.SegurancaService;

@RequestScoped
@ManagedBean
public class AutenticacaoBean extends BaseBean implements AuthenticationProvider{
	
	@Autowired
	protected SegurancaService segurancaService;	
	@Autowired
	protected UsuarioBean usuarioBean;

	private String email;
    private String senha;
 	
    public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String autenticar() {
        try {	
            Usuario usuario = segurancaService.autenticar(email, senha);
            autenticaSpringSecurity(usuario);
            usuarioBean.setUsuario(usuario);
            return "successfulPage";
        } catch (IllegalArgumentException ex) {
            message(ex.getMessage());
        }
        return "";
    }	
    
	private void message(String message) {
        FacesContext.getCurrentInstance().addMessage(null,
                new FacesMessage(message));
    }

	protected void autenticaSpringSecurity(Usuario usuario) {
        UsernamePasswordAuthenticationToken token = new UsernamePasswordAuthenticationToken(
        		usuario.getEmail(), null, usuario.getPermissao());
        token.setDetails(usuario);
 
        SecurityContextHolder.createEmptyContext();
        SecurityContextHolder.getContext().setAuthentication(token);
    }
    
	@Override
	public Authentication authenticate(Authentication arg0)
			throws AuthenticationException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean supports(Class<?> arg0) {
		// TODO Auto-generated method stub
		return false;
	}
	
}
