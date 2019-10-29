import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import agenda.Agenda;

/**
 * Testa o principal método da classe agenda, especificamente o cadastrar contatos.
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

	 // Testa o cadastro em uma das posições extrema, a posição 1.
	@Test
	public void testCadastrarContatoP1() {
		assertEquals(true, agenda.cadastrarContato(1, "Isaias", "Silva", "(83)9834-4190"));
	}

	 //Testa o cadastro na outra posição extrema, a posição 100.
	@Test
	public void testCadastrarContatoP100() {
		assertEquals(true, agenda.cadastrarContato(100, "Isaias", "Silva", "(83)9834-4190"));
	}
	
	 //Testa o cadastro de dois cotatos na mesma posição.
	@Test
	public void testCadastrarContatoP1P1() {
		assertEquals(true, agenda.cadastrarContato(1, "Isaias", "Silva", "(83)9834-4190"));
		assertEquals(true, agenda.cadastrarContato(1, "João", "Marcos", "(83)8725-7091"));
	}
	
	//Testa o cadastro em uma posição inválida, posição 0.
	@Test
	public void testCadastrarContatoP0() {
		assertEquals(false, agenda.cadastrarContato(0, "Isaias", "Silva", "(83)9834-4190"));
	}
	
	//Testa o cadastro em uma posição inválida, posição 101.
	@Test
	public void testCadastrarContatoP101() {
		assertEquals(false, agenda.cadastrarContato(101, "Isaias", "Silva", "(83)9834-4190"));
	}


}
