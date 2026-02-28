package com.github.yohannestz.iconsax_compose.sample

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.github.yohannestz.iconsax_compose.sample.ui.theme.IconsaxcomposeTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun App() {
    IconsaxcomposeTheme {
        Scaffold(
            modifier = Modifier.fillMaxSize(),
            topBar = {
                TopAppBar(
                    title = { Text("IconSaxCompose Sample") },
                )
            },
        ) { innerPadding ->
            IconsaxBrowserScreen(
                modifier = Modifier.padding(innerPadding)
            )
        }
    }
}
