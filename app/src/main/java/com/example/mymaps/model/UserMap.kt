package com.example.mymaps.model

import java.io.Serializable

data class UserMap(val title: String, val places: List<Place?>) : Serializable
