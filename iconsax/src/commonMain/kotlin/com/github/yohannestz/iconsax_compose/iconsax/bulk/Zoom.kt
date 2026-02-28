package com.github.yohannestz.iconsax_compose.iconsax.bulk

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Zoom: ImageVector
    get() {
        val current = _zoom
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Zoom",
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
                moveTo(x = 12.0f, y = 22.0f)
                arcToRelative(a = 10.0f, b = 10.0f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = 0.0f, dy1 = -20.0f)
                arcToRelative(a = 10.0f, b = 10.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 20.0f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(x = 6.25f, y = 9.68f)
                verticalLineToRelative(dy = 2.8f)
                arcToRelative(a = 2.77f, b = 2.77f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 2.79f, dy1 = 2.77f)
                lineToRelative(dx = 3.68f, dy = -0.03f)
                arcToRelative(a = 0.9f, b = 0.9f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.92f, dy1 = -0.92f)
                verticalLineToRelative(dy = -2.77f)
                arcToRelative(a = 2.77f, b = 2.77f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -2.77f, dy1 = -2.77f)
                horizontalLineTo(x = 7.18f)
                arcToRelative(a = 0.9f, b = 0.9f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.93f, dy1 = 0.92f)
                moveToRelative(dx = 11.5f, dy = 0.34f)
                verticalLineTo(y = 14.0f)
                arcToRelative(a = 0.54f, b = 0.54f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.84f, dy1 = 0.45f)
                lineToRelative(dx = -1.92f, dy = -1.28f)
                arcToRelative(a = 0.5f, b = 0.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.24f, dy1 = -0.45f)
                verticalLineTo(y = 11.3f)
                arcToRelative(a = 0.5f, b = 0.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.24f, dy1 = -0.45f)
                lineToRelative(dx = 1.92f, dy = -1.28f)
                arcToRelative(a = 0.54f, b = 0.54f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.84f, dy1 = 0.45f)
            }
        }.build().also { _zoom = it }
    }

@Suppress("ObjectPropertyName")
private var _zoom: ImageVector? = null
