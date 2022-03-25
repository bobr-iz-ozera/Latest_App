package com.bobrovsergey.latestapp

interface Api {

    suspend fun getUsers(): List<User>
    
}