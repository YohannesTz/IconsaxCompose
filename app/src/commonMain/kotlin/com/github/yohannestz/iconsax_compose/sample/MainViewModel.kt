package com.github.yohannestz.iconsax_compose.sample

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.stateIn

class MainViewModel : ViewModel() {

    val uiState: StateFlow<IconsaxUiState> =
        loadIconsax().stateIn(
            viewModelScope,
            SharingStarted.WhileSubscribed(5_000),
            IconsaxUiState.Loading
        )
}
