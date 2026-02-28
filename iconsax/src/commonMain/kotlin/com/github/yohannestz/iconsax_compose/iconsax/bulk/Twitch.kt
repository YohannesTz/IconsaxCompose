package com.github.yohannestz.iconsax_compose.iconsax.bulk

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
                fill = SolidColor(Color(0xFF292D32)),
                fillAlpha = 0.4f,
                pathFillType = PathFillType.EvenOdd,
                strokeAlpha = 0.4f,
            ) {
                moveTo(x = 5.04f, y = 2.0f)
                horizontalLineTo(x = 20.5f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.0f, dy1 = 1.0f)
                verticalLineToRelative(dy = 10.59f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.29f, dy1 = 0.71f)
                lineToRelative(dx = -4.41f, dy = 4.41f)
                arcTo(horizontalEllipseRadius = 1.0f, verticalEllipseRadius = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 16.09f, y1 = 19.0f)
                horizontalLineToRelative(dx = -4.05f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.83f, dy1 = 0.45f)
                lineTo(x = 9.8f, y = 21.56f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.83f, dy1 = 0.45f)
                horizontalLineTo(x = 7.51f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.0f, dy1 = -1.0f)
                verticalLineToRelative(dy = -1.0f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.0f, dy1 = -1.0f)
                horizontalLineToRelative(dx = -2.0f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.0f, dy1 = -1.0f)
                verticalLineTo(y = 5.31f)
                quadToRelative(dx1 = 0.0f, dy1 = -0.3f, dx2 = 0.17f, dy2 = -0.55f)
                lineToRelative(dx = 1.54f, dy = -2.3f)
                arcTo(horizontalEllipseRadius = 1.0f, verticalEllipseRadius = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 5.04f, y1 = 2.0f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(x = 8.5f, y = 7.14f)
                verticalLineToRelative(dy = 5.71f)
                arcToRelative(a = 0.57f, b = 0.57f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.57f, dy1 = 0.57f)
                horizontalLineToRelative(dx = 1.14f)
                arcToRelative(a = 0.57f, b = 0.57f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.57f, dy1 = -0.57f)
                verticalLineTo(y = 7.14f)
                arcToRelative(a = 0.57f, b = 0.57f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.57f, dy1 = -0.57f)
                horizontalLineTo(x = 9.07f)
                arcTo(horizontalEllipseRadius = 0.6f, verticalEllipseRadius = 0.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 8.5f, y1 = 7.14f)
                moveToRelative(dx = 5.71f, dy = 0.0f)
                verticalLineToRelative(dy = 5.71f)
                arcToRelative(a = 0.57f, b = 0.57f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.57f, dy1 = 0.57f)
                horizontalLineToRelative(dx = 1.14f)
                arcToRelative(a = 0.57f, b = 0.57f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.57f, dy1 = -0.57f)
                verticalLineTo(y = 7.14f)
                arcToRelative(a = 0.57f, b = 0.57f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.57f, dy1 = -0.57f)
                horizontalLineToRelative(dx = -1.14f)
                arcToRelative(a = 0.6f, b = 0.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.57f, dy1 = 0.57f)
            }
        }.build().also { _twitch = it }
    }

@Suppress("ObjectPropertyName")
private var _twitch: ImageVector? = null
