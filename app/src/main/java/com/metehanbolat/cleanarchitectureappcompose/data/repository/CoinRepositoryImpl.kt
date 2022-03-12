package com.metehanbolat.cleanarchitectureappcompose.data.repository

import com.metehanbolat.cleanarchitectureappcompose.data.remote.CoinPaprikaApi
import com.metehanbolat.cleanarchitectureappcompose.data.remote.dto.CoinDetailDto
import com.metehanbolat.cleanarchitectureappcompose.data.remote.dto.CoinDto
import com.metehanbolat.cleanarchitectureappcompose.domain.repository.CoinRepository
import javax.inject.Inject

class CoinRepositoryImpl @Inject constructor(
    private val api: CoinPaprikaApi
): CoinRepository {

    override suspend fun getCoins(): List<CoinDto> {
        return api.getCoins()
    }

    override suspend fun getCoinById(coinId: String): CoinDetailDto {
        return api.getCoinById(coinId)
    }
}