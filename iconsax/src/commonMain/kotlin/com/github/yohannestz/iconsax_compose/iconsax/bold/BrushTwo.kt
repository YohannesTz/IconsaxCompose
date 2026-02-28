package com.github.yohannestz.iconsax_compose.iconsax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val BrushTwo: ImageVector
    get() {
        val current = _brushTwo
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.BrushTwo",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 21.81f, y = 3.94f)
                curveToRelative(dx1 = -1.31f, dy1 = 3.27f, dx2 = -4.3f, dy2 = 7.54f, dx3 = -7.15f, dy3 = 10.33f)
                arcTo(horizontalEllipseRadius = 6.0f, verticalEllipseRadius = 6.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 9.59f, y1 = 9.3f)
                curveToRelative(dx1 = 2.8f, dy1 = -2.86f, dx2 = 7.1f, dy2 = -5.9f, dx3 = 10.38f, dy3 = -7.21f)
                arcToRelative(a = 1.42f, b = 1.42f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.84f, dy1 = 1.84f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 13.78f, y = 15.09f)
                lineToRelative(dx = -0.6f, dy = 0.5f)
                lineToRelative(dx = -1.79f, dy = 1.43f)
                lineToRelative(dx = -0.01f, dy = -0.11f)
                arcToRelative(a = 5.0f, b = 5.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.45f, dy1 = -2.87f)
                arcToRelative(a = 5.0f, b = 5.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -2.96f, dy1 = -1.46f)
                lineToRelative(dx = -0.1f, dy = -0.01f)
                lineToRelative(dx = 1.45f, dy = -1.83f)
                lineToRelative(dx = 0.45f, dy = -0.53f)
                lineToRelative(dx = 0.68f, dy = 0.09f)
                arcToRelative(a = 5.0f, b = 5.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 4.22f, dy1 = 4.13f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 10.43f, y = 17.62f)
                arcToRelative(a = 4.1f, b = 4.1f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -3.65f, dy1 = 4.1f)
                lineToRelative(dx = -2.45f, dy = 0.27f)
                arcToRelative(a = 2.13f, b = 2.13f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -2.34f, dy1 = -2.35f)
                lineToRelative(dx = 0.27f, dy = -2.46f)
                arcToRelative(a = 4.1f, b = 4.1f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 4.61f, dy1 = -3.61f)
                arcToRelative(a = 4.0f, b = 4.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 2.36f, dy1 = 1.18f)
                arcToRelative(a = 4.0f, b = 4.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.16f, dy1 = 2.29f)
                quadToRelative(dx1 = 0.03f, dy1 = 0.3f, dx2 = 0.04f, dy2 = 0.58f)
            }
        }.build().also { _brushTwo = it }
    }

@Suppress("ObjectPropertyName")
private var _brushTwo: ImageVector? = null
