package com.github.yohannestz.iconsax_compose.iconsax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Send: ImageVector
    get() {
        val current = _send
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Send",
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
                moveTo(x = 9.51f, y = 4.23f)
                lineToRelative(dx = 8.56f, dy = 4.28f)
                curveToRelative(dx1 = 3.84f, dy1 = 1.92f, dx2 = 3.84f, dy2 = 5.06f, dx3 = 0.0f, dy3 = 6.98f)
                lineToRelative(dx = -8.56f, dy = 4.28f)
                curveToRelative(dx1 = -5.76f, dy1 = 2.88f, dx2 = -8.11f, dy2 = 0.52f, dx3 = -5.23f, dy3 = -5.23f)
                lineToRelative(dx = 0.87f, dy = -1.73f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = -1.61f)
                lineTo(x = 4.28f, y = 9.46f)
                curveTo(x1 = 1.4f, y1 = 3.71f, x2 = 3.76f, y2 = 1.35f, x3 = 9.51f, y3 = 4.23f)
                moveTo(x = 5.44f, y = 12.0f)
                horizontalLineToRelative(dx = 5.4f)
            }
        }.build().also { _send = it }
    }

@Suppress("ObjectPropertyName")
private var _send: ImageVector? = null
