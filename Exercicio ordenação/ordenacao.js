function quickSort(array) {

    if (array.length <= 1) {
        return array;
    }

    let pivo = array[0];

    let menores = [];
    let maiores = [];

    for (let i = 1; i < array.length; i++) {
        if (array[i] < pivo) {
            menores.push(array[i]);
        } else {
            maiores.push(array[i]); 
        }
    }

    return [...quickSort(menores), pivo, ...quickSort(maiores)];
}

let numeros = [8, 3, 1, 7, 0, 10, 2];
let numerosOrdenados = quickSort(numeros);
console.log("Lista ordenada:", numerosOrdenados);