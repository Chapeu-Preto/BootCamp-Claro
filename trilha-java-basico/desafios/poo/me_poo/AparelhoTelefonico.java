package com.desafio_bootcamp_claro_dio.me_poo;

import java.util.Scanner;

public class AparelhoTelefonico {

	public void menu() {
		Scanner scanner = new Scanner(System.in);
		int opcao = -1;
		
		while (opcao != 0) {
			System.out.println("    Telefone    ");
			System.out.println(" 1- Fazer Chamada ");
			System.out.println(" 2- Finalizar Chamada ");
			System.out.println(" 3- Discar Número ");
			
			opcao = scanner.nextInt();
			
			switch (opcao) {
			
			case 1: 
				fazerChamada();
				break;
			case 2:
				finalizarChamada();
				break;
			case 3:
				discarNumero();
			default:
				System.out.println(" Não foi possivel realizar ação");
			}
		}
	}
	
	public void fazerChamada() {
		
		System.out.println("Chamando....");
	}
	
	public void finalizarChamada() {
		System.out.println("Chamada Encerrada");
	}
	
	public void discarNumero() {
		System.out.println("Discando Número");
	}
}
