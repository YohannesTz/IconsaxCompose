package com.github.yohannestz.iconsax_compose.iconsax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val BookOne: ImageVector
    get() {
        val current = _bookOne
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.BookOne",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 22.0f, y = 4.85f)
                verticalLineToRelative(dy = 11.89f)
                arcToRelative(a = 2.06f, b = 2.06f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.76f, dy1 = 1.98f)
                lineToRelative(dx = -0.31f, dy = 0.04f)
                arcToRelative(a = 26.0f, b = 26.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -5.81f, dy1 = 1.68f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.37f, dy1 = -0.93f)
                verticalLineTo(y = 5.6f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.54f, dy1 = -0.89f)
                arcToRelative(a = 19.0f, b = 19.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 6.48f, dy1 = -2.03f)
                horizontalLineToRelative(dx = 0.06f)
                curveToRelative(dx1 = 1.2f, dy1 = 0.0f, dx2 = 2.17f, dy2 = 0.97f, dx3 = 2.17f, dy3 = 2.17f)
                moveTo(x = 10.7f, y = 4.71f)
                arcToRelative(a = 19.0f, b = 19.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -6.47f, dy1 = -2.03f)
                horizontalLineTo(x = 4.16f)
                arcToRelative(a = 2.17f, b = 2.17f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -2.17f, dy1 = 2.17f)
                verticalLineToRelative(dy = 11.89f)
                arcToRelative(a = 2.06f, b = 2.06f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.76f, dy1 = 1.98f)
                lineToRelative(dx = 0.3f, dy = 0.04f)
                arcToRelative(a = 26.0f, b = 26.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 5.82f, dy1 = 1.68f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.37f, dy1 = -0.93f)
                verticalLineTo(y = 5.6f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.53f, dy1 = -0.89f)
                moveTo(x = 5.0f, y = 7.74f)
                horizontalLineToRelative(dx = 2.25f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = true, dx1 = 0.0f, dy1 = 1.5f)
                horizontalLineTo(x = 5.0f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = true, dx1 = 0.0f, dy1 = -1.5f)
                moveToRelative(dx = 3.0f, dy = 4.5f)
                horizontalLineTo(x = 5.0f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = true, dx1 = 0.0f, dy1 = -1.5f)
                horizontalLineToRelative(dx = 3.0f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = true, dx1 = 0.0f, dy1 = 1.5f)
            }
        }.build().also { _bookOne = it }
    }

@Suppress("ObjectPropertyName")
private var _bookOne: ImageVector? = null
