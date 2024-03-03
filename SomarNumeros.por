
programa {
    funcao inicio() {
        
        // Declaracao de variaveis e leitura de dados
        real numero1, numero2, soma, subtracao, multiplicacao
        
        escreva("Digite um numero: ")
        leia(numero1)
        escreva("Digite outro numero: ")
        leia(numero2)
        
        // Calculos
        soma = numero1 + numero2
        subtracao = numero1 - numero2
        multiplicacao = numero1 * numero2
        
        // Resultados na tela
        escreva("Soma dos numeros: ", soma, "\n")
        escreva("Subtracao dos numeros: ", subtracao, "\n")
        escreva("Multiplicacao dos numeros: ", multiplicacao)
    }
}

