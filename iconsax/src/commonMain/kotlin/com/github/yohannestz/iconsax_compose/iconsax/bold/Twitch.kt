package com.github.yohannestz.iconsax_compose.iconsax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Twitch: ImageVector
    get() {
        val current = _twitch
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Twitch",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(x = 20.5f, y = 2.0f)
                horizontalLineTo(x = 5.04f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.83f, dy1 = 0.45f)
                lineToRelative(dx = -1.54f, dy = 2.3f)
                arcTo(horizontalEllipseRadius = 1.0f, verticalEllipseRadius = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 2.5f, y1 = 5.3f)
                verticalLineTo(y = 18.0f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.0f, dy1 = 1.0f)
                horizontalLineToRelative(dx = 2.0f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.0f, dy1 = 1.0f)
                verticalLineToRelative(dy = 1.0f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.0f, dy1 = 1.0f)
                horizontalLineToRelative(dx = 1.46f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.83f, dy1 = -0.45f)
                lineToRelative(dx = 1.41f, dy = -2.11f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.83f, dy1 = -0.45f)
                horizontalLineToRelative(dx = 4.05f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.71f, dy1 = -0.29f)
                lineToRelative(dx = 4.41f, dy = -4.41f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.29f, dy1 = -0.71f)
                verticalLineTo(y = 3.0f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.99f, dy1 = -1.0f)
                moveToRelative(dx = -9.71f, dy = 10.86f)
                arcToRelative(a = 0.57f, b = 0.57f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.57f, dy1 = 0.57f)
                horizontalLineTo(x = 9.08f)
                arcToRelative(a = 0.57f, b = 0.57f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.57f, dy1 = -0.57f)
                verticalLineTo(y = 7.15f)
                arcToRelative(a = 0.57f, b = 0.57f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.57f, dy1 = -0.57f)
                horizontalLineToRelative(dx = 1.14f)
                arcToRelative(a = 0.57f, b = 0.57f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.57f, dy1 = 0.57f)
                close()
                moveToRelative(dx = 5.71f, dy = 0.0f)
                arcToRelative(a = 0.57f, b = 0.57f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.57f, dy1 = 0.57f)
                horizontalLineToRelative(dx = -1.14f)
                arcToRelative(a = 0.57f, b = 0.57f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.57f, dy1 = -0.57f)
                verticalLineTo(y = 7.15f)
                arcToRelative(a = 0.57f, b = 0.57f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.57f, dy1 = -0.57f)
                horizontalLineToRelative(dx = 1.14f)
                arcToRelative(a = 0.57f, b = 0.57f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.57f, dy1 = 0.57f)
                close()
            }
        }.build().also { _twitch = it }
    }

@Suppress("ObjectPropertyName")
private var _twitch: ImageVector? = null
