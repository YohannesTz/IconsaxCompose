package com.github.yohannestz.iconsax_compose.iconsax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val HtmlThree: ImageVector
    get() {
        val current = _htmlThree
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.HtmlThree",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                moveTo(x = 19.88f, y = 2.0f)
                horizontalLineTo(x = 4.12f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.99f, dy1 = 1.11f)
                lineToRelative(dx = 1.8f, dy = 16.22f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.72f, dy1 = 0.85f)
                lineToRelative(dx = 6.08f, dy = 1.74f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.55f, dy1 = 0.0f)
                lineToRelative(dx = 6.08f, dy = -1.74f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.72f, dy1 = -0.85f)
                lineToRelative(dx = 1.8f, dy = -16.22f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.0f, dy1 = -1.11f)
                moveToRelative(dx = -3.63f, dy = 14.08f)
                arcToRelative(a = 0.8f, b = 0.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.54f, dy1 = 0.64f)
                lineToRelative(dx = -3.5f, dy = 1.0f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.42f, dy1 = 0.0f)
                lineToRelative(dx = -3.5f, dy = -1.0f)
                arcToRelative(a = 0.7f, b = 0.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.52f, dy1 = -0.54f)
                lineToRelative(dx = -0.5f, dy = -2.0f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.55f, dy1 = -0.91f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.91f, dy1 = 0.55f)
                lineToRelative(dx = 0.4f, dy = 1.58f)
                lineToRelative(dx = 2.88f, dy = 0.82f)
                lineToRelative(dx = 2.81f, dy = -0.8f)
                lineToRelative(dx = 0.41f, dy = -3.67f)
                horizontalLineTo(x = 8.0f)
                curveToRelative(dx1 = -0.41f, dy1 = 0.0f, dx2 = -0.75f, dy2 = -0.34f, dx3 = -0.75f, dy3 = -0.75f)
                reflectiveCurveTo(x1 = 7.59f, y1 = 10.25f, x2 = 8.0f, y2 = 10.25f)
                horizontalLineToRelative(dx = 7.38f)
                lineToRelative(dx = 0.28f, dy = -2.5f)
                lineTo(x = 7.5f, y = 7.73f)
                curveToRelative(dx1 = -0.41f, dy1 = 0.0f, dx2 = -0.75f, dy2 = -0.34f, dx3 = -0.75f, dy3 = -0.75f)
                reflectiveCurveTo(x1 = 7.09f, y1 = 6.23f, x2 = 7.5f, y2 = 6.23f)
                lineToRelative(dx = 9.0f, dy = 0.02f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.75f, dy1 = 0.83f)
                close()
            }
        }.build().also { _htmlThree = it }
    }

@Suppress("ObjectPropertyName")
private var _htmlThree: ImageVector? = null
