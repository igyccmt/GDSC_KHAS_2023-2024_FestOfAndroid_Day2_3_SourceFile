package com.example.classes

/**
 * IS-A, HAS-A nedir? IS-A alt sınıfın üst sınıfın yapabileceği her şeyi yapabileceği anlamına gelmesidir.
 * HAS-A ise bir sınıfın başka bir sınıfı içinde bulundurmasıdır. Örneğin: Bir akıllı evde akıllı televizyon
 * bulunması gibi.
 */

fun main() {
    val cihazlar = AkilliCihaz(os = "Android")
    val buzdolabım = AkilliBuzdolabı(androidVersion = "Android 6", ekranBüyüklüğü = 17.4,
        kapakSayisi = 2, osOf = "Android", buzlukTipi = "NoFrost")

    println(buzdolabım.speakerVolume)
    buzdolabım.increaseSpeakerVolume()
    println(buzdolabım.speakerVolume)

    val evim = SmartHome(roomAmount = 4, stores = 2)

}

open class AkilliCihaz(os: String){

}

class AkilliBuzdolabı(osOf : String, ekranBüyüklüğü: Double, androidVersion: String, kapakSayisi: Int,
    buzlukTipi: String): AkilliCihaz(os = osOf) {
    var speakerVolume = 2
        set(value) {
            if (value in 0..100) {
                field = value
            }
        }
    fun increaseSpeakerVolume() {
        speakerVolume++
        println("Speaker volume increased to $speakerVolume.")
    }
}

class SmartHome(roomAmount: Int, stores: Int){
    val buzdolabı = AkilliBuzdolabı(androidVersion = "Android 6", ekranBüyüklüğü = 17.4,
        kapakSayisi = 2, osOf = "Android", buzlukTipi = "NoFrost")
}