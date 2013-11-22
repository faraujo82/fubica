package br.com.fubica.ws.server;

import javax.xml.ws.Endpoint;

import br.com.fubica.ws.impl.DefaultFubicaEndpoint;

public class Publisher {
	public static void main(String[] args) {
		Endpoint.publish("http://localhost:8080/WS/DefaultFubicaEndpoint",new DefaultFubicaEndpoint());
	}
}
