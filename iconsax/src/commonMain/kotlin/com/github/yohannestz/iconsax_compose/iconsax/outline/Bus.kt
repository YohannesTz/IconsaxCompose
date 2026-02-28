package com.github.yohannestz.iconsax_compose.iconsax.outline

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
            ) {
                moveTo(x = 16.9f, y = 22.75f)
                horizontalLineTo(x = 7.1f)
                arcToRelative(a = 3.86f, b = 3.86f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -3.85f, dy1 = -3.85f)
                verticalLineTo(y = 5.1f)
                arcTo(horizontalEllipseRadius = 3.86f, verticalEllipseRadius = 3.86f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 7.1f, y1 = 1.25f)
                horizontalLineToRelative(dx = 9.8f)
                arcToRelative(a = 3.86f, b = 3.86f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 3.85f, dy1 = 3.85f)
                verticalLineToRelative(dy = 13.8f)
                arcToRelative(a = 3.86f, b = 3.86f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -3.85f, dy1 = 3.85f)
                moveToRelative(dx = -9.8f, dy = -20.0f)
                arcTo(horizontalEllipseRadius = 2.35f, verticalEllipseRadius = 2.35f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 4.75f, y1 = 5.1f)
                verticalLineToRelative(dy = 13.8f)
                arcToRelative(a = 2.35f, b = 2.35f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 2.35f, dy1 = 2.35f)
                horizontalLineToRelative(dx = 9.8f)
                arcToRelative(a = 2.35f, b = 2.35f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 2.35f, dy1 = -2.35f)
                verticalLineTo(y = 5.1f)
                arcToRelative(a = 2.35f, b = 2.35f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -2.35f, dy1 = -2.35f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 18.5f, y = 13.75f)
                horizontalLineToRelative(dx = -13.0f)
                arcToRelative(a = 2.25f, b = 2.25f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -2.25f, dy1 = -2.25f)
                verticalLineToRelative(dy = -2.0f)
                arcTo(horizontalEllipseRadius = 2.25f, verticalEllipseRadius = 2.25f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 5.5f, y1 = 7.25f)
                horizontalLineToRelative(dx = 13.0f)
                arcToRelative(a = 2.25f, b = 2.25f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 2.25f, dy1 = 2.25f)
                verticalLineToRelative(dy = 2.0f)
                arcToRelative(a = 2.25f, b = 2.25f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -2.25f, dy1 = 2.25f)
                moveToRelative(dx = -13.0f, dy = -5.0f)
                arcTo(horizontalEllipseRadius = 0.76f, verticalEllipseRadius = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 4.75f, y1 = 9.5f)
                verticalLineToRelative(dy = 2.0f)
                arcToRelative(a = 0.76f, b = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.75f, dy1 = 0.75f)
                horizontalLineToRelative(dx = 13.0f)
                arcToRelative(a = 0.76f, b = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.75f, dy1 = -0.75f)
                verticalLineToRelative(dy = -2.0f)
                arcToRelative(a = 0.76f, b = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.75f, dy1 = -0.75f)
                close()
                moveToRelative(dx = 2.5f, dy = 10.0f)
                arcToRelative(a = 1.2f, b = 1.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.88f, dy1 = -0.37f)
                lineToRelative(dx = -0.16f, dy = -0.2f)
                lineToRelative(dx = -0.11f, dy = -0.2f)
                quadToRelative(dx1 = -0.05f, dy1 = -0.12f, dx2 = -0.08f, dy2 = -0.24f)
                lineTo(x = 6.75f, y = 17.5f)
                lineToRelative(dx = 0.02f, dy = -0.24f)
                lineToRelative(dx = 0.08f, dy = -0.24f)
                lineToRelative(dx = 0.11f, dy = -0.21f)
                lineToRelative(dx = 0.16f, dy = -0.2f)
                arcToRelative(a = 1.27f, b = 1.27f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.92f, dy1 = 0.2f)
                lineTo(x = 9.15f, y = 17.0f)
                quadToRelative(dx1 = 0.06f, dy1 = 0.13f, dx2 = 0.08f, dy2 = 0.25f)
                lineToRelative(dx = 0.02f, dy = 0.24f)
                lineToRelative(dx = -0.02f, dy = 0.24f)
                lineToRelative(dx = -0.08f, dy = 0.24f)
                lineToRelative(dx = -0.11f, dy = 0.2f)
                quadToRelative(dx1 = -0.07f, dy1 = 0.12f, dx2 = -0.16f, dy2 = 0.2f)
                arcTo(horizontalEllipseRadius = 1.2f, verticalEllipseRadius = 1.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 8.0f, y1 = 18.75f)
                moveToRelative(dx = 8.0f, dy = 0.0f)
                arcToRelative(a = 1.2f, b = 1.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.88f, dy1 = -0.37f)
                arcToRelative(a = 1.2f, b = 1.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.37f, dy1 = -0.88f)
                arcToRelative(a = 1.2f, b = 1.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.37f, dy1 = -0.88f)
                arcToRelative(a = 1.27f, b = 1.27f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.76f, dy1 = 0.0f)
                arcToRelative(a = 1.2f, b = 1.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.37f, dy1 = 0.88f)
                arcToRelative(a = 1.2f, b = 1.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.37f, dy1 = 0.88f)
                arcTo(horizontalEllipseRadius = 1.2f, verticalEllipseRadius = 1.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 16.0f, y1 = 18.75f)
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
