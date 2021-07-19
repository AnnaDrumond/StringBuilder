package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {
	
	// para que n�o seja necess�rio toda vez instanciar um SDF eu crio uma constante
	// o private static, � para que n�o tenha uma c�pia do objeto sdf para CADA post da minha app
	//Assim, eu tenho apenas uma c�pia para a app inteira
	private static SimpleDateFormat sdf = new SimpleDateFormat ("dd/MM/yyyy HH:mm:ss");

	private Date moment;
	private String title;
	private String content;
	private Integer likes;

	// Depois do atributo, vamos criar as associa��es:

	/* o diagrama UML do pdf 07 mostra atrav�s do "*" que cada post vai ter v�rios coment�rios.
	 * Para representar isso, vou usar uma lista. O nome da lista est� no UML.
	 */
	private List<Comment> comments = new ArrayList<>();
	// Agora vamos instanciar esta lista, para instanciar um tipo que � "interface" como a lista,
	// eu tenho de colocar uma classe que implementa esta interface, neste caso, ArrayList (que pega as vantagens
	// da lista e as vantagens do vertor, otimizando).

	// construtores:

	public Post() {
	}

	// Lmbre que a lista n�o entra no construtor cheio, a lista se inicia vazia mesmo.
	public Post(Date moment, String title, String content, Integer likes) {
		this.moment = moment;
		this.title = title;
		this.content = content;
		this.likes = likes;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Integer getLikes() {
		return likes;
	}

	public void setLikes(Integer likes) {
		this.likes = likes;
	}

	public List<Comment> getComments() {
		return comments;
	}

	// Lembre que no caso da lista/cole��o, n�o deve ter um m�todo set, pois n�o podemos permitir
	// que esta lista seja trocada por uma outra lista. Ao inv�s do set, temos de criar ao add e o remove, 
	// que � a forma de adicionar ou remover algum elemento da minha lista/cole��o. 
	// Podem haver outras l�gicas sim, masesta abaixo � a mais usada.

	public void addComment(Comment comment) {
		comments.add(comment);
	}

	public void removeComment(Comment comment) {
		comments.remove(comment);
	}

	// Como tenho de criar um toString muito grande, eu vou usar StringBuilder:
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(title + "\n");
		sb.append(likes);
		sb.append(" Likes - ");
		// para colocar a minhda data formatada, eu preciso tambem instaciar um SimplesDateFormat aqui na classe Post.
		sb.append(sdf.format(moment)+ "\n");
		// o m�todo format > Formata uma data em uma string de data e hora.
		//Par�metros: data o valor de hora a ser formatado em uma string de data e hora. Retorna: a string de data e hora formatada.
		sb.append(content + "\n");
		sb.append("Comments: \n");
		// colocar o texto de cada coment�rio associado ao meu post:
		//para cada comment c na minha de comments, pegue o texto deste comment c:
		for (Comment c : comments) {
			sb.append(c.getText() + "\n");
		}
		// Por fim, converter o meu StringBuilder para String:
		return sb.toString();		
	}
}
