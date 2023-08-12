package Solid_aula_2;

public class cartao_da_senf extends cartao_base{
	@Override
	protected boolean validarData() {
		return true;
	}

	@Override
	public boolean pagar() {
		if(this.validar()) {
			return true;
		}else {
		return false;
		}
	}
}