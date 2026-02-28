package com.github.yohannestz.iconsax_compose.iconsax.bulk

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Dash: ImageVector
    get() {
        val current = _dash
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Dash",
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
                moveTo(x = 7.12f, y = 3.5f)
                horizontalLineTo(x = 16.0f)
                curveToRelative(dx1 = 4.0f, dy1 = 0.0f, dx2 = 6.0f, dy2 = 2.5f, dx3 = 6.0f, dy3 = 6.0f)
                verticalLineTo(y = 12.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 5.0f, dx2 = -3.0f, dy2 = 8.5f, dx3 = -8.5f, dy3 = 8.5f)
                horizontalLineTo(x = 3.94f)
                lineTo(x = 5.0f, y = 16.25f)
                horizontalLineToRelative(dx = 7.44f)
                curveToRelative(dx1 = 3.56f, dy1 = 0.0f, dx2 = 5.31f, dy2 = -2.25f, dx3 = 5.31f, dy3 = -5.31f)
                verticalLineToRelative(dy = -0.19f)
                curveToRelative(dx1 = 0.0f, dy1 = -1.75f, dx2 = -0.75f, dy2 = -3.0f, dx3 = -3.0f, dy3 = -3.0f)
                horizontalLineTo(x = 6.06f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 12.41f, y = 10.23f)
                horizontalLineTo(x = 4.7f)
                arcToRelative(a = 2.4f, b = 2.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -2.29f, dy1 = 1.78f)
                lineToRelative(dx = -0.25f, dy = 1.02f)
                arcToRelative(a = 0.6f, b = 0.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.57f, dy1 = 0.73f)
                horizontalLineToRelative(dx = 7.71f)
                arcToRelative(a = 2.4f, b = 2.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 2.29f, dy1 = -1.78f)
                lineToRelative(dx = 0.25f, dy = -1.02f)
                arcToRelative(a = 0.6f, b = 0.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.57f, dy1 = -0.73f)
            }
        }.build().also { _dash = it }
    }

@Suppress("ObjectPropertyName")
private var _dash: ImageVector? = null
