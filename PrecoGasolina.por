
programa {
  funcao inicio() {
    
    //declara��o de vari�veis e leitura de dados, em seguida.
    real precoGasolina, gasolinaCliente, precoTotal

    escreva("Digite o pre�o do litra da gasolina: ")
      leia( precoGasolina)
    
    escreva("Digite quantos litros foram vendidos para o cliente: ")
      leia(gasolinaCliente)

    //Calculo e apresentacao do resultado na tela
    precoTotal = precoGasolina * gasolinaCliente

    escreva("Total: R$", precoTotal)


  }
}
