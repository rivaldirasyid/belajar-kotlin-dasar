const val nilaiAkhir = 85

fun main() {
    ifExspression()
    elseExspression()
    elseIfExspression()
}

fun ifExspression() {
    // Dalam Kotlin, if adalah salah satu kata kunci yang digunakan untuk percabangan
    // Percabangan artinya kita bisa mengeksekusi kode program tertentu ketika suatu kondisi terpenuhi
    // Hampir di semua bahasa pemrograman mendukung if expression

    // if(kondisi boolean) {
    // jika kondisi boolean true
    // maka isi blok if akan dieksekusi
    // }

    if (nilaiAkhir > 80) {
        println("Anda Lulus!") // jika kondisi nilai akhir lebih dari 80 dan mengashilkan nilai true maka cetak Anda Lulus! akan dieksekusi
    }
}

fun elseExspression() {
    // Blok if akan dieksekusi ketika kondisi if bernilai true
    // Kadang kita ingin melakukan eksekusi program tertentu jika kondisi if bernilai false
    // Hal ini bisa dilakukan menggunakan else expression

    // if(kondisi boolean) {
        // jika kondisi boolean true
        // maka isi blok if akan dieksekusi
    // } else {
        // jika kondisi boolean bernilai false
        // maka isi blok else akan dieksekusi
    // }

    if (nilaiAkhir > 90) {
        println("Good Job!")
    } else {
        println("Note Bad!") // jika kondisi nilai akhir tidak lebih dari 90 dan mengashilkan nilai false maka blok else akan dieksekusi
    }
}

fun elseIfExspression() {
    // Kadang dalam If, kita butuh membuat beberapa kondisi
    // Kasus seperti ini, di Kotlin kita bisa menggunakan Else If expression

    // if (kondisi boolean 1) {
        // jika kondisi boolean true
        // maka isi blok if akan dieksekusi
    // } else if (kondisi boolean 2) {
        // jika kondisi boolean bernilai true
        // maka isi blok else if akan dieksekusi
    // } else {
        // jika kondisi boolean bernilai false
        // maka isi blok else akan dieksekusi
    // }

    if (nilaiAkhir > 90) {
        println("Great!")
    } else if (nilaiAkhir > 80) { // jika kondisi nilai akhir lebih dari 80 dan kurang dari 90 dan mengashilkan nilai true maka blok else if ini akan dieksekusi
        println("Good Job!")
    } else if (nilaiAkhir > 70) { // jika kondisi nilai akhir lebih dari 70 dan kurang dari 90 dan 80 lalu mengashilkan nilai true maka blok else if ini akan dieksekusi
        println("Not Bad!")
    } else {
        println("Try Again Next Year!")
    }

}