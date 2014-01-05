package br.com.fubica.web.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class RedirecionaBean {
	 
	public String usuarioPagina() {
	        return "usuarioPagina";
	    }
	 
	    public String adminPagina() {
	        return "adminPagina";
	    }
	 
	    public String index() {
	        return "index";
	    }
	 
	    public String sucessoPagina() {
	        return "sucessoPagina";
	    }	
}
