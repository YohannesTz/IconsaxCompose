package com.github.yohannestz.iconsax_compose.iconsax.bulk

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val WarningTwo: ImageVector
    get() {
        val current = _warningTwo
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.WarningTwo",
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
                moveTo(x = 21.08f, y = 8.58f)
                verticalLineToRelative(dy = 6.84f)
                curveToRelative(dx1 = 0.0f, dy1 = 1.12f, dx2 = -0.6f, dy2 = 2.16f, dx3 = -1.57f, dy3 = 2.73f)
                lineToRelative(dx = -5.94f, dy = 3.43f)
                arcToRelative(a = 3.2f, b = 3.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -3.15f, dy1 = 0.0f)
                lineToRelative(dx = -5.94f, dy = -3.43f)
                arcToRelative(a = 3.2f, b = 3.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.57f, dy1 = -2.73f)
                verticalLineTo(y = 8.58f)
                curveToRelative(dx1 = 0.0f, dy1 = -1.12f, dx2 = 0.6f, dy2 = -2.16f, dx3 = 1.57f, dy3 = -2.73f)
                lineToRelative(dx = 5.94f, dy = -3.43f)
                arcToRelative(a = 3.2f, b = 3.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 3.15f, dy1 = 0.0f)
                lineToRelative(dx = 5.94f, dy = 3.43f)
                arcToRelative(a = 3.2f, b = 3.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.57f, dy1 = 2.73f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 12.0f, y = 13.75f)
                arcTo(horizontalEllipseRadius = 0.76f, verticalEllipseRadius = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 11.25f, y1 = 13.0f)
                verticalLineTo(y = 7.75f)
                curveTo(x1 = 11.25f, y1 = 7.34f, x2 = 11.59f, y2 = 7.0f, x3 = 12.0f, y3 = 7.0f)
                reflectiveCurveToRelative(dx1 = 0.75f, dy1 = 0.34f, dx2 = 0.75f, dy2 = 0.75f)
                verticalLineTo(y = 13.0f)
                arcTo(horizontalEllipseRadius = 0.76f, verticalEllipseRadius = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 12.0f, y1 = 13.75f)
                moveToRelative(dx = 0.0f, dy = 3.5f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.38f, dy1 = -0.08f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.33f, dy1 = -0.21f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.22f, dy1 = -0.33f)
                arcTo(horizontalEllipseRadius = 1.0f, verticalEllipseRadius = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 11.0f, y1 = 16.25f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.29f, dy1 = -0.71f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.33f, dy1 = -0.21f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.09f, dy1 = 0.2f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.21f, dy1 = 0.34f)
                arcTo(horizontalEllipseRadius = 1.0f, verticalEllipseRadius = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 13.0f, y1 = 16.25f)
                quadToRelative(dx1 = 0.0f, dy1 = 0.2f, dx2 = -0.08f, dy2 = 0.38f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.21f, dy1 = 0.33f)
                arcTo(horizontalEllipseRadius = 1.0f, verticalEllipseRadius = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 12.0f, y1 = 17.25f)
            }
        }.build().also { _warningTwo = it }
    }

@Suppress("ObjectPropertyName")
private var _warningTwo: ImageVector? = null
