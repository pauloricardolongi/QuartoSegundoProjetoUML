package aplicacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import entidade.Comentario;
import entidade.Publicar;

public class Programa {
	    public static void main(String[]args) throws ParseException {
	    	
	    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	    
		Comentario c1 = new Comentario("comentário c1: tenho uma boa viagem!");
		Comentario c2 = new Comentario("comentário c2: que maravilha");
		
		Publicar p1 = new Publicar(sdf.parse("21/06/2018 13:05:44"),
				"TÍTULO: Viagem para nova Zelandia",
				"CONTEÚDO: visitar um novo  país",
				12);
		p1.addComentario(c1);
		p1.addComentario(c2);
		Comentario c3 = new Comentario("comentário c3: Farei outra viagem!");
		Comentario c4 = new Comentario("comentário c4: que país grande");
		
		Publicar p2 = new Publicar(sdf.parse("28/07/2018 23:14:19"),
				"TÍTULO: Viagem ",
				"CONTEÚDO: visitar Estados Unidos",
				8);
		p2.addComentario(c3);
		p2.addComentario(c4);
		
		System.out.println(p1);
		System.out.println(p2);
		
	}

}
