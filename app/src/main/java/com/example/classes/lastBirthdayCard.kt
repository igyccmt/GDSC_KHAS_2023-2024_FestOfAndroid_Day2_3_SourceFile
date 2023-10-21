package com.example.classes

/**
 * Artık dersimizin sonlarına geliyoruz. Bugün fonksiyonları, sınıfları, sınıf özellik ve constructor
 * yapısını öğrendik. Hadi ikizlere bir doğum günü kartı yazalım!
 */

fun main () {
    val ikiz1 = Kisi(isim = "Ilgın", yas = 22)
    messageForBirthday(isim = ikiz1.isim, yas = ikiz1.yas)

    val ikiz2 = Kisi(isim = "İrem", yas = 22)
    messageForBirthday(isim = ikiz2.isim, yas = ikiz2.yas)

    dogumGünüPastası(22)

}

class Kisi(val isim: String, var yas: Int) {

}

fun messageForBirthday(isim: String, yas: Int){
    println("İyi ki doğdun $isim!")
    println("Artık $yas yaşındasın. En güzel günler senin olsun!")
}

fun dogumGünüPastası(yas: Int){
    reprinting(times = yas+2, toprint = "-")
    println()
    print(" ")
    reprinting(times = yas, toprint = "'")
    println()
    print(" ")
    reprinting(times = yas, toprint = "|")
    println("")
    reprinting(times = yas+2, toprint = "=")
    println("")
    repeat(3){
        reprinting(times = yas+2, toprint = "@")
        println()
    }
}

fun reprinting(times: Int, toprint: String){
    repeat(times){
        print(toprint)
    }
}
