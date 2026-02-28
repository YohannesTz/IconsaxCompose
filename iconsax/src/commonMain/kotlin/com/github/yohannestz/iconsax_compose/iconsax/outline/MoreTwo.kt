package com.github.yohannestz.iconsax_compose.iconsax.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MoreTwo: ImageVector
    get() {
        val current = _moreTwo
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.MoreTwo",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 12.0f, y = 10.07f)
                arcToRelative(a = 2.9f, b = 2.9f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -2.91f, dy1 = -2.91f)
                curveToRelative(dx1 = 0.0f, dy1 = -1.6f, dx2 = 1.31f, dy2 = -2.91f, dx3 = 2.91f, dy3 = -2.91f)
                reflectiveCurveToRelative(dx1 = 2.91f, dy1 = 1.31f, dx2 = 2.91f, dy2 = 2.91f)
                reflectiveCurveToRelative(dx1 = -1.31f, dy1 = 2.91f, dx2 = -2.91f, dy2 = 2.91f)
                moveToRelative(dx = 0.0f, dy = -4.32f)
                arcToRelative(a = 1.4f, b = 1.4f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = 0.0f, dy1 = 2.82f)
                arcToRelative(a = 1.4f, b = 1.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = -2.82f)
                moveToRelative(dx = -5.21f, dy = 14.0f)
                arcToRelative(a = 2.9f, b = 2.9f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -2.91f, dy1 = -2.91f)
                curveToRelative(dx1 = 0.0f, dy1 = -1.6f, dx2 = 1.31f, dy2 = -2.91f, dx3 = 2.91f, dy3 = -2.91f)
                reflectiveCurveToRelative(dx1 = 2.91f, dy1 = 1.31f, dx2 = 2.91f, dy2 = 2.91f)
                reflectiveCurveToRelative(dx1 = -1.31f, dy1 = 2.91f, dx2 = -2.91f, dy2 = 2.91f)
                moveToRelative(dx = 0.0f, dy = -4.32f)
                arcToRelative(a = 1.4f, b = 1.4f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = 0.0f, dy1 = 2.82f)
                arcToRelative(a = 1.4f, b = 1.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = -2.82f)
                moveToRelative(dx = 10.42f, dy = 4.32f)
                arcToRelative(a = 2.9f, b = 2.9f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -2.91f, dy1 = -2.91f)
                curveToRelative(dx1 = 0.0f, dy1 = -1.6f, dx2 = 1.31f, dy2 = -2.91f, dx3 = 2.91f, dy3 = -2.91f)
                reflectiveCurveToRelative(dx1 = 2.91f, dy1 = 1.31f, dx2 = 2.91f, dy2 = 2.91f)
                reflectiveCurveToRelative(dx1 = -1.3f, dy1 = 2.91f, dx2 = -2.91f, dy2 = 2.91f)
                moveToRelative(dx = 0.0f, dy = -4.32f)
                arcToRelative(a = 1.4f, b = 1.4f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = 0.0f, dy1 = 2.82f)
                arcToRelative(a = 1.4f, b = 1.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = -2.82f)
            }
        }.build().also { _moreTwo = it }
    }

@Suppress("ObjectPropertyName")
private var _moreTwo: ImageVector? = null
