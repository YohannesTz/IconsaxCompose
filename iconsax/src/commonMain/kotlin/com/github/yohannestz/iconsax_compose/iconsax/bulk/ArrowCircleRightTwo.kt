package com.github.yohannestz.iconsax_compose.iconsax.bulk

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ArrowCircleRightTwo: ImageVector
    get() {
        val current = _arrowCircleRightTwo
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.ArrowCircleRightTwo",
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
            ) {
                moveTo(x = 16.03f, y = 11.47f)
                lineToRelative(dx = -3.0f, dy = -3.0f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.06f, dy1 = 0.0f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 1.06f)
                lineToRelative(dx = 1.72f, dy = 1.72f)
                horizontalLineTo(x = 8.5f)
                curveToRelative(dx1 = -0.41f, dy1 = 0.0f, dx2 = -0.75f, dy2 = 0.34f, dx3 = -0.75f, dy3 = 0.75f)
                reflectiveCurveToRelative(dx1 = 0.34f, dy1 = 0.75f, dx2 = 0.75f, dy2 = 0.75f)
                horizontalLineToRelative(dx = 5.19f)
                lineToRelative(dx = -1.72f, dy = 1.72f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 1.06f)
                quadToRelative(dx1 = 0.23f, dy1 = 0.22f, dx2 = 0.53f, dy2 = 0.22f)
                curveToRelative(dx1 = 0.3f, dy1 = 0.0f, dx2 = 0.38f, dy2 = -0.07f, dx3 = 0.53f, dy3 = -0.22f)
                lineToRelative(dx = 3.0f, dy = -3.0f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = -1.06f)
            }
        }.build().also { _arrowCircleRightTwo = it }
    }

@Suppress("ObjectPropertyName")
private var _arrowCircleRightTwo: ImageVector? = null
