package LabVeiculo;

public class Veiculo {
	protected int velocidade;
	
	public void acelerar(int acelerar) {
		velocidade = velocidade + acelerar;
	}
	
	public void frear(int frear) {
		velocidade = velocidade - frear;
	}
	
	public String toString(){
		return new String("Velocidade:" + velocidade);		
	}

}