package com.desafio_bootcamp_claro_dio.me_poo;

import java.util.Scanner;


class ReprodutorMusical {

	public void menu() {

		Scanner scanner = new Scanner(System.in);
		int opcao = -1;
		
		while (opcao != 0) {
			System.out.println("     Reprodutor Musical    ");
			System.out.println(" 1- Tocar Música ");
			System.out.println(" 2- Pausar Música ");
			System.out.println(" 3- Parar Música ");
			System.out.println(" 4- Voltar ao Inicio ");
			opcao = scanner.nextInt();
			
			switch (opcao) {
			case 1:
				tocarMusica();
				break;
			case 2:
				pausarMusica();
				break;
			case 3:
				pararMusica();
				break;
			default:
				System.out.println(" Ação Invalida ");
				break;
			}
		}
	}
	
	public void tocarMusica() {
		System.out.println("Tocando Música...");
	}
	
	public void pausarMusica() {
		System.out.println("Musica Pausada...");
	}
	
	public void pararMusica() {
		System.out.println("Musica parada");
	}
}
