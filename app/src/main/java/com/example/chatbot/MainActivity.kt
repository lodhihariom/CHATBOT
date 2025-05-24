package com.example.chatbot

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.chatbot.Screens.ChatScreen
import com.example.chatbot.ui.theme.CHATBOTTheme
import com.example.chatbot.viewModels.ChatViewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CHATBOTTheme {
               navigation()
            }
        }
    }
}
@Composable
fun navigation(
) {
    var chatViewModel : ChatViewModel = viewModel()
    NavHost(
        navController = rememberNavController(),
        startDestination = Screen.ChatScreen.route,
    ) {
        composable(Screen.ChatScreen.route) {
            ChatScreen(chatViewModel)
        }
    }
}
