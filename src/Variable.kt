const val APP = "Calc" //variabel constant
const val VERSION = "0.0.1"

fun main() {
    variable()
    nullable()

    //Variable Constant
    //Constant adalah Immutable data, yang biasanya diakses untuk keperluan global.
    //Global artinya bisa diakses dimanapun
    //Untuk menandai bahwa variable tersebut adalah constant, biasanya menggunakan UPPER_CASE dalam pembuatan nama variable constant nya

    println("Welcome to $APP version $VERSION")

}

fun variable() {
    //Variable adalah tempat untuk menyimpan data
    //Kotlin mendukung 2 jenis variabel; Mutable (bisa diubah) dan Immutable (tidak bisa diubah).
    //Untuk membuat variable Mutable, di kotlin bisa menggunakan kata kunci var
    //Untuk membuat variable Immutable, di kotlin bisa menggunakan kata kunci val

    //Deklarasi variabel
    //val/var namaVariable : TipeData = data

    //Direkomendasikan menggunakan Immutable dibanding Mutable data

    //Kode variabel mutable
    var namaDepan: String = "Rivaldi"
    var namaBelakang = "Rasyid" //deklarasi tipe data itu opsional atau tidak wajib

    //mengubah variabel
    namaDepan = "Ipang"



    //Kode variabel immutable
    val namaDepan1: String = "Rivaldi"
    val namaBelakang1 = "Rasyid"

    //error jika mengubah variabel
    //namaDepan1 = "Ipang"
}

fun nullable() {
    //Nullable
    //Secara standar, variable di Kotlin harus dideklarasikan / diinisialisasikan nilai nya
    //Jika saat membuat variable, tidak diberi nilai, maka akan error
    //Kotlin mendukung variable yang boleh null (tidak memiliki data)
    //Ini dikarenakan Kotlin bisa mengakses Java, dan kebanyakan di Java, semua variable bisa null
    //Untuk membuat variable bisa bernilai null, di Kotlin bisa menggunakan ? (tanda tanya) setelah tipe datanya.
    //Penggunaan  fitur ini tidak direkomendasikan untuk dilakukan di kotlin, hanya sebagai jalan akhir jika misal mengakses kode Java
    var firstName: String? = null
    firstName = "ipang"

    println(firstName?.length)
}