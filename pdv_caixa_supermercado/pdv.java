package exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class pdv {

	public static void main(String[] args) {
		// variaveis
		double total, desconto, totaldesconto, valorpago, troco;
		//objetos
		Scanner teclado = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("#0.00");
		//entrada 1
		System.out.println("PDV");
		System.out.print("valor total: ");
		total = teclado.nextDouble();
		System.out.print("desconto (%): ");
		desconto = teclado.nextDouble();
		//processamento01
		totaldesconto = total - (desconto * total) / 100;
		//saida1
		System.out.println("total com desconto: R$ " + formatador.format(totaldesconto));
		// entrada 02
		System.out.println("------------------------------------");
		System.out.print("valor pago em dinheiro: ");
		valorpago = teclado.nextDouble();
		//processamento02
		troco = valorpago - totaldesconto;
		//saida 02
		System.out.println("troco: R$ " + formatador.format(troco));
		System.out.println("foi um prazer ter voce aqui  volte sempre!!! ");
		teclado.close();
		
	}

}
