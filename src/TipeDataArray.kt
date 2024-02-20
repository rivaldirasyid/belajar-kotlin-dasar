fun main() {
    //Tipe Data Array
    //Array adalah tipe data yang berisikan kumpulan data dengan tipe yang sama
    //Tipe data array di Kotlin direpresentasikan dengan kata kunci Array

    val members: Array<String> = arrayOf("ipang", "adi", "joko")
    val values: Array<Byte> = arrayOf(30, 50, 100)
    val balances: Array<Int> = arrayOf(2_000, 5_000, 10_000)

    //Index di Array
    //| Index   | Data       |
    //| 0       | ipang      |
    //| 1       | adi        |
    //| 2       | joko       |

     //Operasi di Array
    //| Operasi               | Keterangan                       |
    //| size                  | Untuk mendapatkan panjang Array  |
    //| get(index)            | Mendapat data di posisi index    |
    //| [index]               | Mendapat data di posisi index    |
    //| set(index, value)     | Mengubah data di posisi index    |
    //| [index] = value       | Mengubah data di posisi index    |

    members[0] = "sandi"
    members.set(1, "gogon")

    println(members[2])
    println(values.size)
    println(balances.get(0))
    println(balances.get(1))
    println(balances.get(2))

    arrayNullable()

}

fun arrayNullable() {
    //Array Nullable
    //Secara standard data di Array di Kotlin tidak boleh null
    //Jika kita butuh membuat Array yang datanya boleh null, kita bisa menggunakan ? (tanda tanya)

    val umur: Array<Int?> = arrayOfNulls(5)
    umur.set(0, 20)
    umur[1] = 17
    umur[2] = null
    umur[3] = 18
    umur[4] = 19

    println(umur.size)
    println(umur[0])
    println(umur[1])
    println(umur[2])
    println(umur.get(4))
}