package com.github.yohannestz.iconsax_compose.iconsax.bulk

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val LikeDislike: ImageVector
    get() {
        val current = _likeDislike
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.LikeDislike",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
                fillAlpha = 0.4f,
                strokeAlpha = 0.4f,
            ) {
                moveTo(x = 13.15f, y = 15.37f)
                arcToRelative(a = 1.3f, b = 1.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.06f, dy1 = -0.5f)
                horizontalLineTo(x = 9.76f)
                arcToRelative(a = 0.5f, b = 0.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.39f, dy1 = -0.18f)
                arcToRelative(a = 0.6f, b = 0.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.12f, dy1 = -0.44f)
                lineToRelative(dx = 0.29f, dy = -1.86f)
                arcToRelative(a = 1.25f, b = 1.25f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.8f, dy1 = -1.37f)
                arcToRelative(a = 1.2f, b = 1.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.37f, dy1 = 0.44f)
                lineToRelative(dx = -2.39f, dy = 3.55f)
                lineToRelative(dx = -0.07f, dy = 0.12f)
                verticalLineToRelative(dy = 5.02f)
                lineTo(x = 5.0f, y = 20.24f)
                lineToRelative(dx = 1.8f, dy = 1.39f)
                curveTo(x1 = 7.04f, y1 = 21.87f, x2 = 7.58f, y2 = 22.0f, x3 = 7.96f, y3 = 22.0f)
                horizontalLineToRelative(dx = 2.21f)
                arcToRelative(a = 1.8f, b = 1.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.7f, dy1 = -1.27f)
                lineToRelative(dx = 1.4f, dy = -4.25f)
                arcToRelative(a = 1.2f, b = 1.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.12f, dy1 = -1.11f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 3.82f, y = 13.3f)
                horizontalLineTo(x = 3.24f)
                curveTo(x1 = 2.36f, y1 = 13.3f, x2 = 2.0f, y2 = 13.64f, x3 = 2.0f, y3 = 14.48f)
                verticalLineToRelative(dy = 5.71f)
                curveToRelative(dx1 = 0.0f, dy1 = 0.84f, dx2 = 0.36f, dy2 = 1.18f, dx3 = 1.24f, dy3 = 1.18f)
                horizontalLineToRelative(dx = 0.58f)
                curveToRelative(dx1 = 0.88f, dy1 = 0.0f, dx2 = 1.24f, dy2 = -0.34f, dx3 = 1.24f, dy3 = -1.18f)
                verticalLineToRelative(dy = -5.71f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.84f, dx2 = -0.36f, dy2 = -1.18f, dx3 = -1.24f, dy3 = -1.18f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
                fillAlpha = 0.4f,
                strokeAlpha = 0.4f,
            ) {
                moveTo(x = 11.2f, y = 8.6f)
                arcToRelative(a = 1.3f, b = 1.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.06f, dy1 = 0.5f)
                horizontalLineToRelative(dx = 2.33f)
                quadToRelative(dx1 = 0.24f, dy1 = 0.0f, dx2 = 0.39f, dy2 = 0.18f)
                arcToRelative(a = 0.6f, b = 0.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.12f, dy1 = 0.44f)
                lineToRelative(dx = -0.29f, dy = 1.86f)
                arcToRelative(a = 1.25f, b = 1.25f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.8f, dy1 = 1.37f)
                arcToRelative(a = 1.2f, b = 1.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.37f, dy1 = -0.44f)
                lineToRelative(dx = 2.39f, dy = -3.55f)
                lineToRelative(dx = 0.07f, dy = -0.12f)
                verticalLineTo(y = 3.82f)
                lineToRelative(dx = -0.09f, dy = -0.1f)
                lineToRelative(dx = -1.8f, dy = -1.38f)
                curveToRelative(dx1 = -0.24f, dy1 = -0.24f, dx2 = -0.78f, dy2 = -0.37f, dx3 = -1.16f, dy3 = -0.37f)
                horizontalLineToRelative(dx = -2.21f)
                arcToRelative(a = 1.8f, b = 1.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.7f, dy1 = 1.27f)
                lineToRelative(dx = -1.4f, dy = 4.25f)
                arcToRelative(a = 1.2f, b = 1.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.12f, dy1 = 1.1f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 20.53f, y = 10.67f)
                horizontalLineToRelative(dx = 0.58f)
                curveToRelative(dx1 = 0.88f, dy1 = 0.0f, dx2 = 1.24f, dy2 = -0.34f, dx3 = 1.24f, dy3 = -1.18f)
                verticalLineTo(y = 3.78f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.84f, dx2 = -0.36f, dy2 = -1.18f, dx3 = -1.24f, dy3 = -1.18f)
                horizontalLineToRelative(dx = -0.58f)
                curveToRelative(dx1 = -0.88f, dy1 = 0.0f, dx2 = -1.24f, dy2 = 0.34f, dx3 = -1.24f, dy3 = 1.18f)
                verticalLineToRelative(dy = 5.7f)
                curveToRelative(dx1 = 0.0f, dy1 = 0.85f, dx2 = 0.36f, dy2 = 1.19f, dx3 = 1.24f, dy3 = 1.19f)
            }
        }.build().also { _likeDislike = it }
    }

@Suppress("ObjectPropertyName")
private var _likeDislike: ImageVector? = null
