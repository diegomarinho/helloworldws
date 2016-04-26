package ws.publish;

import javax.swing.JOptionPane;

import ws.sei.Welcome;
import ws.sib.WelcomeImpl;

public class ClienteConsumerWs {

	public static void main(String arg[]) {
		Welcome welcome = new WelcomeImpl();
		Pessoa pessoa = new Pessoa();
		
		pessoa.setNome(JOptionPane.showInputDialog("Digite o nome"));

		String result = welcome.welcomeEn(pessoa.getNome());
		System.out.println(result);
	}
}
