package com.github.yohannestz.iconsax_compose.iconsax.broken

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val RepeateMusic: ImageVector
    get() {
        val current = _repeateMusic
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.RepeateMusic",
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
                moveTo(x = 10.0f, y = 21.0f)
                lineToRelative(dx = -2.44f, dy = -2.34f)
                lineToRelative(dx = 7.95f, dy = 0.02f)
                arcTo(horizontalEllipseRadius = 6.53f, verticalEllipseRadius = 6.53f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 20.1f, y1 = 7.56f)
                moveTo(x = 9.0f, y = 12.0f)
                horizontalLineToRelative(dx = 6.0f)
                moveTo(x = 8.56f, y = 4.98f)
                arcToRelative(a = 6.53f, b = 6.53f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -4.6f, dy1 = 11.12f)
                moveToRelative(dx = 10.1f, dy = -13.44f)
                lineTo(x = 16.5f, y = 5.0f)
                lineToRelative(dx = -3.51f, dy = -0.01f)
            }
        }.build().also { _repeateMusic = it }
    }

@Suppress("ObjectPropertyName")
private var _repeateMusic: ImageVector? = null
