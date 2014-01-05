package br.com.fubica.web.bean;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

@Controller
@Scope("request")
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
