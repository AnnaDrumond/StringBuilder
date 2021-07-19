package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import entities.Comment;
import entities.Post;

public class Program {

	public static void main(String[] args) throws ParseException {
		// Instancie manualmente (hard code) os objetos mostrados no pdf 07 - aula 120 Udemy e mostre-os 
		// na tela do terminal, conforme exemplo.
	
		SimpleDateFormat sdf = new SimpleDateFormat ("dd/MM/yyyy HH:mm:ss");
	
		// Conforme o diagrama UML, tenho de criar um comentário com o texto abaixo e depois outro com um segundo texto.
		Comment comment1 = new Comment ("Have a nice trip!");
		Comment comment2 = new Comment ("Wow that's awesome!");
		
		// Criar uma VAR do tipo Post recebendo moment, content, likes e title como argumentos.
		// O moment seria 21/06/2018 13:05:44, para poder instanciar um objeto Date a partir deste texto,
		// criar um SimpleDateFormat passando uma máscara como argumento. E depois vou chamar a var sdf.parse.
		Post post1 = new Post(sdf.parse("21/06/2018 13:05:44"), 
				// o método parse > Analisa o texto do início de uma determinada string para produzir uma data.
				"Traveling to New Zealand", 
				"I'm going to visit this wonderful country!", 
				12);
		
		// Vamos adicionar os 02 comments ao meu post:
		post1.addComment(comment1);
		post1.addComment(comment2);
		
		System.out.println(post1);
		
		
		Comment comment3 = new Comment ("Good night");
		Comment comment4 = new Comment ("May the Force be with you");
		
		// Criar uma VAR do tipo Post recebendo moment, content, likes e title como argumentos.
		// O moment seria 21/06/2018 13:05:44, para poder instanciar um objeto Date a partir deste texto,
		// criar um SimpleDateFormat passando uma máscara como argumento. E depois vou chamar a var sdf.parse.
		Post post2 = new Post(sdf.parse("28/07/2018 23:14:19"), 
				// o método parse > Analisa o texto do início de uma determinada string para produzir uma data.
				"Good night guys", 
				"See you tomorrow", 
				12);
		
		// Vamos adicionar os 02 comments ao meu post:
		post2.addComment(comment3);
		post2.addComment(comment4);
		
	
		System.out.println(post2);
	
	
	
	
	}

}
