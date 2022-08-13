package aulaJava;

import java.util.Random;
import java.util.Scanner;

public class Jogo {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		Random gerador = new Random();

		int opcao, escolhaComputador, escolhaUsuario;

		System.out.println("Olá, Qual é seu nome?");
		String nome = ler.nextLine();
		System.out.println("Prazer em conhece-lo " + nome + "!");
		System.out.println(nome + ", Vamos jogar o jogo da advinhação ?");
		System.out.println("digite 1 para jogar ou 2 para sair");
		opcao = ler.nextInt();

		if (opcao == 2) {
			System.out.println("Fica para próxima então!");
		} else if (opcao == 1) {
			System.out.println("Vamos jogar!");
			System.out.println("Tente advinhar um numero entre 0 e 10");
			
			escolhaComputador = gerador.nextInt(11);
			System.out.println(nome +" Eu ja escolhi");
			System.out.println("Agora é com você HAHAHAHHHHH!");
			
			do {
				escolhaUsuario = ler.nextInt();
				if(escolhaComputador != escolhaUsuario) {
					System.out.println("Errou,tente novamente");
				}else {
					System.out.println(nome +" Parabéns! Voce acertou!");
				}
			}while(escolhaComputador != escolhaUsuario);
			
		}
	}
}
