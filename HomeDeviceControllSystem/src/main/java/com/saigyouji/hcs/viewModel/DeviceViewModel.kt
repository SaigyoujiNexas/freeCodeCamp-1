package com.saigyouji.hcs.viewModel

import com.saigyouji.hcs.model.Device
import com.squareup.moshi.Moshi
import com.squareup.moshi.Types
import com.squareup.moshi.adapter
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory

@ExperimentalStdlibApi
class DeviceViewModel {
    private val _devices =  mutableListOf<Device>()
    private val moshi = Moshi.Builder().add(
        KotlinJsonAdapterFactory()
    ).build()
    init{
        for(i in 0 until 10){
            _devices += Device(id = i.toString())
        }
    }
    val devices: String
    get(){
        val adapter = moshi.adapter<List<Device>>()
        return adapter.toJson(_devices)
    }


}
