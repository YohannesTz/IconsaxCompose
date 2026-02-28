package com.github.yohannestz.iconsax_compose.iconsax.bulk

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Xd: ImageVector
    get() {
        val current = _xd
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Xd",
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
                moveTo(x = 16.19f, y = 2.0f)
                horizontalLineTo(x = 7.82f)
                curveTo(x1 = 4.18f, y1 = 2.0f, x2 = 2.01f, y2 = 4.17f, x3 = 2.01f, y3 = 7.81f)
                verticalLineToRelative(dy = 8.37f)
                curveToRelative(dx1 = 0.0f, dy1 = 3.64f, dx2 = 2.17f, dy2 = 5.81f, dx3 = 5.81f, dy3 = 5.81f)
                horizontalLineToRelative(dx = 8.37f)
                curveToRelative(dx1 = 3.64f, dy1 = 0.0f, dx2 = 5.81f, dy2 = -2.17f, dx3 = 5.81f, dy3 = -5.81f)
                verticalLineTo(y = 7.81f)
                curveTo(x1 = 22.0f, y1 = 4.17f, x2 = 19.83f, y2 = 2.0f, x3 = 16.19f, y3 = 2.0f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 17.96f, y = 7.72f)
                arcToRelative(a = 0.76f, b = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.75f, dy1 = 0.75f)
                verticalLineToRelative(dy = 2.78f)
                horizontalLineToRelative(dx = -1.02f)
                arcToRelative(a = 2.52f, b = 2.52f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 5.04f)
                horizontalLineToRelative(dx = 1.77f)
                arcToRelative(a = 0.76f, b = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.75f, dy1 = -0.75f)
                verticalLineTo(y = 8.48f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.75f, dy1 = -0.76f)
                moveToRelative(dx = -0.75f, dy = 7.06f)
                horizontalLineToRelative(dx = -1.02f)
                curveToRelative(dx1 = -0.56f, dy1 = 0.0f, dx2 = -1.02f, dy2 = -0.46f, dx3 = -1.02f, dy3 = -1.02f)
                reflectiveCurveToRelative(dx1 = 0.46f, dy1 = -1.02f, dx2 = 1.02f, dy2 = -1.02f)
                horizontalLineToRelative(dx = 1.02f)
                close()
                moveToRelative(dx = -5.05f, dy = -6.9f)
                arcTo(horizontalEllipseRadius = 0.74f, verticalEllipseRadius = 0.74f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 11.11f, y1 = 8.0f)
                lineToRelative(dx = -2.24f, dy = 2.8f)
                lineTo(x = 6.63f, y = 8.0f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.17f, dy1 = 0.93f)
                lineToRelative(dx = 2.45f, dy = 3.06f)
                lineToRelative(dx = -2.45f, dy = 3.06f)
                arcToRelative(a = 0.74f, b = 0.74f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.12f, dy1 = 1.05f)
                arcToRelative(a = 0.7f, b = 0.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.47f, dy1 = 0.16f)
                quadToRelative(dx1 = 0.35f, dy1 = 0.0f, dx2 = 0.59f, dy2 = -0.28f)
                lineToRelative(dx = 2.24f, dy = -2.8f)
                lineToRelative(dx = 2.24f, dy = 2.8f)
                arcToRelative(a = 0.76f, b = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.06f, dy1 = 0.12f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.12f, dy1 = -1.05f)
                lineToRelative(dx = -2.45f, dy = -3.06f)
                lineToRelative(dx = 2.45f, dy = -3.06f)
                arcToRelative(a = 0.76f, b = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.14f, dy1 = -1.05f)
            }
        }.build().also { _xd = it }
    }

@Suppress("ObjectPropertyName")
private var _xd: ImageVector? = null
