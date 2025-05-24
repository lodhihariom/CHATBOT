package com.example.chatbot.viewModels

import androidx.lifecycle.ViewModel

class ChatViewModel : ViewModel() {
    // ViewModel logic for managing chat messages and state
    private val messages = mutableListOf<String>()

    fun sendMessage(question : String) {
        messages.add(question)
        // Logic to send the message to the chatbot API
    }

    fun getMessages(): List<String> {
        return messages
    }
}