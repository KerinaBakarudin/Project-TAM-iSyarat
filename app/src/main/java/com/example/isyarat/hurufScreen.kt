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
fun IsyaratHuruf(navController: NavHostController) {
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
                    text = "Huruf",
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
                        // A
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
                            Image(painter = painterResource(id = R.drawable.a),
                                contentDescription = "A",
                                modifier = Modifier
                                    .align(Alignment.BottomCenter)
                                    .height(90.dp)
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
                            Text(text = "A",
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
                            Image(painter = painterResource(id = R.drawable.c),
                                contentDescription = "C",
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
                            Text(text = "C",
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
                            Image(painter = painterResource(id = R.drawable.e),
                                contentDescription = "E",
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
                            Text(text = "E",
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
                            Image(painter = painterResource(id = R.drawable.g),
                                contentDescription = "G",
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
                            Text(text = "G",
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
                            Image(painter = painterResource(id = R.drawable.i),
                                contentDescription = "I",
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
                            Text(text = "I",
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
                            Image(painter = painterResource(id = R.drawable.k),
                                contentDescription = "K",
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
                            Text(text = "K",
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
                            Image(painter = painterResource(id = R.drawable.m),
                                contentDescription = "M",
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
                            Text(text = "M",
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
                            Image(painter = painterResource(id = R.drawable.o),
                                contentDescription = "O",
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
                            Text(text = "O",
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
                            Image(painter = painterResource(id = R.drawable.q),
                                contentDescription = "Q",
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
                            Text(text = "Q",
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
                            Image(painter = painterResource(id = R.drawable.s),
                                contentDescription = "S",
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
                            Text(text = "S",
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
                            Image(painter = painterResource(id = R.drawable.u),
                                contentDescription = "U",
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
                            Text(text = "U",
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
                            Image(painter = painterResource(id = R.drawable.w),
                                contentDescription = "W",
                                modifier = Modifier
                                    .align(Alignment.BottomCenter)
                                    .height(108.dp)
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
                            Text(text = "W",
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
                            Image(painter = painterResource(id = R.drawable.y),
                                contentDescription = "Y",
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
                            Text(text = "Y",
                                modifier = Modifier
                                    .align(Alignment.Center),
                                fontSize = 23.sp,
                                fontWeight = FontWeight.Bold,
                                color = Color.White
                            )
                        }

                        Spacer(modifier = Modifier.height(30.dp))

                        // batasan
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
                            Image(painter = painterResource(id = R.drawable.b),
                                contentDescription = "B",
                                modifier = Modifier
                                    .align(Alignment.BottomCenter)
                                    .height(90.dp)
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
                            Text(text = "B",
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
                            Image(painter = painterResource(id = R.drawable.d),
                                contentDescription = "D",
                                modifier = Modifier
                                    .align(Alignment.BottomCenter)
                                    .height(80.dp)
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
                            Text(text = "D",
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
                            Image(painter = painterResource(id = R.drawable.f),
                                contentDescription = "F",
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
                            Text(text = "F",
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
                            Image(painter = painterResource(id = R.drawable.h),
                                contentDescription = "H",
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
                            Text(text = "H",
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
                            Image(painter = painterResource(id = R.drawable.j),
                                contentDescription = "J",
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
                            Text(text = "J",
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
                            Image(painter = painterResource(id = R.drawable.l),
                                contentDescription = "L",
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
                            Text(text = "L",
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
                            Image(painter = painterResource(id = R.drawable.n),
                                contentDescription = "N",
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
                            Text(text = "N",
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
                            Image(painter = painterResource(id = R.drawable.p),
                                contentDescription = "P",
                                modifier = Modifier
                                    .align(Alignment.BottomCenter)
                                    .height(105.dp)
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
                            Text(text = "P",
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
                            Image(painter = painterResource(id = R.drawable.r),
                                contentDescription = "R",
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
                            Text(text = "R",
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
                            Image(painter = painterResource(id = R.drawable.t),
                                contentDescription = "T",
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
                            Text(text = "T",
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
                            Image(painter = painterResource(id = R.drawable.v),
                                contentDescription = "V",
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
                            Text(text = "V",
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
                            Image(painter = painterResource(id = R.drawable.x),
                                contentDescription = "X",
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
                            Text(text = "X",
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
                            Image(painter = painterResource(id = R.drawable.z),
                                contentDescription = "Z",
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
                            Text(text = "Z",
                                modifier = Modifier
                                    .align(Alignment.Center),
                                fontSize = 23.sp,
                                fontWeight = FontWeight.Bold,
                                color = Color.White
                            )
                        }

                        Spacer(modifier = Modifier.height(30.dp))

                        // batasan
                    }
                }

            }

        }
    }
}