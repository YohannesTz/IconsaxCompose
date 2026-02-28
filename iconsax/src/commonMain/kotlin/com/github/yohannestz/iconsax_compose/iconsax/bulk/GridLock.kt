package com.github.yohannestz.iconsax_compose.iconsax.bulk

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val GridLock: ImageVector
    get() {
        val current = _gridLock
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.GridLock",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 21.53f, y = 17.31f)
                verticalLineToRelative(dy = -0.16f)
                quadToRelative(dx1 = -0.01f, dy1 = -2.9f, dx2 = -2.9f, dy2 = -2.9f)
                curveToRelative(dx1 = -2.89f, dy1 = 0.0f, dx2 = -2.9f, dy2 = 0.98f, dx3 = -2.9f, dy3 = 2.9f)
                verticalLineToRelative(dy = 0.16f)
                curveToRelative(dx1 = -1.05f, dy1 = 0.26f, dx2 = -1.47f, dy2 = 0.98f, dx3 = -1.47f, dy3 = 2.42f)
                verticalLineToRelative(dy = 0.74f)
                curveToRelative(dx1 = 0.0f, dy1 = 1.85f, dx2 = 0.69f, dy2 = 2.53f, dx3 = 2.53f, dy3 = 2.53f)
                horizontalLineToRelative(dx = 3.68f)
                curveToRelative(dx1 = 1.85f, dy1 = 0.0f, dx2 = 2.53f, dy2 = -0.69f, dx3 = 2.53f, dy3 = -2.53f)
                verticalLineToRelative(dy = -0.74f)
                curveToRelative(dx1 = 0.0f, dy1 = -1.43f, dx2 = -0.42f, dy2 = -2.16f, dx3 = -1.47f, dy3 = -2.42f)
                moveToRelative(dx = -2.91f, dy = -1.68f)
                curveToRelative(dx1 = 1.29f, dy1 = 0.0f, dx2 = 1.52f, dy2 = 0.49f, dx3 = 1.52f, dy3 = 1.52f)
                verticalLineToRelative(dy = 0.05f)
                horizontalLineTo(x = 17.1f)
                verticalLineToRelative(dy = -0.05f)
                curveToRelative(dx1 = 0.0f, dy1 = -1.03f, dx2 = 0.23f, dy2 = -1.52f, dx3 = 1.52f, dy3 = -1.52f)
                moveTo(x = 8.39f, y = 2.17f)
                verticalLineToRelative(dy = 6.45f)
                horizontalLineTo(x = 1.93f)
                verticalLineTo(y = 7.94f)
                curveToRelative(dx1 = 0.0f, dy1 = -3.6f, dx2 = 2.15f, dy2 = -5.76f, dx3 = 5.76f, dy3 = -5.76f)
                horizontalLineToRelative(dx = 0.7f)
                moveToRelative(dx = 13.38f, dy = 5.76f)
                arcToRelative(a = 0.7f, b = 0.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.68f, dy1 = 0.68f)
                horizontalLineToRelative(dx = -5.75f)
                verticalLineTo(y = 2.16f)
                horizontalLineToRelative(dx = 0.67f)
                arcToRelative(a = 5.8f, b = 5.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 5.76f, dy1 = 5.77f)
                moveTo(x = 8.39f, y = 15.55f)
                verticalLineToRelative(dy = 5.76f)
                arcToRelative(a = 0.7f, b = 0.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.68f, dy1 = 0.68f)
                horizontalLineTo(x = 7.7f)
                arcToRelative(a = 5.76f, b = 5.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -5.76f, dy1 = -5.76f)
                verticalLineToRelative(dy = -0.68f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
                fillAlpha = 0.4f,
                strokeAlpha = 0.4f,
            ) {
                moveTo(x = 8.4f, y = 8.61f)
                horizontalLineTo(x = 1.94f)
                verticalLineToRelative(dy = 6.94f)
                horizontalLineTo(x = 8.4f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 15.33f, y = 8.61f)
                verticalLineToRelative(dy = 5.94f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.0f, dy1 = 1.0f)
                horizontalLineTo(x = 8.39f)
                verticalLineTo(y = 8.61f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
                fillAlpha = 0.4f,
                strokeAlpha = 0.4f,
            ) {
                moveTo(x = 15.33f, y = 2.17f)
                horizontalLineTo(x = 8.39f)
                verticalLineToRelative(dy = 6.45f)
                horizontalLineToRelative(dx = 6.94f)
                close()
            }
        }.build().also { _gridLock = it }
    }

@Suppress("ObjectPropertyName")
private var _gridLock: ImageVector? = null
