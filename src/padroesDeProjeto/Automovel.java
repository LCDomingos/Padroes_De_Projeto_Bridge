package padroesDeProjeto;

public abstract class Automovel {
	
	protected Cor plantaDePintura;
	
	protected Automovel(Cor pintar) {
		this.plantaDePintura = pintar;
		
	}
	
	abstract public void pintar();
	

}
