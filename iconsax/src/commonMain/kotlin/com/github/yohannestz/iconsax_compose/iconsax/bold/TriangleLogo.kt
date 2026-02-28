package com.github.yohannestz.iconsax_compose.iconsax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val TriangleLogo: ImageVector
    get() {
        val current = _triangleLogo
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.TriangleLogo",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                moveTo(x = 10.05f, y = 2.85f)
                lineToRelative(dx = -8.79f, dy = 8.79f)
                arcToRelative(a = 0.5f, b = 0.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 0.7f)
                lineToRelative(dx = 8.79f, dy = 8.8f)
                curveToRelative(dx1 = 0.32f, dy1 = 0.3f, dx2 = 0.85f, dy2 = 0.09f, dx3 = 0.85f, dy3 = -0.35f)
                verticalLineToRelative(dy = -2.6f)
                arcToRelative(a = 0.5f, b = 0.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.15f, dy1 = -0.34f)
                lineToRelative(dx = -5.5f, dy = -5.5f)
                arcToRelative(a = 0.5f, b = 0.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = -0.71f)
                lineToRelative(dx = 5.5f, dy = -5.5f)
                arcToRelative(a = 0.5f, b = 0.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.15f, dy1 = -0.35f)
                verticalLineToRelative(dy = -2.6f)
                arcToRelative(a = 0.5f, b = 0.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.85f, dy1 = -0.34f)
                moveToRelative(dx = 3.7f, dy = 0.0f)
                lineToRelative(dx = 8.79f, dy = 8.79f)
                arcToRelative(a = 0.5f, b = 0.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = 0.7f)
                lineToRelative(dx = -8.79f, dy = 8.8f)
                arcToRelative(a = 0.5f, b = 0.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.85f, dy1 = -0.35f)
                verticalLineToRelative(dy = -2.6f)
                arcToRelative(a = 0.5f, b = 0.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.15f, dy1 = -0.34f)
                lineToRelative(dx = 5.5f, dy = -5.5f)
                arcToRelative(a = 0.5f, b = 0.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = -0.71f)
                lineToRelative(dx = -5.5f, dy = -5.5f)
                arcToRelative(a = 0.5f, b = 0.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.15f, dy1 = -0.35f)
                verticalLineToRelative(dy = -2.6f)
                arcToRelative(a = 0.5f, b = 0.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.85f, dy1 = -0.34f)
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                moveTo(x = 10.05f, y = 9.85f)
                lineToRelative(dx = -1.79f, dy = 1.79f)
                arcToRelative(a = 0.5f, b = 0.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 0.7f)
                lineToRelative(dx = 1.79f, dy = 1.8f)
                curveToRelative(dx1 = 0.32f, dy1 = 0.3f, dx2 = 0.85f, dy2 = 0.09f, dx3 = 0.85f, dy3 = -0.35f)
                verticalLineToRelative(dy = -3.6f)
                arcToRelative(a = 0.5f, b = 0.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.85f, dy1 = -0.34f)
            }
        }.build().also { _triangleLogo = it }
    }

@Suppress("ObjectPropertyName")
private var _triangleLogo: ImageVector? = null
