package com.example.chatbot.Screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Send
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedCard
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.chatbot.viewModels.ChatViewModel

@Composable
 fun ChatScreen(chatViewModel: ChatViewModel){
    Column (
        modifier = Modifier
    ){
      AppHeader()
        MassegeInput(
            onMessageSend = {
             chatViewModel.sendMessage(it)
            }
        )
    }
 }
@Composable
fun AppHeader() {
   Box(
       modifier = Modifier
           .fillMaxWidth().background(MaterialTheme.colorScheme.primary)
   ){
       Text(  modifier = Modifier.padding(16.dp),
           text = "EASY BOT",
           color = Color.Black,
           fontSize = 22.sp

       )
   }
}
@Composable
fun MassegeInput(
    onMessageSend: (String) -> Unit
){
    var text by remember { mutableStateOf("") }
    Row (
        modifier = Modifier.padding(8.dp),
        verticalAlignment = Alignment.CenterVertically
    ){
        OutlinedTextField(
            value = text,
            onValueChange = {
                text = it
            },
            modifier = Modifier.weight(1f),
            placeholder = {
                Text(text = "Type a message")
            }
        )
        IconButton(
            onClick = {
                onMessageSend(text)
                text = ""
            },
        ) {
            Icon(
                imageVector = Icons.Default.Send,
                contentDescription = "Send",
                tint = Color.Black
            )
        }
    }
}
