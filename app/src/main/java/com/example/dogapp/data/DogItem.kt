package com.example.dogapp.data

data class DogItem(
    val breeds: List<Breed>,
    val height: Int,
    val id: String,
    val url: String,
    val width: Int
)