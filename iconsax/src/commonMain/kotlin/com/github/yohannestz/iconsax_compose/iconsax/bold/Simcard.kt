package com.github.yohannestz.iconsax_compose.iconsax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Simcard: ImageVector
    get() {
        val current = _simcard
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Simcard",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 19.54f, y = 6.54f)
                lineToRelative(dx = -3.07f, dy = -3.07f)
                arcTo(horizontalEllipseRadius = 5.0f, verticalEllipseRadius = 5.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 12.93f, y1 = 2.0f)
                horizontalLineTo(x = 8.0f)
                curveTo(x1 = 5.0f, y1 = 2.0f, x2 = 3.0f, y2 = 4.0f, x3 = 3.0f, y3 = 7.0f)
                verticalLineToRelative(dy = 10.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 3.0f, dx2 = 2.0f, dy2 = 5.0f, dx3 = 5.0f, dy3 = 5.0f)
                horizontalLineToRelative(dx = 8.0f)
                curveToRelative(dx1 = 3.0f, dy1 = 0.0f, dx2 = 5.0f, dy2 = -2.0f, dx3 = 5.0f, dy3 = -5.0f)
                verticalLineToRelative(dy = -6.93f)
                arcToRelative(a = 5.0f, b = 5.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.46f, dy1 = -3.53f)
                moveToRelative(dx = -9.51f, dy = 10.93f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = 1.06f)
                quadTo(x1 = 9.8f, y1 = 18.75f, x2 = 9.5f, y2 = 18.75f)
                curveToRelative(dx1 = -0.3f, dy1 = 0.0f, dx2 = -0.38f, dy2 = -0.07f, dx3 = -0.53f, dy3 = -0.22f)
                lineToRelative(dx = -2.0f, dy = -2.0f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = -1.06f)
                lineToRelative(dx = 2.0f, dy = -2.0f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.06f, dy1 = 0.0f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = 1.06f)
                lineTo(x = 8.56f, y = 16.0f)
                close()
                moveToRelative(dx = 7.0f, dy = -0.94f)
                lineToRelative(dx = -2.0f, dy = 2.0f)
                quadToRelative(dx1 = -0.23f, dy1 = 0.22f, dx2 = -0.53f, dy2 = 0.22f)
                curveToRelative(dx1 = -0.3f, dy1 = 0.0f, dx2 = -0.38f, dy2 = -0.07f, dx3 = -0.53f, dy3 = -0.22f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = -1.06f)
                lineTo(x = 15.44f, y = 16.0f)
                lineToRelative(dx = -1.47f, dy = -1.47f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = -1.06f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.06f, dy1 = 0.0f)
                lineToRelative(dx = 2.0f, dy = 2.0f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = 1.06f)
            }
        }.build().also { _simcard = it }
    }

@Suppress("ObjectPropertyName")
private var _simcard: ImageVector? = null
