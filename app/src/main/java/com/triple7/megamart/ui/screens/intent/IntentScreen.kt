package com.triple7.megamart.ui.screens.intent

import android.content.Intent
import android.provider.MediaStore
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
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
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.net.toUri
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.triple7.megamart.navigation.ROUT_HOME
import com.triple7.megamart.ui.theme.Triple7Orange
import com.triple7.megamart.ui.theme.TripleOrange

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun IntentScreen(navController: NavController){

    val mContext = LocalContext.current

    //Scaffold

    var selectedIndex by remember { mutableStateOf(0) }

    Scaffold(
        //TopBar
        topBar = {
            TopAppBar(
                title = { Text("Intents") },
                navigationIcon = {
                    IconButton(onClick = { /* Handle back/nav */ }) {
                        Icon(Icons.Default.ArrowBack, contentDescription = "Back")
                    }
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = Triple7Orange,
                    titleContentColor = Color.White,
                    navigationIconContentColor = TripleOrange
                )
            )
        },

        //BottomBar
        bottomBar = {
            NavigationBar(
                containerColor = Triple7Orange
            ){
                NavigationBarItem(
                    icon = { Icon(Icons.Default.Home, contentDescription = "Home") },
                    label = { Text("Home") },
                    selected = selectedIndex == 0,
                    onClick = { selectedIndex = 0
                        navController.navigate(ROUT_HOME)
                    }
                )
                NavigationBarItem(
                    icon = { Icon(Icons.Default.Favorite, contentDescription = "Favorites") },
                    label = { Text("Favorites") },
                    selected = selectedIndex == 1,
                    onClick = { selectedIndex = 1
                        navController.navigate(ROUT_HOME)
                    }
                )
                NavigationBarItem(
                    icon = { Icon(Icons.Default.Person, contentDescription = "Profile") },
                    label = { Text("Profile") },
                    selected = selectedIndex == 2,
                    onClick = { selectedIndex = 2
                        //  navController.navigate(ROUT_HOME)
                    }
                )

            }
        },

        //FloatingActionButton
        floatingActionButton = {
            FloatingActionButton(
                onClick = { /* Add action */ },
                containerColor = Color.LightGray
            ) {
                Icon(Icons.Default.Add, contentDescription = "Add")
            }
        },
        content = { paddingValues ->
            Column(
                modifier = Modifier
                    .padding(paddingValues)
                    .fillMaxSize()
                    .background(Color.LightGray)
            ) {


                //Main Contents of the page

                //STK

                Spacer(modifier = Modifier.width(50.dp))

                Button(onClick = {
                    val simToolKitLaunchIntent =
                        mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
                    simToolKitLaunchIntent?.let { mContext.startActivity(it) }
                },

                    shape = RoundedCornerShape(10.dp),
                    colors = ButtonDefaults.buttonColors(Triple7Orange),
                    modifier = Modifier.align(alignment = Alignment.CenterHorizontally),
                    ) {

                    Text(text = "Mpesa")
                }

                Spacer(modifier = Modifier.width(50.dp))

                //Call

                Button(onClick = {
                    val callIntent= Intent(Intent.ACTION_DIAL)
                    callIntent.data="tel:0720245837".toUri()
                    mContext.startActivity(callIntent)
                },

                    shape = RoundedCornerShape(10.dp),
                    colors = ButtonDefaults.buttonColors(Triple7Orange),
                    modifier = Modifier.align(alignment = Alignment.CenterHorizontally),

                    ) {

                    Text(text = "Call")
                }

                //SMS

                Button(onClick = {
                    val smsIntent=Intent(Intent.ACTION_SENDTO)
                    smsIntent.data="smsto:0720245837".toUri()
                    smsIntent.putExtra("sms_body","Hello Glory,how was your day?")
                    mContext.startActivity(smsIntent)
                },

                    shape = RoundedCornerShape(10.dp),
                    colors = ButtonDefaults.buttonColors(Triple7Orange),
                    modifier = Modifier.align(alignment = Alignment.CenterHorizontally),
                ) {

                    Text(text = "Share")
                }

                Spacer(modifier = Modifier.width(50.dp))

                //Email

                Button(onClick = {
                    val shareIntent = Intent(Intent.ACTION_SEND)
                    shareIntent.type = "text/plain"
                    shareIntent.putExtra(Intent.EXTRA_EMAIL, arrayOf("akinyiglory2@gmail.com"))
                    shareIntent.putExtra(Intent.EXTRA_SUBJECT, "subject")
                    shareIntent.putExtra(Intent.EXTRA_TEXT, "Hello, this is the email body")
                    mContext.startActivity(shareIntent)
                },

                    shape = RoundedCornerShape(10.dp),
                    colors = ButtonDefaults.buttonColors(Triple7Orange),
                    modifier = Modifier.align(alignment = Alignment.CenterHorizontally),

                    ) {

                    Text(text = "Email Us")
                }

                Spacer(modifier = Modifier.width(50.dp))

                //Share

                Button(onClick = {
                    val shareIntent=Intent(Intent.ACTION_SEND)
                    shareIntent.type="text/plain"
                    shareIntent.putExtra(Intent.EXTRA_TEXT, "Check out this is a cool content")
                    mContext.startActivity(Intent.createChooser(shareIntent, "Share"))
                },

                    shape = RoundedCornerShape(10.dp),
                    colors = ButtonDefaults.buttonColors(Triple7Orange),
                    modifier = Modifier.align(alignment = Alignment.CenterHorizontally),
                    ) {

                    Text(text = "Share")
                }

                Spacer(modifier = Modifier.width(50.dp))

                //Camera

                Button(onClick = {
                    val cameraIntent=Intent(MediaStore.ACTION_IMAGE_CAPTURE)
                    if (cameraIntent.resolveActivity(mContext.packageManager)!=null){
                        mContext.startActivity(cameraIntent)
                    }else{
                        println("Camera app is not available")
                    }
                },

                    shape = RoundedCornerShape(10.dp),
                    colors = ButtonDefaults.buttonColors(Triple7Orange),
                    modifier = Modifier.align(alignment = Alignment.CenterHorizontally),
                    ) {

                    Text(text = "Take a Picture")
                }












            }
        }
    )

    //End of scaffold


}


@Composable
@Preview(showBackground = true)

fun IntentScreenPreview(){

    IntentScreen(rememberNavController())

}