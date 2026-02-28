package com.github.yohannestz.iconsax_compose.iconsax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Triangle: ImageVector
    get() {
        val current = _triangle
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Triangle",
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
                moveTo(x = 12.0f, y = 21.41f)
                horizontalLineTo(x = 5.94f)
                curveToRelative(dx1 = -3.47f, dy1 = 0.0f, dx2 = -4.92f, dy2 = -2.48f, dx3 = -3.24f, dy3 = -5.51f)
                lineToRelative(dx = 3.12f, dy = -5.62f)
                lineTo(x = 8.76f, y = 5.0f)
                curveToRelative(dx1 = 1.78f, dy1 = -3.21f, dx2 = 4.7f, dy2 = -3.21f, dx3 = 6.48f, dy3 = 0.0f)
                lineToRelative(dx = 2.94f, dy = 5.29f)
                lineToRelative(dx = 3.12f, dy = 5.62f)
                curveToRelative(dx1 = 1.68f, dy1 = 3.03f, dx2 = 0.22f, dy2 = 5.51f, dx3 = -3.24f, dy3 = 5.51f)
                horizontalLineTo(x = 12.0f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 21.44f, y = 20.0f)
                lineTo(x = 12.0f, y = 13.39f)
                lineTo(x = 2.56f, y = 20.0f)
                moveTo(x = 12.0f, y = 3.0f)
                verticalLineToRelative(dy = 10.39f)
            }
        }.build().also { _triangle = it }
    }

@Suppress("ObjectPropertyName")
private var _triangle: ImageVector? = null
