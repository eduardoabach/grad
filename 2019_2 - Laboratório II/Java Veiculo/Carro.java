package LabVeiculo;

public class Carro extends Veiculo{
	protected float combustivelDisponivel;
	protected final float combustivelCapacidade = 55;

	public boolean abastece(float qtdLitrosCombust){
		var result = combustivelDisponivel + qtdLitrosCombust;
		if(result <= combustivelCapacidade){
			combustivelDisponivel = result;
			return true;
		}

		return false;
	}

	public boolean consumirCombustivel(float qtdLitrosCombust){
		var result = combustivelDisponivel - qtdLitrosCombust;
		if(result >= 0){
			combustivelDisponivel = result;
			return true;
		}

		return false;
	}

	public float getAutonimia(float kmPorLitro){
		return kmPorLitro * combustivelDisponivel;
	}

    public String toString(){
        return (super.toString() + " Combustível: " + combustivelDisponivel + " litro(s)");
    }

}
