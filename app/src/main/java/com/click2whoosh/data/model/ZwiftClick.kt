package com.click2whoosh.data.model

import android.bluetooth.BluetoothDevice
import android.bluetooth.BluetoothGatt
import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class ZwiftClick(
    val device: BluetoothDevice,
    val name: String,
    val address: String,
    val rssi: Int,
    var isFavorite: Boolean = false,
    var isConnected: Boolean = false,
    var gatt: BluetoothGatt? = null
) : Parcelable

data class ClickAction(
    val type: ClickType,
    val timestamp: Long = System.currentTimeMillis()
)

enum class ClickType {
    GEAR_UP,
    GEAR_DOWN
}

enum class ConnectionState {
    DISCONNECTED,
    SCANNING,
    CONNECTING,
    CONNECTED,
    ERROR
}
