package com.github.yohannestz.iconsax_compose.iconsax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Refresh: ImageVector
    get() {
        val current = _refresh
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Refresh",
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
                moveTo(x = 22.0f, y = 12.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 5.52f, dx2 = -4.48f, dy2 = 10.0f, dx3 = -10.0f, dy3 = 10.0f)
                reflectiveCurveToRelative(dx1 = -8.89f, dy1 = -5.56f, dx2 = -8.89f, dy2 = -5.56f)
                moveToRelative(dx = 0.0f, dy = 0.0f)
                horizontalLineToRelative(dx = 4.52f)
                moveToRelative(dx = -4.52f, dy = 0.0f)
                verticalLineToRelative(dy = 5.0f)
                moveTo(x = 2.0f, y = 12.0f)
                curveTo(x1 = 2.0f, y1 = 6.48f, x2 = 6.44f, y2 = 2.0f, x3 = 12.0f, y3 = 2.0f)
                curveToRelative(dx1 = 6.67f, dy1 = 0.0f, dx2 = 10.0f, dy2 = 5.56f, dx3 = 10.0f, dy3 = 5.56f)
                moveToRelative(dx = 0.0f, dy = 0.0f)
                verticalLineToRelative(dy = -5.0f)
                moveToRelative(dx = 0.0f, dy = 5.0f)
                horizontalLineToRelative(dx = -4.44f)
            }
        }.build().also { _refresh = it }
    }

@Suppress("ObjectPropertyName")
private var _refresh: ImageVector? = null
