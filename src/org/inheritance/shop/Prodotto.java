package org.inheritance.shop;

import java.util.Random;

public class Prodotto {

	private int codice;
	private String nome;
	private String descrizione;
	private double prezzo;
	private double iva = 1.22;
	
	void setCodice() {
		Random ran = new Random();
		codice = ran.nextInt(10000);
			}
	
	public double getPrezzoIva() {
		return prezzo * iva;
	}
	
	public String getNomeEsteso() {
		return nome + "-" + codice;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setDescrizione (String descrizione) {
		this.descrizione = descrizione;
	}
	
	public String getDescrizione() {
		return descrizione;
	}
	
	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}
	
	public double getPrezzoBase() {
		return prezzo;
	}
	
}	


