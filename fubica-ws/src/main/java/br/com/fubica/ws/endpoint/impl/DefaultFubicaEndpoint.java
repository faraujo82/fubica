package br.com.fubica.ws.endpoint.impl;

import javax.jws.WebService;

import br.com.fubica.core.util.Constants;
import br.com.fubica.core.util.I18nUtil;
import br.com.fubica.ws.endpoint.FubicaEndpoint;

@WebService(targetNamespace = Constants.WS_NAMESPACE, endpointInterface = "br.com.fubica.ws.endpoint.FubicaEndpoint")
public class DefaultFubicaEndpoint implements FubicaEndpoint{
	//http://localhost:9090/fubica/services/fubica?wsdl
	public String traduzir(String chave){
		return I18nUtil.getTexto(chave);
	}

}
