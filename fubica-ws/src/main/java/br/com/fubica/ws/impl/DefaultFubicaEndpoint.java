package br.com.fubica.ws.impl;

import javax.jws.WebMethod;
import javax.jws.WebService;

import br.com.fubica.core.util.I18nUtil;
import br.com.fubica.ws.FubicaEndpoint;

@WebService(endpointInterface = "br.com.fubica.ws.FubicaEndpoint")
public class DefaultFubicaEndpoint implements FubicaEndpoint {
	
	@WebMethod
	public String traduzir(String chave) {
		return I18nUtil.getTexto(chave);
	}

}
