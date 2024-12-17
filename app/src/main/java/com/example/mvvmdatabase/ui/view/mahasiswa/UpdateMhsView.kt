package com.example.mvvmdatabase.ui.view.mahasiswa

import androidx.compose.runtime.Composable
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


}