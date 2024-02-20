fun main() {
    // Do While Loop adalah perulangan yang hampir sama dengan While Loop
    // Yang membedakan adalah, pada Do While Loop,
    // kode blok akan dijalankan dahulu, baru diakhir dilakukan pengecekan kondisi

    var no = 1

    do { //do tetap menjalankan baris kode pertama sebelum diulang jika kondisi memenuhi
        println("nomor ke $no")
        no++
    } while (no <= 10) //melakukan pengecekan kondisinya di akhir

    println("Selesai") //jika kondisi dowhile sudah tidak memenuhi atau false maka pengulangan dihentikan dan menjalankan baris berikutnya
}