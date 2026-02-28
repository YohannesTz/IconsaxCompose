package com.github.yohannestz.iconsax_compose.iconsax.broken

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val RepeateOne: ImageVector
    get() {
        val current = _repeateOne
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.RepeateOne",
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
                moveTo(x = 8.5f, y = 5.32f)
                arcToRelative(a = 6.53f, b = 6.53f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -4.59f, dy1 = 11.12f)
                moveTo(x = 14.0f, y = 3.0f)
                lineToRelative(dx = 2.44f, dy = 2.34f)
                lineToRelative(dx = -3.51f, dy = -0.01f)
                moveTo(x = 10.0f, y = 21.0f)
                lineToRelative(dx = -2.44f, dy = -2.34f)
                lineToRelative(dx = 7.95f, dy = 0.02f)
                arcTo(horizontalEllipseRadius = 6.53f, verticalEllipseRadius = 6.53f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 20.1f, y1 = 7.56f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 12.25f, y = 14.67f)
                verticalLineTo(y = 9.33f)
                lineTo(x = 10.75f, y = 11.0f)
            }
        }.build().also { _repeateOne = it }
    }

@Suppress("ObjectPropertyName")
private var _repeateOne: ImageVector? = null
