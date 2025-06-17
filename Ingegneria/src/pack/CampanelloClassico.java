package pack;

public class CampanelloClassico implements Campanello {
private String nome;
//private String suono;
public CampanelloClassico(String nome, String suono) {
	super();
	this.nome = nome;
	//this.suono = suono;
}
public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
//public void setSuono(String suono) {
//	this.suono = suono;
//}
@Override
public void suona() {
	System.out.println("Ding dong!");
}
}
