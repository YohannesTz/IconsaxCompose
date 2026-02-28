package com.github.yohannestz.iconsax_compose.iconsax.bulk

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Ankr: ImageVector
    get() {
        val current = _ankr
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Ankr",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 20.89f, y = 10.53f)
                arcToRelative(a = 0.76f, b = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.75f, dy1 = -0.75f)
                verticalLineTo(y = 6.9f)
                lineTo(x = 12.0f, y = 2.84f)
                lineTo(x = 3.86f, y = 6.9f)
                verticalLineToRelative(dy = 2.87f)
                curveToRelative(dx1 = 0.0f, dy1 = 0.4f, dx2 = -0.34f, dy2 = 0.75f, dx3 = -0.75f, dy3 = 0.75f)
                reflectiveCurveToRelative(dx1 = -0.75f, dy1 = -0.34f, dx2 = -0.75f, dy2 = -0.75f)
                verticalLineTo(y = 6.44f)
                arcToRelative(a = 0.8f, b = 0.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.42f, dy1 = -0.67f)
                lineToRelative(dx = 8.89f, dy = -4.44f)
                arcToRelative(a = 0.7f, b = 0.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.67f, dy1 = 0.0f)
                lineToRelative(dx = 8.89f, dy = 4.44f)
                arcToRelative(a = 0.8f, b = 0.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.42f, dy1 = 0.67f)
                verticalLineToRelative(dy = 3.33f)
                arcToRelative(a = 0.77f, b = 0.77f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.76f, dy1 = 0.76f)
                moveTo(x = 12.0f, y = 22.75f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.33f, dy1 = -0.08f)
                lineToRelative(dx = -8.89f, dy = -4.44f)
                arcToRelative(a = 0.8f, b = 0.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.42f, dy1 = -0.67f)
                verticalLineToRelative(dy = -3.33f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.41f, dx2 = 0.34f, dy2 = -0.75f, dx3 = 0.75f, dy3 = -0.75f)
                reflectiveCurveToRelative(dx1 = 0.75f, dy1 = 0.34f, dx2 = 0.75f, dy2 = 0.75f)
                verticalLineToRelative(dy = 2.87f)
                lineTo(x = 12.0f, y = 21.17f)
                lineToRelative(dx = 8.14f, dy = -4.07f)
                verticalLineToRelative(dy = -2.87f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.41f, dx2 = 0.34f, dy2 = -0.75f, dx3 = 0.75f, dy3 = -0.75f)
                reflectiveCurveToRelative(dx1 = 0.75f, dy1 = 0.34f, dx2 = 0.75f, dy2 = 0.75f)
                verticalLineToRelative(dy = 3.33f)
                arcToRelative(a = 0.8f, b = 0.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.42f, dy1 = 0.67f)
                lineToRelative(dx = -8.89f, dy = 4.44f)
                arcTo(horizontalEllipseRadius = 1.0f, verticalEllipseRadius = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 12.0f, y1 = 22.75f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
                fillAlpha = 0.4f,
                strokeAlpha = 0.4f,
            ) {
                moveTo(x = 16.44f, y = 12.0f)
                arcToRelative(a = 4.44f, b = 4.44f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = -5.17f, dy1 = 4.37f)
                lineToRelative(dx = -0.01f, dy = 0.07f)
                verticalLineTo(y = 22.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 0.4f, dx2 = 0.34f, dy2 = 0.75f, dx3 = 0.75f, dy3 = 0.75f)
                reflectiveCurveToRelative(dx1 = 0.75f, dy1 = -0.34f, dx2 = 0.75f, dy2 = -0.75f)
                verticalLineToRelative(dy = -5.56f)
                lineToRelative(dx = -0.01f, dy = -0.07f)
                arcTo(horizontalEllipseRadius = 4.4f, verticalEllipseRadius = 4.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 16.44f, y1 = 12.0f)
            }
        }.build().also { _ankr = it }
    }

@Suppress("ObjectPropertyName")
private var _ankr: ImageVector? = null
