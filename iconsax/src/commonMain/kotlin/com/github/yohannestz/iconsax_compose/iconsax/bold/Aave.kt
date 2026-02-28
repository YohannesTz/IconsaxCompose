package com.github.yohannestz.iconsax_compose.iconsax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Aave: ImageVector
    get() {
        val current = _aave
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Aave",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                moveTo(x = 12.0f, y = 2.0f)
                arcToRelative(a = 10.0f, b = 10.0f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = 0.0f, dy1 = 20.0f)
                arcToRelative(a = 10.0f, b = 10.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = -20.0f)
                moveToRelative(dx = 4.3f, dy = 14.69f)
                arcToRelative(a = 0.76f, b = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.99f, dy1 = -0.39f)
                lineTo(x = 12.0f, y = 8.85f)
                lineToRelative(dx = -1.07f, dy = 2.4f)
                horizontalLineTo(x = 12.0f)
                curveToRelative(dx1 = 0.41f, dy1 = 0.0f, dx2 = 0.75f, dy2 = 0.34f, dx3 = 0.75f, dy3 = 0.75f)
                reflectiveCurveToRelative(dx1 = -0.34f, dy1 = 0.75f, dx2 = -0.75f, dy2 = 0.75f)
                horizontalLineToRelative(dx = -1.73f)
                lineTo(x = 8.69f, y = 16.3f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.37f, dy1 = -0.61f)
                lineToRelative(dx = 1.31f, dy = -2.95f)
                horizontalLineTo(x = 8.0f)
                curveToRelative(dx1 = -0.41f, dy1 = 0.0f, dx2 = -0.75f, dy2 = -0.34f, dx3 = -0.75f, dy3 = -0.75f)
                reflectiveCurveTo(x1 = 7.59f, y1 = 11.24f, x2 = 8.0f, y2 = 11.24f)
                horizontalLineToRelative(dx = 1.29f)
                lineToRelative(dx = 2.02f, dy = -4.55f)
                curveToRelative(dx1 = 0.24f, dy1 = -0.54f, dx2 = 1.13f, dy2 = -0.54f, dx3 = 1.37f, dy3 = 0.0f)
                lineToRelative(dx = 4.0f, dy = 9.0f)
                arcToRelative(a = 0.76f, b = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.38f, dy1 = 1.0f)
            }
        }.build().also { _aave = it }
    }

@Suppress("ObjectPropertyName")
private var _aave: ImageVector? = null
