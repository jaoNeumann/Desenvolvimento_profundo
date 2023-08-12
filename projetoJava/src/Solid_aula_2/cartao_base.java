package Solid_aula_2;
//classe abstrata!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
public abstract class cartao_base implements servico_financeiro{
	public String Nome;
	public String Numero;
	public String Data_validade;
	public double ValorCobrado;
	
	public boolean validar() {
		if (this.validarData() 
				&& this.validarNome() 
				&& this.validarNumero()){
			return true;	
		}else{
			return false;
		}
	}

	protected boolean validarNome() {
		boolean resultado = false;
		if(this.Nome.equalsIgnoreCase("Pedro de Lara")) {
			resultado = true;
		}else {
			resultado = false;
		}
		return resultado;
	}
	protected boolean validarData() {
		boolean resultado = false;
		if(this.Data_validade.equalsIgnoreCase("08/2029")) {
			resultado = true;
		}else {
			resultado = false;
		}
		return resultado;
	}
	protected boolean validarNumero() {		
		boolean resultado = false;
		if(this.Numero.equalsIgnoreCase("999")) {
			resultado = true;
		}else {
			resultado = false;
		}
		return resultado;
	}
} 
