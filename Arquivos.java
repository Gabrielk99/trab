package com.relatorio.trabalho.java;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class Arquivos {
	public boolean lerArqDocent(List<Docente> list, String arg) {
		try {
			Scanner arq = new Scanner(new File(arg));
			String ler;
			String[] line;
			arq.nextLine();
			while (arq.hasNextLine()) {
				ler = arq.nextLine();
				line = ler.split(";");
				int i = 0;
				int cod = Integer.parseInt(line[i++]);
				String nome = line[i++];
				String dep = line[i++];
				list.add(new Docente(cod, nome, dep));
			}
			return true;

		} catch (IOException e) {
			System.err.printf("Erro de IO: %s.\n", e.getMessage());
			return false;
		}
	}

	public boolean lerArqDiscent(List<Discente> list, String arg) {
		try {
			Scanner arq = new Scanner(new File(arg));
			String ler;
			String[] line;
			arq.nextLine();
			while (arq.hasNextLine()) {
				ler = arq.nextLine();
				line = ler.split(";");
				int i = 0;
				long mat = Long.parseLong(line[i++]);
				String nome = line[i++];
				double cod = Double.parseDouble(line[i++]);
				Discente disc = new Discente(nome, cod, mat);
				list.add(disc);
			}
			return true;
		
		} catch (IOException e) {
			System.err.printf("Erro de IO: %s.\n", e.getMessage());
			return false;
		}
	}

	public boolean lerArqDisciplina(List<Disciplina> list, String arg) {
		try {
			Scanner arq = new Scanner(new File(arg));
			String ler;
			String[] line;
			arq.nextLine();
			while (arq.hasNextLine()) {
				ler = arq.nextLine();
				line = ler.split(";");
				int i = 0;
				String cod = line[i++];
				String nome = line[i++];
				int codD = Integer.parseInt(line[i++]);
				int cargHS = Integer.parseInt(line[i++]);
				int cargHSM = Integer.parseInt(line[i++]);
				double cc = Double.parseDouble(line[i++]);
				Disciplina discpl = new Disciplina(cod, nome, cargHS, cargHSM, codD, cc);
				list.add(discpl);
			}
			return true;

		} catch (IOException e) {
			System.err.printf("Erro de IO: %s.\n", e.getMessage());
			return false;
		}
	}

	public boolean lerArqCurso(List<Curso> list, String arg) {
		try {
			Scanner arq = new Scanner(new File(arg));
			String ler;
			String[] line;
			arq.nextLine();
			ler = arq.nextLine();
			line = ler.split(";");
			while (arq.hasNextLine()) {
				ler = arq.nextLine();
				int i = 0;
				String g;
				String pg;
				double cod = Double.parseDouble(line[i++]);
				String nome = line[i++];
				if(line.length == 4) {
				g = line[i++];
				pg = line[i++];
				}
				else {
					g = line[i++];
					pg = " ";
				}
				Curso cur = new Curso(cod, nome, g, pg);
				list.add(cur);
			}
			return true;
		} catch (IOException e) {
			System.err.printf("Erfor (int i = 0; i < line.length; i++) {ro de IO: %s.\n", e.getMessage());
			return false;
		}
	}

	public boolean lerArqGrad(List<Graduacao> list, String arg) {
		try {
			Scanner arq = new Scanner(new File(arg));
			String ler;
			String[] line;
			arq.nextLine();
			while (arq.hasNextLine()) {
				ler = arq.nextLine();
				line = ler.split(";");
				int i = 0;
				int cd = Integer.parseInt(line[i++]);
				long m = Long.parseLong(line[i++]);
				double cc = Double.parseDouble(line[i++]);
				int cghs = Integer.parseInt(line[i++]);
				int csms = Integer.parseInt(line[i++]);
				Graduacao g = new Graduacao(cd, m, cc, cghs, csms);
				list.add(g);
			}
			return true;
		} catch (IOException e) {
			System.err.printf("Erro de IO: %s.\n", e.getMessage());
			return false;
		}
	}

	public boolean lerArqPos(List<posGraduacao> list, String arg) {
		try {
			Scanner arq = new Scanner(new File(arg));
			String ler;
			String[] line;
			arq.nextLine();
			while (arq.hasNextLine()) {
				ler = arq.nextLine();
				line = ler.split(";");
				int i = 0;
				int cd = Integer.parseInt(line[i++]);
				long m = Long.parseLong(line[i++]);
				Date dat;
				try {
					String dado = line[i++];
					DateFormat data = DateFormat.getDateInstance();
					dat = data.parse(dado);
				} catch (Exception ex) {
					System.out.printf("Erro: %s.\n", ex.getMessage());
					return false;
				}
				String prog = line[i++];
				int chs = Integer.parseInt(line[i++]);
				int csms = Integer.parseInt(line[i++]);
				list.add(new posGraduacao(cd, m, prog, chs, dat, csms));
			}
			return true;
		} catch (IOException e) {
			System.err.printf("Erro de IO: %s.\n", e.getMessage());
			return false;
		}
	}

	public boolean lerArqProd(List<prodCien> list, String arg) {
		try {
			Scanner arq = new Scanner(new File(arg));
			String ler;
			String[] line;
			arq.nextLine();
			while (arq.hasNextLine()) {
				ler = arq.nextLine();
				line = ler.split(";");
				int i = 0;
				String t;
				String q;
				int cd = Integer.parseInt(line[i++]);
				t = line[i++];
				if (line.length == 3) {
					q = line[i++];
				} else
					q = " ";
				prodCien c = new prodCien(t, cd, q);
				list.add(c);
			}
			return true;
		} catch (IOException e) {
			System.err.printf("Erro de IO: %s.\n", e.getMessage());
			return false;
		}
	}
}
