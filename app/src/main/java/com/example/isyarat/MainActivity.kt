package com.example.isyarat

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.isyarat.ui.theme.ISyaratTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ISyaratTheme {
                val navController = rememberNavController()
                NavHost(navController = navController, startDestination = "welcomeScreen") {
                    composable("welcomeScreen") { WelcomeScreen(navController) }
                    composable("homeScreen") { HomeScreen(navController) }
                    composable("hurufScreen") { IsyaratHuruf(navController) }
                    composable("angkaScreen") { IsyaratAngka(navController) }
                    composable("videoPembelajaranScreen") { LayoutList(navController) }
                    composable("videosatu") { VideoScreen1() }
                    composable("videodua") { VideoScreen2() }
                    composable("videotiga") { VideoScreen3() }
                    composable("videoempat") { VideoScreen4() }
                    composable("videolima") { VideoScreen5() }
                    composable("kosaKataScreen") { ListKosaKata(navController) }
                    composable("displayAnjing") { DisplayGIF(navController, R.drawable.anjing, "\"Anjing\"") }
                    composable("displayApa") { DisplayGIF(navController, R.drawable.apa, "\"Apa\"") }
                    composable("displayAyah") { DisplayGIF(navController, R.drawable.ayah, "\"Ayah\"") }
                    composable("displayAyam") { DisplayGIF(navController, R.drawable.ayam, "\"Ayam\"") }
                    composable("displayBagaimana") { DisplayGIF(navController, R.drawable.bagaimana, "\"Bagaimana\"") }
                    composable("displayBerapa") { DisplayGIF(navController, R.drawable.berapa, "\"Berapa\"") }
                    composable("displayDimana") { DisplayGIF(navController, R.drawable.dimana, "\"Di mana\"") }
                    composable("displayIbu") { DisplayGIF(navController, R.drawable.ibu, "\"Ibu\"") }
                    composable("displayKakak") { DisplayGIF(navController, R.drawable.kakak, "\"Kakak\"") }
                    composable("displayKapan") { DisplayGIF(navController, R.drawable.kapan, "\"Kapan\"") }
                    composable("displayKenapa") { DisplayGIF(navController, R.drawable.kenapa, "\"Kenapa\"") }
                    composable("displayKucing") { DisplayGIF(navController, R.drawable.kucing, "\"Kucing\"") }
                    composable("displayLelah") { DisplayGIF(navController, R.drawable.lelah, "\"Lelah\"") }
                    composable("displayMonyet") { DisplayGIF(navController, R.drawable.monyet, "\"Monyet\"") }
                    composable("displaySedih") { DisplayGIF(navController, R.drawable.sedih, "\"Sedih\"") }
                    composable("displaySenang") { DisplayGIF(navController, R.drawable.senang, "\"Senang\"") }
                    composable("displaySiapa") { DisplayGIF(navController, R.drawable.siapa, "\"Siapa\"") }
                    composable("displayTelepon") { DisplayGIF(navController, R.drawable.telepon, "\"Telepon\"") }
                }
            }
        }
    }
}