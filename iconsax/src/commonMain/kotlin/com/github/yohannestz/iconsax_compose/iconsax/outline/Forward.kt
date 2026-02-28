package com.github.yohannestz.iconsax_compose.iconsax.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Forward: ImageVector
    get() {
        val current = _forward
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Forward",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 3.95f, y = 18.36f)
                arcToRelative(a = 2.6f, b = 2.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.35f, dy1 = -0.37f)
                arcToRelative(a = 2.7f, b = 2.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.35f, dy1 = -2.34f)
                verticalLineTo(y = 8.33f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.98f, dx2 = 0.5f, dy2 = -1.85f, dx3 = 1.35f, dy3 = -2.34f)
                arcToRelative(a = 2.7f, b = 2.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 2.7f, dy1 = 0.0f)
                lineToRelative(dx = 6.34f, dy = 3.66f)
                arcToRelative(a = 3.0f, b = 3.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.7f, dy1 = 0.59f)
                arcToRelative(a = 0.7f, b = 0.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.17f, dy1 = 0.47f)
                verticalLineToRelative(dy = 2.56f)
                arcToRelative(a = 0.7f, b = 0.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.17f, dy1 = 0.47f)
                arcToRelative(a = 3.0f, b = 3.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.68f, dy1 = 0.58f)
                lineTo(x = 5.3f, y = 18.0f)
                arcToRelative(a = 3.0f, b = 3.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.35f, dy1 = 0.36f)
                moveToRelative(dx = 0.0f, dy = -11.22f)
                arcToRelative(a = 1.19f, b = 1.19f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.2f, dy1 = 1.2f)
                verticalLineToRelative(dy = 7.32f)
                arcToRelative(a = 1.2f, b = 1.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.6f, dy1 = 1.04f)
                arcToRelative(a = 1.2f, b = 1.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.2f, dy1 = 0.0f)
                lineToRelative(dx = 6.34f, dy = -3.66f)
                lineToRelative(dx = 0.11f, dy = -0.08f)
                verticalLineToRelative(dy = -1.93f)
                lineToRelative(dx = -0.12f, dy = -0.08f)
                lineTo(x = 4.55f, y = 7.3f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.6f, dy1 = -0.16f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 13.7f, y = 18.36f)
                arcToRelative(a = 2.6f, b = 2.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.34f, dy1 = -0.37f)
                arcTo(horizontalEllipseRadius = 2.7f, verticalEllipseRadius = 2.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 11.0f, y1 = 15.65f)
                verticalLineTo(y = 8.33f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.98f, dx2 = 0.5f, dy2 = -1.85f, dx3 = 1.35f, dy3 = -2.34f)
                arcToRelative(a = 2.7f, b = 2.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 2.7f, dy1 = 0.0f)
                lineToRelative(dx = 6.34f, dy = 3.66f)
                arcToRelative(a = 2.7f, b = 2.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.35f, dy1 = 2.34f)
                curveToRelative(dx1 = 0.0f, dy1 = 0.98f, dx2 = -0.5f, dy2 = 1.85f, dx3 = -1.35f, dy3 = 2.34f)
                lineToRelative(dx = -6.34f, dy = 3.66f)
                arcToRelative(a = 2.6f, b = 2.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.35f, dy1 = 0.37f)
                moveToRelative(dx = 0.0f, dy = -11.22f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.6f, dy1 = 0.16f)
                arcToRelative(a = 1.2f, b = 1.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.6f, dy1 = 1.04f)
                verticalLineToRelative(dy = 7.32f)
                arcToRelative(a = 1.2f, b = 1.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.6f, dy1 = 1.04f)
                arcToRelative(a = 1.2f, b = 1.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.2f, dy1 = 0.0f)
                lineToRelative(dx = 6.35f, dy = -3.66f)
                arcToRelative(a = 1.2f, b = 1.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.6f, dy1 = -1.04f)
                arcToRelative(a = 1.2f, b = 1.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.6f, dy1 = -1.04f)
                lineTo(x = 14.3f, y = 7.3f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.6f, dy1 = -0.16f)
            }
        }.build().also { _forward = it }
    }

@Suppress("ObjectPropertyName")
private var _forward: ImageVector? = null
