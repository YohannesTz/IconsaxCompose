package com.github.yohannestz.iconsax_compose.iconsax.bulk

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val PathToolTwo: ImageVector
    get() {
        val current = _pathToolTwo
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.PathToolTwo",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 14.15f, y = 22.0f)
                horizontalLineTo(x = 9.87f)
                curveToRelative(dx1 = -1.53f, dy1 = 0.0f, dx2 = -2.67f, dy2 = -1.24f, dx3 = -2.38f, dy3 = -2.57f)
                lineToRelative(dx = 0.7f, dy = -3.08f)
                horizontalLineToRelative(dx = 7.64f)
                lineToRelative(dx = 0.7f, dy = 3.08f)
                curveToRelative(dx1 = 0.32f, dy1 = 1.41f, dx2 = -0.75f, dy2 = 2.57f, dx3 = -2.38f, dy3 = 2.57f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
                fillAlpha = 0.4f,
                strokeAlpha = 0.4f,
            ) {
                moveTo(x = 18.77f, y = 13.74f)
                lineToRelative(dx = -2.94f, dy = 2.61f)
                horizontalLineTo(x = 8.19f)
                lineToRelative(dx = -2.94f, dy = -2.61f)
                curveToRelative(dx1 = -1.71f, dy1 = -1.4f, dx2 = -1.71f, dy2 = -2.48f, dx3 = -0.41f, dy3 = -4.13f)
                lineToRelative(dx = 5.19f, dy = -6.57f)
                arcToRelative(a = 3.0f, b = 3.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.23f, dy1 = -0.92f)
                arcToRelative(a = 2.3f, b = 2.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.5f, dy1 = 0.0f)
                arcToRelative(a = 3.0f, b = 3.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.23f, dy1 = 0.92f)
                lineToRelative(dx = 5.19f, dy = 6.57f)
                curveToRelative(dx1 = 1.3f, dy1 = 1.65f, dx2 = 1.24f, dy2 = 2.67f, dx3 = -0.41f, dy3 = 4.13f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 12.76f, y = 2.12f)
                verticalLineToRelative(dy = 4.85f)
                curveToRelative(dx1 = 0.0f, dy1 = 0.41f, dx2 = -0.34f, dy2 = 0.75f, dx3 = -0.75f, dy3 = 0.75f)
                reflectiveCurveToRelative(dx1 = -0.75f, dy1 = -0.34f, dx2 = -0.75f, dy2 = -0.75f)
                verticalLineTo(y = 2.12f)
                arcToRelative(a = 2.3f, b = 2.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.5f, dy1 = 0.0f)
            }
        }.build().also { _pathToolTwo = it }
    }

@Suppress("ObjectPropertyName")
private var _pathToolTwo: ImageVector? = null
