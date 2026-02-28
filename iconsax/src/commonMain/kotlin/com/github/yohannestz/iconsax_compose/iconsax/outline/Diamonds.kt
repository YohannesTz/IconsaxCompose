package com.github.yohannestz.iconsax_compose.iconsax.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Diamonds: ImageVector
    get() {
        val current = _diamonds
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Diamonds",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 12.0f, y = 22.6f)
                arcToRelative(a = 4.0f, b = 4.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -2.91f, dy1 = -1.31f)
                lineToRelative(dx = -6.86f, dy = -7.54f)
                arcToRelative(a = 4.2f, b = 4.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.69f, dy1 = -4.24f)
                lineTo(x = 4.1f, y = 3.75f)
                arcToRelative(a = 3.6f, b = 3.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 3.59f, dy1 = -2.34f)
                horizontalLineToRelative(dx = 8.59f)
                verticalLineToRelative(dy = 0.75f)
                verticalLineToRelative(dy = -0.75f)
                arcToRelative(a = 3.6f, b = 3.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 3.59f, dy1 = 2.33f)
                lineToRelative(dx = 2.56f, dy = 5.76f)
                arcToRelative(a = 4.2f, b = 4.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.68f, dy1 = 4.24f)
                lineToRelative(dx = -6.85f, dy = 7.55f)
                arcTo(horizontalEllipseRadius = 3.9f, verticalEllipseRadius = 3.9f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 12.0f, y1 = 22.6f)
                moveToRelative(dx = 4.29f, dy = -19.7f)
                horizontalLineTo(x = 7.7f)
                curveToRelative(dx1 = -1.31f, dy1 = 0.0f, dx2 = -1.84f, dy2 = 0.58f, dx3 = -2.22f, dy3 = 1.45f)
                lineToRelative(dx = -2.56f, dy = 5.76f)
                arcToRelative(a = 2.7f, b = 2.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.42f, dy1 = 2.62f)
                lineToRelative(dx = 6.86f, dy = 7.54f)
                arcToRelative(a = 2.4f, b = 2.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.8f, dy1 = 0.82f)
                arcToRelative(a = 2.4f, b = 2.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.8f, dy1 = -0.82f)
                lineToRelative(dx = 6.85f, dy = -7.55f)
                arcToRelative(a = 2.7f, b = 2.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.42f, dy1 = -2.62f)
                lineToRelative(dx = -2.56f, dy = -5.76f)
                curveTo(x1 = 18.13f, y1 = 3.48f, x2 = 17.6f, y2 = 2.9f, x3 = 16.29f, y3 = 2.9f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 3.5f, y = 8.75f)
                curveTo(x1 = 3.09f, y1 = 8.75f, x2 = 2.75f, y2 = 8.4f, x3 = 2.75f, y3 = 8.0f)
                reflectiveCurveTo(x1 = 3.09f, y1 = 7.25f, x2 = 3.5f, y2 = 7.25f)
                lineToRelative(dx = 17.0f, dy = -0.01f)
                curveToRelative(dx1 = 0.41f, dy1 = 0.0f, dx2 = 0.75f, dy2 = 0.34f, dx3 = 0.75f, dy3 = 0.75f)
                reflectiveCurveToRelative(dx1 = -0.34f, dy1 = 0.75f, dx2 = -0.75f, dy2 = 0.75f)
                close()
            }
        }.build().also { _diamonds = it }
    }

@Suppress("ObjectPropertyName")
private var _diamonds: ImageVector? = null
