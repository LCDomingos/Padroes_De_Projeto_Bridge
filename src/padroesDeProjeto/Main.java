package padroesDeProjeto;

public class Main {
	
	public static void main(String[] args) {
		
		Automovel bmw = new BMW320i(new Azul());
		bmw.pintar();
		
		Automovel porsche = new Porsche911(new Vermelho());
		porsche.pintar();
		
				
	}

}
