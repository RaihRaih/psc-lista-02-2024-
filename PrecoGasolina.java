// Raissa Rodrigues - Sistemas de informação 

import java.util.Scanner;

public class PrecoGasolina {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        float precoLitro, litrosVendidos, precoTotal;
        //leitura dos dados
        System.out.print("Digite o preço do litro da gasolina: ");
        precoLitro = scanner.nextFloat();
        
        System.out.print("Digite a quantidade de litros vendidos: ");
        litrosVendidos = scanner.nextFloat();
        
        //calculo da gasolina
        precoTotal = precoLitro * litrosVendidos;
        
        System.out.println("O cliente deve pagar R$" + precoTotal);
        
        scanner.close();
    }
}

