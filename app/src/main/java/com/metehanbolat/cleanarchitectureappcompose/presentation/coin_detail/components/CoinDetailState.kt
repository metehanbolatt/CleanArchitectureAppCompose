package com.metehanbolat.cleanarchitectureappcompose.presentation.coin_detail.components

import com.metehanbolat.cleanarchitectureappcompose.domain.model.CoinDetail

data class CoinDetailState(
    val isLoading: Boolean = false,
    val coin: CoinDetail? = null,
    val error: String = ""
)
