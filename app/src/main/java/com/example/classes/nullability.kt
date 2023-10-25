package com.example.classes

/**
 * nullability yani boş olabilme durumu. Boş değer alabilecek olan değişken ya da parametrelerimizin
 * tipinin yanına ? koyarak buna ulaşabiliriz.
 */

fun main() {
    var telefonBir = Phone(brand = "Redmi", upToDate = false)
    phoneUser("Tuba", 21, phoneType = telefonBir.phoneModel, androidVersion = telefonBir.androidVersion)
}

fun phoneUser(isim: String, yas: Int, phoneType: String?, androidVersion: String?) {
    println("$yas yaşındaki $isim, $phoneType'ı kullanıyor ve Android'inin versiyonu $androidVersion!")
}

class Phone(brand: String? = "Samsung", upToDate: Boolean) {
    private var upToDate: Boolean = upToDate
    var phoneModel: String? = brand

    var androidVersion: String?
        get() = if (upToDate) "Android 13" else "Android 12 ya da aşağı"
        set(value) {
            androidVersion = if (upToDate) value else "Android 12 ya da aşağı"
        }
}
