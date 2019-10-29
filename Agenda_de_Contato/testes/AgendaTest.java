import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import agenda.Agenda;

/**
 * Testa o principal m�todo da classe agenda, especificamente o cadastrar contatos.
 * 
 * @author Isaias.Silva - 118111333
 *
 */

public class AgendaTest {
	Agenda agenda;

	@Before
	public void setUp() throws Exception {
		agenda = new Agenda();
	}

	 // Testa o cadastro em uma das posi��es extrema, a posi��o 1.
	@Test
	public void testCadastrarContatoP1() {
		assertEquals(true, agenda.cadastrarContato(1, "Isaias", "Silva", "(83)9834-4190"));
	}

	 //Testa o cadastro na outra posi��o extrema, a posi��o 100.
	@Test
	public void testCadastrarContatoP100() {
		assertEquals(true, agenda.cadastrarContato(100, "Isaias", "Silva", "(83)9834-4190"));
	}
	
	 //Testa o cadastro de dois cotatos na mesma posi��o.
	@Test
	public void testCadastrarContatoP1P1() {
		assertEquals(true, agenda.cadastrarContato(1, "Isaias", "Silva", "(83)9834-4190"));
		assertEquals(true, agenda.cadastrarContato(1, "Jo�o", "Marcos", "(83)8725-7091"));
	}
	
	//Testa o cadastro em uma posi��o inv�lida, posi��o 0.
	@Test
	public void testCadastrarContatoP0() {
		assertEquals(false, agenda.cadastrarContato(0, "Isaias", "Silva", "(83)9834-4190"));
	}
	
	//Testa o cadastro em uma posi��o inv�lida, posi��o 101.
	@Test
	public void testCadastrarContatoP101() {
		assertEquals(false, agenda.cadastrarContato(101, "Isaias", "Silva", "(83)9834-4190"));
	}


}
