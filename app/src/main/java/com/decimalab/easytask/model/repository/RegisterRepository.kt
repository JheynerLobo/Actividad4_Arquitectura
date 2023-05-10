package com.decimalab.easytask.model.repository

import com.decimalab.easytask.model.remote.NetworkService
import com.decimalab.easytask.model.remote.request.auth.RegisterRequest

class RegisterRepository(private val networkService: NetworkService) {

    suspend fun register(registerRequest: RegisterRequest) =
        networkService.register(registerRequest)


}
