package com.example.chatbot

sealed class Screen(
    val route: String,
    val title: String,
) {
    object signUp : Screen (
        route = "signUp",
        title = "Sign Up"
            )
    object signIn : Screen (
        route = "signIn",
        title = "Sign In"
    )
    object ChatScreen : Screen(
        route = "chat",
        title = "Chat"
    )
    object profile : Screen(
        route = "profile",
        title = "Profile"
    )
}
