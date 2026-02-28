package com.github.yohannestz.iconsax_compose.iconsax.bulk

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Crop: ImageVector
    get() {
        val current = _crop
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Crop",
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
                moveTo(x = 13.94f, y = 4.83f)
                horizontalLineTo(x = 6.83f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -2.0f, dy1 = 2.0f)
                verticalLineToRelative(dy = 7.1f)
                arcToRelative(a = 5.23f, b = 5.23f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 5.23f, dy1 = 5.24f)
                horizontalLineToRelative(dx = 7.11f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 2.0f, dy1 = -2.0f)
                verticalLineToRelative(dy = -7.11f)
                arcToRelative(a = 5.23f, b = 5.23f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -5.23f, dy1 = -5.23f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 5.53f, y = 2.0f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.75f, dy1 = 0.75f)
                verticalLineToRelative(dy = 2.03f)
                horizontalLineTo(x = 2.75f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = 0.0f, dy1 = 1.5f)
                horizontalLineToRelative(dx = 2.78f)
                arcToRelative(a = 0.76f, b = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.75f, dy1 = -0.75f)
                verticalLineTo(y = 2.75f)
                arcTo(horizontalEllipseRadius = 0.76f, verticalEllipseRadius = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 5.53f, y1 = 2.0f)
                moveToRelative(dx = 15.72f, dy = 15.72f)
                horizontalLineToRelative(dx = -2.78f)
                arcToRelative(a = 0.76f, b = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.75f, dy1 = 0.75f)
                verticalLineToRelative(dy = 2.78f)
                curveToRelative(dx1 = 0.0f, dy1 = 0.4f, dx2 = 0.34f, dy2 = 0.75f, dx3 = 0.75f, dy3 = 0.75f)
                reflectiveCurveToRelative(dx1 = 0.75f, dy1 = -0.34f, dx2 = 0.75f, dy2 = -0.75f)
                verticalLineToRelative(dy = -2.03f)
                horizontalLineToRelative(dx = 2.03f)
                curveToRelative(dx1 = 0.41f, dy1 = 0.0f, dx2 = 0.75f, dy2 = -0.34f, dx3 = 0.75f, dy3 = -0.75f)
                reflectiveCurveToRelative(dx1 = -0.34f, dy1 = -0.75f, dx2 = -0.75f, dy2 = -0.75f)
            }
        }.build().also { _crop = it }
    }

@Suppress("ObjectPropertyName")
private var _crop: ImageVector? = null
