package priscillaComposição;
import java.util.Scanner;
import java.util.ArrayList;

public class MainFilme {

	public static void main(String[] args) {
		  
		        Scanner scanner = new Scanner(System.in);
		        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
		        
		        String resposta = "";  

		        while (! resposta.equalsIgnoreCase("sair"))
		        {
		        	
		            System.out.println("DADOS DO DIRETOR : ");
		            
		            System.out.print("Nome do diretor: ");
		            String nome = scanner.nextLine();
		            
		            System.out.print("Local de origem do diretor: ");
		            String local_origem = scanner.nextLine();

		            System.out.print("Tempo de experiência (em anos): ");
		            int tempo_experiencia = scanner.nextInt();
		           
		            scanner.nextLine(); 

             
	                Diretor diretor = new Diretor(nome, local_origem,tempo_experiencia);

	                System.out.println("\n --------------------------------------- ");

		            System.out.println("DADOS DO FILME: ");
		            
		            System.out.print("Digite o título do filme: ");
		            String titulo = scanner.nextLine();
		            
		            System.out.print("Entre com a descrição: ");
		            String desc = scanner.nextLine();
		            
		            System.out.print("Digite a duração do filme em minutos: ");
		            int duracao_minutos = scanner.nextInt();
		            
		            scanner.nextLine();  
            
		            Filme filme = new Filme (titulo, desc,diretor, duracao_minutos);
		            
		            listaDeFilmes.add(filme); 
		            
			        System.out.println("\n------------------------");
			        System.out.println("Filme cadastrado com sucesso!");
			        System.out.println("------------------------");

		            System.out.print("Digite 'sair' para finalizar o cadastro: ");
		            resposta = scanner.nextLine();
		            
			        System.out.println("------------------------");

		        }

		       
		        System.out.print("Digite o título do filme para busca: ");
		        String tituloBusca = scanner.nextLine();
		        
		        boolean filmeEncontrado = false;

		        for (Filme f : listaDeFilmes)
		        {	        
		            if (f.getTitulo().equalsIgnoreCase(tituloBusca))
		            {
		            	filmeEncontrado = true; 
			            System.out.println(f); 
		            }} 			            
		      if (filmeEncontrado == true) 
			   {
		    	  System.out.println("\nAVISO: Filme com o título '" + tituloBusca + "foi encontrado.");
			   }
		      else 
		      {
		    	    System.out.println("\nAVISO: Filme com o título '" + tituloBusca + "' NÃO foi encontrado.");
		      }

		        System.out.println("\nLista de filmes cadastrados:");
		        
		        for (Filme f : listaDeFilmes)
                {
		        	System.out.print("Título: " + f.getTitulo() + " | "); 
			        f.exibirDuracaoEmHoras();
		        }

		        scanner.close(); }}