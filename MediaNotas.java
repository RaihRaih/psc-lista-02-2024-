// Raissa Rodrigues - Sistemas de informação 

import java.util.Scanner;

public class MediaNotas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        float media, nota1, nota2, nota3, nota4;
        
        System.out.print("Digite a primeira nota: ");
        nota1 = scanner.nextFloat();
        System.out.print("Digite a segunda nota: ");
        nota2 = scanner.nextFloat();
        System.out.print("Digite a terceira nota: ");
        nota3 = scanner.nextFloat();
        System.out.print("Digite a quarta nota: ");
        nota4 = scanner.nextFloat();

        media = (nota1 + nota2 + nota3 + nota4) / 4;
        
        scanner.close();
        System.out.println("Média: " + media);
    }
}
