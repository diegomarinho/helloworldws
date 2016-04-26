package teste;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import ws.sib.WelcomeImpl;

public class WelcomeTeste {

	private WelcomeImpl impl;

	@Before
	public void setUpClass() {
		impl = new WelcomeImpl();
	}

	@After
	public void tearDownClass() {
		System.out.println("Executando depois");
	}

	@Test
	public void testWelcomePtSucesso() {
		assertEquals("Msg não está correta!", "Olá diego", impl.welcomePt("diego"));
	}

	@Test
	public void testWelcomeEnSucesso() {
		assertEquals("Msg não está correta!", "Hello diego", impl.welcomeEn("diego"));
	}

}
