package com.github.yohannestz.iconsax_compose.iconsax.bulk

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bus: ImageVector
    get() {
        val current = _bus
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Bus",
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
                moveTo(x = 16.9f, y = 22.0f)
                horizontalLineTo(x = 7.1f)
                arcTo(horizontalEllipseRadius = 3.1f, verticalEllipseRadius = 3.1f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 4.0f, y1 = 18.9f)
                verticalLineTo(y = 5.1f)
                arcTo(horizontalEllipseRadius = 3.1f, verticalEllipseRadius = 3.1f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 7.1f, y1 = 2.0f)
                horizontalLineToRelative(dx = 9.8f)
                arcTo(horizontalEllipseRadius = 3.1f, verticalEllipseRadius = 3.1f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 20.0f, y1 = 5.1f)
                verticalLineToRelative(dy = 13.8f)
                arcToRelative(a = 3.1f, b = 3.1f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -3.1f, dy1 = 3.1f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 20.0f, y = 8.0f)
                horizontalLineTo(x = 4.0f)
                verticalLineToRelative(dy = 5.0f)
                horizontalLineToRelative(dx = 16.0f)
                close()
                moveTo(x = 8.0f, y = 18.75f)
                lineToRelative(dx = -0.24f, dy = -0.02f)
                lineToRelative(dx = -0.24f, dy = -0.08f)
                lineToRelative(dx = -0.21f, dy = -0.11f)
                quadToRelative(dx1 = -0.11f, dy1 = -0.07f, dx2 = -0.19f, dy2 = -0.16f)
                arcToRelative(a = 1.2f, b = 1.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.37f, dy1 = -0.88f)
                arcToRelative(a = 1.2f, b = 1.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.37f, dy1 = -0.88f)
                lineToRelative(dx = 0.19f, dy = -0.16f)
                lineToRelative(dx = 0.21f, dy = -0.11f)
                quadToRelative(dx1 = 0.12f, dy1 = -0.05f, dx2 = 0.24f, dy2 = -0.08f)
                arcToRelative(a = 1.26f, b = 1.26f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.49f, dy1 = 1.23f)
                arcToRelative(a = 1.2f, b = 1.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.37f, dy1 = 0.88f)
                arcTo(horizontalEllipseRadius = 1.2f, verticalEllipseRadius = 1.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 8.0f, y1 = 18.75f)
                moveToRelative(dx = 8.0f, dy = 0.0f)
                lineToRelative(dx = -0.24f, dy = -0.02f)
                lineToRelative(dx = -0.24f, dy = -0.08f)
                lineToRelative(dx = -0.21f, dy = -0.11f)
                quadToRelative(dx1 = -0.11f, dy1 = -0.07f, dx2 = -0.19f, dy2 = -0.16f)
                arcToRelative(a = 1.2f, b = 1.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.37f, dy1 = -0.88f)
                arcToRelative(a = 1.2f, b = 1.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.37f, dy1 = -0.88f)
                lineToRelative(dx = 0.19f, dy = -0.16f)
                lineToRelative(dx = 0.21f, dy = -0.11f)
                quadToRelative(dx1 = 0.12f, dy1 = -0.05f, dx2 = 0.24f, dy2 = -0.08f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.49f, dy1 = 0.0f)
                quadToRelative(dx1 = 0.1f, dy1 = 0.02f, dx2 = 0.23f, dy2 = 0.08f)
                lineToRelative(dx = 0.21f, dy = 0.1f)
                quadToRelative(dx1 = 0.11f, dy1 = 0.08f, dx2 = 0.19f, dy2 = 0.17f)
                arcToRelative(a = 1.2f, b = 1.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.37f, dy1 = 0.88f)
                arcToRelative(a = 1.2f, b = 1.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.37f, dy1 = 0.88f)
                lineToRelative(dx = -0.19f, dy = 0.16f)
                lineToRelative(dx = -0.21f, dy = 0.1f)
                quadToRelative(dx1 = -0.12f, dy1 = 0.07f, dx2 = -0.23f, dy2 = 0.09f)
                close()
                moveToRelative(dx = -1.5f, dy = -13.0f)
                horizontalLineToRelative(dx = -5.0f)
                curveTo(x1 = 9.09f, y1 = 5.75f, x2 = 8.75f, y2 = 5.41f, x3 = 8.75f, y3 = 5.0f)
                reflectiveCurveTo(x1 = 9.09f, y1 = 4.25f, x2 = 9.5f, y2 = 4.25f)
                horizontalLineToRelative(dx = 5.0f)
                curveToRelative(dx1 = 0.41f, dy1 = 0.0f, dx2 = 0.75f, dy2 = 0.34f, dx3 = 0.75f, dy3 = 0.75f)
                reflectiveCurveToRelative(dx1 = -0.34f, dy1 = 0.75f, dx2 = -0.75f, dy2 = 0.75f)
            }
        }.build().also { _bus = it }
    }

@Suppress("ObjectPropertyName")
private var _bus: ImageVector? = null
