package Scaffold2

import kotlinx.serialization.Serializable


@Serializable
sealed class Route {
    @Serializable
    object homescreen

    @Serializable
    object searchscreen

    @Serializable
    object notificationscreen

    @Serializable
    object profilescreen



}
