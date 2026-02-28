package com.github.yohannestz.iconsax_compose.iconsax.bulk

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val GridEraser: ImageVector
    get() {
        val current = _gridEraser
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.GridEraser",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
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
                verticalLineToRelative(dy = 6.26f)
                arcToRelative(a = 0.7f, b = 0.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.68f, dy1 = 0.68f)
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
                moveTo(x = 19.8f, y = 20.7f)
                lineToRelative(dx = -1.9f, dy = 1.91f)
                arcToRelative(a = 1.4f, b = 1.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.92f, dy1 = 0.0f)
                lineToRelative(dx = -1.58f, dy = -1.59f)
                arcToRelative(a = 1.4f, b = 1.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = -1.92f)
                lineToRelative(dx = 1.91f, dy = -1.89f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 22.61f, y = 17.9f)
                lineToRelative(dx = -2.81f, dy = 2.8f)
                lineToRelative(dx = -3.49f, dy = -3.49f)
                lineToRelative(dx = 2.8f, dy = -2.82f)
                arcToRelative(a = 1.4f, b = 1.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.92f, dy1 = 0.0f)
                lineToRelative(dx = 1.58f, dy = 1.59f)
                arcToRelative(a = 1.4f, b = 1.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = 1.92f)
            }
        }.build().also { _gridEraser = it }
    }

@Suppress("ObjectPropertyName")
private var _gridEraser: ImageVector? = null
