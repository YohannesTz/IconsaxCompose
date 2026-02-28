package com.github.yohannestz.iconsax_compose.iconsax.bulk

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Hierarchy: ImageVector
    get() {
        val current = _hierarchy
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Hierarchy",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 5.25f, y = 8.5f)
                arcToRelative(a = 3.25f, b = 3.25f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = 0.0f, dy1 = -6.5f)
                arcToRelative(a = 3.25f, b = 3.25f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 6.5f)
                moveTo(x = 5.0f, y = 22.0f)
                arcToRelative(a = 3.0f, b = 3.0f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = 0.0f, dy1 = -6.0f)
                arcToRelative(a = 3.0f, b = 3.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 6.0f)
                moveToRelative(dx = 14.0f, dy = 0.0f)
                arcToRelative(a = 3.0f, b = 3.0f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = 0.0f, dy1 = -6.0f)
                arcToRelative(a = 3.0f, b = 3.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 6.0f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
                fillAlpha = 0.4f,
                strokeAlpha = 0.4f,
            ) {
                moveTo(x = 19.17f, y = 15.98f)
                arcToRelative(a = 6.9f, b = 6.9f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -6.54f, dy1 = -4.65f)
                horizontalLineTo(x = 9.07f)
                arcToRelative(a = 3.4f, b = 3.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -3.29f, dy1 = -2.48f)
                verticalLineTo(y = 7.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.42f, dx2 = -0.34f, dy2 = -0.76f, dx3 = -0.77f, dy3 = -0.76f)
                reflectiveCurveTo(x1 = 4.25f, y1 = 6.58f, x2 = 4.25f, y2 = 7.0f)
                verticalLineToRelative(dy = 11.22f)
                curveToRelative(dx1 = 0.0f, dy1 = 0.42f, dx2 = 0.34f, dy2 = 0.76f, dx3 = 0.76f, dy3 = 0.76f)
                reflectiveCurveToRelative(dx1 = 0.77f, dy1 = -0.34f, dx2 = 0.77f, dy2 = -0.76f)
                verticalLineTo(y = 11.6f)
                arcToRelative(a = 5.0f, b = 5.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 3.28f, dy1 = 1.26f)
                horizontalLineToRelative(dx = 0.02f)
                lineToRelative(dx = 3.53f, dy = -0.01f)
                horizontalLineToRelative(dx = 0.02f)
                arcToRelative(a = 5.4f, b = 5.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 5.09f, dy1 = 3.62f)
                arcToRelative(a = 0.76f, b = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.97f, dy1 = 0.47f)
                arcToRelative(a = 0.74f, b = 0.74f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.48f, dy1 = -0.96f)
            }
        }.build().also { _hierarchy = it }
    }

@Suppress("ObjectPropertyName")
private var _hierarchy: ImageVector? = null
