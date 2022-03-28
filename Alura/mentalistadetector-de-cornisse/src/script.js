var i = 1
i = parseInt(prompt("Quer jogar? (1=sim | 0=nao)"))
while (i==1){
  jogar()
  i = parseInt(prompt("Quer jogar novamente? (1=sim | 0=nao)"))
}

function jogar() {
  var oNumero =parseInt(Math.random()*100)
  var tentativas = 10

  if (oNumero >=80){
    alert(" Aviso: Amigo voce é MUITO corno! ")
  } else if (oNumero <=20){
    alert(" Aviso: Amigo voce é um POUCO corno! ")
  }
  
  while (tentativas > 0){
    var chute = parseInt(prompt ("chute o seu nivel de cornisse (um numero entre 0 a 100)"))
    if (oNumero == chute){
      alert("A sua porcetagem de Cornisse é: " + oNumero + "%")
      break

    } else if (chute > oNumero){
      alert("A sua porcentagem de cornisse é MENOR (tente novamente)")
      tentativas -= 1

    } else if (chute < oNumero){
      alert("A sua porcentagem de cornisse é MAIOR (tente novamente)")
      tentativas -= 1
    }
  } 
  if (chute != oNumero){
    alert("Suas tentativas acabaram burrão. A sua porcetagem de Cornisse é: " + oNumero + "%")
  }
}