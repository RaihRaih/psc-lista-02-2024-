
programa {
  funcao inicio() {
    
    //declaração de variáveis e leitura de dados, em seguida.
    real precoGasolina, gasolinaCliente, precoTotal

    escreva("Digite o preço do litra da gasolina: ")
      leia( precoGasolina)
    
    escreva("Digite quantos litros foram vendidos para o cliente: ")
      leia(gasolinaCliente)

    //Calculo e apresentacao do resultado na tela
    precoTotal = precoGasolina * gasolinaCliente

    escreva("Total: R$", precoTotal)


  }
}
