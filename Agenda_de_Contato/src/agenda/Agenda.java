package agenda;

/**
 * Representa��o de uma agenda, especificamente de um sistema de gerenciamento de contatos, caracterizada
 * por guardar e manipular contatos em sua estrutura.
 * 
 * @author Isaias.Silva - 118111333
 *
 */
public class Agenda {
	
	/**
	 * Atributo para armazenar os contatos na agenda. 
	 */
	private Contato[] meusContatos;
	
    /**
     * Constroi uma agenda sem parametros.
     */
	public Agenda() {
		meusContatos = new Contato[100];
	}
	
	/**
	 * Retorna uma representa��o booleana sobre o sucesso da opera��o de cadastro do contato, e inseri
	 * na agenda numa posi��o espec�fica o contato.
	 * 
	 * @param posicao, a posi��o na agenda onde o contato deve ser inserido.
	 * @param nome, nome do contato.
	 * @param sobrenome, sobrenome do contato.
	 * @param telefone, n�mero telef�nico do contato.
	 * 
	 * @return a representa��o boolean do resultado da opre��o.
	 */
	public boolean cadastrarContato(int posicao, String nome, String sobrenome, String telefone){
		if ((posicao <= 0) || (posicao > 100)){
			return false;
		}
		else{
			Contato contato = new Contato(nome, sobrenome, telefone);
			meusContatos[posicao - 1] = contato;
			return true;
		}
	}
	
	/**
	 * Retorna uma representa��o em String das posi��es e dos contatos correspondentes armazenados na agenda.
	 * 
	 * @return a representa��o String da posi��o, do nome e do sobrenome.
	 */
	public String listaContatos(){
			String contatos = "";
			for (int i=0; i<100; i++){
				if (meusContatos[i] != null)
					contatos += i+1 + " - " + meusContatos[i].getNome() + " " + meusContatos[i].getSobrenome() + "\n";
			}
			return contatos;
		}
	
	/**
	 * Retorna uma representa��o em String do contato armazenado na agenda.
	 * 
	 * @param posicao, a posi��o onde se encontra o contato.
	 * 
	 * @return a representa��o String do nome, sobrenome e n�mero telef�nnico.
	 */
	public String exibirContato(int posicao){
		String contato = "";
		if (meusContatos[posicao - 1] != null){
			contato = meusContatos[posicao-1].toString();
		}
		else{
			contato = "POSI��O INV�LIDA!";
		}
		return contato;
	}
	
}