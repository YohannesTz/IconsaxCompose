package com.github.yohannestz.iconsax_compose.iconsax.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val LampOn: ImageVector
    get() {
        val current = _lampOn
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.LampOn",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 14.77f, y = 19.75f)
                horizontalLineTo(x = 9.26f)
                curveToRelative(dx1 = -0.44f, dy1 = 0.0f, dx2 = -1.0f, dy2 = -0.05f, dx3 = -1.37f, dy3 = -0.43f)
                curveToRelative(dx1 = -0.36f, dy1 = -0.37f, dx2 = -0.35f, dy2 = -0.83f, dx3 = -0.34f, dy3 = -1.14f)
                verticalLineToRelative(dy = -0.9f)
                curveToRelative(dx1 = -2.52f, dy1 = -1.67f, dx2 = -4.18f, dy2 = -4.6f, dx3 = -4.18f, dy3 = -7.37f)
                arcTo(horizontalEllipseRadius = 8.6f, verticalEllipseRadius = 8.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 6.6f, y1 = 3.17f)
                arcToRelative(a = 8.7f, b = 8.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 13.15f, dy1 = 2.78f)
                curveToRelative(dx1 = 2.17f, dy1 = 4.37f, dx2 = 0.08f, dy2 = 9.1f, dx3 = -3.26f, dy3 = 11.35f)
                verticalLineToRelative(dy = 0.75f)
                curveToRelative(dx1 = 0.01f, dy1 = 0.29f, dx2 = 0.02f, dy2 = 0.82f, dx3 = -0.39f, dy3 = 1.24f)
                arcToRelative(a = 1.8f, b = 1.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.33f, dy1 = 0.46f)
                moveToRelative(dx = -5.73f, dy = -1.51f)
                horizontalLineToRelative(dx = 5.73f)
                lineToRelative(dx = 0.21f, dy = -0.01f)
                verticalLineToRelative(dy = -1.36f)
                arcToRelative(a = 0.8f, b = 0.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.36f, dy1 = -0.64f)
                curveToRelative(dx1 = 2.96f, dy1 = -1.8f, dx2 = 4.92f, dy2 = -5.88f, dx3 = 3.05f, dy3 = -9.63f)
                arcTo(horizontalEllipseRadius = 7.21f, verticalEllipseRadius = 7.21f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 7.52f, y1 = 4.33f)
                arcTo(horizontalEllipseRadius = 7.1f, verticalEllipseRadius = 7.1f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 4.85f, y1 = 9.9f)
                curveToRelative(dx1 = 0.0f, dy1 = 2.78f, dx2 = 1.92f, dy2 = 5.18f, dx3 = 3.82f, dy3 = 6.33f)
                arcToRelative(a = 0.7f, b = 0.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.36f, dy1 = 0.64f)
                verticalLineToRelative(dy = 1.35f)
                close()
                moveToRelative(dx = 6.46f, dy = 4.51f)
                lineToRelative(dx = -0.21f, dy = -0.03f)
                arcToRelative(a = 12.0f, b = 12.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -6.59f, dy1 = 0.0f)
                arcToRelative(a = 0.76f, b = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.93f, dy1 = -0.52f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.52f, dy1 = -0.93f)
                arcToRelative(a = 13.5f, b = 13.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 7.41f, dy1 = 0.0f)
                arcToRelative(a = 0.76f, b = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.52f, dy1 = 0.93f)
                arcToRelative(a = 0.74f, b = 0.74f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.72f, dy1 = 0.55f)
            }
        }.build().also { _lampOn = it }
    }

@Suppress("ObjectPropertyName")
private var _lampOn: ImageVector? = null
