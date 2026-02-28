package com.github.yohannestz.iconsax_compose.iconsax.bulk

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Eos: ImageVector
    get() {
        val current = _eos
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Eos",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 16.98f, y = 8.09f)
                lineToRelative(dx = -0.17f, dy = 0.43f)
                lineToRelative(dx = -4.72f, dy = 13.23f)
                horizontalLineToRelative(dx = -0.18f)
                lineTo(x = 7.18f, y = 8.5f)
                lineTo(x = 7.02f, y = 8.1f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.22f, dy1 = -0.4f)
                lineToRelative(dx = 3.61f, dy = -4.32f)
                arcToRelative(a = 1.45f, b = 1.45f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 2.3f, dy1 = 0.0f)
                lineToRelative(dx = 3.61f, dy = 4.33f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.22f, dy1 = 0.38f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
                fillAlpha = 0.4f,
                strokeAlpha = 0.4f,
            ) {
                moveTo(x = 11.91f, y = 21.75f)
                arcToRelative(a = 1.4f, b = 1.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.65f, dy1 = -0.18f)
                lineToRelative(dx = -5.32f, dy = -3.03f)
                arcToRelative(a = 1.6f, b = 1.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.73f, dy1 = -1.6f)
                lineToRelative(dx = 1.72f, dy = -8.57f)
                lineToRelative(dx = 0.09f, dy = -0.27f)
                lineToRelative(dx = 0.16f, dy = 0.4f)
                close()
                moveToRelative(dx = 6.15f, dy = -3.21f)
                lineToRelative(dx = -5.32f, dy = 3.03f)
                arcToRelative(a = 1.4f, b = 1.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.65f, dy1 = 0.18f)
                lineToRelative(dx = 4.72f, dy = -13.23f)
                lineToRelative(dx = 0.17f, dy = -0.43f)
                lineToRelative(dx = 0.09f, dy = 0.28f)
                lineToRelative(dx = 1.72f, dy = 8.57f)
                arcToRelative(a = 1.6f, b = 1.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.73f, dy1 = 1.6f)
            }
        }.build().also { _eos = it }
    }

@Suppress("ObjectPropertyName")
private var _eos: ImageVector? = null
