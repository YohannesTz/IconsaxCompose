package com.github.yohannestz.iconsax_compose.iconsax.broken

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lifebuoy: ImageVector
    get() {
        val current = _lifebuoy
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Lifebuoy",
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
                moveTo(x = 7.04f, y = 3.3f)
                arcTo(horizontalEllipseRadius = 10.0f, verticalEllipseRadius = 10.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 1.97f, y1 = 12.0f)
                arcToRelative(a = 10.0f, b = 10.0f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = 10.0f, dy1 = -10.0f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 12.0f, y = 16.5f)
                arcToRelative(a = 4.5f, b = 4.5f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = 0.0f, dy1 = -9.0f)
                arcToRelative(a = 4.5f, b = 4.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 9.0f)
                moveTo(x = 4.9f, y = 4.93f)
                lineToRelative(dx = 3.54f, dy = 3.53f)
                moveTo(x = 4.9f, y = 19.07f)
                lineToRelative(dx = 3.54f, dy = -3.53f)
                moveToRelative(dx = 10.61f, dy = 3.53f)
                lineToRelative(dx = -3.54f, dy = -3.53f)
                moveToRelative(dx = 3.54f, dy = -10.61f)
                lineToRelative(dx = -3.54f, dy = 3.53f)
            }
        }.build().also { _lifebuoy = it }
    }

@Suppress("ObjectPropertyName")
private var _lifebuoy: ImageVector? = null
