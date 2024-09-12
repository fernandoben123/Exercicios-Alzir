let numero = 5;
let primo = true;

if (numero <= 1) {
    primo = false;
}

for (let i = 2; i < numero; i++) {
    if (numero % i == 0) {
        primo = false;
    }
}

if (primo) {
    console.log(`${numero} é primo`);
} else {
    console.log(`${numero} não é primo`);
}
