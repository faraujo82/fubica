package br.com.fubica.ws.endpoint;

import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

import br.com.fubica.core.util.Constants;

@WebService(targetNamespace = Constants.WS_NAMESPACE)
@SOAPBinding(style = Style.RPC)
public interface FubicaEndpoint {

	public String traduzir(@WebParam(name = "chave") String chave);

}
