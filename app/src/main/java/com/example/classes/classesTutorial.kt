package com.example.classes

fun main() {
    val oturumcu = Kisi("Emre", 20, hitap = "Bey")

    println(message = "Hoşgeldiniz ${oturumcu.isim} ${oturumcu.hitap}!")
}

/**
 * Class, obje oluşturmak için kullanılan bir yapıdır. Obje tabanlı programlama dillerinin vazgeçilmezi olan
 * Class'ı oluşturmak ve kullanmak çok kolay. Method (davranış) ve özelliklerler ile sürekli ortak özellikleri
 * olabilecek objeleri ayrı ayrı yazmamamıza yarar. Inheretence (Miras Alma), Abstraction (Soyutlama),
 * Encapsulation (Kapsülleme), Polymorphism (Çok Biçimlilik) diye 4 özellikten bahsedebiliriz. Bu özellikleri
 * örneklerledaha detaylı anlayalım.
 */

/**
 * Miras Alma (Inheretence):
 * Alt ve üst sınıf ilişkilerini kurmamıza yarar. Akıllı cihazlar sınıfı üst sınıfken akıllı buzdolabı sınıfı
 * akıllı cihazlar sınıfının bir alt sınıfıdır. Akıllı cihazlar sınıfındaki sınıf karakteristik özelliklerini
 * miras alır. Bunlara "parent" ve "child" da dendiği için bunu genetik kalıtım gibi de düşünebiliriz.
 */

/**
 * Kapsülleme (Encapsulation):
 * Davranış ve özellikler sınıfta soyutlanır ve saklanır. Kapsülleme ile hangi özelliklerin ve davranışların
 * dışarıdan kullanılabileceğine karar verebiliriz. Örneğin oluşturacağımız bir akıllı cihazlar sınıfının
 * içine public yani "herkese açık" bir davranış ya da özellik katarsak bu ismin önerdiği üzere herkes
 * tarafından kullanılabilir. Private yani "gizli" bir davranış ya da özellik katarsak bu kimse tarafından
 * kullanılamaz. Protected yani "korumalı" bir davranış ya da özellik katarsak bu da miras alma özelliği
 * içerisinde alt sınıflar tarafından kullanılabilir. Kapsülleme, veri gizleme gibi yönlerden dolayı
 * kullanılmaktadır.
 */

/**
 * Soyutlama (Abstraction)
 * Bir sınıfın özelliklerinin tanımlanmasına denir. Örneğin akıllı cihazlar sınıfında: cihazın boyutu,
 * kullandığı Android sürümü gibi.
 */

/**
 * Çok Biçimlilik (Polymorphism)
 * İki objenin miras alan gibi ilişkileri olmasına rağmen, yani üst ve alt sınıf olmalarına ya da
 * ortak üst sınıfa sahip olmalarına rağmen farklı özellikler gösterebilmelerine denir. Örneğin
 * akıllı cihazlar üst sınıfından iki yeni sınıf oluşturalım: Akıllı buzdolap ve akıllı telefon! Birbirinden
 * oldukça farklılar, değil mi?
 */

class Kisi(val isim: String, var yas: Int, val hitap: String) {

}

