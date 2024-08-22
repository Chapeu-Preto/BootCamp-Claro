package com.desafio_bootcamp_claro_dio.me_poo;

import java.util.Scanner;


public class Smartphone {
	
	private ReprodutorMusical reprodutormusical;
	private AparelhoTelefonico aparelhoTelefonico;
	private NavegadorInternet navegadorInternet;
	
	public Smartphone() {
		reprodutormusical = new ReprodutorMusical();
		aparelhoTelefonico = new AparelhoTelefonico();
		navegadorInternet = new NavegadorInternet();
	}
	
	public void iniciar () {
		Scanner scanner = new Scanner(System.in);
		int opcao = -1;
		
		while (opcao != 0) {
			
			System.out.println("      Iphone     ");
			System.out.println("  1. Play List");
			System.out.println("  2. Telefone");
			System.out.println("  3. Google Chrome");
			System.out.println(" Escolha uma das pções ");
			
			opcao = scanner.nextInt();
			
			switch (opcao) {
			
			case 1:
				reprodutormusical.menu();
				break;
			case 2:
				aparelhoTelefonico.menu();
				break;
			case 3:
				navegadorInternet.menu();
				break;
			default:
				System.out.println("Escolha uma das funções");
			}
			
		}
	}

	public static void main(String[] args) {
		 
		Smartphone smartphone = new Smartphone();
		smartphone.iniciar();
		
	}
	
}
