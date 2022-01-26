var preçoDoDolar = prompt("qual o preço absurdo do dolar atualmente? (Março de 2021: 5.51 reais) ps:escreva os valores com .")
var preçoDoDolar = parseFloat(preçoDoDolar)
var valorEmDolar = prompt("Qual o valor em dolar que você quer converter?")
var valorEmDolar = parseFloat(valorEmDolar)
var valorEmReal = valorEmDolar * preçoDoDolar
alert(valorEmReal)