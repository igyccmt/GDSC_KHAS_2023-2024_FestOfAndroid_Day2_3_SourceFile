package com.example.classes


/**
 * Elvis operatorü null değerlerle karşılaştığımız taktirde almayı istediğimiz çıktıyı belirlememize yarar.
 * "!!" not null assertion yani boş değil zorlayıcısı null olma ihtimali olan, yani değişken tipini ? ile
 * null olabilir olarak ayarladığımız değerlerin boş olmaması gerektiği durumlarda kullandığımız bir ifade.
 */

fun main() {
    val kisi1 = KisiKullanıcısı("Tuba", 21, phone = null, adress = null)
    val kisi2 = KisiKullanıcısı("Elif", 21, phone ="Samsung", adress = null)

    println(kisi1.isim!!.length)
    println(kisi2.adress?.length?: "bulunamadı")
}

class KisiKullanıcısı(val isim: String, var yas: Int?, var phone: String?, var adress: String?){

}