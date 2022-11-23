package padroesDeProjeto;

public class Porsche911 extends Automovel{

	public Porsche911(Cor plantaDePintura) {
		super(plantaDePintura);
	}

	@Override
	public void pintar() {
		System.out.print("Foi pintada uma Porsche 911 na cor ");
		plantaDePintura.cor();
	}
	

}
