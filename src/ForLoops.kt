

fun main() {
    //Dalam bahasa pemrograman, biasanya ada fitur yang bernama perulangan
    //Salah satu fitur perulangan di Kotlin adalah for
    //For digunakan untuk melakukan perulangan iterasi dari data iterator (Array, Range, dan lain-lain)

    forArray()
    forRange()

}

fun forArray() {
    val names = arrayOf("Rivaldi", "Rasyid", "Ipang", "Gustian", "Joko", "Budi")

    var total = 0
    for (name in names) { //membuat variabel perulangan yaitu name untuk mmenyimpan data dari variabel yang kita lakukan perulangan
        total++
        println(name)
    }
    println("total perualngan = $total")

}

fun forRange() {
    val names = arrayOf("Rivaldi", "Rasyid", "Ipang", "Gustian", "Joko", "Budi")

    val ukuranArray = names.size -1 // karena index array diitung dari 0, jadi kita harus melaukan -1 agar perulangan bisa dilakukan

    //for (i in 0..5) menggunakan seperti ini juga bisa cuman kita harus tau length atau ukuran arraynya
    //for (i in 1..100 step 2) kita bisa melakukan perulangan dengan tipe data Range
    //for (i in 0 downTo 1000 step 5) kita juga bisa melakukan penurunan
    for (i in 0..ukuranArray){
        println("No $i Untuk ${names.get(i)}") //mendaptkan nilai perulangan beserta data array
    }
}