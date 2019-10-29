package agenda;

/**
 * Representação de uma agenda, especificamente de um sistema de gerenciamento de contatos, caracterizada
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
	 * Retorna uma representação booleana sobre o sucesso da operação de cadastro do contato, e inseri
	 * na agenda numa posição específica o contato.
	 * 
	 * @param posicao, a posição na agenda onde o contato deve ser inserido.
	 * @param nome, nome do contato.
	 * @param sobrenome, sobrenome do contato.
	 * @param telefone, número telefônico do contato.
	 * 
	 * @return a representação boolean do resultado da opreção.
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
	 * Retorna uma representação em String das posições e dos contatos correspondentes armazenados na agenda.
	 * 
	 * @return a representação String da posição, do nome e do sobrenome.
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
	 * Retorna uma representação em String do contato armazenado na agenda.
	 * 
	 * @param posicao, a posição onde se encontra o contato.
	 * 
	 * @return a representação String do nome, sobrenome e número telefônnico.
	 */
	public String exibirContato(int posicao){
		String contato = "";
		if (meusContatos[posicao - 1] != null){
			contato = meusContatos[posicao-1].toString();
		}
		else{
			contato = "POSIÇÃO INVÁLIDA!";
		}
		return contato;
	}
}