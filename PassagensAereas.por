programa {
    funcao inicio() {
        
        // Declaracao das variaveis
        inteiro precoAlemanha, precoPortugal, precoItalia, totalViagem, quantidadePessoas

        // Solicitacoes com os precos das viagens para cada destino
        escreva("Digite o preco da viagem para a Alemanha: ")
        leia(precoAlemanha)
        
        escreva("Digite o preco da viagem para Portugal: ")
        leia(precoPortugal)
        
        escreva("Digite o preco da viagem para a Italia: ")
        leia(precoItalia)
        
        
        escreva("Digite a quantidade total de pessoas: ")
        leia(quantidadePessoas)
        
        // calculo do valor total da viagem e em seguida, mostrar na tela
        totalViagem = (precoAlemanha + precoPortugal + precoItalia) * quantidadePessoas
        
        escreva("O valor total da viagem : R$", totalViagem)
    }
}
