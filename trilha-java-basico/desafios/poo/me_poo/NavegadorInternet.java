package com.desafio_bootcamp_claro_dio.me_poo;

import java.util.Scanner;

public class NavegadorInternet {

	public void menu () {
		Scanner scanner = new Scanner(System.in);
		int opcao = -1;
		
		while (opcao != 0) {
			System.out.println("  Abrir Google");
			System.out.println("Abrir Site");
			System.out.println("Atualizar Pagina");
			System.out.println("Fechar Navegador");
			opcao = scanner.nextInt();
			
			switch (opcao) {
			
			case 1:
				abrirSite();
				break;
			case 2:
				atualizarPagina();
				break;
			case 3:
				fecharNavegador();
				break;
			default:
				System.out.println("Ação não reconhecida");
				break;
	
			}
		}
		
	}
	
	public void abrirSite() {
		System.out.println("Abrindo Google");
	}
	
	public void atualizarPagina() {
		System.out.println("A pagina foi atualizada");
	}
	
	public void fecharNavegador() {
		System.out.println("Navegador Fechado");
	}
}
