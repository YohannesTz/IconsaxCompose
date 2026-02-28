package com.github.yohannestz.iconsax_compose.iconsax.broken

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val BucketCircle: ImageVector
    get() {
        val current = _bucketCircle
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.BucketCircle",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 9.41f, y = 15.95f)
                lineToRelative(dx = -2.39f, dy = -2.39f)
                quadToRelative(dx1 = -1.2f, dy1 = -1.2f, dx2 = 0.0f, dy2 = -2.39f)
                lineToRelative(dx = 3.99f, dy = -3.99f)
                lineToRelative(dx = 4.39f, dy = 4.39f)
                arcToRelative(a = 0.57f, b = 0.57f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = 0.8f)
                lineToRelative(dx = -3.59f, dy = 3.59f)
                quadToRelative(dx1 = -1.2f, dy1 = 1.19f, dx2 = -2.4f, dy2 = -0.01f)
                moveToRelative(dx = 0.8f, dy = -9.57f)
                lineToRelative(dx = 0.8f, dy = 0.8f)
                moveToRelative(dx = -4.55f, dy = 5.15f)
                lineToRelative(dx = 9.03f, dy = -0.4f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 16.47f, y = 14.17f)
                reflectiveCurveToRelative(dx1 = -1.1f, dy1 = 1.2f, dx2 = -1.1f, dy2 = 1.93f)
                arcToRelative(a = 1.1f, b = 1.1f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.1f, dy1 = 1.1f)
                arcToRelative(a = 1.1f, b = 1.1f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.1f, dy1 = -1.1f)
                curveToRelative(dx1 = 0.01f, dy1 = -0.74f, dx2 = -1.1f, dy2 = -1.93f, dx3 = -1.1f, dy3 = -1.93f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 4.0f, y = 6.0f)
                arcToRelative(a = 10.0f, b = 10.0f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = 3.97f, dy1 = -3.15f)
            }
        }.build().also { _bucketCircle = it }
    }

@Suppress("ObjectPropertyName")
private var _bucketCircle: ImageVector? = null
