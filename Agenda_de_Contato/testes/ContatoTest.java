import static org.junit.Assert.*;

import org.junit.Test;

import agenda.Contato;


public class ContatoTest {
	Contato contato;

	@Test
	public void testNomeNull() {
		try {

		     contato = new Contato(null, "Isaias", "(83)9834-4190");

		     fail("Era esperado exceção ao passar código nulo");

		  } catch (NullPointerException npe) {


		  }

		}
}
