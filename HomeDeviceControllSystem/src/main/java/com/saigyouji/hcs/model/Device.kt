package com.saigyouji.hcs.model

data class Device(
    val id: String,
    val name: String = "台灯",
    val position: String = "未知",
    val info: String = "https://www.baidu.com"
)
