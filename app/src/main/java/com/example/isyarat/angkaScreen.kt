package com.example.isyarat

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController

@Composable
fun IsyaratAngka(navController: NavHostController) {
    Box(modifier = Modifier
        .fillMaxSize()) {


        Column {
            // header
            Box (modifier = Modifier
                .fillMaxWidth()
                .height(80.dp)
                .background(
                    color = Color(0xFF219C90),
                    shape = RoundedCornerShape(
                        bottomStart = 15.dp,
                        bottomEnd = 15.dp
                    )
                )
            ){
                Button(
                    onClick = { navController.navigate("homeScreen") },
                    colors = ButtonDefaults.buttonColors(Color(0xFF219C90).copy(alpha = 1f)),
                    modifier = Modifier
                        .align(Alignment.CenterStart)
                ) {
                    Image(painter = painterResource(id = R.drawable.back_icon),
                        contentDescription = "back",
                        modifier = Modifier
                            .size(28.dp)
                    )
                }

                Text(
                    text = "Angka",
                    fontSize = 26.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.White,
                    modifier = Modifier
                        .align(Alignment.Center)
                )
            }


            // biar bisa discroll
            Column  (modifier = Modifier
                .weight(1f)
                .fillMaxWidth()
                .verticalScroll(rememberScrollState())
            ){


                // isi konten
                Row (modifier = Modifier
                    .padding(top = 25.dp, start = 35.dp)){


                    // konten kolom ke 1
                    Column {
                        Box (modifier = Modifier
                            .width(135.dp)
                            .height(120.dp)
                            .background(
                                color = Color(0xFFBDE2DE),
                                shape = RoundedCornerShape(
                                    topStart = 15.dp,
                                    topEnd = 15.dp
                                )
                            )
                        ){
                            Image(painter = painterResource(id = R.drawable.satu),
                                contentDescription = "Satu",
                                modifier = Modifier
                                    .align(Alignment.BottomCenter)
                                    .height(115.dp)
                            )


                        }
                        Box (modifier = Modifier
                            .width(135.dp)
                            .height(33.dp)
                            .background(
                                color = Color(0xFF219C90),
                                shape = RoundedCornerShape(
                                    bottomStart = 15.dp,
                                    bottomEnd = 15.dp
                                )
                            )
                        ){
                            Text(text = "1",
                                modifier = Modifier
                                    .align(Alignment.Center),
                                fontSize = 23.sp,
                                fontWeight = FontWeight.Bold,
                                color = Color.White
                            )


                        }


                        Spacer(modifier = Modifier.height(30.dp))


                        Box (modifier = Modifier
                            .width(135.dp)
                            .height(120.dp)
                            .background(
                                color = Color(0xFFBDE2DE),
                                shape = RoundedCornerShape(
                                    topStart = 15.dp,
                                    topEnd = 15.dp
                                )
                            )
                        ){
                            Image(painter = painterResource(id = R.drawable.tiga),
                                contentDescription = "Tiga",
                                modifier = Modifier
                                    .align(Alignment.BottomCenter)
                                    .height(95.dp)
                            )


                        }
                        Box (modifier = Modifier
                            .width(135.dp)
                            .height(33.dp)
                            .background(
                                color = Color(0xFF219C90),
                                shape = RoundedCornerShape(
                                    bottomStart = 15.dp,
                                    bottomEnd = 15.dp
                                )
                            )
                        ){
                            Text(text = "3",
                                modifier = Modifier
                                    .align(Alignment.Center),
                                fontSize = 23.sp,
                                fontWeight = FontWeight.Bold,
                                color = Color.White
                            )


                        }


                        Spacer(modifier = Modifier.height(30.dp))


                        Box (modifier = Modifier
                            .width(135.dp)
                            .height(120.dp)
                            .background(
                                color = Color(0xFFBDE2DE),
                                shape = RoundedCornerShape(
                                    topStart = 15.dp,
                                    topEnd = 15.dp
                                )
                            )
                        ){
                            Image(painter = painterResource(id = R.drawable.lima),
                                contentDescription = "Lima",
                                modifier = Modifier
                                    .align(Alignment.BottomCenter)
                                    .height(100.dp)
                            )


                        }
                        Box (modifier = Modifier
                            .width(135.dp)
                            .height(33.dp)
                            .background(
                                color = Color(0xFF219C90),
                                shape = RoundedCornerShape(
                                    bottomStart = 15.dp,
                                    bottomEnd = 15.dp
                                )
                            )
                        ){
                            Text(text = "5",
                                modifier = Modifier
                                    .align(Alignment.Center),
                                fontSize = 23.sp,
                                fontWeight = FontWeight.Bold,
                                color = Color.White
                            )


                        }


                        Spacer(modifier = Modifier.height(30.dp))


                        Box (modifier = Modifier
                            .width(135.dp)
                            .height(120.dp)
                            .background(
                                color = Color(0xFFBDE2DE),
                                shape = RoundedCornerShape(
                                    topStart = 15.dp,
                                    topEnd = 15.dp
                                )
                            )
                        ){
                            Image(painter = painterResource(id = R.drawable.tujuh),
                                contentDescription = "Tujuh",
                                modifier = Modifier
                                    .align(Alignment.BottomCenter)
                                    .height(115.dp)
                            )


                        }
                        Box (modifier = Modifier
                            .width(135.dp)
                            .height(33.dp)
                            .background(
                                color = Color(0xFF219C90),
                                shape = RoundedCornerShape(
                                    bottomStart = 15.dp,
                                    bottomEnd = 15.dp
                                )
                            )
                        ){
                            Text(text = "7",
                                modifier = Modifier
                                    .align(Alignment.Center),
                                fontSize = 23.sp,
                                fontWeight = FontWeight.Bold,
                                color = Color.White
                            )
                        }


                        Spacer(modifier = Modifier.height(30.dp))


                        Box (modifier = Modifier
                            .width(135.dp)
                            .height(120.dp)
                            .background(
                                color = Color(0xFFBDE2DE),
                                shape = RoundedCornerShape(
                                    topStart = 15.dp,
                                    topEnd = 15.dp
                                )
                            )
                        ){
                            Image(painter = painterResource(id = R.drawable.sembilan),
                                contentDescription = "Sembilan",
                                modifier = Modifier
                                    .align(Alignment.BottomCenter)
                                    .height(115.dp)
                            )


                        }
                        Box (modifier = Modifier
                            .width(135.dp)
                            .height(33.dp)
                            .background(
                                color = Color(0xFF219C90),
                                shape = RoundedCornerShape(
                                    bottomStart = 15.dp,
                                    bottomEnd = 15.dp
                                )
                            )
                        ){
                            Text(text = "9",
                                modifier = Modifier
                                    .align(Alignment.Center),
                                fontSize = 23.sp,
                                fontWeight = FontWeight.Bold,
                                color = Color.White
                            )
                        }


                        Spacer(modifier = Modifier.height(30.dp))


                        Box (modifier = Modifier
                            .width(135.dp)
                            .height(120.dp)
                            .background(
                                color = Color(0xFFBDE2DE),
                                shape = RoundedCornerShape(
                                    topStart = 15.dp,
                                    topEnd = 15.dp
                                )
                            )
                        ){
                            Image(painter = painterResource(id = R.drawable.sebelas),
                                contentDescription = "Sebelas",
                                modifier = Modifier
                                    .align(Alignment.BottomCenter)
                                    .height(117.dp)
                            )


                        }
                        Box (modifier = Modifier
                            .width(135.dp)
                            .height(33.dp)
                            .background(
                                color = Color(0xFF219C90),
                                shape = RoundedCornerShape(
                                    bottomStart = 15.dp,
                                    bottomEnd = 15.dp
                                )
                            )
                        ){
                            Text(text = "11",
                                modifier = Modifier
                                    .align(Alignment.Center),
                                fontSize = 23.sp,
                                fontWeight = FontWeight.Bold,
                                color = Color.White
                            )
                        }


                        Spacer(modifier = Modifier.height(30.dp))


                        Box (modifier = Modifier
                            .width(135.dp)
                            .height(120.dp)
                            .background(
                                color = Color(0xFFBDE2DE),
                                shape = RoundedCornerShape(
                                    topStart = 15.dp,
                                    topEnd = 15.dp
                                )
                            )
                        ){
                            Image(painter = painterResource(id = R.drawable.tigabelas),
                                contentDescription = "Tiga Belas",
                                modifier = Modifier
                                    .align(Alignment.BottomCenter)
                                    .height(115.dp)
                            )


                        }
                        Box (modifier = Modifier
                            .width(135.dp)
                            .height(33.dp)
                            .background(
                                color = Color(0xFF219C90),
                                shape = RoundedCornerShape(
                                    bottomStart = 15.dp,
                                    bottomEnd = 15.dp
                                )
                            )
                        ){
                            Text(text = "13",
                                modifier = Modifier
                                    .align(Alignment.Center),
                                fontSize = 23.sp,
                                fontWeight = FontWeight.Bold,
                                color = Color.White
                            )
                        }


                        Spacer(modifier = Modifier.height(30.dp))


                        Box (modifier = Modifier
                            .width(135.dp)
                            .height(120.dp)
                            .background(
                                color = Color(0xFFBDE2DE),
                                shape = RoundedCornerShape(
                                    topStart = 15.dp,
                                    topEnd = 15.dp
                                )
                            )
                        ){
                            Image(painter = painterResource(id = R.drawable.limabelas),
                                contentDescription = "Lima Belas",
                                modifier = Modifier
                                    .align(Alignment.BottomCenter)
                                    .height(115.dp)
                            )


                        }
                        Box (modifier = Modifier
                            .width(135.dp)
                            .height(33.dp)
                            .background(
                                color = Color(0xFF219C90),
                                shape = RoundedCornerShape(
                                    bottomStart = 15.dp,
                                    bottomEnd = 15.dp
                                )
                            )
                        ){
                            Text(text = "15",
                                modifier = Modifier
                                    .align(Alignment.Center),
                                fontSize = 23.sp,
                                fontWeight = FontWeight.Bold,
                                color = Color.White
                            )
                        }


                        Spacer(modifier = Modifier.height(30.dp))


                        Box (modifier = Modifier
                            .width(135.dp)
                            .height(120.dp)
                            .background(
                                color = Color(0xFFBDE2DE),
                                shape = RoundedCornerShape(
                                    topStart = 15.dp,
                                    topEnd = 15.dp
                                )
                            )
                        ){
                            Image(painter = painterResource(id = R.drawable.tujuhbelas),
                                contentDescription = "Tujuh Belas",
                                modifier = Modifier
                                    .align(Alignment.BottomCenter)
                                    .height(115.dp)
                            )


                        }
                        Box (modifier = Modifier
                            .width(135.dp)
                            .height(33.dp)
                            .background(
                                color = Color(0xFF219C90),
                                shape = RoundedCornerShape(
                                    bottomStart = 15.dp,
                                    bottomEnd = 15.dp
                                )
                            )
                        ){
                            Text(text = "17",
                                modifier = Modifier
                                    .align(Alignment.Center),
                                fontSize = 23.sp,
                                fontWeight = FontWeight.Bold,
                                color = Color.White
                            )
                        }


                        Spacer(modifier = Modifier.height(30.dp))


                        Box (modifier = Modifier
                            .width(135.dp)
                            .height(120.dp)
                            .background(
                                color = Color(0xFFBDE2DE),
                                shape = RoundedCornerShape(
                                    topStart = 15.dp,
                                    topEnd = 15.dp
                                )
                            )
                        ){
                            Image(painter = painterResource(id = R.drawable.sembilanbelas),
                                contentDescription = "Sembilan Belas",
                                modifier = Modifier
                                    .align(Alignment.BottomCenter)
                                    .height(120.dp)
                            )


                        }
                        Box (modifier = Modifier
                            .width(135.dp)
                            .height(33.dp)
                            .background(
                                color = Color(0xFF219C90),
                                shape = RoundedCornerShape(
                                    bottomStart = 15.dp,
                                    bottomEnd = 15.dp
                                )
                            )
                        ){
                            Text(text = "19",
                                modifier = Modifier
                                    .align(Alignment.Center),
                                fontSize = 23.sp,
                                fontWeight = FontWeight.Bold,
                                color = Color.White
                            )
                        }


                        Spacer(modifier = Modifier.height(30.dp))
                    }


                    Spacer(modifier = Modifier.width(45.dp))


                    // konten kolom ke 2
                    Column {
                        Box (modifier = Modifier
                            .width(135.dp)
                            .height(120.dp)
                            .background(
                                color = Color(0xFFBDE2DE),
                                shape = RoundedCornerShape(
                                    topStart = 15.dp,
                                    topEnd = 15.dp
                                )
                            )
                        ){
                            Image(painter = painterResource(id = R.drawable.dua),
                                contentDescription = "Dua",
                                modifier = Modifier
                                    .align(Alignment.BottomCenter)
                                    .height(115.dp)
                            )


                        }
                        Box (modifier = Modifier
                            .width(135.dp)
                            .height(33.dp)
                            .background(
                                color = Color(0xFF219C90),
                                shape = RoundedCornerShape(
                                    bottomStart = 15.dp,
                                    bottomEnd = 15.dp
                                )
                            )
                        ){
                            Text(text = "2",
                                modifier = Modifier
                                    .align(Alignment.Center),
                                fontSize = 23.sp,
                                fontWeight = FontWeight.Bold,
                                color = Color.White
                            )


                        }


                        Spacer(modifier = Modifier.height(30.dp))


                        Box (modifier = Modifier
                            .width(135.dp)
                            .height(120.dp)
                            .background(
                                color = Color(0xFFBDE2DE),
                                shape = RoundedCornerShape(
                                    topStart = 15.dp,
                                    topEnd = 15.dp
                                )
                            )
                        ){
                            Image(painter = painterResource(id = R.drawable.empat),
                                contentDescription = "Empat",
                                modifier = Modifier
                                    .align(Alignment.BottomCenter)
                                    .height(100.dp)
                            )


                        }
                        Box (modifier = Modifier
                            .width(135.dp)
                            .height(33.dp)
                            .background(
                                color = Color(0xFF219C90),
                                shape = RoundedCornerShape(
                                    bottomStart = 15.dp,
                                    bottomEnd = 15.dp
                                )
                            )
                        ){
                            Text(text = "4",
                                modifier = Modifier
                                    .align(Alignment.Center),
                                fontSize = 23.sp,
                                fontWeight = FontWeight.Bold,
                                color = Color.White
                            )
                        }


                        Spacer(modifier = Modifier.height(30.dp))


                        Box (modifier = Modifier
                            .width(135.dp)
                            .height(120.dp)
                            .background(
                                color = Color(0xFFBDE2DE),
                                shape = RoundedCornerShape(
                                    topStart = 15.dp,
                                    topEnd = 15.dp
                                )
                            )
                        ){
                            Image(painter = painterResource(id = R.drawable.enam),
                                contentDescription = "Enam",
                                modifier = Modifier
                                    .align(Alignment.BottomCenter)
                                    .height(115.dp)
                            )


                        }
                        Box (modifier = Modifier
                            .width(135.dp)
                            .height(33.dp)
                            .background(
                                color = Color(0xFF219C90),
                                shape = RoundedCornerShape(
                                    bottomStart = 15.dp,
                                    bottomEnd = 15.dp
                                )
                            )
                        ){
                            Text(text = "6",
                                modifier = Modifier
                                    .align(Alignment.Center),
                                fontSize = 23.sp,
                                fontWeight = FontWeight.Bold,
                                color = Color.White
                            )
                        }


                        Spacer(modifier = Modifier.height(30.dp))


                        Box (modifier = Modifier
                            .width(135.dp)
                            .height(120.dp)
                            .background(
                                color = Color(0xFFBDE2DE),
                                shape = RoundedCornerShape(
                                    topStart = 15.dp,
                                    topEnd = 15.dp
                                )
                            )
                        ){
                            Image(painter = painterResource(id = R.drawable.delapan),
                                contentDescription = "Delapan",
                                modifier = Modifier
                                    .align(Alignment.BottomCenter)
                                    .height(115.dp)
                            )


                        }
                        Box (modifier = Modifier
                            .width(135.dp)
                            .height(33.dp)
                            .background(
                                color = Color(0xFF219C90),
                                shape = RoundedCornerShape(
                                    bottomStart = 15.dp,
                                    bottomEnd = 15.dp
                                )
                            )
                        ){
                            Text(text = "8",
                                modifier = Modifier
                                    .align(Alignment.Center),
                                fontSize = 23.sp,
                                fontWeight = FontWeight.Bold,
                                color = Color.White
                            )
                        }


                        Spacer(modifier = Modifier.height(30.dp))


                        Box (modifier = Modifier
                            .width(135.dp)
                            .height(120.dp)
                            .background(
                                color = Color(0xFFBDE2DE),
                                shape = RoundedCornerShape(
                                    topStart = 15.dp,
                                    topEnd = 15.dp
                                )
                            )
                        ){
                            Image(painter = painterResource(id = R.drawable.sepuluh),
                                contentDescription = "Sepuluh",
                                modifier = Modifier
                                    .align(Alignment.BottomCenter)
                                    .height(115.dp)
                            )


                        }
                        Box (modifier = Modifier
                            .width(135.dp)
                            .height(33.dp)
                            .background(
                                color = Color(0xFF219C90),
                                shape = RoundedCornerShape(
                                    bottomStart = 15.dp,
                                    bottomEnd = 15.dp
                                )
                            )
                        ){
                            Text(text = "10",
                                modifier = Modifier
                                    .align(Alignment.Center),
                                fontSize = 23.sp,
                                fontWeight = FontWeight.Bold,
                                color = Color.White
                            )
                        }


                        Spacer(modifier = Modifier.height(30.dp))


                        Box (modifier = Modifier
                            .width(135.dp)
                            .height(120.dp)
                            .background(
                                color = Color(0xFFBDE2DE),
                                shape = RoundedCornerShape(
                                    topStart = 15.dp,
                                    topEnd = 15.dp
                                )
                            )
                        ){
                            Image(painter = painterResource(id = R.drawable.duabelas),
                                contentDescription = "Dua Belas",
                                modifier = Modifier
                                    .align(Alignment.BottomCenter)
                                    .height(110.dp)
                            )


                        }
                        Box (modifier = Modifier
                            .width(135.dp)
                            .height(33.dp)
                            .background(
                                color = Color(0xFF219C90),
                                shape = RoundedCornerShape(
                                    bottomStart = 15.dp,
                                    bottomEnd = 15.dp
                                )
                            )
                        ){
                            Text(text = "12",
                                modifier = Modifier
                                    .align(Alignment.Center),
                                fontSize = 23.sp,
                                fontWeight = FontWeight.Bold,
                                color = Color.White
                            )
                        }


                        Spacer(modifier = Modifier.height(30.dp))


                        Box (modifier = Modifier
                            .width(135.dp)
                            .height(120.dp)
                            .background(
                                color = Color(0xFFBDE2DE),
                                shape = RoundedCornerShape(
                                    topStart = 15.dp,
                                    topEnd = 15.dp
                                )
                            )
                        ){
                            Image(painter = painterResource(id = R.drawable.empatbelas),
                                contentDescription = "Empat Belas",
                                modifier = Modifier
                                    .align(Alignment.BottomCenter)
                                    .height(115.dp)
                            )


                        }
                        Box (modifier = Modifier
                            .width(135.dp)
                            .height(33.dp)
                            .background(
                                color = Color(0xFF219C90),
                                shape = RoundedCornerShape(
                                    bottomStart = 15.dp,
                                    bottomEnd = 15.dp
                                )
                            )
                        ){
                            Text(text = "14",
                                modifier = Modifier
                                    .align(Alignment.Center),
                                fontSize = 23.sp,
                                fontWeight = FontWeight.Bold,
                                color = Color.White
                            )
                        }


                        Spacer(modifier = Modifier.height(30.dp))


                        Box (modifier = Modifier
                            .width(135.dp)
                            .height(120.dp)
                            .background(
                                color = Color(0xFFBDE2DE),
                                shape = RoundedCornerShape(
                                    topStart = 15.dp,
                                    topEnd = 15.dp
                                )
                            )
                        ){
                            Image(painter = painterResource(id = R.drawable.enambelas),
                                contentDescription = "Enam Belas",
                                modifier = Modifier
                                    .align(Alignment.BottomCenter)
                                    .height(115.dp)
                            )


                        }
                        Box (modifier = Modifier
                            .width(135.dp)
                            .height(33.dp)
                            .background(
                                color = Color(0xFF219C90),
                                shape = RoundedCornerShape(
                                    bottomStart = 15.dp,
                                    bottomEnd = 15.dp
                                )
                            )
                        ){
                            Text(text = "16",
                                modifier = Modifier
                                    .align(Alignment.Center),
                                fontSize = 23.sp,
                                fontWeight = FontWeight.Bold,
                                color = Color.White
                            )
                        }


                        Spacer(modifier = Modifier.height(30.dp))


                        Box (modifier = Modifier
                            .width(135.dp)
                            .height(120.dp)
                            .background(
                                color = Color(0xFFBDE2DE),
                                shape = RoundedCornerShape(
                                    topStart = 15.dp,
                                    topEnd = 15.dp
                                )
                            )
                        ){
                            Image(painter = painterResource(id = R.drawable.delapanbelas),
                                contentDescription = "Delapan Belas",
                                modifier = Modifier
                                    .align(Alignment.BottomCenter)
                                    .height(115.dp)
                            )


                        }
                        Box (modifier = Modifier
                            .width(135.dp)
                            .height(33.dp)
                            .background(
                                color = Color(0xFF219C90),
                                shape = RoundedCornerShape(
                                    bottomStart = 15.dp,
                                    bottomEnd = 15.dp
                                )
                            )
                        ){
                            Text(text = "18",
                                modifier = Modifier
                                    .align(Alignment.Center),
                                fontSize = 23.sp,
                                fontWeight = FontWeight.Bold,
                                color = Color.White
                            )
                        }


                        Spacer(modifier = Modifier.height(30.dp))


                        Box (modifier = Modifier
                            .width(135.dp)
                            .height(120.dp)
                            .background(
                                color = Color(0xFFBDE2DE),
                                shape = RoundedCornerShape(
                                    topStart = 15.dp,
                                    topEnd = 15.dp
                                )
                            )
                        ){
                            Image(painter = painterResource(id = R.drawable.duapuluh),
                                contentDescription = "Dua Puluh",
                                modifier = Modifier
                                    .align(Alignment.BottomCenter)
                                    .height(110.dp)
                            )


                        }
                        Box (modifier = Modifier
                            .width(135.dp)
                            .height(33.dp)
                            .background(
                                color = Color(0xFF219C90),
                                shape = RoundedCornerShape(
                                    bottomStart = 15.dp,
                                    bottomEnd = 15.dp
                                )
                            )
                        ){
                            Text(text = "20",
                                modifier = Modifier
                                    .align(Alignment.Center),
                                fontSize = 23.sp,
                                fontWeight = FontWeight.Bold,
                                color = Color.White
                            )
                        }
                        Spacer(modifier = Modifier.height(30.dp))
                    }
                }
            }
        }
    }
}