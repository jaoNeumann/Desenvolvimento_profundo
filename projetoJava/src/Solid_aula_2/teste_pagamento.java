package Solid_aula_2;

public class teste_pagamento {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cartao_de_credito cc = new cartao_de_credito();
		cartao_da_senf cs = new cartao_da_senf();

		venda v = new venda();
		
		cc.Nome = "Pedro de Lara";
		cc.Numero = "999";
		cc.Data_validade = "08/2029";
		cc.ValorCobrado = 10100;
		
		cs.Nome = "Pedro de Lara";
		cs.Numero = "999";
		cs.Data_validade = "08/2029";
		cs.ValorCobrado = 10100;
		
		if(v.processar_pagamento(cc)) {
			System.out.println("Compra Crédito confirmada");
		}else {
			System.out.println("Compra Crédito recusada");
		}
	
		if(v.processar_pagamento(cs)) {
			System.out.println("Compra Crédito Senf confirmada");
		}else {
			System.out.println("Compra Crédito Senf recusada");
		}
	}
}
