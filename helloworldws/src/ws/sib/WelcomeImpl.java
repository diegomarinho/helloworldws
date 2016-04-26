package ws.sib;

import javax.jws.WebService;

import ws.sei.Welcome;

@WebService(endpointInterface = "ws.sei.Welcome")
public class WelcomeImpl implements Welcome {

	@Override
	public String welcomePt(String nome) {

		return "Olá " + nome;
	}

	@Override
	public String welcomeEn(String nome) {

		return "Hello " + nome;
	}

}