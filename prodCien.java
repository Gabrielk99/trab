package com.relatorio.trabalho.java;

public class prodCien {
	private String titulo;
	private int codDoc;
	private String qualificada;
	
	public prodCien (String title, int cd, String q) {
			this.codDoc = cd;
			this.qualificada = q;
			this.titulo = title;
	}
	public boolean buscaProd(int cd) {
		if(this.codDoc == cd) {
			return true;
		}
		else return false;
	}
}
