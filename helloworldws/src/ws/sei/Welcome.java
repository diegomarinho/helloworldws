package ws.sei;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface Welcome {

	@WebMethod
	String welcomePt(String nome);

	@WebMethod
	String welcomeEn(String nome);

}
