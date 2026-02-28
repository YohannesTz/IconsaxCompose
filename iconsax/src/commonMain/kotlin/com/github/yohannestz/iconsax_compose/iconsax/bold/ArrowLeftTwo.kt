package com.github.yohannestz.iconsax_compose.iconsax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ArrowLeftTwo: ImageVector
    get() {
        val current = _arrowLeftTwo
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.ArrowLeftTwo",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 13.98f, y = 5.32f)
                lineToRelative(dx = -3.21f, dy = 3.2f)
                lineTo(x = 8.8f, y = 10.5f)
                arcToRelative(a = 2.13f, b = 2.13f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 3.0f)
                lineToRelative(dx = 5.18f, dy = 5.19f)
                arcToRelative(a = 1.08f, b = 1.08f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.84f, dy1 = -0.76f)
                verticalLineTo(y = 6.08f)
                arcToRelative(a = 1.08f, b = 1.08f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.84f, dy1 = -0.76f)
            }
        }.build().also { _arrowLeftTwo = it }
    }

@Suppress("ObjectPropertyName")
private var _arrowLeftTwo: ImageVector? = null
