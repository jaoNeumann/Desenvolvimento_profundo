package Solid_aula_2;

public class boleto implements servico_financeiro{
	public String Numero;
	public String DataVencimento;
	public double Valor;
	
	public boolean Processar() {
		//Código para processar o pagamento
			//Invocar a API do banco emissor do boleto
		return true;
	}

	@Override
	public boolean pagar() {
		if(this.Processar()) {
			return true;
		}else {
		return false;
		}
	}
	
	
}
