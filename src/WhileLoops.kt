fun main() {
    // While adalah salah satu perulangan lain yang ada di Kotlin
    // While adalah salah satu perulangan yang sangat flexible,
    // dimana kode while akan melakukan pengecekan kondisi,
    // jika kondisi bernilai true, maka dia akan menjalankan blok while, dan terus diulangi sampai kondisi while bernilai false

    var i = 1
    while (i <= 10) { //melakukan pengecekan jika nilai i kurang dari 10 maka bernilai true dan melakukan perulangan hingga bernilai false
        println("perulangan ke $i")
        i++ //ditambahkan 1 nilai per perulangan karena berada didalam blok kode while hingga mengashilkan nilai yang false atau tidak kurang dari samadengan 10
    }
    println("Perulangan Selesai") //jika nilai i sudah bernilai 10 dan bernilai true maka perulangan berhenti dan mengeksekesui kode ini

}
