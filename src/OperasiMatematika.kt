fun main() {
    //| Operator    | Keterangan      |
    //| +           | Penjumlahan     |
    //| -           | Pengurangan     |
    //| *           | Perkalian       |
    //| /           | Pembagian       |
    //| %           | Sisa Pembagian  |

    val penambahan = 100 + 50
    val pengurangan = 100 - 50
    val perkalian = 100 * 50
    val pembagian = 100 / 50
    val sisaPembagian = 100 % 50

    println(penambahan)
    println(pengurangan)
    println(perkalian)
    println(pembagian)
    println(sisaPembagian)

    //operasi matematika dikotlin menggunakan scientific

    //melakukan pembagian dulu sebelum penambahan
    val scientific = 10 + 10 / 2

    println(scientific)

    augmentedAssignments()
    unaryOperator()
}

fun augmentedAssignments() {
    //| Operasi Matematika    | Augmented Assignments
    //| a = a + 10            | a += 10
    //| a = a - 10            | a -= 10
    //| a = a * 10            | a *= 10
    //| a = a / 10            | a /= 10
    //| a = a % 10            | a %= 10

    var tambah = 10
    tambah = tambah + 10 //contoh operasi matematika
    tambah += 10  //contoh augmented assignments

    //contoh
    var total = 0

    val barang1 = 100
    val barang2 = 150

    total = total + barang1
    total += barang2 //dipersingkat menggunakan Augmented Assignments

    println(total)
}

fun unaryOperator() {
    //| Operator    | Keterangan         |
    //| ++          | a = a + 1          |
    //| --          | a = a - 1          |
    //| -           | Negative           |
    //| +           | Positive           |
    //| !           | Boolean kebalikan  |

    var totalHarga = 100 //default sudah positive
    var totalHargaNegative = -100 //menjadi angka negative
    var sehat = true

    totalHarga++ //total = total + 1
    totalHarga++ //total = total + 1
    totalHarga-- //total = total - 1

    totalHargaNegative++

    println(totalHarga)
    println(totalHargaNegative)

    println(!sehat) //kebalikan dari data booleannya


}