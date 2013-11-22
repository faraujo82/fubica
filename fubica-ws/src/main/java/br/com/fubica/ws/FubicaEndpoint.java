package br.com.fubica.ws;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface FubicaEndpoint {

	@WebMethod
	String reverse(String value);
}
