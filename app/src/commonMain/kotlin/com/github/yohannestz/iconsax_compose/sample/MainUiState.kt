package com.github.yohannestz.iconsax_compose.sample

import com.github.yohannestz.iconsax_compose.sample.util.IconCollector
import com.github.yohannestz.iconsax_compose.sample.util.IconsaxEntry
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn

sealed interface IconsaxUiState {
    object Loading : IconsaxUiState
    data class Loaded(
        val iconsByMode: Map<String, List<IconsaxEntry>>
    ) : IconsaxUiState
}

fun loadIconsax(): Flow<IconsaxUiState> = flow {
    emit(IconsaxUiState.Loading)

    emit(
        IconsaxUiState.Loaded(
            mapOf(
                "Bold" to IconCollector.collectBoldIcons(),
                "Linear" to IconCollector.collectLinearIcons(),
                "Outline" to IconCollector.collectOutlineIcons(),
                "Bulk" to IconCollector.collectBulkIcons(),
                "Broken" to IconCollector.collectBrokenIcons(),
                "TwoTone" to IconCollector.collectTwoToneIcons()
            )
        )
    )
}.flowOn(Dispatchers.Default)