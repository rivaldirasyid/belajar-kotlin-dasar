fun main() {
    // Break & continue adalah kata kunci yang bisa digunakan dalam semua perulangan di Kotlin
    // Break digunakan untuk menghentikan seluruh perulangan
    // Continue adalah digunakan untuk menghentikan perulangan yang berjalan, dan langsung melanjutkan ke perulangan selanjutnya

    var angka = 0

    //Contoh sederhana penggunaan Break
    while (true) {
        println("Angka ke $angka")
        angka++
        if (angka > 1000){
            break //menghentikan perulangan dengan kondisi jika i lebih dari 1000
        }
    }
    println("Selesai diangka $angka")

    //Contoh sederhana penggunaan Continue
    for (i in 1..100){
        if (i % 2 == 0) { //jika di modulo 0 atau habis dibagi 2 maka continue
            continue
        }
        println("Angka ke $i") //menghasilkan hanya angka bilangan ganjil karena bilangan genap sudah di continue
    }

}