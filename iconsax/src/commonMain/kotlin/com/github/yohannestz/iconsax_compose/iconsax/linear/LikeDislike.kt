package com.github.yohannestz.iconsax_compose.iconsax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
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
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 4.92f, y = 20.28f)
                lineToRelative(dx = 1.77f, dy = 1.37f)
                curveToRelative(dx1 = 0.23f, dy1 = 0.23f, dx2 = 0.74f, dy2 = 0.34f, dx3 = 1.09f, dy3 = 0.34f)
                horizontalLineToRelative(dx = 2.17f)
                curveToRelative(dx1 = 0.69f, dy1 = 0.0f, dx2 = 1.43f, dy2 = -0.51f, dx3 = 1.6f, dy3 = -1.2f)
                lineToRelative(dx = 1.37f, dy = -4.17f)
                curveToRelative(dx1 = 0.29f, dy1 = -0.8f, dx2 = -0.23f, dy2 = -1.49f, dx3 = -1.09f, dy3 = -1.49f)
                horizontalLineTo(x = 9.54f)
                arcToRelative(a = 0.58f, b = 0.58f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.57f, dy1 = -0.69f)
                lineToRelative(dx = 0.29f, dy = -1.83f)
                arcToRelative(a = 1.14f, b = 1.14f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.74f, dy1 = -1.26f)
                arcToRelative(a = 1.15f, b = 1.15f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.26f, dy1 = 0.4f)
                lineToRelative(dx = -2.34f, dy = 3.49f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 2.0f, y = 20.28f)
                verticalLineToRelative(dy = -5.6f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.8f, dx2 = 0.34f, dy2 = -1.09f, dx3 = 1.14f, dy3 = -1.09f)
                horizontalLineToRelative(dx = 0.57f)
                curveToRelative(dx1 = 0.8f, dy1 = 0.0f, dx2 = 1.14f, dy2 = 0.29f, dx3 = 1.14f, dy3 = 1.09f)
                verticalLineToRelative(dy = 5.6f)
                curveToRelative(dx1 = 0.0f, dy1 = 0.8f, dx2 = -0.34f, dy2 = 1.09f, dx3 = -1.14f, dy3 = 1.09f)
                horizontalLineTo(x = 3.14f)
                curveToRelative(dx1 = -0.8f, dy1 = 0.0f, dx2 = -1.14f, dy2 = -0.28f, dx3 = -1.14f, dy3 = -1.09f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 19.08f, y = 3.72f)
                lineToRelative(dx = -1.77f, dy = -1.37f)
                curveToRelative(dx1 = -0.23f, dy1 = -0.23f, dx2 = -0.74f, dy2 = -0.34f, dx3 = -1.09f, dy3 = -0.34f)
                horizontalLineToRelative(dx = -2.17f)
                curveToRelative(dx1 = -0.69f, dy1 = 0.0f, dx2 = -1.43f, dy2 = 0.51f, dx3 = -1.6f, dy3 = 1.2f)
                lineToRelative(dx = -1.37f, dy = 4.17f)
                curveToRelative(dx1 = -0.29f, dy1 = 0.8f, dx2 = 0.23f, dy2 = 1.49f, dx3 = 1.09f, dy3 = 1.49f)
                horizontalLineToRelative(dx = 2.29f)
                arcToRelative(a = 0.58f, b = 0.58f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.57f, dy1 = 0.69f)
                lineToRelative(dx = -0.29f, dy = 1.83f)
                arcToRelative(a = 1.14f, b = 1.14f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.74f, dy1 = 1.26f)
                arcToRelative(a = 1.15f, b = 1.15f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.26f, dy1 = -0.4f)
                lineToRelative(dx = 2.34f, dy = -3.49f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 22.0f, y = 3.72f)
                verticalLineToRelative(dy = 5.6f)
                curveToRelative(dx1 = 0.0f, dy1 = 0.8f, dx2 = -0.34f, dy2 = 1.09f, dx3 = -1.14f, dy3 = 1.09f)
                horizontalLineToRelative(dx = -0.57f)
                curveToRelative(dx1 = -0.8f, dy1 = 0.0f, dx2 = -1.14f, dy2 = -0.29f, dx3 = -1.14f, dy3 = -1.09f)
                verticalLineToRelative(dy = -5.6f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.8f, dx2 = 0.34f, dy2 = -1.09f, dx3 = 1.14f, dy3 = -1.09f)
                horizontalLineToRelative(dx = 0.57f)
                curveToRelative(dx1 = 0.8f, dy1 = 0.0f, dx2 = 1.14f, dy2 = 0.28f, dx3 = 1.14f, dy3 = 1.09f)
            }
        }.build().also { _likeDislike = it }
    }

@Suppress("ObjectPropertyName")
private var _likeDislike: ImageVector? = null
