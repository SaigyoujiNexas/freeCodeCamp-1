package com.saigyouji.hcs.model

data class User(
    val name: String,
    val passwd: String,
    val devices: List<Device>
)