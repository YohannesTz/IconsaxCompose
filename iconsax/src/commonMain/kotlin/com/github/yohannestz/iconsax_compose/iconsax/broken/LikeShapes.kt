package com.github.yohannestz.iconsax_compose.iconsax.broken

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
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 9.89f, y = 14.82f)
                lineToRelative(dx = 1.45f, dy = 1.12f)
                curveToRelative(dx1 = 0.19f, dy1 = 0.19f, dx2 = 0.61f, dy2 = 0.28f, dx3 = 0.89f, dy3 = 0.28f)
                horizontalLineTo(x = 14.0f)
                curveToRelative(dx1 = 0.56f, dy1 = 0.0f, dx2 = 1.17f, dy2 = -0.42f, dx3 = 1.31f, dy3 = -0.98f)
                lineToRelative(dx = 1.12f, dy = -3.42f)
                curveToRelative(dx1 = 0.23f, dy1 = -0.65f, dx2 = -0.19f, dy2 = -1.22f, dx3 = -0.89f, dy3 = -1.22f)
                horizontalLineToRelative(dx = -1.87f)
                curveToRelative(dx1 = -0.28f, dy1 = 0.0f, dx2 = -0.51f, dy2 = -0.23f, dx3 = -0.47f, dy3 = -0.56f)
                lineToRelative(dx = 0.23f, dy = -1.5f)
                arcToRelative(a = 0.9f, b = 0.9f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.61f, dy1 = -1.03f)
                arcToRelative(a = 0.9f, b = 0.9f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.03f, dy1 = 0.33f)
                lineToRelative(dx = -1.92f, dy = 2.85f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
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
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 14.66f, y = 20.01f)
                lineToRelative(dx = -1.52f, dy = 1.52f)
                arcToRelative(a = 1.6f, b = 1.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -2.26f, dy1 = 0.0f)
                lineToRelative(dx = -1.52f, dy = -1.52f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.13f, dy1 = -0.47f)
                horizontalLineTo(x = 6.08f)
                arcToRelative(a = 1.6f, b = 1.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.6f, dy1 = -1.6f)
                verticalLineToRelative(dy = -2.15f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.47f, dy1 = -1.13f)
                lineToRelative(dx = -1.52f, dy = -1.52f)
                arcToRelative(a = 1.6f, b = 1.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = -2.26f)
                lineToRelative(dx = 1.52f, dy = -1.52f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.47f, dy1 = -1.13f)
                verticalLineTo(y = 6.08f)
                arcToRelative(a = 1.6f, b = 1.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.6f, dy1 = -1.6f)
                moveToRelative(dx = 3.26f, dy = -0.5f)
                lineToRelative(dx = 1.52f, dy = -1.51f)
                arcToRelative(a = 1.6f, b = 1.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 2.26f, dy1 = 0.0f)
                lineToRelative(dx = 1.52f, dy = 1.52f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.13f, dy1 = 0.47f)
                horizontalLineToRelative(dx = 2.15f)
                arcToRelative(a = 1.6f, b = 1.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.6f, dy1 = 1.6f)
                verticalLineTo(y = 8.2f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.47f, dy1 = 1.13f)
                lineToRelative(dx = 1.52f, dy = 1.52f)
                arcToRelative(a = 1.6f, b = 1.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = 2.26f)
                lineToRelative(dx = -1.52f, dy = 1.52f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.47f, dy1 = 1.13f)
                verticalLineToRelative(dy = 2.15f)
                arcToRelative(a = 1.6f, b = 1.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.6f, dy1 = 1.6f)
            }
        }.build().also { _likeShapes = it }
    }

@Suppress("ObjectPropertyName")
private var _likeShapes: ImageVector? = null
