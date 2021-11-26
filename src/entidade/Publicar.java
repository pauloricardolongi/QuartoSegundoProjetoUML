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
}
