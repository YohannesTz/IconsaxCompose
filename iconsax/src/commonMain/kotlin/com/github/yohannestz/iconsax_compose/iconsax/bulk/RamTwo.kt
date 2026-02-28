package com.github.yohannestz.iconsax_compose.iconsax.bulk

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val RamTwo: ImageVector
    get() {
        val current = _ramTwo
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.RamTwo",
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
                moveTo(x = 18.5f, y = 10.0f)
                verticalLineToRelative(dy = 2.17f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.59f, dy1 = 1.42f)
                lineToRelative(dx = 0.82f, dy = 0.82f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.59f, dy1 = 1.42f)
                verticalLineTo(y = 17.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 3.0f, dx2 = -1.53f, dy2 = 5.0f, dx3 = -5.0f, dy3 = 5.0f)
                horizontalLineToRelative(dx = -7.0f)
                curveToRelative(dx1 = -3.53f, dy1 = 0.0f, dx2 = -5.0f, dy2 = -2.0f, dx3 = -5.0f, dy3 = -5.0f)
                verticalLineTo(y = 7.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -2.92f, dx2 = 1.4f, dy2 = -4.9f, dx3 = 4.74f, dy3 = -4.99f)
                lineTo(x = 8.5f, y = 2.0f)
                horizontalLineToRelative(dx = 7.0f)
                lineToRelative(dx = 0.24f, dy = 0.01f)
                curveTo(x1 = 19.04f, y1 = 2.09f, x2 = 20.5f, y2 = 4.07f, x3 = 20.5f, y3 = 7.0f)
                verticalLineToRelative(dy = 1.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 0.55f, dx2 = -0.45f, dy2 = 1.0f, dx3 = -1.0f, dy3 = 1.0f)
                reflectiveCurveToRelative(dx1 = -1.0f, dy1 = 0.45f, dx2 = -1.0f, dy2 = 1.0f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 9.74f, y = 2.0f)
                lineTo(x = 9.69f, y = 4.96f)
                arcTo(horizontalEllipseRadius = 0.75f, verticalEllipseRadius = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 8.94f, y1 = 5.7f)
                horizontalLineTo(x = 8.93f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.74f, dy1 = -0.77f)
                lineToRelative(dx = 0.05f, dy = -2.92f)
                lineTo(x = 8.5f, y = 2.0f)
                close()
                moveToRelative(dx = 3.0f, dy = 0.0f)
                lineToRelative(dx = -0.05f, dy = 2.95f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.75f, dy1 = 0.73f)
                horizontalLineToRelative(dx = -0.01f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.74f, dy1 = -0.76f)
                lineTo(x = 11.24f, y = 2.0f)
                close()
                moveToRelative(dx = 3.0f, dy = 0.01f)
                lineToRelative(dx = -0.05f, dy = 2.88f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.75f, dy1 = 0.74f)
                horizontalLineToRelative(dx = -0.01f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.74f, dy1 = -0.76f)
                lineTo(x = 14.24f, y = 2.0f)
                horizontalLineToRelative(dx = 1.26f)
                close()
                moveToRelative(dx = 0.28f, dy = 19.97f)
                lineTo(x = 15.51f, y = 22.0f)
                horizontalLineToRelative(dx = -7.0f)
                quadTo(x1 = 8.24f, y1 = 22.0f, x2 = 8.0f, y2 = 21.98f)
                lineTo(x = 7.98f, y = 19.0f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 2.0f, dy1 = -2.0f)
                horizontalLineToRelative(dx = 4.01f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 2.0f, dy1 = 1.99f)
                close()
            }
        }.build().also { _ramTwo = it }
    }

@Suppress("ObjectPropertyName")
private var _ramTwo: ImageVector? = null
