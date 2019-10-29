package agenda;

/**
 * Representa��o de um contato, especificamente para uma agenda, sendo este carecterizado pelo nome,
 * sobrenome e o n�mero telef�nico.
 *
 * @author Isaias.Silva - 118111333
 *
 */
public class Contato {
	
	/**
	 * Nome do contato, seu sobrenome e o n�mero do telefone. 
	 */
	private String nome;
	private String sobrenome;
	private String telefone;
	
	/**
	 * Constroi um contato apartir do nome, sobrenome e o n�mero do telefone.
	 * 
	 * @param nome, nome do contato.
	 * @param sobrenome, sobrenome do contato.
	 * @param telefone, n�mero telf�nico do contato.
	 */
	public Contato(String nome, String sobrenome, String telefone) {
		if ((nome == null) || (sobrenome == null) || (telefone == null)){
			throw new NullPointerException("Dado nulo n�o � permitido!");
		}
		if ((nome.trim().equals("")) || (sobrenome.trim().equals("")) || (telefone.trim().equals(""))){
			throw new IllegalArgumentException("Dados vazios ou espa�os n�o s�o permitidos!");
		}
		
		 this.nome = nome;
		 this.sobrenome = sobrenome;
		 this.telefone = telefone;
	}
	
    /**
     * Retorna uma representa��o em String do atributo nome do contato.
     * 
     * @return a representa��o String do nome.
     */
	public String getNome(){
		return nome;
	}
	
	/**
	 * Retorna uma representa��o em String do atributo sobrenome do contato.
	 * 
	 * @return a representa��o String do sobrenome.
	 */
	public String getSobrenome(){
		return sobrenome; 
	}
	
	/**
	 * Retorna uma representa��o em String do atributo telefone do contato.
	 * 
	 * @return a representa��o String do telefone.
	 */
	public String getTelefone(){
		return telefone;
	}

	/**
	 * Retorna a String que representa o nome do contato, seu sobrenome e o n�mero do telefone.
	 * 
	 * @return a representa��o String do nome, sobrenome e teefone.
	 */
	@Override
	public String toString() {
		return nome + " " + sobrenome + " - " + telefone;
	}

}