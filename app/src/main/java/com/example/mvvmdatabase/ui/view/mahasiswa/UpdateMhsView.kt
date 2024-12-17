package com.example.mvvmdatabase.ui.view.mahasiswa

import androidx.compose.material3.SnackbarHostState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.mvvmdatabase.ui.viewmodel.PenyediaViewModel
import com.example.mvvmdatabase.ui.viewmodel.UpdateMhsViewModel

@Composable
fun UpdateMhsView(
    onBack: () -> Unit = { },
    onNavigate: () -> Unit = { },
    modifier: Modifier = Modifier,
    viewModel: UpdateMhsViewModel = viewModel(factory = PenyediaViewModel.Factory)
) {
    val uiState = viewModel.updateUIState // Ambil UI State Dari ViewModel
    val snackBarHostState = remember { SnackbarHostState() } // Ambil Snackbar Host State Dari ViewModel
    val coroutineScope = rememberCoroutineScope() // Ambil Coroutine Scope Dari ViewModel

    // Observasi Perubahan Snackbar Message Dari ViewModel



}