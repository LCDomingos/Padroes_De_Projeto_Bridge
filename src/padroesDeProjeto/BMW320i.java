package padroesDeProjeto;

public class BMW320i extends Automovel{

	public BMW320i(Cor plantaDePintura) {
		super(plantaDePintura);
	}

	@Override
	public void pintar() {
		System.out.print("Foi pintada uma BMW320i na cor ");
		plantaDePintura.cor();
	}
	

}
