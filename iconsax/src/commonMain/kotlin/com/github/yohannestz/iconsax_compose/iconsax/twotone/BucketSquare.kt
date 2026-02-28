package com.github.yohannestz.iconsax_compose.iconsax.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val BucketSquare: ImageVector
    get() {
        val current = _bucketSquare
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.BucketSquare",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 8.94f, y = 16.93f)
                lineTo(x = 6.11f, y = 14.1f)
                quadToRelative(dx1 = -1.41f, dy1 = -1.42f, dx2 = 0.0f, dy2 = -2.83f)
                lineToRelative(dx = 4.72f, dy = -4.72f)
                lineToRelative(dx = 5.19f, dy = 5.19f)
                arcToRelative(a = 0.66f, b = 0.66f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = 0.94f)
                lineToRelative(dx = -4.25f, dy = 4.25f)
                quadToRelative(dx1 = -1.41f, dy1 = 1.41f, dx2 = -2.83f, dy2 = 0.0f)
                moveTo(x = 9.88f, y = 5.6f)
                lineToRelative(dx = 0.95f, dy = 0.94f)
                moveToRelative(dx = -5.39f, dy = 6.1f)
                lineToRelative(dx = 10.69f, dy = -0.47f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 17.3f, y = 14.81f)
                reflectiveCurveToRelative(dx1 = -1.31f, dy1 = 1.42f, dx2 = -1.31f, dy2 = 2.3f)
                arcToRelative(a = 1.3f, b = 1.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.31f, dy1 = 1.3f)
                arcToRelative(a = 1.3f, b = 1.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.31f, dy1 = -1.3f)
                curveToRelative(dx1 = -0.01f, dy1 = -0.88f, dx2 = -1.31f, dy2 = -2.3f, dx3 = -1.31f, dy3 = -2.3f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 22.0f, y = 15.0f)
                verticalLineTo(y = 9.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -5.0f, dx2 = -2.0f, dy2 = -7.0f, dx3 = -7.0f, dy3 = -7.0f)
                horizontalLineTo(x = 9.0f)
                curveTo(x1 = 4.0f, y1 = 2.0f, x2 = 2.0f, y2 = 4.0f, x3 = 2.0f, y3 = 9.0f)
                verticalLineToRelative(dy = 6.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 5.0f, dx2 = 2.0f, dy2 = 7.0f, dx3 = 7.0f, dy3 = 7.0f)
                horizontalLineToRelative(dx = 6.0f)
                curveToRelative(dx1 = 5.0f, dy1 = 0.0f, dx2 = 7.0f, dy2 = -2.0f, dx3 = 7.0f, dy3 = -7.0f)
            }
        }.build().also { _bucketSquare = it }
    }

@Suppress("ObjectPropertyName")
private var _bucketSquare: ImageVector? = null
