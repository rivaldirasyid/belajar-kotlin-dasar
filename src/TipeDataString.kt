fun main() {
    //Tipe Data String berisikin data kumpulan Character atau sederhanannya adalah teks
    //Tipe Data String diRepresentasikan dengan :
    //kata kunci " (petik 2) untuk teks satu baris
    //kata kunci """ (tanda petik 2 sebanyak 3 kali) untuk teks lebih dari satu baris

    val firstName: String = "Rivaldi"
    val lastName: String = "Rasyid"
    val fullName: String = "Rivaldi Rasyid"
    val address: String = """
        >Street Not Yet Done
        >Jl. Krisan Blok Pesona
        >Bojonegara
        >Serang, Banten
    """.trimMargin(">")

    println(firstName)
    println(lastName)
    println(fullName)
    println(address)

    //menggabungkan data Strring
    //untuk penggabungan kita bisa menggunakan kata kunci + (tambah)
    val fullName1: String = firstName + " " + lastName //bisa membuat data baru dari penggabungan String
    println(fullName1)


    //String Template
    //dengan String Template, secara otomatis kita bisa mengakses Data dari luar teks String
    //$ adalah tanda yang digunakan untuk template ekspresi sederhana, seperti mengakases variabel lain
    //${isi ekspresi} adalah tanda untuk template ekspresi yang kompleks
    val stringTamplate: String = "$firstName $lastName" //menggunakan ekspresi sederhana
    val desc: String = "total $firstName char = ${firstName.length}" //menggunakan ekspresi komplek untuk funtion yang lain
    println(stringTamplate)
    println(desc)

}