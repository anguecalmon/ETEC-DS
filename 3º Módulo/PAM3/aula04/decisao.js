let pivo = true;

if(pivo) {
    console.log("Olá pessoal")
} else {
    console.log("Bye bye bye")
}

let nome

if(nome) {
    console.log("Hétero top na área")
} else {
    console.log("Hétero top nos deixou")
}

function testezinho (entrada) {
    if (entrada === "João") {
        return console.log("Sua entrada foi:", entrada)
    }
    console.log("Nada entrou")

    if (entrada === 1) {
        return console.log("Sua entrada foi", entrada)
    }
    console.log("Nenhum nome confere")
}

testezinho("João")
testezinho(1)



let num = 1
let msg

num === 1 ? msg = "O número é 1" : msg = "O número não é 1"

console.log(msg)

num = 1

switch (num) {
    case 1:
        msg = "um"
    break;
    case 2:
        msg = "dois"
    break;
    case 3:
        msg = "três"
    break;
    default:
        msg = "Sem número"
} 
console.log(msg)
