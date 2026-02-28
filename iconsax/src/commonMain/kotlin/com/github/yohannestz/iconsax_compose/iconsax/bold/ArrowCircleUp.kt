package com.github.yohannestz.iconsax_compose.iconsax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ArrowCircleUp: ImageVector
    get() {
        val current = _arrowCircleUp
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.ArrowCircleUp",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 12.0f, y = 2.0f)
                curveTo(x1 = 6.49f, y1 = 2.0f, x2 = 2.0f, y2 = 6.49f, x3 = 2.0f, y3 = 12.0f)
                reflectiveCurveToRelative(dx1 = 4.49f, dy1 = 10.0f, dx2 = 10.0f, dy2 = 10.0f)
                reflectiveCurveToRelative(dx1 = 10.0f, dy1 = -4.49f, dx2 = 10.0f, dy2 = -10.0f)
                reflectiveCurveTo(x1 = 17.51f, y1 = 2.0f, x2 = 12.0f, y2 = 2.0f)
                moveToRelative(dx = 4.06f, dy = 11.79f)
                quadToRelative(dx1 = -0.23f, dy1 = 0.22f, dx2 = -0.53f, dy2 = 0.22f)
                curveToRelative(dx1 = -0.3f, dy1 = 0.0f, dx2 = -0.38f, dy2 = -0.07f, dx3 = -0.53f, dy3 = -0.22f)
                lineToRelative(dx = -3.0f, dy = -3.0f)
                lineToRelative(dx = -3.0f, dy = 3.0f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.06f, dy1 = 0.0f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = -1.06f)
                lineToRelative(dx = 3.53f, dy = -3.53f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.06f, dy1 = 0.0f)
                lineToRelative(dx = 3.53f, dy = 3.53f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = 1.06f)
            }
        }.build().also { _arrowCircleUp = it }
    }

@Suppress("ObjectPropertyName")
private var _arrowCircleUp: ImageVector? = null
