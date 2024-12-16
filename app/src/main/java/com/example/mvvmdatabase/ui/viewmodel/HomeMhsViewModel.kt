package com.example.mvvmdatabase.ui.viewmodel

import androidx.lifecycle.ViewModel
import com.example.mvvmdatabase.data.entity.Mahasiswa
import com.example.mvvmdatabase.repository.RepositoryMhs
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.filterNotNull
import kotlinx.coroutines.flow.map

class HomeMhsViewModel(
    private val repositoryMhs: RepositoryMhs
) : ViewModel(){


}

data class HomeUiState(
    val listMhs: List<Mahasiswa> = listOf(),
    val isLoading: Boolean = false,
    val isError: Boolean = false,
    val errorMessages: String = ""
)