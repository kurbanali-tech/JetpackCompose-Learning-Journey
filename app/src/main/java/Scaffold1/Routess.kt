package com.example.jetpack.Scaffold1

import kotlinx.serialization.Serializable


@Serializable

sealed class Routess {


    @Serializable
     object Home: Routess()

    @Serializable
    object Search: Routess()

    @Serializable
    object Notification:Routess()

    @Serializable
    object Profile:Routess()
}