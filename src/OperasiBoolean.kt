const val nilaiUjian = 80
const val nilaiAbsensi = 70
const val nilaiEkstra = 75

fun main() {
    //Operasi Boolean atau Operasi Logika
    //Operator logika adalah operator untuk dua buah data boolean
    //Hasil dari operator logika adalah boolean lagi

    //| Operator   | Keterangan  |
    //| &&         | Dan         |
    //| ||         | Atau        |
    //| !          | Kebalikan   |

    operasiDan()
    operasiAtau()
    operasiKebalikan()

}

fun operasiDan() {
    //Operasi && (Dan)
    //| Nilai 1   | Operator  | Nilai 2    | Hasil  |
    //| true      |    &&     | true       | true   |
    //| true      |    &&     | false      | false  |
    //| false     |    &&     | true       | false  |
    //| false     |    &&     | false      | false  |

    val apakahLulusUjian = nilaiUjian > 75 //pengecekan
    val apakahLulusAbsensi = nilaiAbsensi > 80 //pengecekan
    val apakahLulusEkstra = nilaiEkstra > 70 //pengecekan

    val apakahLulus = apakahLulusUjian && apakahLulusAbsensi && apakahLulusEkstra//jika disini terdapat salah satu nilai false maka hasilnya tidak lulus
    //val apakahLulus = ((apakahLulusUjian && apakahLulusAbsensi) && apakahLulusEkstra) //jadi membandingkan kedua nilai diawal dan hasilnya dibandingkan lagi dengan nilai selanjutnya
    println(apakahLulus) //menghasilkan nilai false karena nilai absensi tidak lebih dari ketentuan lulus


}

fun operasiAtau() {
    //Operasi || (Atau)
    //| Nilai 1   | Operator  | Nilai 2    | Hasil  |
    //| true      |    ||     | true       | true   |
    //| true      |    ||     | false      | true   |
    //| false     |    ||     | true       | true   |
    //| false     |    ||     | false      | false  |

    val apakahLulusUjian = nilaiUjian > 80 //pengecekan
    val apakahLulusAbsensi = nilaiAbsensi > 60 //pengecekan
    val apakahLulusEkstra = nilaiEkstra > 70 //pengecekan

    val apakahLulus = apakahLulusUjian || apakahLulusAbsensi || apakahLulusEkstra //jika disini terdapat perbandingan false dengan false maka akan menghasilkan false
    //val apakahLulus = ((apakahLulusUjian || apakahLulusAbsensi) || apakahLulusEkstra) //jadi membandingkan kedua nilai diawal dan hasilnya dibandingkan lagi dengan nilai selanjutnya

    println(apakahLulus) //mendapatkan nilai true karena tidak ada perbandingan antra nilai false dengan false

}

fun operasiKebalikan() {
    //Operasi ! (Kebalikan)
    //| Operator  |   Nilai  | Hasil   |
    //| !         |   true   | false   |
    //| !         |   false  | true    |

    val apakahLulusUjian = nilaiUjian > 80 //pengecekan
    val apakahLulusAbsensi = nilaiAbsensi > 60 //pengecekan
    val apakahLulusEkstra = nilaiEkstra > 70 //pengecekan

    val apakahLulus = apakahLulusUjian && apakahLulusAbsensi || apakahLulusEkstra
    println(!apakahLulus) //kebalikan dari hasil nilai tersebut dengan tanda seru jika nilainya true maka hasilnya false dan sebaliknya


}