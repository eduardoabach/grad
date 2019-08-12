package LabVeiculo;

public class OnibusTeste {
    public static void main(String[] args) {
        Onibus onibusT = new Onibus();
        
        onibusT.embarca(30);
        onibusT.desembarca(20);
        System.out.println("Teste: " + (onibusT.qtdPassageiros == 10 ? "Ok" : "Erro"));
        
     
        onibusT.velocidade = 0;
        onibusT.acelera(10);
        onibusT.acelera(15);
        System.out.println("Teste: " + (onibusT.velocidade == 25 ? "Ok" : "Erro"));
        
        onibusT.freia(20);
        System.out.println("Teste: " + (onibusT.velocidade == 5 ? "Ok" : "Erro"));
    }
}