package com.github.yohannestz.iconsax_compose.iconsax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Spotify: ImageVector
    get() {
        val current = _spotify
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Spotify",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                moveTo(x = 12.0f, y = 2.0f)
                arcToRelative(a = 10.0f, b = 10.0f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = 0.0f, dy1 = 20.0f)
                arcToRelative(a = 10.0f, b = 10.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = -20.0f)
                moveToRelative(dx = 3.42f, dy = 14.58f)
                arcToRelative(a = 0.7f, b = 0.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.61f, dy1 = 0.31f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.44f, dy1 = -0.14f)
                arcTo(horizontalEllipseRadius = 5.6f, verticalEllipseRadius = 5.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 9.1f, y1 = 16.1f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.97f, dy1 = -0.42f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.42f, dy1 = -0.97f)
                arcToRelative(a = 7.0f, b = 7.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 6.69f, dy1 = 0.82f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.18f, dy1 = 1.05f)
                moveToRelative(dx = 1.1f, dy = -2.79f)
                arcToRelative(a = 0.7f, b = 0.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.61f, dy1 = 0.31f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.44f, dy1 = -0.14f)
                arcToRelative(a = 7.6f, b = 7.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -7.26f, dy1 = -0.89f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.97f, dy1 = -0.42f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.42f, dy1 = -0.97f)
                arcToRelative(a = 9.1f, b = 9.1f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 8.68f, dy1 = 1.07f)
                arcToRelative(a = 0.74f, b = 0.74f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.18f, dy1 = 1.04f)
                moveToRelative(dx = 1.57f, dy = -2.68f)
                arcToRelative(a = 0.7f, b = 0.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.61f, dy1 = 0.31f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.44f, dy1 = -0.14f)
                arcToRelative(a = 10.7f, b = 10.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -10.2f, dy1 = -1.25f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.97f, dy1 = -0.42f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.42f, dy1 = -0.97f)
                arcToRelative(a = 12.2f, b = 12.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 11.63f, dy1 = 1.43f)
                arcToRelative(a = 0.73f, b = 0.73f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.17f, dy1 = 1.04f)
            }
        }.build().also { _spotify = it }
    }

@Suppress("ObjectPropertyName")
private var _spotify: ImageVector? = null
