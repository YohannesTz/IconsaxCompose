package com.github.yohannestz.iconsax_compose.iconsax.broken

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val CpuCharge: ImageVector
    get() {
        val current = _cpuCharge
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.CpuCharge",
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
                moveTo(x = 9.6f, y = 20.0f)
                horizontalLineToRelative(dx = 4.8f)
                curveToRelative(dx1 = 4.0f, dy1 = 0.0f, dx2 = 5.6f, dy2 = -1.6f, dx3 = 5.6f, dy3 = -5.6f)
                verticalLineTo(y = 9.6f)
                curveToRelative(dx1 = 0.0f, dy1 = -4.0f, dx2 = -1.6f, dy2 = -5.6f, dx3 = -5.6f, dy3 = -5.6f)
                horizontalLineTo(x = 9.6f)
                curveTo(x1 = 5.6f, y1 = 4.0f, x2 = 4.0f, y2 = 5.6f, x3 = 4.0f, y3 = 9.6f)
                verticalLineToRelative(dy = 4.8f)
                curveToRelative(dx1 = 0.0f, dy1 = 4.0f, dx2 = 1.6f, dy2 = 5.6f, dx3 = 5.6f, dy3 = 5.6f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 7.0f, y = 10.5f)
                verticalLineToRelative(dy = 3.0f)
                curveTo(x1 = 7.0f, y1 = 16.0f, x2 = 8.0f, y2 = 17.0f, x3 = 10.5f, y3 = 17.0f)
                horizontalLineToRelative(dx = 3.0f)
                curveToRelative(dx1 = 2.5f, dy1 = 0.0f, dx2 = 3.5f, dy2 = -1.0f, dx3 = 3.5f, dy3 = -3.5f)
                verticalLineToRelative(dy = -3.0f)
                curveTo(x1 = 17.0f, y1 = 8.0f, x2 = 16.0f, y2 = 7.0f, x3 = 13.5f, y3 = 7.0f)
                horizontalLineToRelative(dx = -3.0f)
                moveTo(x = 8.01f, y = 4.0f)
                verticalLineTo(y = 2.0f)
                moveTo(x = 12.0f, y = 4.0f)
                verticalLineTo(y = 2.0f)
                moveToRelative(dx = 4.0f, dy = 2.0f)
                verticalLineTo(y = 2.0f)
                moveToRelative(dx = 4.0f, dy = 6.0f)
                horizontalLineToRelative(dx = 2.0f)
                moveToRelative(dx = -2.0f, dy = 4.0f)
                horizontalLineToRelative(dx = 2.0f)
                moveToRelative(dx = -2.0f, dy = 4.0f)
                horizontalLineToRelative(dx = 2.0f)
                moveToRelative(dx = -6.0f, dy = 4.0f)
                verticalLineToRelative(dy = 2.0f)
                moveToRelative(dx = -3.99f, dy = -2.0f)
                verticalLineToRelative(dy = 2.0f)
                moveToRelative(dx = -4.0f, dy = -2.0f)
                verticalLineToRelative(dy = 2.0f)
                moveTo(x = 2.0f, y = 8.0f)
                horizontalLineToRelative(dx = 2.0f)
                moveToRelative(dx = -2.0f, dy = 4.0f)
                horizontalLineToRelative(dx = 2.0f)
                moveToRelative(dx = -2.0f, dy = 4.0f)
                horizontalLineToRelative(dx = 2.0f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 12.0f, y = 9.7f)
                lineToRelative(dx = -0.94f, dy = 1.64f)
                curveTo(x1 = 10.85f, y1 = 11.7f, x2 = 11.02f, y2 = 12.0f, x3 = 11.44f, y3 = 12.0f)
                horizontalLineToRelative(dx = 1.12f)
                curveToRelative(dx1 = 0.42f, dy1 = 0.0f, dx2 = 0.59f, dy2 = 0.3f, dx3 = 0.38f, dy3 = 0.66f)
                lineTo(x = 12.0f, y = 14.3f)
            }
        }.build().also { _cpuCharge = it }
    }

@Suppress("ObjectPropertyName")
private var _cpuCharge: ImageVector? = null
