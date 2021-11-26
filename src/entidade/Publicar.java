package entidade;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Publicar {
	private Date momento;
	private String titulo;
	private String content;
	private Integer likes;
	
    private List<Comentario> comentarios = new ArrayList<>();

	public Publicar() {
		
	}

	public Publicar(Date momento, String titulo, String content, Integer likes) {
		
		this.momento = momento;
		this.titulo = titulo;
		this.content = content;
		this.likes = likes;
	}
    
    
}
