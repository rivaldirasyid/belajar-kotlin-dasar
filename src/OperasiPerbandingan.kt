fun main() {
    //Operasi perbandingan adalah operasi untuk membandingkan dua buah data
    //Operasi perbandingan adalah operasi yang menghasilkan nilai boolean (benar atau salah)
    //Jika hasil operasinya adalah benar, maka nilainya adalah true
    //Jika hasil operasinya adalah salah, maka nilainya adalah false

    //| Operator   | Keterangan               |
    //| >          | Lebih Dari               |
    //| <          | Kurang Dari              |
    //| >=         | Lebih Dari Sama Dengan   |
    //| <=         | Kurang Dari Sama Dengan  |
    //| ==         | Sama Dengan              |
    //| !=         | Tidak Sama Dengan        |

    val a = 100
    val b = 200

    val result:Boolean = a > b

    println(result) //hasilnya adalah false karena nilai a tidak lebih besar dibandingkan dengan b

    println(100 >= 100) //menghasilkan nilai true karena menggunakan operator lebih dari atau sama dengan
    println("abc" != "abc") //menghasilkan nilai false karena menggunakan operator tidak atau sama dengan
    println(50 < 200) //menghasilkan nilai true karena nilai 50 kurang dari nilai 200
}