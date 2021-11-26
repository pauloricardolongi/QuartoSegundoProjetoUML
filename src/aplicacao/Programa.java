package aplicacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import entidade.Comentario;
import entidade.Publicar;

public class Programa {
	    public static void main(String[]args) throws ParseException {
	    	
	    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	    
		Comentario c1 = new Comentario("Have a nice trip!");
		Comentario c2 = new Comentario("Wow that s awesome");
		
		Publicar p1 = new Publicar(sdf.parse("21/06/2018 13:05:44"),
				"Traveling to New Zealend",
				"Vou visitar esse país",
				12);
		p1.addComentario(c1);
		p1.addComentario(c2);
		
	}

}
