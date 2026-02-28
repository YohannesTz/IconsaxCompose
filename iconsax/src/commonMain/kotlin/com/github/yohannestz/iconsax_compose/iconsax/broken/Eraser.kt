package com.github.yohannestz.iconsax_compose.iconsax.broken

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Eraser: ImageVector
    get() {
        val current = _eraser
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Eraser",
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
                moveTo(x = 9.0f, y = 22.0f)
                horizontalLineToRelative(dx = 12.0f)
                moveToRelative(dx = 0.09f, dy = -11.34f)
                arcToRelative(a = 3.0f, b = 3.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = -4.24f)
                lineTo(x = 17.58f, y = 2.9f)
                arcToRelative(a = 3.0f, b = 3.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -4.24f, dy1 = 0.0f)
                lineTo(x = 2.91f, y = 13.34f)
                arcToRelative(a = 3.0f, b = 3.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 4.24f)
                lineToRelative(dx = 3.51f, dy = 3.5f)
                arcToRelative(a = 3.0f, b = 3.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 4.24f, dy1 = 0.0f)
                lineToRelative(dx = 7.08f, dy = -7.07f)
                moveTo(x = 7.12f, y = 9.13f)
                lineToRelative(dx = 7.75f, dy = 7.75f)
                moveTo(x = 3.52f, y = 17.66f)
                lineTo(x = 9.17f, y = 12.0f)
                moveToRelative(dx = -2.83f, dy = 8.49f)
                lineTo(x = 12.0f, y = 14.83f)
            }
        }.build().also { _eraser = it }
    }

@Suppress("ObjectPropertyName")
private var _eraser: ImageVector? = null
