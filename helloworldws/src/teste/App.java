package teste;

import java.io.FileInputStream;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.soap.MessageFactory;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPMessage;
import javax.xml.ws.Dispatch;
import javax.xml.ws.Service;

/**
 * Simula o consumo de um WS - "tissSolicitacaoProcedimento", usando como entrada um arquivo
 * "SOLICITACAO_PROCEDIMENTOS_doc_13_id_6098.xml".
 * 
 * @author diego.almeida
 * 
 */
public class App {
	public static void main(String args[]) throws Exception {
		//		URL url = new URL("http://api.google.com/GoogleSearch.wsdl");
		URL wsdl = new URL(
				"https://wsp.hom.orizonbrasil.com.br:6200/tissTransmiteMensagemZIP/v20202?wsdl");

		QName serviceName = new QName("http://www.ans.gov.br/tiss/ws/tipos/tissSolicitacaoProcedimento/v20203",
				"tissSolicitacaoProcedimento");

		//QName portName = new QName("urn:GoogleSearch", "GoogleSearchPort");

		Service service = null;
		Dispatch<SOAPMessage> dispatch = null;
		SOAPMessage request = null;
		SOAPMessage response = null;

		try {
			service = Service.create(wsdl, serviceName);
			dispatch = service.createDispatch(null, SOAPMessage.class, Service.Mode.MESSAGE);
			request = MessageFactory.newInstance().createMessage(null,
					new FileInputStream("SOLICITACAO_PROCEDIMENTOS_doc_13_id_6098.xml"));

			response = dispatch.invoke(request);
			response.writeTo(System.out);
		} catch (SOAPException soapex) {
			soapex.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
