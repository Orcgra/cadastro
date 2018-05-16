package br.orcgra.domain;

import java.util.Date;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		OrdemServico OS = new OrdemServico();
	
		int ticket;
		
		Scanner tck = new Scanner(System.in);
		System.out.println("Entre com o ticket:");
		ticket = tck.nextInt();
		
		System.out.println("Descreva o serviço;");
		String descricao = tck.next();
		
	
		OS.setTicket(ticket);
		OS.setData(new Date());
		OS.setDescricao(descricao);
		
		OS.getTicket();
		OS.getData();
		OS.getValor();
		OS.getDescricao();
		OS.getValor_total();
		OS.getTempo_utilizado();
	}

}
