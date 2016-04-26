package ws.publish;

import javax.xml.ws.Endpoint;

import ws.sib.WelcomeImpl;

/**
 * Publica um WS para ser consumido.
 * 
 * @author diego.almeida
 * 
 */
public class WelcomePublish {

	public static void main(String[] args) {
		System.out.println("iniciando serviço...");
		WelcomeImpl implementor = new WelcomeImpl();
		Endpoint.publish("http://localhost:9876/welcome", implementor);
		System.out.println("serviço ativado!");
	}
}
