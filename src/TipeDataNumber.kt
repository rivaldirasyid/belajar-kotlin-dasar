fun main() {
    integerNumber()
    floatingNumber()
    literals()
    conversion()
}

fun integerNumber() {
    var age: Byte = 30
    var height: Short = 170
    var distance: Int = 2000
    var balance: Long = 10_000_000L //fitur Underscore hanya untuk memudahkan pembacaan tanpa mempengaruhi Nilai

    println("Umur " + age +" tinggi " + height +" jarak " + distance +" jumlah " + balance)
}

fun floatingNumber() {
    var radius: Float = 98.78F
    var value: Double = 1245235.234242

    println("radius " + radius + " value " + value)
}

fun literals() {
    var decimalLiteral: Int = 100
    var hexaDecimalLiteral: Int = 0xFF //untuk melalukan kode angka hexadecimal menggunakan kode 0x diawal variabel atau nilai
    var binaryDecimal: Int = 0b0101 //untuk melakukan kode angka binarydecimal menggunakan kode 0b diawal variabel atau nilai

    println("decimal " + decimalLiteral + " hexa " + hexaDecimalLiteral + " binary " + binaryDecimal)
}

fun conversion() {
    //mengkonfersi nilai dari tipe data yang berbeda ke tipe data yang kita inginkan
    var number: Int = 300
    //conversion
    var byte: Byte = number.toByte()
    var short: Short = number.toShort()
    var int: Int = number.toInt()
    var long: Long = number.toLong()
    var float: Float = number.toFloat()
    var double: Double = number.toDouble()

    println("Nilai Awal " + number)
    println("Conversion to Byte " + byte)
    println("Conversion to Short " + short)
    println("Conversion to Int " + int)
    println("Conversion to Long " + long)
    println("Conversion to Float " + float)
    println("Conversion to Double " + double)

}



//Tipe Data Integer Number atau Bilangan Bulat
//Terdapat 4 Type yaitu Byte, Short, Int dan Long
//Byte Size(bits) nya 8bit dengan Data Range -128 sampai 127
//Short Size(bits) nya 16bit dengan Data Range -32768 sampai 32767
//Int Size(bits) nya 32bit dengan Data Range -2,147,483,648 sampai 2,147,483,647
//Long Size(bits) nya 64bit dengan Data Range -9,223,372,036,854,775,808 sampai +9,223,372,036,854,775,807

//Tipe Data Floating-points Number atau Bilangan Pecahan
//Terdapat 2 Type yaitu Double dan Float
//Float Size(bits) nya 32bit dengan Significant bitnya adalah 24bit lalu Exponent Bitsnya 8 dan Decimial digitsnya 6-7
//Double Size(bits) nya 64bit dengan Significant bitnya adalah 53bit lalu Exponent Bitsnya 11 dan Decimial digitsnya 15-16