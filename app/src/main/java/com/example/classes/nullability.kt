package com.example.classes

fun main () {

    phone("Tuba", 21, "Iphone",null)

}

/**
 * Nullability, yani null olabilme - boş olabilme özelliğini kullanırken dikkatli olmamız gereken konular
 * var. Null olabilecek bir değerin tip değerinin yanına "?" koymayı unutmayın! Örneğe bakalım :)
 */


fun phone (isim: String, yas: Int, phoneType: String?, androidVersion: String?){

    println("$yas yaşındaki $isim, $phoneType'ı kullanıyor ve Android'inin versiyonu $androidVersion!")

}