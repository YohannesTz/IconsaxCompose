package com.github.yohannestz.iconsax_compose.iconsax.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Dribbble: ImageVector
    get() {
        val current = _dribbble
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Dribbble",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                moveTo(x = 6.87f, y = 12.28f)
                arcToRelative(a = 14.0f, b = 14.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.27f, dy1 = -0.06f)
                lineToRelative(dx = -3.17f, dy = -0.29f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.68f, dy1 = -0.82f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.82f, dy1 = -0.68f)
                lineToRelative(dx = 3.17f, dy = 0.3f)
                arcTo(horizontalEllipseRadius = 12.7f, verticalEllipseRadius = 12.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 17.85f, y1 = 4.4f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.02f, dy1 = -0.28f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.28f, dy1 = 1.02f)
                arcToRelative(a = 14.2f, b = 14.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -12.28f, dy1 = 7.13f)
                moveTo(x = 5.5f, y = 20.12f)
                arcTo(horizontalEllipseRadius = 0.75f, verticalEllipseRadius = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 4.85f, y1 = 19.0f)
                arcToRelative(a = 14.2f, b = 14.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 13.55f, dy1 = -7.06f)
                lineToRelative(dx = 3.17f, dy = 0.29f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = true, dx1 = -0.14f, dy1 = 1.5f)
                lineToRelative(dx = -3.17f, dy = -0.3f)
                arcToRelative(a = 12.7f, b = 12.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -12.11f, dy1 = 6.32f)
                arcToRelative(a = 0.8f, b = 0.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.65f, dy1 = 0.37f)
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                moveTo(x = 12.0f, y = 22.75f)
                arcToRelative(a = 10.76f, b = 10.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = -21.5f)
                arcToRelative(a = 10.76f, b = 10.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = 21.5f)
                moveToRelative(dx = 0.0f, dy = -20.0f)
                arcToRelative(a = 9.26f, b = 9.26f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 18.5f)
                arcToRelative(a = 9.26f, b = 9.26f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = -18.5f)
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                moveTo(x = 16.47f, y = 21.7f)
                arcToRelative(a = 0.8f, b = 0.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.73f, dy1 = -0.57f)
                lineToRelative(dx = -1.21f, dy = -5.0f)
                arcToRelative(a = 22.0f, b = 22.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -4.3f, dy1 = -8.7f)
                lineTo(x = 7.05f, y = 3.48f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = true, dx1 = 1.16f, dy1 = -0.94f)
                lineToRelative(dx = 3.18f, dy = 3.95f)
                arcToRelative(a = 24.0f, b = 24.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 4.59f, dy1 = 9.29f)
                lineToRelative(dx = 1.21f, dy = 4.99f)
                arcToRelative(a = 0.76f, b = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.72f, dy1 = 0.93f)
            }
        }.build().also { _dribbble = it }
    }

@Suppress("ObjectPropertyName")
private var _dribbble: ImageVector? = null
