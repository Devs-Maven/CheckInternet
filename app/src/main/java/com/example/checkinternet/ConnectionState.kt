package com.example.checkinternet

sealed class ConnectionState{
    object Available : ConnectionState()
    object Unavailable : ConnectionState()
}
