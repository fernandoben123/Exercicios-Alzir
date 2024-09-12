let dados = [1, 7];

let primeiro = dados[0];
let ultimo = dados[dados.length - 1];

let contagem = 0;

for (let i = primeiro; i <= ultimo; i++) {
    contagem++;
}

console.log(`Total de inteiros: ${contagem}`);
