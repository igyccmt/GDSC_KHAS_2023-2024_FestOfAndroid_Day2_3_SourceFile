package com.example.classes

fun main(){
    var trafikLambasi = "Yeşil"

    kontrol(trafikLambasi)

    trafikLambasi = "Siyah"

    kontrol(trafikLambasi)
}

fun kontrol (renk: String){
    when (renk) {
        "Yeşil" -> println("Geçebilirsiniz")
        "Sarı" -> println("Bekleyiniz")
        "Kırmızı" -> println("Durunuz!")
        else -> println("Geçersiz")
    }
    if (renk == "Yeşil"){
        println(". .")
        println(" U ")
    }
    else if (renk == "Sarı"){
        println(". .")
        println(" - ")
    }
    else {
        println(". .")
        println(" x ")
    }
}