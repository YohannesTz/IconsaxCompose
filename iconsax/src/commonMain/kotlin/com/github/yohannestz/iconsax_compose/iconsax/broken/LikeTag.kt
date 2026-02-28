package com.github.yohannestz.iconsax_compose.iconsax.broken

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val LikeTag: ImageVector
    get() {
        val current = _likeTag
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.LikeTag",
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
                moveTo(x = 9.65f, y = 13.8f)
                lineToRelative(dx = 1.61f, dy = 1.25f)
                curveToRelative(dx1 = 0.21f, dy1 = 0.21f, dx2 = 0.68f, dy2 = 0.31f, dx3 = 0.99f, dy3 = 0.31f)
                horizontalLineToRelative(dx = 1.98f)
                curveToRelative(dx1 = 0.62f, dy1 = 0.0f, dx2 = 1.3f, dy2 = -0.47f, dx3 = 1.46f, dy3 = -1.09f)
                lineToRelative(dx = 1.25f, dy = -3.79f)
                curveToRelative(dx1 = 0.26f, dy1 = -0.73f, dx2 = -0.21f, dy2 = -1.35f, dx3 = -0.99f, dy3 = -1.35f)
                horizontalLineToRelative(dx = -2.08f)
                arcToRelative(a = 0.52f, b = 0.52f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.52f, dy1 = -0.62f)
                lineToRelative(dx = 0.26f, dy = -1.66f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.68f, dy1 = -1.14f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.14f, dy1 = 0.36f)
                lineTo(x = 9.66f, y = 9.24f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 7.0f, y = 13.8f)
                verticalLineTo(y = 8.71f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.73f, dx2 = 0.31f, dy2 = -0.99f, dx3 = 1.04f, dy3 = -0.99f)
                horizontalLineToRelative(dx = 0.52f)
                curveToRelative(dx1 = 0.73f, dy1 = 0.0f, dx2 = 1.04f, dy2 = 0.26f, dx3 = 1.04f, dy3 = 1.0f)
                verticalLineToRelative(dy = 5.08f)
                curveToRelative(dx1 = 0.0f, dy1 = 0.73f, dx2 = -0.31f, dy2 = 1.0f, dx3 = -1.04f, dy3 = 1.0f)
                horizontalLineTo(x = 8.04f)
                curveToRelative(dx1 = -0.73f, dy1 = 0.0f, dx2 = -1.04f, dy2 = -0.27f, dx3 = -1.04f, dy3 = -1.0f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 3.0f, y = 4.97f)
                arcTo(horizontalEllipseRadius = 3.0f, verticalEllipseRadius = 3.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 6.0f, y1 = 2.0f)
                horizontalLineToRelative(dx = 12.0f)
                curveToRelative(dx1 = 1.66f, dy1 = 0.0f, dx2 = 3.0f, dy2 = 1.33f, dx3 = 3.0f, dy3 = 2.97f)
                verticalLineToRelative(dy = 10.91f)
                arcToRelative(a = 3.0f, b = 3.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -3.0f, dy1 = 2.97f)
                horizontalLineToRelative(dx = -0.76f)
                arcToRelative(a = 3.0f, b = 3.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -2.12f, dy1 = 0.87f)
                lineToRelative(dx = -1.71f, dy = 1.69f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -2.83f, dy1 = 0.0f)
                lineToRelative(dx = -1.71f, dy = -1.69f)
                arcToRelative(a = 3.0f, b = 3.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -2.12f, dy1 = -0.87f)
                horizontalLineTo(x = 6.0f)
                curveToRelative(dx1 = -1.66f, dy1 = 0.0f, dx2 = -3.0f, dy2 = -1.33f, dx3 = -3.0f, dy3 = -2.97f)
                verticalLineTo(y = 9.07f)
            }
        }.build().also { _likeTag = it }
    }

@Suppress("ObjectPropertyName")
private var _likeTag: ImageVector? = null
