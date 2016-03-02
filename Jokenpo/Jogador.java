
public class Jogador {
	
	private String nome, sobrenome,
	int opcao;
	
	public Jogador (){
		this.nome = "";
		this.sobrenome = "";
		this.opcao = 0; 
		}
	
	public Jogador (String nome, String sobrenome, int opcao){
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.opcao = opcao; 
		}
	
	
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public int getOpcao() {
		return opcao;
	}

	public void setOpcao(int opcao) {
		this.opcao = opcao;
	}

	public String Jogador1(String nome1)
	{
		return "Player 1: " + nome1;
	}

	public String Jogador(String nome2)
	{
		return "Player 2: " + nome2;
	}
}
