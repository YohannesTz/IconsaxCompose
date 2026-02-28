package com.github.yohannestz.iconsax_compose.iconsax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FigmaOne: ImageVector
    get() {
        val current = _figmaOne
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.FigmaOne",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                moveTo(x = 12.0f, y = 12.0f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 2.0f, dy1 = -2.0f)
                horizontalLineToRelative(dx = -2.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                moveTo(x = 12.0f, y = 2.0f)
                arcToRelative(a = 10.0f, b = 10.0f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = 0.0f, dy1 = 20.0f)
                arcToRelative(a = 10.0f, b = 10.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = -20.0f)
                moveToRelative(dx = 4.0f, dy = 10.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 1.1f, dx2 = -0.9f, dy2 = 2.0f, dx3 = -2.0f, dy3 = 2.0f)
                reflectiveCurveToRelative(dx1 = -2.0f, dy1 = -0.9f, dx2 = -2.0f, dy2 = -2.0f)
                verticalLineToRelative(dy = 4.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 1.1f, dx2 = -0.9f, dy2 = 2.0f, dx3 = -2.0f, dy3 = 2.0f)
                reflectiveCurveToRelative(dx1 = -2.0f, dy1 = -0.9f, dx2 = -2.0f, dy2 = -2.0f)
                reflectiveCurveToRelative(dx1 = 0.9f, dy1 = -2.0f, dx2 = 2.0f, dy2 = -2.0f)
                curveToRelative(dx1 = -1.1f, dy1 = 0.0f, dx2 = -2.0f, dy2 = -0.9f, dx3 = -2.0f, dy3 = -2.0f)
                reflectiveCurveToRelative(dx1 = 0.9f, dy1 = -2.0f, dx2 = 2.0f, dy2 = -2.0f)
                curveToRelative(dx1 = -1.1f, dy1 = 0.0f, dx2 = -2.0f, dy2 = -0.9f, dx3 = -2.0f, dy3 = -2.0f)
                reflectiveCurveToRelative(dx1 = 0.9f, dy1 = -2.0f, dx2 = 2.0f, dy2 = -2.0f)
                horizontalLineToRelative(dx = 4.0f)
                curveToRelative(dx1 = 1.1f, dy1 = 0.0f, dx2 = 2.0f, dy2 = 0.9f, dx3 = 2.0f, dy3 = 2.0f)
                reflectiveCurveToRelative(dx1 = -0.9f, dy1 = 2.0f, dx2 = -2.0f, dy2 = 2.0f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 2.0f, dy1 = 2.0f)
            }
        }.build().also { _figmaOne = it }
    }

@Suppress("ObjectPropertyName")
private var _figmaOne: ImageVector? = null
