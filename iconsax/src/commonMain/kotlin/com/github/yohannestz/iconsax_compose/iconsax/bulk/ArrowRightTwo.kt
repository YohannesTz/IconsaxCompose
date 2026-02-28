package com.github.yohannestz.iconsax_compose.iconsax.bulk

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ArrowRightTwo: ImageVector
    get() {
        val current = _arrowRightTwo
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.ArrowRightTwo",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
                fillAlpha = 0.4f,
                strokeAlpha = 0.4f,
            ) {
                moveTo(x = 13.23f, y = 8.52f)
                lineToRelative(dx = -5.05f, dy = 3.79f)
                verticalLineToRelative(dy = 5.61f)
                arcToRelative(a = 1.08f, b = 1.08f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.84f, dy1 = 0.76f)
                lineToRelative(dx = 5.18f, dy = -5.18f)
                arcToRelative(a = 2.13f, b = 2.13f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = -3.01f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 8.18f, y = 6.08f)
                verticalLineToRelative(dy = 6.23f)
                lineToRelative(dx = 5.05f, dy = -3.79f)
                lineToRelative(dx = -3.21f, dy = -3.21f)
                arcToRelative(a = 1.08f, b = 1.08f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.84f, dy1 = 0.77f)
            }
        }.build().also { _arrowRightTwo = it }
    }

@Suppress("ObjectPropertyName")
private var _arrowRightTwo: ImageVector? = null
