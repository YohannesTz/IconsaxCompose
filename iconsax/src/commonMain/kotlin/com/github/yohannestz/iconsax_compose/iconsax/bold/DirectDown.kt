package com.github.yohannestz.iconsax_compose.iconsax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DirectDown: ImageVector
    get() {
        val current = _directDown
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.DirectDown",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 17.02f, y = 2.72f)
                lineToRelative(dx = -3.48f, dy = 1.74f)
                arcToRelative(a = 3.5f, b = 3.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -3.07f, dy1 = 0.0f)
                lineTo(x = 6.98f, y = 2.7f)
                arcToRelative(a = 3.44f, b = 3.44f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -4.57f, dy1 = 4.68f)
                lineToRelative(dx = 0.82f, dy = 1.54f)
                arcTo(horizontalEllipseRadius = 1.0f, verticalEllipseRadius = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 3.74f, y1 = 9.4f)
                lineToRelative(dx = 12.65f, dy = 5.69f)
                arcToRelative(a = 1.1f, b = 1.1f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.39f, dy1 = -0.48f)
                lineToRelative(dx = 3.81f, dy = -7.24f)
                curveToRelative(dx1 = 1.55f, dy1 = -2.94f, dx2 = -1.59f, dy2 = -6.16f, dx3 = -4.57f, dy3 = -4.66f)
                moveTo(x = 15.6f, y = 16.3f)
                lineToRelative(dx = -8.28f, dy = -3.73f)
                curveToRelative(dx1 = -0.93f, dy1 = -0.42f, dx2 = -1.87f, dy2 = 0.58f, dx3 = -1.39f, dy3 = 1.48f)
                lineToRelative(dx = 3.04f, dy = 5.77f)
                arcToRelative(a = 3.43f, b = 3.43f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 6.08f, dy1 = 0.0f)
                lineToRelative(dx = 1.07f, dy = -2.04f)
                arcToRelative(a = 1.1f, b = 1.1f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.52f, dy1 = -1.48f)
            }
        }.build().also { _directDown = it }
    }

@Suppress("ObjectPropertyName")
private var _directDown: ImageVector? = null
