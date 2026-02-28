package com.github.yohannestz.iconsax_compose.iconsax.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heart: ImageVector
    get() {
        val current = _heart
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Heart",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 12.0f, y = 21.65f)
                arcToRelative(a = 3.0f, b = 3.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.86f, dy1 = -0.13f)
                curveToRelative(dx1 = -3.82f, dy1 = -1.3f, dx2 = -9.89f, dy2 = -5.96f, dx3 = -9.89f, dy3 = -12.83f)
                curveToRelative(dx1 = 0.0f, dy1 = -3.5f, dx2 = 2.83f, dy2 = -6.34f, dx3 = 6.31f, dy3 = -6.34f)
                arcTo(horizontalEllipseRadius = 6.2f, verticalEllipseRadius = 6.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 12.0f, y1 = 4.2f)
                arcToRelative(a = 6.2f, b = 6.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 4.44f, dy1 = -1.84f)
                arcToRelative(a = 6.34f, b = 6.34f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 6.31f, dy1 = 6.34f)
                curveToRelative(dx1 = 0.0f, dy1 = 6.88f, dx2 = -6.07f, dy2 = 11.52f, dx3 = -9.89f, dy3 = 12.83f)
                arcTo(horizontalEllipseRadius = 3.0f, verticalEllipseRadius = 3.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 12.0f, y1 = 21.65f)
                moveTo(x = 7.56f, y = 3.85f)
                arcTo(horizontalEllipseRadius = 4.83f, verticalEllipseRadius = 4.83f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 2.75f, y1 = 8.7f)
                curveToRelative(dx1 = 0.0f, dy1 = 6.83f, dx2 = 6.57f, dy2 = 10.63f, dx3 = 8.88f, dy3 = 11.42f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.75f, dy1 = 0.0f)
                curveToRelative(dx1 = 2.3f, dy1 = -0.79f, dx2 = 8.88f, dy2 = -4.58f, dx3 = 8.88f, dy3 = -11.42f)
                arcToRelative(a = 4.83f, b = 4.83f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -4.81f, dy1 = -4.84f)
                arcToRelative(a = 4.8f, b = 4.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -3.84f, dy1 = 1.94f)
                curveToRelative(dx1 = -0.28f, dy1 = 0.38f, dx2 = -0.92f, dy2 = 0.38f, dx3 = -1.2f, dy3 = 0.0f)
                arcToRelative(a = 4.8f, b = 4.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -3.85f, dy1 = -1.94f)
            }
        }.build().also { _heart = it }
    }

@Suppress("ObjectPropertyName")
private var _heart: ImageVector? = null
