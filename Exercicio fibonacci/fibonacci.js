var a = 0
var b = 1
var n = 8

for (i = 0; i < n; i++) {
    console.log(a)
    var termoatual = a + b
    a = b
    b = termoatual
}

