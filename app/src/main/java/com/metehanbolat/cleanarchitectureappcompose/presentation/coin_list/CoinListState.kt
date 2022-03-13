package com.metehanbolat.cleanarchitectureappcompose.presentation.coin_list

import com.metehanbolat.cleanarchitectureappcompose.domain.model.Coin

data class CoinListState(
    val isLoading: Boolean = false,
    val coins: List<Coin> = emptyList(),
    val error: String = ""
)
