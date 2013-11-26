package br.com.fubica.ws.impl;

import javax.jws.WebService;

import br.com.fubica.ws.FubicaEndpoint;

@WebService(endpointInterface = "br.com.fubica.ws.FubicaEndpoint")
public class DefaultFubicaEndpoint implements FubicaEndpoint {
	
	@Override
	public String reverse(String value) {
		if (value == null) return null;
		return new StringBuffer(value).reverse().toString();
	}

}
