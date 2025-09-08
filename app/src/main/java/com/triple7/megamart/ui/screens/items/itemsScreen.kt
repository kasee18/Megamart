package com.triple7.megamart.ui.screens.items

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Place
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material.icons.filled.ThumbUp
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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.triple7.megamart.R
import com.triple7.megamart.ui.theme.Triple7Orange

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ItemScreen(){

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

    }




}


@Composable
@Preview(showBackground = true)

fun ItemScreentPreview(){

    ItemScreen()

}