package com.github.yohannestz.iconsax_compose.iconsax.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val LikeShapes: ImageVector
    get() {
        val current = _likeShapes
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.LikeShapes",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 10.75f, y = 2.45f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 2.52f, dy1 = 0.0f)
                lineToRelative(dx = 1.58f, dy = 1.36f)
                arcToRelative(a = 2.2f, b = 2.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.26f, dy1 = 0.47f)
                horizontalLineToRelative(dx = 1.7f)
                arcToRelative(a = 1.94f, b = 1.94f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.93f, dy1 = 1.93f)
                verticalLineToRelative(dy = 1.7f)
                arcToRelative(a = 2.2f, b = 2.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.47f, dy1 = 1.26f)
                lineToRelative(dx = 1.36f, dy = 1.58f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = 2.52f)
                lineToRelative(dx = -1.36f, dy = 1.58f)
                arcToRelative(a = 2.2f, b = 2.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.47f, dy1 = 1.26f)
                verticalLineToRelative(dy = 1.7f)
                arcToRelative(a = 1.94f, b = 1.94f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.93f, dy1 = 1.93f)
                horizontalLineToRelative(dx = -1.7f)
                arcToRelative(a = 2.2f, b = 2.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.26f, dy1 = 0.47f)
                lineToRelative(dx = -1.58f, dy = 1.36f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -2.52f, dy1 = 0.0f)
                lineToRelative(dx = -1.58f, dy = -1.36f)
                arcToRelative(a = 2.2f, b = 2.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.26f, dy1 = -0.47f)
                horizontalLineTo(x = 6.18f)
                arcToRelative(a = 1.94f, b = 1.94f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.93f, dy1 = -1.93f)
                verticalLineTo(y = 16.1f)
                arcToRelative(a = 2.3f, b = 2.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.46f, dy1 = -1.25f)
                lineToRelative(dx = -1.35f, dy = -1.59f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = -2.5f)
                lineToRelative(dx = 1.35f, dy = -1.59f)
                arcToRelative(a = 2.3f, b = 2.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.46f, dy1 = -1.25f)
                verticalLineTo(y = 6.21f)
                arcToRelative(a = 1.94f, b = 1.94f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.93f, dy1 = -1.93f)
                horizontalLineToRelative(dx = 1.73f)
                arcToRelative(a = 2.2f, b = 2.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.26f, dy1 = -0.47f)
                close()
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 9.9f, y = 14.82f)
                lineToRelative(dx = 1.44f, dy = 1.12f)
                curveToRelative(dx1 = 0.2f, dy1 = 0.19f, dx2 = 0.61f, dy2 = 0.28f, dx3 = 0.9f, dy3 = 0.28f)
                horizontalLineTo(x = 14.0f)
                curveToRelative(dx1 = 0.56f, dy1 = 0.0f, dx2 = 1.17f, dy2 = -0.42f, dx3 = 1.31f, dy3 = -0.98f)
                lineToRelative(dx = 1.12f, dy = -3.42f)
                curveToRelative(dx1 = 0.23f, dy1 = -0.65f, dx2 = -0.19f, dy2 = -1.22f, dx3 = -0.89f, dy3 = -1.22f)
                horizontalLineToRelative(dx = -1.87f)
                curveToRelative(dx1 = -0.28f, dy1 = 0.0f, dx2 = -0.5f, dy2 = -0.23f, dx3 = -0.47f, dy3 = -0.56f)
                lineToRelative(dx = 0.23f, dy = -1.5f)
                arcToRelative(a = 0.9f, b = 0.9f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.6f, dy1 = -1.03f)
                arcToRelative(a = 0.9f, b = 0.9f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.04f, dy1 = 0.33f)
                lineToRelative(dx = -1.92f, dy = 2.85f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 7.5f, y = 14.82f)
                verticalLineToRelative(dy = -4.58f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.66f, dx2 = 0.28f, dy2 = -0.9f, dx3 = 0.94f, dy3 = -0.9f)
                horizontalLineToRelative(dx = 0.47f)
                curveToRelative(dx1 = 0.65f, dy1 = 0.0f, dx2 = 0.94f, dy2 = 0.24f, dx3 = 0.94f, dy3 = 0.9f)
                verticalLineToRelative(dy = 4.58f)
                curveToRelative(dx1 = 0.0f, dy1 = 0.65f, dx2 = -0.28f, dy2 = 0.89f, dx3 = -0.94f, dy3 = 0.89f)
                horizontalLineTo(x = 8.44f)
                curveToRelative(dx1 = -0.66f, dy1 = 0.0f, dx2 = -0.94f, dy2 = -0.23f, dx3 = -0.94f, dy3 = -0.9f)
            }
        }.build().also { _likeShapes = it }
    }

@Suppress("ObjectPropertyName")
private var _likeShapes: ImageVector? = null
