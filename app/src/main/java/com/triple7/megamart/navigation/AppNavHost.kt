package com.triple7.megamart.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.triple7.megamart.ui.screens.about.About
import com.triple7.megamart.ui.screens.about.triple7
import com.triple7.megamart.ui.screens.contacts.Contacts
import com.triple7.megamart.ui.screens.home.Home
import com.triple7.megamart.ui.screens.intent.IntentScreen
import com.triple7.megamart.ui.screens.items.ItemScreen
import com.triple7.megamart.ui.screens.scaffold.ScaffoldScreen
import com.triple7.megamart.ui.screens.splash.SplashScreen

@Composable
fun AppNavHost(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
    startDestination: String = ROUT_SPLASH
) {

    NavHost(
        navController = navController,
        startDestination = startDestination,
        modifier = modifier
    ) {
        composable(ROUT_HOME) {
            Home(navController)
        }

        composable(ROUT_ABOUT) {
            About(navController)
        }

        composable(ROUT_CONTACT) {
            Contacts(navController)
        }

        composable(ROUT_ITEM) {
            ItemScreen(navController)

        }

        composable(ROUT_SCAFFOLD) {
            ScaffoldScreen(navController)
        }

        composable(ROUT_TRIPLE7) {
            triple7(navController)
        }
        composable(ROUT_SPLASH) {
            SplashScreen(navController)
        }
        composable(ROUT_INTENT) {
            IntentScreen(navController)
        }
    }
}