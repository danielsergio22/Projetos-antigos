var operacao = prompt("Qual a operação a ser feita? (digite um dos símbolos +-*/)")
var primeiroValor = parseFloat(prompt("Digite o primerio valor:"))
var segundoValor = parseFloat(prompt("Digite o primerio valor:"))
switch (operacao){
  case"+":
    var resultado = primeiroValor + segundoValor
    break
  case"-":
    var resultado = primeiroValor - segundoValor
    break
  case"*":
    var resultado = primeiroValor * segundoValor
    break
  case"/":
    var resultado = primeiroValor / segundoValor
    break
  default:
  operacao = "i"
}
if (operacao == "i"){
  document.write("<h2>opção Inválida</h2>")
} else{
  document.write("<h2>" + primeiroValor +" "+ operacao +" "+ segundoValor +" = "+ resultado + "</h2>")
}