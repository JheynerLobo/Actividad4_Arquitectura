package com.decimalab.easytask.model.repository

import com.decimalab.easytask.model.remote.NetworkService

class ValidateTokenRepository(private val networkService: NetworkService) {

    suspend fun validateToken(token: String) = networkService.validateToken(token)

}
