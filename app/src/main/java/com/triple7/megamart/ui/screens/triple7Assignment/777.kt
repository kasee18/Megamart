package com.triple7.megamart.ui.screens.about

import android.R.attr.contentDescription
import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.text.font.FontWeight
import com.triple7.megamart.R
import com.triple7.megamart.ui.theme.Triple7Orange

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun triple7() {
    Scaffold(
        bottomBar = {
            BottomAppBar(
                containerColor = Triple7Orange
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 16.dp, vertical = 10.dp),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(text = "Home", fontSize = 18.sp, fontWeight = FontWeight.Bold)
                    Text(text = "Search", fontSize = 18.sp, fontWeight = FontWeight.Bold)
                    Text(text = "Profile", fontSize = 18.sp, fontWeight = FontWeight.Bold)
                }
            }
        }
    ) {
        Row {
            Box(modifier = Modifier.fillMaxWidth()) {

                Row {
                    TopAppBar(
                        title = {
                            Column {
                                Text(
                                    text = "Hi Samantha",
                                    fontSize = 30.sp,
                                    fontWeight = FontWeight.Bold
                                )
                                Text(
                                    text = "Here you go",
                                    fontSize = 20.sp,
                                )
                            }
                        }
                    )
                }

                Box(
                    modifier = Modifier
                        .size(220.dp)
                        .align(Alignment.TopEnd)
                        .offset(x = 110.dp, y = (-110).dp)
                        .background(Triple7Orange, CircleShape),
                    contentAlignment = Alignment.Center
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.img_10),
                        contentDescription = "img_10",
                        modifier = Modifier
                            .size(180.dp)
                            .clip(CircleShape)
                            .offset(y = 70.dp),
                        contentScale = ContentScale.Crop
                    )
                }
            }

            //Body content

            Column {
                Image(
                    painter = painterResource(id = R.drawable.img_11),
                    contentDescription = "img_11",)
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun triple7Preview() {
    triple7()
}
