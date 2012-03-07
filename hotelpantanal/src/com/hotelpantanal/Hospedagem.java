package com.hotelpantanal;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Hospedagem {
	private double qtdeDiaria;
	private String tipoApartamento;
	private int diasHospedagem;
	private double telefone;
	private double televisao;

	public Hospedagem() {

	}

	public void message() {
		System.out.println("Welcome to Patanal Hotel");
	}

	public void inputDados() {
		Scanner input = new Scanner(System.in);
		System.out.println("Digite o numero de dias hospedados:");
		setDiasHospedagem(input.nextInt());
		System.out.println("Tipos de apartamento (S - Simples) (C - Comum) (T - Suite) ");
		
		System.out.println("Digite o tipo de apartamento: ");
		tipoApartamento = input.next();
		while(!tipoApartamento.equals("C") && !tipoApartamento.equals("S") && !tipoApartamento.equals("T")){
			System.out.println(String.format("Tipo invalido (%s)", this.tipoApartamento));
			System.out.println("Digite o tipo de apartamento: ");
			tipoApartamento = input.next();
			}
		
		setDiaria(tipoApartamento);
		

		System.out.println("Foi utilizado o serviço de telefone: (s/n) ");
		String optel = input.next();
		if (optel.equals("s")) {
			System.out.println("Quantas vezes usou o serviço de telefone: ");
			setTelefone(input.nextDouble());
		}
		System.out.println("Foi utilizado o serviço de televisao: (s/n) ");
		String optv = input.next();
		if (optv.equals("s")) {
			System.out.println("Quantos dias foi utilizado a televisao: ");
			setTelevisao(input.nextDouble());
		}
	}

	public void outputDados() {
		DecimalFormat format2F = new DecimalFormat("0.00");
		
		System.out.println("### Hotel Pantanal ###");
		System.out.println("Numero de dias de hospedagem: "	+ this.getDiasHospedagem());
		System.out.println("Tipo do apartamento:  " + tipoApartamento);
		System.out.println("Diarias: ....R$ " + format2F.format(this.getDiaria()).toString());
		System.out.println("Telefone: ....R$ " + format2F.format(this.getTelefone()).toString());
		System.out.println("Televisão: ....R$ " + format2F.format(this.getTelevisao()).toString());
		System.out.println("TOTAL: ....R$ " + format2F.format(this.getValorTotal()).toString());
	}

	public double getDiaria() {
		return qtdeDiaria;
	}

	public void setDiaria(String opcao){
		 if(opcao.equals("S") || opcao.equals("s")){
			this.qtdeDiaria = getDiasHospedagem()*30.00;
		}else if(opcao.equals("C") || opcao.equals("c")){
			this.qtdeDiaria = getDiasHospedagem()*50.00;
		}else if(opcao.equals("T") || opcao.equals("t")){
			this.qtdeDiaria = getDiasHospedagem()*75.00;
		}
				
	}

	public double getTelefone() {
		return telefone;
	}

	public void setTelefone(double telefone) {
		this.telefone = telefone * 1.35;
	}

	public double getTelevisao() {
		return televisao;
	}

	public void setTelevisao(double televisao) {
		this.televisao = televisao * 4.50;
	}

	public int getDiasHospedagem() {
		return diasHospedagem;
	}

	public void setDiasHospedagem(int dias) {
		this.diasHospedagem = dias;
	}

	public double getValorTotal() {
		return getDiaria() + getTelefone() + getTelevisao(); 
	}

} // end of class Hospedagem

