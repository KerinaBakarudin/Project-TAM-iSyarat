package com.example.isyarat

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
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
fun LayoutList(navController: NavHostController) {
    Column {
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
                text = "Video Pembelajaran",
                fontSize = 26.sp,
                fontWeight = FontWeight.Bold,
                color = Color.White,
                modifier = Modifier
                    .align(Alignment.Center)
            )
        }

        Column(modifier = Modifier.padding(16.dp)) {
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 16.dp, top = 16.dp)
                    .clickable { navController.navigate("videosatu") },
                shape = RoundedCornerShape(10.dp),
                elevation = CardDefaults.cardElevation(5.dp),
                colors = CardDefaults.cardColors(
                    containerColor = Color.White
                )
            ) {
                Row(
                    modifier = Modifier
                        .padding(5.dp)
                        .fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.katasapa),
                        contentDescription = null,
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .padding(4.dp)
                            .height(90.dp)
                            .width(90.dp)
                            .clip(RoundedCornerShape(corner = CornerSize(10.dp)))
                    )
                    Column {
                        Text(text = "Kata Sapa", modifier = Modifier.padding(start = 30.dp))
                        Spacer(modifier = Modifier.height(6.dp))
                    }
                }
            }

            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 16.dp)
                    .clickable { navController.navigate("videodua") },
                shape = RoundedCornerShape(10.dp),
                elevation = CardDefaults.cardElevation(5.dp),
                colors = CardDefaults.cardColors(
                    containerColor = Color.White
                )
            ) {
                Row(
                    modifier = Modifier
                        .padding(5.dp)
                        .fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.katasifat),
                        contentDescription = null,
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .padding(4.dp)
                            .height(90.dp)
                            .width(90.dp)
                            .clip(RoundedCornerShape(corner = CornerSize(10.dp)))
                    )
                    Column {
                        Text(text = "Kata Sifat", modifier = Modifier.padding(start = 30.dp))
                        Spacer(modifier = Modifier.height(6.dp))
                    }
                }
            }

            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 16.dp)
                    .clickable { navController.navigate("videotiga") },
                shape = RoundedCornerShape(10.dp),
                elevation = CardDefaults.cardElevation(5.dp),
                colors = CardDefaults.cardColors(
                    containerColor = Color.White
                )
            ) {
                Row(
                    modifier = Modifier
                        .padding(5.dp)
                        .fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.keluarga),
                        contentDescription = null,
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .padding(4.dp)
                            .height(90.dp)
                            .width(90.dp)
                            .clip(RoundedCornerShape(corner = CornerSize(10.dp)))
                    )
                    Column {
                        Text(text = "Keluarga", modifier = Modifier.padding(start = 30.dp))
                        Spacer(modifier = Modifier.height(6.dp))
                    }
                }
            }

            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 16.dp)
                    .clickable { navController.navigate("videoempat") },
                shape = RoundedCornerShape(10.dp),
                elevation = CardDefaults.cardElevation(5.dp),
                colors = CardDefaults.cardColors(
                    containerColor = Color.White
                )
            ) {
                Row(
                    modifier = Modifier
                        .padding(5.dp)
                        .fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.hari),
                        contentDescription = null,
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .padding(4.dp)
                            .height(90.dp)
                            .width(90.dp)
                            .clip(RoundedCornerShape(corner = CornerSize(10.dp)))
                    )
                    Column {
                        Text(text = "Hari", modifier = Modifier.padding(start = 30.dp))
                        Spacer(modifier = Modifier.height(6.dp))
                    }
                }
            }

            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .clickable { navController.navigate("videolima") },
                shape = RoundedCornerShape(10.dp),
                elevation = CardDefaults.cardElevation(5.dp),
                colors = CardDefaults.cardColors(
                    containerColor = Color.White
                )
            ) {
                Row(
                    modifier = Modifier
                        .padding(5.dp)
                        .fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.perkenalkan),
                        contentDescription = null,
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .padding(4.dp)
                            .height(90.dp)
                            .width(90.dp)
                            .clip(RoundedCornerShape(corner = CornerSize(10.dp)))
                    )
                    Column {
                        Text(text = "Perkenalan", modifier = Modifier.padding(start = 30.dp))
                        Spacer(modifier = Modifier.height(6.dp))
                    }
                }
            }
        }
    }
}