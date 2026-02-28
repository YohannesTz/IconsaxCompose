package com.github.yohannestz.iconsax_compose.iconsax.broken

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val GasStation: ImageVector
    get() {
        val current = _gasStation
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.GasStation",
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
                moveTo(x = 3.5f, y = 5.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -2.0f, dx2 = 1.34f, dy2 = -3.0f, dx3 = 3.0f, dy3 = -3.0f)
                horizontalLineToRelative(dx = 8.0f)
                curveToRelative(dx1 = 1.66f, dy1 = 0.0f, dx2 = 3.0f, dy2 = 1.0f, dx3 = 3.0f, dy3 = 3.0f)
                verticalLineToRelative(dy = 17.0f)
                horizontalLineToRelative(dx = -14.0f)
                verticalLineTo(y = 9.0f)
                moveTo(x = 2.0f, y = 22.0f)
                horizontalLineToRelative(dx = 17.0f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 8.39f, y = 10.0f)
                horizontalLineToRelative(dx = 4.23f)
                curveToRelative(dx1 = 1.04f, dy1 = 0.0f, dx2 = 1.89f, dy2 = -0.5f, dx3 = 1.89f, dy3 = -1.9f)
                verticalLineTo(y = 6.89f)
                curveToRelative(dx1 = 0.0f, dy1 = -1.4f, dx2 = -0.85f, dy2 = -1.9f, dx3 = -1.89f, dy3 = -1.9f)
                horizontalLineTo(x = 8.39f)
                curveToRelative(dx1 = -1.04f, dy1 = 0.0f, dx2 = -1.89f, dy2 = 0.5f, dx3 = -1.89f, dy3 = 1.9f)
                verticalLineTo(y = 8.1f)
                curveTo(x1 = 6.5f, y1 = 9.5f, x2 = 7.35f, y2 = 10.0f, x3 = 8.39f, y3 = 10.0f)
                moveTo(x = 6.5f, y = 13.0f)
                horizontalLineToRelative(dx = 3.0f)
                moveToRelative(dx = 8.0f, dy = 3.01f)
                lineTo(x = 22.0f, y = 16.0f)
                verticalLineToRelative(dy = -6.0f)
                lineToRelative(dx = -2.0f, dy = -1.0f)
            }
        }.build().also { _gasStation = it }
    }

@Suppress("ObjectPropertyName")
private var _gasStation: ImageVector? = null
