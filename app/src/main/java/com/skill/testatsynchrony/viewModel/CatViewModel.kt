package com.skill.testatsynchrony.viewModel

import android.util.Log
import androidx.compose.foundation.lazy.LazyListState
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.skill.testatsynchrony.models.CatResponse
import com.skill.testatsynchrony.repositories.CatRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch

class CatViewModel : ViewModel() {
    private val repository = CatRepository()

    private val _catList = MutableStateFlow<List<CatResponse>>(emptyList())
    val catList: StateFlow<List<CatResponse>> = _catList
    private var currentPage = 1

    fun getCats(lazyListState: LazyListState) {
        viewModelScope.launch {
            try {
                val response = repository.getCats(page = currentPage)
                Log.d("Test", "getCats:response: $response ")
//                _catList.value += response
                _catList.update { response }
            } catch (e: Exception) {
                Log.d("Test", "getCats: exception: $e")
            }
        }
    }
}