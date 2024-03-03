
programa {
  funcao inicio() {
    
    //declaração de variáveis e leitura de dados, em seguida.
    real nota1, nota2, nota3, nota4, media
  
    escreva("Digite a primeira nota: ")
      leia( nota1)
    escreva("Digite a segunda nota: ")
      leia(nota2)
    escreva("Digite a terceira nota: ")
      leia(nota3)
    escreva("Digite a quarta nota: ")
      leia(nota4)

    //soma dos numeros, em seguida, calculo da media e resultado na tela.
    media = (nota1 + nota2 + nota3 + nota4)/4

    escreva("Soma dos numeros: "+ media)

  }
}
