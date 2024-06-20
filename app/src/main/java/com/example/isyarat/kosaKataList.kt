package com.example.isyarat

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController

@Composable
fun ListKosaKata(navController: NavHostController) {
    Box(
        modifier = Modifier
            .fillMaxSize()
    ) {

        Column {
            // header
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(250.dp)
                    .background(
                        color = Color(0xFF219C90),
                        shape = RoundedCornerShape(
                            bottomStart = 15.dp,
                            bottomEnd = 15.dp
                        )

                    )
            ) {
                Image(painter = painterResource(id = R.drawable.kosakata),
                    contentDescription = "kosakata",
                    modifier = Modifier
                        .align(Alignment.BottomEnd)
                        .size(180.dp)
                )

                Column {
                    Row {
                        Image(
                            painter = painterResource(id = R.drawable.back_icon),
                            contentDescription = "back",
                            modifier = Modifier
                                .padding(start = 10.dp, top = 17.dp)
                                .size(40.dp)
                                .clickable { navController.navigate("homeScreen") }
                        )

                        Text(
                            text = "Kosakata",
                            fontSize = 23.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color.White,
                            modifier = Modifier
                                .padding(start = 100.dp, top = 20.dp)
                        )
                    }

                    Column (
                        modifier = Modifier
                            .fillMaxHeight()
                            .width(250.dp)
                    ){

                        Text(
                            text = "Cari Kosakata",
                            fontSize = 23.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color.White,
                            modifier = Modifier
                                .padding(start = 30.dp, top = 30.dp)
                        )
                        Text(
                            text = "Tambah wawasan Anda  dengan kosakata bahasa isyarat",
                            fontSize = 17.sp,
                            fontWeight = FontWeight.Light,
                            color = Color.White,
                            modifier = Modifier
                                .padding(start = 30.dp, top = 5.dp)
                        )
                    }
                }

            }

            Spacer(modifier = Modifier.height(24.dp))

            // biar bisa discroll
            Column  (modifier = Modifier
                .weight(1f)
                .fillMaxWidth()
                .verticalScroll(rememberScrollState())
            ) {
                Column(
                    modifier = Modifier
                        .padding(start = 16.dp, end = 16.dp)
                ) {
                    Box(
                        modifier = Modifier
                            .shadow(
                                elevation = 7.dp,
                                shape = RoundedCornerShape(8.dp)
                            )
                            .background(color = Color.White)
                            .fillMaxWidth()
                            .height(62.dp)
                            .clickable { navController.navigate("displayAnjing") }
                    ) {
                        Text(
                            text = "Anjing",
                            fontWeight = FontWeight.Medium,
                            color = Color(0xFF145750),
                            fontSize = 22.sp,
                            modifier = Modifier
                                .padding(start = 15.dp)
                                .align(Alignment.CenterStart)
                        )

                        Image(
                            painter = painterResource(id = R.drawable.back_icon_ijo),
                            contentDescription = "ke gif",
                            modifier = Modifier
                                .size(36.dp)
                                .align(Alignment.CenterEnd)
                                .padding(end = 12.dp)
                        )
                    }

                    Spacer(modifier = Modifier.height(24.dp))

                    Box(
                        modifier = Modifier
                            .shadow(
                                elevation = 7.dp,
                                shape = RoundedCornerShape(8.dp)
                            )
                            .background(color = Color.White)
                            .fillMaxWidth()
                            .height(62.dp)
                            .clickable { navController.navigate("displayApa") }
                    ) {
                        Text(
                            text = "Apa",
                            fontWeight = FontWeight.Medium,
                            color = Color(0xFF145750),
                            fontSize = 22.sp,
                            modifier = Modifier
                                .padding(start = 15.dp)
                                .align(Alignment.CenterStart)
                        )

                        Image(
                            painter = painterResource(id = R.drawable.back_icon_ijo),
                            contentDescription = "ke gif",
                            modifier = Modifier
                                .size(36.dp)
                                .align(Alignment.CenterEnd)
                                .padding(end = 12.dp)
                        )
                    }

                    Spacer(modifier = Modifier.height(24.dp))

                    Box(
                        modifier = Modifier
                            .shadow(
                                elevation = 7.dp,
                                shape = RoundedCornerShape(8.dp)
                            )
                            .background(color = Color.White)
                            .fillMaxWidth()
                            .height(62.dp)
                            .clickable { navController.navigate("displayAyah") }
                    ) {
                        Text(
                            text = "Ayah",
                            fontWeight = FontWeight.Medium,
                            color = Color(0xFF145750),
                            fontSize = 22.sp,
                            modifier = Modifier
                                .padding(start = 15.dp)
                                .align(Alignment.CenterStart)
                        )

                        Image(
                            painter = painterResource(id = R.drawable.back_icon_ijo),
                            contentDescription = "ke gif",
                            modifier = Modifier
                                .size(36.dp)
                                .align(Alignment.CenterEnd)
                                .padding(end = 12.dp)
                        )
                    }

                    Spacer(modifier = Modifier.height(24.dp))

                    Box(
                        modifier = Modifier
                            .shadow(
                                elevation = 7.dp,
                                shape = RoundedCornerShape(8.dp)
                            )
                            .background(color = Color.White)
                            .fillMaxWidth()
                            .height(62.dp)
                            .clickable { navController.navigate("displayAyam") }
                    ) {
                        Text(
                            text = "Ayam",
                            fontWeight = FontWeight.Medium,
                            color = Color(0xFF145750),
                            fontSize = 22.sp,
                            modifier = Modifier
                                .padding(start = 15.dp)
                                .align(Alignment.CenterStart)
                        )

                        Image(
                            painter = painterResource(id = R.drawable.back_icon_ijo),
                            contentDescription = "ke gif",
                            modifier = Modifier
                                .size(36.dp)
                                .align(Alignment.CenterEnd)
                                .padding(end = 12.dp)
                        )
                    }

                    Spacer(modifier = Modifier.height(24.dp))

                    Box(
                        modifier = Modifier
                            .shadow(
                                elevation = 7.dp,
                                shape = RoundedCornerShape(8.dp)
                            )
                            .background(color = Color.White)
                            .fillMaxWidth()
                            .height(62.dp)
                            .clickable { navController.navigate("displayBagaimana") }
                    ) {
                        Text(
                            text = "Bagaimana",
                            fontWeight = FontWeight.Medium,
                            color = Color(0xFF145750),
                            fontSize = 22.sp,
                            modifier = Modifier
                                .padding(start = 15.dp)
                                .align(Alignment.CenterStart)
                        )

                        Image(
                            painter = painterResource(id = R.drawable.back_icon_ijo),
                            contentDescription = "ke gif",
                            modifier = Modifier
                                .size(36.dp)
                                .align(Alignment.CenterEnd)
                                .padding(end = 12.dp)
                        )
                    }

                    Spacer(modifier = Modifier.height(24.dp))

                    Box(
                        modifier = Modifier
                            .shadow(
                                elevation = 7.dp,
                                shape = RoundedCornerShape(8.dp)
                            )
                            .background(color = Color.White)
                            .fillMaxWidth()
                            .height(62.dp)
                            .clickable { navController.navigate("displayBerapa") }
                    ) {
                        Text(
                            text = "Berapa",
                            fontWeight = FontWeight.Medium,
                            color = Color(0xFF145750),
                            fontSize = 22.sp,
                            modifier = Modifier
                                .padding(start = 15.dp)
                                .align(Alignment.CenterStart)
                        )

                        Image(
                            painter = painterResource(id = R.drawable.back_icon_ijo),
                            contentDescription = "ke gif",
                            modifier = Modifier
                                .size(36.dp)
                                .align(Alignment.CenterEnd)
                                .padding(end = 12.dp)
                        )
                    }

                    Spacer(modifier = Modifier.height(24.dp))

                    Box(
                        modifier = Modifier
                            .shadow(
                                elevation = 7.dp,
                                shape = RoundedCornerShape(8.dp)
                            )
                            .background(color = Color.White)
                            .fillMaxWidth()
                            .height(62.dp)
                            .clickable { navController.navigate("displayDimana") }
                    ) {
                        Text(
                            text = "Di mana",
                            fontWeight = FontWeight.Medium,
                            color = Color(0xFF145750),
                            fontSize = 22.sp,
                            modifier = Modifier
                                .padding(start = 15.dp)
                                .align(Alignment.CenterStart)
                        )

                        Image(
                            painter = painterResource(id = R.drawable.back_icon_ijo),
                            contentDescription = "ke gif",
                            modifier = Modifier
                                .size(36.dp)
                                .align(Alignment.CenterEnd)
                                .padding(end = 12.dp)
                        )
                    }

                    Spacer(modifier = Modifier.height(24.dp))

                    Box(
                        modifier = Modifier
                            .shadow(
                                elevation = 7.dp,
                                shape = RoundedCornerShape(8.dp)
                            )
                            .background(color = Color.White)
                            .fillMaxWidth()
                            .height(62.dp)
                            .clickable { navController.navigate("displayIbu") }
                    ) {
                        Text(
                            text = "Ibu",
                            fontWeight = FontWeight.Medium,
                            color = Color(0xFF145750),
                            fontSize = 22.sp,
                            modifier = Modifier
                                .padding(start = 15.dp)
                                .align(Alignment.CenterStart)
                        )

                        Image(
                            painter = painterResource(id = R.drawable.back_icon_ijo),
                            contentDescription = "ke gif",
                            modifier = Modifier
                                .size(36.dp)
                                .align(Alignment.CenterEnd)
                                .padding(end = 12.dp)
                        )
                    }

                    Spacer(modifier = Modifier.height(24.dp))

                    Box(
                        modifier = Modifier
                            .shadow(
                                elevation = 7.dp,
                                shape = RoundedCornerShape(8.dp)
                            )
                            .background(color = Color.White)
                            .fillMaxWidth()
                            .height(62.dp)
                            .clickable { navController.navigate("displayKakak") }
                    ) {
                        Text(
                            text = "Kakak",
                            fontWeight = FontWeight.Medium,
                            color = Color(0xFF145750),
                            fontSize = 22.sp,
                            modifier = Modifier
                                .padding(start = 15.dp)
                                .align(Alignment.CenterStart)
                        )

                        Image(
                            painter = painterResource(id = R.drawable.back_icon_ijo),
                            contentDescription = "ke gif",
                            modifier = Modifier
                                .size(36.dp)
                                .align(Alignment.CenterEnd)
                                .padding(end = 12.dp)
                        )
                    }

                    Spacer(modifier = Modifier.height(24.dp))

                    Box(
                        modifier = Modifier
                            .shadow(
                                elevation = 7.dp,
                                shape = RoundedCornerShape(8.dp)
                            )
                            .background(color = Color.White)
                            .fillMaxWidth()
                            .height(62.dp)
                            .clickable { navController.navigate("displayKapan") }
                    ) {
                        Text(
                            text = "Kapan",
                            fontWeight = FontWeight.Medium,
                            color = Color(0xFF145750),
                            fontSize = 22.sp,
                            modifier = Modifier
                                .padding(start = 15.dp)
                                .align(Alignment.CenterStart)
                        )

                        Image(
                            painter = painterResource(id = R.drawable.back_icon_ijo),
                            contentDescription = "ke gif",
                            modifier = Modifier
                                .size(36.dp)
                                .align(Alignment.CenterEnd)
                                .padding(end = 12.dp)
                        )
                    }

                    Spacer(modifier = Modifier.height(24.dp))

                    Box(
                        modifier = Modifier
                            .shadow(
                                elevation = 7.dp,
                                shape = RoundedCornerShape(8.dp)
                            )
                            .background(color = Color.White)
                            .fillMaxWidth()
                            .height(62.dp)
                            .clickable { navController.navigate("displayKenapa") }
                    ) {
                        Text(
                            text = "Kenapa",
                            fontWeight = FontWeight.Medium,
                            color = Color(0xFF145750),
                            fontSize = 22.sp,
                            modifier = Modifier
                                .padding(start = 15.dp)
                                .align(Alignment.CenterStart)
                        )

                        Image(
                            painter = painterResource(id = R.drawable.back_icon_ijo),
                            contentDescription = "ke gif",
                            modifier = Modifier
                                .size(36.dp)
                                .align(Alignment.CenterEnd)
                                .padding(end = 12.dp)
                        )
                    }

                    Spacer(modifier = Modifier.height(24.dp))

                    Box(
                        modifier = Modifier
                            .shadow(
                                elevation = 7.dp,
                                shape = RoundedCornerShape(8.dp)
                            )
                            .background(color = Color.White)
                            .fillMaxWidth()
                            .height(62.dp)
                            .clickable { navController.navigate("displayKucing") }
                    ) {
                        Text(
                            text = "Kucing",
                            fontWeight = FontWeight.Medium,
                            color = Color(0xFF145750),
                            fontSize = 22.sp,
                            modifier = Modifier
                                .padding(start = 15.dp)
                                .align(Alignment.CenterStart)
                        )

                        Image(
                            painter = painterResource(id = R.drawable.back_icon_ijo),
                            contentDescription = "ke gif",
                            modifier = Modifier
                                .size(36.dp)
                                .align(Alignment.CenterEnd)
                                .padding(end = 12.dp)
                        )
                    }

                    Spacer(modifier = Modifier.height(24.dp))

                    Box(
                        modifier = Modifier
                            .shadow(
                                elevation = 7.dp,
                                shape = RoundedCornerShape(8.dp)
                            )
                            .background(color = Color.White)
                            .fillMaxWidth()
                            .height(62.dp)
                            .clickable { navController.navigate("displayLelah") }
                    ) {
                        Text(
                            text = "Lelah",
                            fontWeight = FontWeight.Medium,
                            color = Color(0xFF145750),
                            fontSize = 22.sp,
                            modifier = Modifier
                                .padding(start = 15.dp)
                                .align(Alignment.CenterStart)
                        )

                        Image(
                            painter = painterResource(id = R.drawable.back_icon_ijo),
                            contentDescription = "ke gif",
                            modifier = Modifier
                                .size(36.dp)
                                .align(Alignment.CenterEnd)
                                .padding(end = 12.dp)
                        )
                    }

                    Spacer(modifier = Modifier.height(24.dp))

                    Box(
                        modifier = Modifier
                            .shadow(
                                elevation = 7.dp,
                                shape = RoundedCornerShape(8.dp)
                            )
                            .background(color = Color.White)
                            .fillMaxWidth()
                            .height(62.dp)
                            .clickable { navController.navigate("displayMonyet") }
                    ) {
                        Text(
                            text = "Monyet",
                            fontWeight = FontWeight.Medium,
                            color = Color(0xFF145750),
                            fontSize = 22.sp,
                            modifier = Modifier
                                .padding(start = 15.dp)
                                .align(Alignment.CenterStart)
                        )

                        Image(
                            painter = painterResource(id = R.drawable.back_icon_ijo),
                            contentDescription = "ke gif",
                            modifier = Modifier
                                .size(36.dp)
                                .align(Alignment.CenterEnd)
                                .padding(end = 12.dp)
                        )
                    }

                    Spacer(modifier = Modifier.height(24.dp))

                    Box(
                        modifier = Modifier
                            .shadow(
                                elevation = 7.dp,
                                shape = RoundedCornerShape(8.dp)
                            )
                            .background(color = Color.White)
                            .fillMaxWidth()
                            .height(62.dp)
                            .clickable { navController.navigate("displaySedih") }
                    ) {
                        Text(
                            text = "Sedih",
                            fontWeight = FontWeight.Medium,
                            color = Color(0xFF145750),
                            fontSize = 22.sp,
                            modifier = Modifier
                                .padding(start = 15.dp)
                                .align(Alignment.CenterStart)
                        )

                        Image(
                            painter = painterResource(id = R.drawable.back_icon_ijo),
                            contentDescription = "ke gif",
                            modifier = Modifier
                                .size(36.dp)
                                .align(Alignment.CenterEnd)
                                .padding(end = 12.dp)
                        )
                    }

                    Spacer(modifier = Modifier.height(24.dp))

                    Box(
                        modifier = Modifier
                            .shadow(
                                elevation = 7.dp,
                                shape = RoundedCornerShape(8.dp)
                            )
                            .background(color = Color.White)
                            .fillMaxWidth()
                            .height(62.dp)
                            .clickable { navController.navigate("displaySenang") }
                    ) {
                        Text(
                            text = "Senang",
                            fontWeight = FontWeight.Medium,
                            color = Color(0xFF145750),
                            fontSize = 22.sp,
                            modifier = Modifier
                                .padding(start = 15.dp)
                                .align(Alignment.CenterStart)
                        )

                        Image(
                            painter = painterResource(id = R.drawable.back_icon_ijo),
                            contentDescription = "ke gif",
                            modifier = Modifier
                                .size(36.dp)
                                .align(Alignment.CenterEnd)
                                .padding(end = 12.dp)
                        )
                    }

                    Spacer(modifier = Modifier.height(24.dp))

                    Box(
                        modifier = Modifier
                            .shadow(
                                elevation = 7.dp,
                                shape = RoundedCornerShape(8.dp)
                            )
                            .background(color = Color.White)
                            .fillMaxWidth()
                            .height(62.dp)
                            .clickable { navController.navigate("displaySiapa") }
                    ) {
                        Text(
                            text = "Siapa",
                            fontWeight = FontWeight.Medium,
                            color = Color(0xFF145750),
                            fontSize = 22.sp,
                            modifier = Modifier
                                .padding(start = 15.dp)
                                .align(Alignment.CenterStart)
                        )

                        Image(
                            painter = painterResource(id = R.drawable.back_icon_ijo),
                            contentDescription = "ke gif",
                            modifier = Modifier
                                .size(36.dp)
                                .align(Alignment.CenterEnd)
                                .padding(end = 12.dp)
                        )
                    }

                    Spacer(modifier = Modifier.height(24.dp))

                    Box(
                        modifier = Modifier
                            .shadow(
                                elevation = 7.dp,
                                shape = RoundedCornerShape(8.dp)
                            )
                            .background(color = Color.White)
                            .fillMaxWidth()
                            .height(62.dp)
                            .clickable { navController.navigate("displayTelepon") }
                    ) {
                        Text(
                            text = "Telepon",
                            fontWeight = FontWeight.Medium,
                            color = Color(0xFF145750),
                            fontSize = 22.sp,
                            modifier = Modifier
                                .padding(start = 15.dp)
                                .align(Alignment.CenterStart)
                        )

                        Image(
                            painter = painterResource(id = R.drawable.back_icon_ijo),
                            contentDescription = "ke gif",
                            modifier = Modifier
                                .size(36.dp)
                                .align(Alignment.CenterEnd)
                                .padding(end = 12.dp)
                        )
                    }

                    Spacer(modifier = Modifier.height(24.dp))

                }
            }
        }
    }
}