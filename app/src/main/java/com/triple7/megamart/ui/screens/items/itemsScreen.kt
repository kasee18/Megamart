package com.triple7.megamart.ui.screens.items

import androidx.compose.foundation.Image
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
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Place
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material.icons.filled.Star
import androidx.compose.material.icons.filled.ThumbUp
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.triple7.megamart.R
import com.triple7.megamart.navigation.ROUT_CATEGORIES
import com.triple7.megamart.navigation.ROUT_CONTACT
import com.triple7.megamart.navigation.ROUT_SCAFFOLD
import com.triple7.megamart.ui.theme.Triple7Orange
import com.triple7.megamart.ui.theme.TripleOrange

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ItemScreen(navController: NavController){

    //Main Layout
    Column(

        modifier = Modifier.fillMaxSize(),



    ){

        //TopAppBar

        TopAppBar(
            title = { Text(text = "Products") },
            colors = TopAppBarDefaults.topAppBarColors(
                containerColor = Triple7Orange,
                titleContentColor = Color.White,
                navigationIconContentColor = Color.White,
                actionIconContentColor = Color.White
            ),
            navigationIcon = {

                IconButton(onClick = {}) { Icon(imageVector = Icons.Default.Menu, contentDescription = "Menu") }

            },
            actions = {

                IconButton(onClick = {}) { Icon(imageVector = Icons.Default.ShoppingCart, contentDescription = "ShoppingCart") }
                IconButton(onClick = {}) { Icon(imageVector = Icons.Default.ThumbUp, contentDescription = "Like") }
                IconButton(onClick = {}) { Icon(imageVector = Icons.Default.Place, contentDescription = "Order") }
                IconButton(onClick = {navController.navigate(ROUT_SCAFFOLD)}) { Icon(imageVector = Icons.Default.ArrowForward, contentDescription = "Order") }


            }
        )

        //End of TopAppBar

        Image(

            painter = painterResource(id = R.drawable.img_4),
            contentDescription = "img_3",
            modifier = Modifier.height(200.dp).fillMaxWidth(),
            contentScale = ContentScale.Crop
        )

        //End of Main Layout

        Spacer(modifier = Modifier.height(20.dp))

        //Searchbar

        var search by remember { mutableStateOf("") }
        OutlinedTextField(
            value = search,
            onValueChange = { search = it },
            modifier = Modifier.
            width(277.dp).
            align(alignment = Alignment.CenterHorizontally),
            leadingIcon = { Icon(imageVector = Icons.Default.Search, contentDescription = "search") }, //Icon at beginning
            trailingIcon = { Icon(imageVector = Icons.Default.Search, contentDescription = "search") },//Icon at end
            label = { Text(text = "Search Products") },
            colors = OutlinedTextFieldDefaults.colors(
                focusedBorderColor = Triple7Orange,
                unfocusedBorderColor = Color.Gray
            )

        )

        //End of Searchbar

        Column(
            modifier = Modifier.verticalScroll(rememberScrollState())
        ){

            Spacer(modifier = Modifier.height(20.dp))

            //Card

            Card(onClick = {},
                modifier = Modifier.fillMaxWidth().height(200.dp).padding(10.dp),
                //colors = CardDefaults.cardColors(Triple7Orange),
                elevation = CardDefaults.cardElevation(5.dp)


            ) {


                Row(
                    modifier = Modifier.padding(5.dp)
                ){

                    Image(

                        painter = painterResource(id = R.drawable.img_5),
                        contentDescription = "img_5",
                        modifier = Modifier.size(200.dp).clip(shape = RoundedCornerShape(20.dp)),
                        contentScale = ContentScale.Crop


                    )

                    Spacer(modifier = Modifier.width(20.dp))

                    Column {

                        Text(text = "Wine", fontSize = 20.sp, fontWeight = FontWeight.Bold)
                        Text(text = "Brand : Hennessy", fontSize = 15.sp, fontWeight = FontWeight.Bold)
                        Text(text = "Quantity : 750Ml", fontSize = 15.sp, fontWeight = FontWeight.Bold)
                        Text(text = "Ksh. 15000", fontSize = 15.sp, fontWeight = FontWeight.Bold)
                        Row {

                            Icon(imageVector = Icons.Default.Star, contentDescription = "star", tint = Triple7Orange)
                            Icon(imageVector = Icons.Default.Star, contentDescription = "star", tint = Triple7Orange)
                            Icon(imageVector = Icons.Default.Star, contentDescription = "star", tint = Triple7Orange)
                            Icon(imageVector = Icons.Default.Star, contentDescription = "star", tint = Triple7Orange)
                            Icon(imageVector = Icons.Default.Star, contentDescription = "star", tint = Triple7Orange)
                        }

                        Button(onClick = {},

                            shape = RoundedCornerShape(15.dp),
                            colors = ButtonDefaults.buttonColors(Triple7Orange),
                            modifier = Modifier.fillMaxWidth(),

                            ) {

                            Text(text = "Add to Cart")
                        }
                    }

                }


            }

            //End of Card


            Spacer(modifier = Modifier.height(20.dp))

            //Card

            Card(onClick = {},
                modifier = Modifier.fillMaxWidth().height(200.dp).padding(10.dp),
                //colors = CardDefaults.cardColors(Triple7Orange),
                elevation = CardDefaults.cardElevation(5.dp)


            ) {


                Row(
                    modifier = Modifier.padding(5.dp)
                ){

                    Image(

                        painter = painterResource(id = R.drawable.img_6),
                        contentDescription = "img_5",
                        modifier = Modifier.size(200.dp).clip(shape = RoundedCornerShape(20.dp)),
                        contentScale = ContentScale.Crop


                    )

                    Spacer(modifier = Modifier.width(20.dp))

                    Column {

                        Text(text = "Wine", fontSize = 20.sp, fontWeight = FontWeight.Bold)
                        Text(text = "Brand : Hennessy", fontSize = 15.sp, fontWeight = FontWeight.Bold)
                        Text(text = "Quantity : 750Ml", fontSize = 15.sp, fontWeight = FontWeight.Bold)
                        Text(text = "Ksh. 15000", fontSize = 15.sp, fontWeight = FontWeight.Bold)
                        Row {

                            Icon(imageVector = Icons.Default.Star, contentDescription = "star", tint = Triple7Orange)
                            Icon(imageVector = Icons.Default.Star, contentDescription = "star", tint = Triple7Orange)
                            Icon(imageVector = Icons.Default.Star, contentDescription = "star", tint = Triple7Orange)
                            Icon(imageVector = Icons.Default.Star, contentDescription = "star", tint = Triple7Orange)
                            Icon(imageVector = Icons.Default.Star, contentDescription = "star", tint = Triple7Orange)
                        }

                        Button(onClick = {},

                            shape = RoundedCornerShape(15.dp),
                            colors = ButtonDefaults.buttonColors(Triple7Orange),
                            modifier = Modifier.fillMaxWidth(),

                            ) {

                            Text(text = "Add to Cart")
                        }
                    }

                }


            }

            //End of Card

            Spacer(modifier = Modifier.height(20.dp))

            //Card

            Card(onClick = {},
                modifier = Modifier.fillMaxWidth().height(200.dp).padding(10.dp),
                //colors = CardDefaults.cardColors(Triple7Orange),
                elevation = CardDefaults.cardElevation(5.dp)


            ) {


                Row(
                    modifier = Modifier.padding(5.dp)
                ){

                    Image(

                        painter = painterResource(id = R.drawable.img_7),
                        contentDescription = "img_5",
                        modifier = Modifier.size(200.dp).clip(shape = RoundedCornerShape(20.dp)),
                        contentScale = ContentScale.Crop


                    )

                    Spacer(modifier = Modifier.width(20.dp))

                    Column {

                        Text(text = "Wine", fontSize = 20.sp, fontWeight = FontWeight.Bold)
                        Text(text = "Brand : Hennessy", fontSize = 15.sp, fontWeight = FontWeight.Bold)
                        Text(text = "Quantity : 750Ml", fontSize = 15.sp, fontWeight = FontWeight.Bold)
                        Text(text = "Ksh. 15000", fontSize = 15.sp, fontWeight = FontWeight.Bold)
                        Row {

                            Icon(imageVector = Icons.Default.Star, contentDescription = "star", tint = Triple7Orange)
                            Icon(imageVector = Icons.Default.Star, contentDescription = "star", tint = Triple7Orange)
                            Icon(imageVector = Icons.Default.Star, contentDescription = "star", tint = Triple7Orange)
                            Icon(imageVector = Icons.Default.Star, contentDescription = "star", tint = Triple7Orange)
                            Icon(imageVector = Icons.Default.Star, contentDescription = "star", tint = Triple7Orange)
                        }

                        Button(onClick = {},

                            shape = RoundedCornerShape(15.dp),
                            colors = ButtonDefaults.buttonColors(Triple7Orange),
                            modifier = Modifier.fillMaxWidth(),

                            ) {

                            Text(text = "Add to Cart")
                        }
                    }

                }


            }

            //End of Card

        }

    }




}


@Composable
@Preview(showBackground = true)

fun ItemScreentPreview(){

    ItemScreen(rememberNavController())

}