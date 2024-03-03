// Raissa Rodrigues - Sistemas de informação 

import java.util.Scanner;

public class OperacoesMatematicas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        float numero1, numero2, soma, subtracao, multiplicacao;

        //leitura dos dados,em seguida, mostra resultado na tela
        System.out.print("Digite o primeiro numero: ");
        numero1 = scanner.nextFloat();
        System.out.print("Digite o segundo numero: ");
        numero2 = scanner.nextFloat();

        soma = numero1 + numero2;
        subtracao = numero1 - numero2;
        multiplicacao = numero1 * numero2;

        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Multiplicação: " + multiplicacao);

        scanner.close();
    }
}
