package com.metehanbolat.cleanarchitectureappcompose.domain.repository

import com.metehanbolat.cleanarchitectureappcompose.data.remote.dto.CoinDetailDto
import com.metehanbolat.cleanarchitectureappcompose.data.remote.dto.CoinDto

interface CoinRepository {

    suspend fun getCoins(): List<CoinDto>

    suspend fun getCoinById(coinId: String): CoinDetailDto
}