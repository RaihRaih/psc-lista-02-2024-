// Raissa Rodrigues - Sistemas de informação 

import java.util.Scanner;

public class ViagemEurotrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        float total, passagemAlemanha, passagemPortugal, passagemItalia;
        int pessoas;
        
        //leitura dos dados
        System.out.print("Digite o preço da passagem para Alemanha: ");
        passagemAlemanha = scanner.nextFloat();
        
        System.out.print("Digite o preço da passagem para Portugal: ");
        passagemPortugal = scanner.nextFloat();
    
        System.out.print("Digite o preço da viagem para a Itália: ");
        passagemItalia = scanner.nextFloat();
        
        System.out.print("Digite a quantidade de pessoas que irão para a viagem: ");
        pessoas = scanner.nextInt();
        
        //calculo do valor total
        total = (passagemAlemanha + passagemPortugal + passagemItalia) * (pessoas);
        
        System.out.println("O valor total da viagem é: R$" + total);
        
        scanner.close();
    }
}