package priscillaComposição;

public class Diretor {

	private String nome;
	private int anoExperiencia;
	private String localOrigem;
	
	public Diretor()
	{     }

	public Diretor(String nome, String localOrigem,int anoExperiencia)
	{
		this.nome = nome;
		this.anoExperiencia =anoExperiencia;
		this.localOrigem = localOrigem;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getAnoExperiencia() {
		return anoExperiencia;
	}

	public void setAnoExperiencia(int anoExperiencia) {
		this.anoExperiencia = anoExperiencia;
	}

	public String getLocalOrigem() {
		return localOrigem;
	}

	public void setLocalOrigem(String localOrigem) {
		this.localOrigem = localOrigem;
	}

	
	public String toString() 
	{
		return "Diretor [Nome =" + nome + ", ano de experiencia=" + anoExperiencia + ", local de origem=" + localOrigem + "]";
	}}

	