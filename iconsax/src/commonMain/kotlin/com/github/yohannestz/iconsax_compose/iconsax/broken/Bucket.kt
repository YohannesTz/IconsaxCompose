package com.github.yohannestz.iconsax_compose.iconsax.broken

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bucket: ImageVector
    get() {
        val current = _bucket
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Bucket",
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
                moveTo(x = 9.69f, y = 3.29f)
                lineToRelative(dx = 7.35f, dy = 7.35f)
                arcToRelative(a = 0.95f, b = 0.95f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = 1.34f)
                lineTo(x = 11.02f, y = 18.0f)
                quadToRelative(dx1 = -2.0f, dy1 = 2.01f, dx2 = -4.01f, dy2 = 0.0f)
                lineTo(x = 3.0f, y = 13.99f)
                quadToRelative(dx1 = -2.01f, dy1 = -2.0f, dx2 = 0.0f, dy2 = -4.01f)
                lineToRelative(dx = 4.31f, dy = -4.31f)
                moveToRelative(dx = 1.04f, dy = -3.72f)
                lineToRelative(dx = 1.34f, dy = 1.34f)
                moveToRelative(dx = -7.62f, dy = 8.63f)
                lineToRelative(dx = 15.12f, dy = -0.66f)
                moveTo(x = 3.0f, y = 22.0f)
                horizontalLineToRelative(dx = 7.0f)
                moveToRelative(dx = 3.0f, dy = 0.0f)
                horizontalLineToRelative(dx = 3.0f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 18.85f, y = 15.0f)
                reflectiveCurveTo(x1 = 17.0f, y1 = 17.01f, x2 = 17.0f, y2 = 18.24f)
                arcToRelative(a = 1.85f, b = 1.85f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 3.7f, dy1 = 0.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -1.23f, dx2 = -1.85f, dy2 = -3.24f, dx3 = -1.85f, dy3 = -3.24f)
            }
        }.build().also { _bucket = it }
    }

@Suppress("ObjectPropertyName")
private var _bucket: ImageVector? = null
