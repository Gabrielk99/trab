package com.relatorio.trabalho.java;

public class Graduacao {
	private int codDoc;
	private long mat;
	private double codCur;
	private int cargHorSem;
	private int cargHorSms;
	
	public Graduacao (int cd,long m,double cc,int chs,int csms) {
		this.codDoc = cd;
		this.mat = m;
		this.codCur = cc;
		this.cargHorSem=chs;
		this.cargHorSms = csms;
	}
	public boolean buscGra(int cd) {
		if(this.codDoc == cd) {
			return true;
		}
		else return false;
	}
}
