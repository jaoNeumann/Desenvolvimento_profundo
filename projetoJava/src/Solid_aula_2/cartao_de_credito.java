package Solid_aula_2;

public class cartao_de_credito extends cartao_base{

	@Override
	public boolean pagar() {
		if(this.validar()) {
			return true;
		}else {
		return false;
		}
	}
}
