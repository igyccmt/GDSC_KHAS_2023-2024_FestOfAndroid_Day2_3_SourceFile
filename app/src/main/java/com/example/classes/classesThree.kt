package com.example.classes


/**
 * Override açık bir sınıfın içerisindeki methodları yani fonksiyonları, genellikle IS-A
 * tipli üst alt sınıf ilişkili sınıfların alt sınıflarında değiştirmemize yarar.
 */

class İşlemÇıkarmaToplama: İşlemler() {
    override fun toplama(sayı1: Int, sayı2: Int): Int {
        return sayı1 + sayı2 * 2
    }
    override fun çıkarma(sayı1: Int, sayı2: Int): Int {
        return Math.abs((sayı1 - sayı2))
    }
}

open class İşlemler {
    open fun toplama(sayı1: Int, sayı2: Int): Int{
        return sayı1 + sayı2
    }
    open fun çıkarma(sayı1: Int, sayı2: Int): Int{
        return sayı1 - sayı2
    }
    open fun çarpma(sayı1: Int, sayı2: Int): Int{
        return sayı1 * sayı2
    }
    open fun bölme(sayı1: Int, sayı2: Int): Int{
        return sayı1 / sayı2
    }
}

fun main() {
    val hatalıİşlemci = İşlemÇıkarmaToplama()
    val hatasızİşlemci = İşlemler()

    println("Hatalı:")
    println(hatalıİşlemci.toplama(30, 2))
    println(hatalıİşlemci.çıkarma(sayı1 = 9, sayı2 = 10))

    println("Hatasız: ")
    println(hatasızİşlemci.toplama(30, 2))
    println(hatasızİşlemci.çıkarma(sayı1 = 9, sayı2 = 10))
}



