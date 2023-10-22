package com.example.composebeginning

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Space
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.Spacer
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.BottomEnd
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.composebeginning.ui.theme.ComposeBeginningTheme
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp


/**
 * Main activity sınıfına onCreate ve setContent yazarak ve setContent'in içerisine fonksiyonumuzu
 * vererek uygulamaya bu bilgileri gönderebiliyoruz.
 */


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeBeginningTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    HappyBirthday("Duru", nameOfGiver = "Tuba", ageOfReciever = 21)
                }
            }
        }
    }
}


/**
 * Composable fonksiyonlar, daha yeni çıktı diyebileceğimiz Jetpack Compose kütüphanesinin bir parçası aslında.
 * Composable fonksiyonlarla, fonksiyonel UI tasarımları yapabiliriz.
 * Önceden bunları yapmak için .xml uzantılı bir dosyada layout yazıyor ve bunu yaparken bir kere kullandığımızı
 * bir kere daha kullanabilmek için kopyala-yapıştır yapmamız gerekiyordu. Şimdi sadece bir Composable fonksiyonu
 * tekrar çağırmamız yeterli.
 */

/**
 * Composable fonksiyon yazmak için öncelikle @ koyup sonra Composable yazmamız gerekiyor. Daha sonra ise
 * fun yazarak fonksiyonun isim ve parametrelerini veriyoruz. Burada modifier da vermek gerekli. Bu şekilde
 * padding, arka plan vb özellikleri modife etmek istediğimizde modifierı çağırabiliriz. Özellikler CSS'teki
 * gibi düşünülebilir.
 */

@Composable
fun HappyBirthday(nameOfReciever: String, nameOfGiver: String, ageOfReciever: Int, modifier: Modifier = Modifier) {

    /**
     * Row sütunu, Column satırı, Box ise kutuyu kontrol etmemizi sağlar ve içine değerler alır. Kendilerini modife
     * edebileceğimiz gibi içerilerindeki özellikleri de modife edebiliriz.
     */

    /**
     * Text metin yazmamıza yararken, Image resim yüklememize yarar.
     */

    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        Image(painter = painterResource(id = R.drawable.androidparty), contentDescription = null, Modifier.fillMaxHeight(), contentScale = ContentScale.Crop)
    }
    Box(modifier = Modifier.fillMaxSize()) {
        Column (Modifier.padding(vertical=25.dp).align(Alignment.TopStart)) {
            Text(
                text = "İyi ki doğdun sevgili $nameOfReciever!",
                color = Color.White,
                modifier = Modifier.padding(vertical = 25.dp)
            )
            Text(
                text = "Çoktan $ageOfReciever yaşına geldin $nameOfReciever!",
                color = Color.White,
                modifier = Modifier.padding(vertical = 25.dp)
            )
            Text(
                text = "Bu yaşın sana en güzel şeyleri getirsin.",
                color = Color.White,
                modifier = Modifier.padding(vertical = 25.dp)
            )
        }
        Column (Modifier.align(Alignment.BottomEnd).padding(vertical = 25.dp)) {
            Text(
                text = "Seni çok seven,",
                color = Color.White,
                modifier = Modifier.padding(vertical = 25.dp)
            )
            Text(
                text = nameOfGiver,
                color = Color.White,
                modifier = Modifier.padding(vertical = 25.dp)
            )
        }
    }
}


/**
 * @Preview sayesinde emulator açmadan ya da fiziksel bir cihaza bağlanmadan kolayca layoutu görebiliriz.
 */

@Preview(showBackground = true)
@Composable
fun HappyBirthdayPreview() {
    ComposeBeginningTheme {
        HappyBirthday("Duru", nameOfGiver = "Tuba", ageOfReciever = 21)
    }
}