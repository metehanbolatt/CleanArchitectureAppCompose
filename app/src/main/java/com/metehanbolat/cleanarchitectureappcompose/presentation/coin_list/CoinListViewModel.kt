package com.metehanbolat.cleanarchitectureappcompose.presentation.coin_list

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.metehanbolat.cleanarchitectureappcompose.domain.use_case.get_coins.GetCoinsUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.onEach
import javax.inject.Inject

@HiltViewModel
class CoinListViewModel @Inject constructor(
    private val getCoinsUseCase: GetCoinsUseCase
): ViewModel() {

    private val _state = mutableStateOf("")
    val state: State<String> = _state

    private fun getCoins() {
        getCoinsUseCase().onEach { result ->

        }
    }
}