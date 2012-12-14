package br.com.example.model;

public class Contato {
	
	private ContatoType type = ContatoType.PHONE;
	private String contact;

	public ContatoType getType() {
		return type;
	}
	public void setType(ContatoType type) {
		this.type = type;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
}
