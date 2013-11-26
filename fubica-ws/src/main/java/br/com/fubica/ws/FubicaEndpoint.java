package br.com.fubica.ws;

import javax.jws.WebParam;
import javax.jws.WebService;

@WebService
public interface FubicaEndpoint {

	public String traduzir(@WebParam(name = "chave") String chave);
}
