package LabVeiculo;

public class CarroTeste {
    public static void main(String[] args) {
        Carro carroT = new Carro();
    
        carroT.abastece(25);
        carroT.consumirCombustivel(5);
        System.out.println("Teste: " + (carroT.combustivelDisponivel == 20 ? "Ok" : "Erro"));
        System.out.println("Teste: " + (carroT.getAutonimia(10) == 200 ? "Ok" : "Erro")); // 10 km/l são 200 de autonomia em 20l 
     
        carroT.velocidade = 0;
        carroT.acelera(10);
        carroT.acelera(15);
        System.out.println("Teste: " + (carroT.velocidade == 25 ? "Ok" : "Erro"));
        
        carroT.freia(20);
        System.out.println("Teste: " + (carroT.velocidade == 5 ? "Ok" : "Erro"));
    }
}