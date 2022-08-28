package entidades;

public class Gerador {
	public static final String senha = "123ABC";
	
	public String senhaTentada;
	
	public Gerador() {
		
	}
	
	public Gerador(String senhaTentada) {
		this.senhaTentada = senhaTentada;
	}

	public String getStringTentada() {
		return senhaTentada;
	}
	public void setSenhaTentada(String senhaTentada) {
		this.senhaTentada = senhaTentada;
	}
	
}
