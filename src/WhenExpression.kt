
const val nilaiMataKuliahPemrogramman = 'E'

fun main() {
    // Selain if expression, untuk melakukan percabangan di Kotlin, kita juga bisa menggunakan When Expression
    // When expression sangat sederhana dibandingkan if
    // Biasanya when expression digunakan untuk melakukan pengecekan ke kondisi dalam satu variable

    when (nilaiMataKuliahPemrogramman) {
        'A' -> { //gunakan kurung kurawal jika ingin menjalankan beberapa perintah
            println("Great!")
            println("WOW!")
        }
        'B' -> println("Good Job!")
        'C' -> println("Not Bad!")
        'D' -> println("Bad!")
        'E' -> println("Try Again Next Year!")
        else -> println("Ups!")
    }

    whenExpressionMultipleOption()
    whenExpressionIn()
    whenExpressionIs()
    whenSebagaiPenggantiIfElse()
}

fun whenExpressionMultipleOption() {
    when (nilaiMataKuliahPemrogramman) {
        'A', 'B', 'C' -> println("Lulus") // Menggunakan multiple option atau banyak pilihan
        else -> {
            println("Tidak Lulus")
        }
    }
}

fun whenExpressionIn() {
    val nilaiSiswa = 'D'
    val nilai = arrayOf('A', 'B', 'C')

    when (nilaiSiswa) {
        in nilai -> println("Anda Lulus!") // in disini bisa langsung mengakses data dari array yang kita buat tampa mengeceknya satu satu
        !in nilai -> {
            println("Maaf Anda Tidak Lulus!")
        }
    }

}

fun whenExpressionIs() {
    // mengecek tipe data dengan When Is

    val name = "Rivaldi"
    when (name) {
        is String -> println("Ini adalah String")
        !is String -> println("Ini bukan String")
        else -> {
            println("hehehe")
        }
    }
}

fun whenSebagaiPenggantiIfElse() {
    // Selain pengecekan terhadap variable
    // When juga dapat digunakan sebagai pengganti if else
    // Untuk mengganti if else dengan when, kita tidak perlu menggunakan variable dalam when

    val nilaiMataKuliah = 50

    when {
        nilaiMataKuliah > 90 -> println("Great")
        nilaiMataKuliah > 80 -> println("Good")
        nilaiMataKuliah > 70 -> println("Not Bad")
        nilaiMataKuliah > 60 -> println("Bad")
        else -> {
            println("the fuck youre idiot!")
        }
    }
}

