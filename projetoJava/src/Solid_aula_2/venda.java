package Solid_aula_2;

public class venda {
	public double valor_a_cobrar; //provisório
	
	public boolean ProcessarPagamento(servico_financeiro f){
		boolean resultado = false;

		if(f.pagar()){
			resultado = true;
		}else{
			resultado = false;
		}
		return resultado;
	}
}
