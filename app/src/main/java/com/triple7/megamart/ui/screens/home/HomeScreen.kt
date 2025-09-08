package com.triple7.megamart.ui.screens.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
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
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.triple7.megamart.R
import com.triple7.megamart.ui.theme.Triple7Orange

@Composable
fun Home(){

    //Main layout
    Column(
        modifier = Modifier.fillMaxSize().padding(start = 20.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,

    ){

        //        Image(
        //            painter = painterResource(id = R.drawable.sikiafiti),
        //            contentDescription = "sikiafiti",
        //            modifier = Modifier.size(300.dp).clip(shape = CircleShape),
        //            contentScale = ContentScale.Crop,
        //
        //        )


        //Row

        Row(
            modifier = Modifier.horizontalScroll(rememberScrollState())

        ){
                Image(
                painter = painterResource(id = R.drawable.img),
                contentDescription = "sikiafiti",
                modifier = Modifier.size(width = 200.dp, height = 250.dp).clip(shape = RoundedCornerShape(10.dp)),
                )

            Spacer(modifier = Modifier.width(20.dp))

            Image(
                painter = painterResource(id = R.drawable.img_1),
                contentDescription = "sikiafiti",
                modifier = Modifier.size(width = 200.dp, height = 250.dp).clip(shape = RoundedCornerShape(10.dp)),
            )

            Spacer(modifier = Modifier.width(20.dp))


            Image(
                painter = painterResource(id = R.drawable.img_2),
                contentDescription = "sikiafiti",
                modifier = Modifier.size(width = 200.dp, height = 250.dp).clip(shape = RoundedCornerShape(10.dp)),
            )

            Spacer(modifier = Modifier.width(20.dp))

            Image(
                painter = painterResource(id = R.drawable.img_3),
                contentDescription = "sikiafiti",
                modifier = Modifier.size(width = 200.dp, height = 250.dp).clip(shape = RoundedCornerShape(10.dp)),
            )

            Spacer(modifier = Modifier.width(20.dp))





        }

        //End of Row


        Spacer(modifier = Modifier.height(20.dp))

        Text(

            text = "SHHOP.DISCOVER.TREND",
            fontSize = 30.sp,
            color = Triple7Orange,
            fontWeight = FontWeight.ExtraBold,

        )

        Spacer(modifier = Modifier.height(20.dp))

        Text(
            text = "Viceroy is a wonderfully matured South African brandy. It's matured to a higher standard than other brandies, making it one of the world's great tastes in brandy. This 5-year-old Viceroy Liqueur Brandy was launched in 1940 and is produced at The Van Ryn Brandy Distillery in Vlottenburg, Stellenbosch.",
            textAlign = TextAlign.Center

        )

        Spacer(modifier = Modifier.height(20.dp))
        Button(

            onClick = {},
            shape = RoundedCornerShape(15.dp),
            colors = ButtonDefaults.buttonColors(Triple7Orange),
            modifier = Modifier.fillMaxWidth(),

        ){
            Text(text = "Lets Get on")
        }





    }

    //End main layout


}


@Composable
@Preview(showBackground = true)

fun HomePreview(){

    Home()

}