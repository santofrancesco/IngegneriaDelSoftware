package pack;

public class Campanello {
private String nome;
private String suono;
public Campanello(String nome, String suono) {
	super();
	this.nome = nome;
	this.suono = suono;
}
public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public String getSuono() {
	return suono;
}
public void setSuono(String suono) {
	this.suono = suono;
}
public String suona() {
	return suono;
}
}
