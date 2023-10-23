package com.example.classes

fun main(){
    var trafikLambasi = "Yeşil"

    kontrol(trafikLambasi)

    trafikLambasi = "Siyah"

    kontrol(trafikLambasi)
}

/**
 * If-Else kalıbı, bir durumun/şartın doğruluğu üzerine hareket etmek istediğimizde kullandığımız
 * kalıplardır. "Eğer ... ise ... yap, değilse ... yap" gibi. Else if ise birden fazla durum/şart
 * vermek istediğimizde kullandığımız bir kalıp.
 */


/**
 * When ise bir durum doğruluğunu korurken yapılacak şeyler için kullanılır. "... doğruyken ... yap"
 */


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