package com.github.yohannestz.iconsax_compose.iconsax.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Play: ImageVector
    get() {
        val current = _play
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Play",
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
                moveTo(x = 4.0f, y = 12.0f)
                verticalLineTo(y = 8.44f)
                curveToRelative(dx1 = 0.0f, dy1 = -4.42f, dx2 = 3.13f, dy2 = -6.23f, dx3 = 6.96f, dy3 = -4.02f)
                lineToRelative(dx = 3.09f, dy = 1.78f)
                lineToRelative(dx = 3.09f, dy = 1.78f)
                curveToRelative(dx1 = 3.83f, dy1 = 2.21f, dx2 = 3.83f, dy2 = 5.83f, dx3 = 0.0f, dy3 = 8.04f)
                lineToRelative(dx = -3.09f, dy = 1.78f)
                lineToRelative(dx = -3.09f, dy = 1.78f)
                curveTo(x1 = 7.13f, y1 = 21.79f, x2 = 4.0f, y2 = 19.98f, x3 = 4.0f, y3 = 15.56f)
                close()
            }
        }.build().also { _play = it }
    }

@Suppress("ObjectPropertyName")
private var _play: ImageVector? = null
