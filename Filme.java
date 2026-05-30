package projetoComposição;

public class Filme {
	
	private String titulo;
	private String descricao;
	private Diretor diretor;
	private int duracaoEmMinutos; // dado em minutos
	
	public Filme ()
	{   }
	
    public Filme(String titulo, String descricao, Diretor diretor, int duracaoEmMinutos)
    {
		
		this.titulo = titulo;
		this.descricao = descricao;
		this.diretor = diretor;
		this.duracaoEmMinutos = duracaoEmMinutos;
	}
    public String getDescricao()
    {
		return descricao;
	}

	public void setDescricao(String descricao)
	{
		this.descricao = descricao;
	}

	public Diretor getDiretor()
	{
		return diretor;
	}

	public void setDiretor(Diretor diretor) 
	{
		this.diretor = diretor;
	}

	public int getDuracaoEmMinutos()
	{
		return duracaoEmMinutos;
	}

	public void setDuracaoEmMinutos(int duracaoEmMinutos)
	{
		this.duracaoEmMinutos = duracaoEmMinutos;
	}
	public String getTitulo() 
	{
		return titulo;
	}

	public void setTitulo(String titulo)
	{
		this.titulo = titulo;
	}
		
	public void exibirDuracaoEmHoras()
	{
	   int hora = (this.duracaoEmMinutos)/60;   // -- converto aqui de minutos para hora
	   int minutos_restantes = (this.duracaoEmMinutos) % 60; // -- pgo o resto que sobrou dos minutos 
       System.out.println("O filme " + titulo + " possui " + hora + " horas  " + minutos_restantes+  " minutos de duração.");
	}
	
	
	public String comparacao(String titulo_comparacao)
	{
        if (this.titulo.equalsIgnoreCase(titulo_comparacao))
        
                return this.titulo;
        else
        	
        	    return null;
    }
	public String toString()
   {
	    return ("Título: " + titulo + " Descrição: " + descricao +  " Diretor: " + diretor + " Duração" + duracaoEmMinutos + " minutos");       
    }}

