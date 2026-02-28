package com.github.yohannestz.iconsax_compose.iconsax.bulk

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ArrowDownTwo: ImageVector
    get() {
        val current = _arrowDownTwo
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.ArrowDownTwo",
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
                moveTo(x = 15.48f, y = 13.23f)
                lineToRelative(dx = -3.79f, dy = -5.05f)
                horizontalLineTo(x = 6.08f)
                arcToRelative(a = 1.08f, b = 1.08f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.76f, dy1 = 1.84f)
                lineToRelative(dx = 5.18f, dy = 5.18f)
                arcToRelative(a = 2.13f, b = 2.13f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 3.01f, dy1 = 0.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 17.92f, y = 8.18f)
                horizontalLineToRelative(dx = -6.23f)
                lineToRelative(dx = 3.79f, dy = 5.05f)
                lineToRelative(dx = 3.21f, dy = -3.21f)
                arcToRelative(a = 1.08f, b = 1.08f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.77f, dy1 = -1.84f)
            }
        }.build().also { _arrowDownTwo = it }
    }

@Suppress("ObjectPropertyName")
private var _arrowDownTwo: ImageVector? = null
