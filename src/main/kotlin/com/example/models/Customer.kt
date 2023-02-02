package com.example.models

import com.fasterxml.jackson.databind.annotation.JsonSerialize


@JsonSerialize
data class Customer(
    val id: String,
    val firstName: String,
    val lastName: String,
    val email: String
)

val customerStorage = mutableListOf<Customer>()
//val customerStorage = mutableListOf(
//    Customer(
//    "1",
//    "Hamza",
//    "Malik",
//    "hamza@vayana.com"),
//    Customer(
//    "2",
//    "Vishesh",
//    "Modi",
//    "vishesh@vayana.com")
//)
