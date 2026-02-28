package com.github.yohannestz.iconsax_compose.iconsax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Stop: ImageVector
    get() {
        val current = _stop
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Stop",
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
                moveTo(x = 9.3f, y = 21.0f)
                horizontalLineToRelative(dx = 5.4f)
                curveToRelative(dx1 = 4.5f, dy1 = 0.0f, dx2 = 6.3f, dy2 = -1.8f, dx3 = 6.3f, dy3 = -6.3f)
                verticalLineTo(y = 9.3f)
                curveTo(x1 = 21.0f, y1 = 4.8f, x2 = 19.2f, y2 = 3.0f, x3 = 14.7f, y3 = 3.0f)
                horizontalLineTo(x = 9.3f)
                curveTo(x1 = 4.8f, y1 = 3.0f, x2 = 3.0f, y2 = 4.8f, x3 = 3.0f, y3 = 9.3f)
                verticalLineToRelative(dy = 5.4f)
                curveTo(x1 = 3.0f, y1 = 19.2f, x2 = 4.8f, y2 = 21.0f, x3 = 9.3f, y3 = 21.0f)
            }
        }.build().also { _stop = it }
    }

@Suppress("ObjectPropertyName")
private var _stop: ImageVector? = null
