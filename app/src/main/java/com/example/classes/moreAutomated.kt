package com.example.classes

/**
 * Bu derste daha otomatik Doğum Günü Kartı Yazmayı Öğreneceğiz.
 * Bunu yapmak için bilmemiz gereken bazı fonksiyonlar ve yapılar var.
 */

/**
 * fun geçen ders de anlatıldığı üzere fonksiyon yazmak için kullanılıyor ve ingilizce function'un
 * kısaltılması. fun yazdıktan hemen sonra, bir boşluk bırakıp fonksiyonumuzun ismini vermemiz gerek.
 * Fonksiyonu çağırırken bu isimle çağıracağız. Fonksiyonda isimden sonra bir açık bir kapalı olmak
 * üzere parantezlerimizi yazacağız. Gerektiğinde bu parantez içine parametre yazabiliriz. Parametreler
 * işimize çok yarayacak çünkü fonksiyonun içine değer verebilmemizi sağlıyorlar. Son olarak fonksiyonun
 * vücut yani "body" kısmını yazmalıyız. Bunu da diğer kodlardan ayırabilmek için "{}" içerisine
 * yazacağız.
 */

/**
 * fun main() {} her kotlin projesinin olmazsa olmazıdır. Gerçekten de kot fun main() olmadan çalışmıyor.
 * Ana kodumuzu fun main() içerisine yazacağız, burayı daha temiz tutabilmek için fun main fonksiyonumuzun
 * içindeki işlemleri parçalara bölebiliriz.
 */

fun main() {

    val isim = "Elif"
    val yas = 21

    message(isim = isim, yas = yas)
    pasta(21)

}

/**
 * pasta fonksiyonu ile istediğimiz zaman pasta çıktısı alabilecek bir noktaya geliyoruz.
 */

fun pasta(yas: Int){
    reprint(times = yas+2, toprint = "-")
    println()
    print(" ")
    reprint(times = yas, toprint = "'")
    println()
    print(" ")
    reprint(times = yas, toprint = "|")
    println("")
    reprint(times = yas+2, toprint = "=")
    println("")
    repeat(3){
        reprint(times = yas+2, toprint = "@")
        println()
    }
}

/**
 * reprint fonksiyonu parametre olarak kaç kere tekrar edileceğini belirten "times" ve ne yazılacağını
 * belirleyen "toprint" parametrelerini alıyor. Daha sonra "repeat" yazıyor ve print'i döngüye sokuyoruz.
 * Println yerine print kullanıyoruz çünkü aynı satırda yazdırmasını istiyoruz.
 */

fun reprint(times: Int, toprint: String){
    repeat(times){
        print(toprint)
    }
}

/**
 * Yazdıracağımız mesajı bir message fonksiyonuna atayarak, oldu ki birden fazla kişiye mesaj yazmak
 * istediğimiz zamanlara kendimizi hazırlıyoruz. Tabii ki el ile girerek de farklı farklı mesajlar
 * elde edebiliriz. Fakat diyelim ki uygulamamızı kullanan kullanıcıların doğum günlerini kutlamak istedik,
 * burada tek tek özel mesajlar yazmak yorucu olur.
 */

fun message(isim: String, yas: Int){
    println("İyi ki doğdun $isim!")
    println("Artık $yas yaşındasın. En güzel günler senin olsun!")
}