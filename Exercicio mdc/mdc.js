function calcularMDC(a, b) {

    while (b !== 0) {
    let temp = b;
        
    b = a % b;

    a = temp;
    }
    return a;
}

let num1 = 56;
let num2 = 98;

let mdc = calcularMDC(num1, num2);
console.log(`O MDC de ${num1} e ${num2} é: ${mdc}`);