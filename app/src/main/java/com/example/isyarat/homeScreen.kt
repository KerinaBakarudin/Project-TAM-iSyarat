package com.example.isyarat

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController

@Composable
fun HomeScreen(navController: NavHostController) {
    BoxWithConstraints(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
        val headerHeight = maxHeight * 0.35f


        Column(
            modifier = Modifier
                .fillMaxSize()
        ) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(headerHeight)
                    .clip(RoundedCornerShape(bottomStart = 16.dp, bottomEnd = 16.dp))
                    .background(Color(0xFF219C90))
                    .padding(start = 20.dp, end = 20.dp, top = 20.dp, bottom = 8.dp)


            ) {
                Image(
                    painter = painterResource(id = R.drawable.greatinghand),
                    contentDescription = null,
                    contentScale = ContentScale.FillBounds,
                    modifier = Modifier
                        .height(240.dp)
                        .width(120.dp)
                        .align(Alignment.BottomEnd)
                )


                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(bottom = 32.dp)
                ) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.isyarat),
                            contentDescription = null,
                            modifier = Modifier
                                .size(60.dp)
                        )


                        Spacer(modifier = Modifier.width(8.dp))


                        Text(
                            text = "iSyarat",
                            fontSize = 24.sp,
                            color = Color.White
                        )
                    }


                    Spacer(modifier = Modifier.weight(1f))


                    Text(
                        text = "Hai, Teman iSyarat!",
                        fontWeight = FontWeight.Bold,
                        fontSize = 28.sp,
                        color = Color.White
                    )


                    Text(
                        text = "Yuk belajar bahasa isyarat\nbersama kami!",
                        fontSize = 20.sp,
                        color = Color.White
                    )
                }
            }


            Spacer(modifier = Modifier.height(60.dp))


            Row(
                horizontalArrangement = Arrangement.Center,
                modifier = Modifier
                    .fillMaxWidth()
            ) {
                Column {
                    Box {
                        Box(
                            modifier = Modifier
                                .height(120.dp)
                                .width(140.dp)
                                .clip(RoundedCornerShape(16.dp))
                                .background(Color(0xFF219C90).copy(alpha = 0.3f))
                                .align(Alignment.BottomCenter)
                                .clickable { navController.navigate("hurufScreen") }

                        )

                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally,
                            modifier = Modifier
                                .padding(bottom = 12.dp)
                                .align(Alignment.TopCenter)
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.alfabet),
                                contentDescription = null,
                                modifier = Modifier
                                    .size(100.dp)
                            )


                            Text(
                                text = "Huruf",
                                fontSize = 20.sp
                            )
                        }
                    }


                    Spacer(modifier = Modifier.height(28.dp))


                    Box {
                        Box(
                            modifier = Modifier
                                .height(120.dp)
                                .width(140.dp)
                                .clip(RoundedCornerShape(16.dp))
                                .background(Color(0xFF219C90).copy(alpha = 0.3f))
                                .align(Alignment.BottomCenter)
                                .clickable { navController.navigate("kosaKataScreen") }
                        )


                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally,
                            modifier = Modifier
                                .padding(bottom = 12.dp)
                                .align(Alignment.TopCenter)
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.kosakata),
                                contentDescription = null,
                                modifier = Modifier
                                    .size(100.dp)
                            )


                            Text(
                                text = "Kosa Kata",
                                fontSize = 20.sp
                            )
                        }
                    }
                }


                Spacer(modifier = Modifier.width(40.dp))


                Column {
                    Box {
                        Box(
                            modifier = Modifier
                                .height(120.dp)
                                .width(140.dp)
                                .clip(RoundedCornerShape(16.dp))
                                .background(Color(0xFF219C90).copy(alpha = 0.3f))
                                .align(Alignment.BottomCenter)
                                .clickable { navController.navigate("angkaScreen") }
                        )


                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally,
                            modifier = Modifier
                                .padding(bottom = 12.dp)
                                .align(Alignment.TopCenter)
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.angka),
                                contentDescription = null,
                                modifier = Modifier
                                    .size(100.dp)
                            )


                            Text(
                                text = "Angka",
                                fontSize = 20.sp
                            )
                        }
                    }


                    Spacer(modifier = Modifier.height(28.dp))


                    Box {
                        Box(
                            modifier = Modifier
                                .height(120.dp)
                                .width(140.dp)
                                .clip(RoundedCornerShape(16.dp))
                                .background(Color(0xFF219C90).copy(alpha = 0.3f))
                                .align(Alignment.BottomCenter)
                                .clickable { navController.navigate("videoPembelajaranScreen") }
                        )


                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally,
                            modifier = Modifier
                                .padding(bottom = 12.dp)
                                .align(Alignment.TopCenter)
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.video),
                                contentDescription = null,
                                modifier = Modifier
                                    .size(100.dp)
                            )


                            Text(
                                text = "Video Belajar",
                                fontSize = 20.sp
                            )
                        }
                    }
                }
            }
        }
    }
}