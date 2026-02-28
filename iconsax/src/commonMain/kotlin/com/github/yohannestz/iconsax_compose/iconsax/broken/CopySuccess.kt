package com.github.yohannestz.iconsax_compose.iconsax.broken

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val CopySuccess: ImageVector
    get() {
        val current = _copySuccess
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.CopySuccess",
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
                moveTo(x = 22.0f, y = 6.9f)
                curveTo(x1 = 22.0f, y1 = 3.4f, x2 = 20.6f, y2 = 2.0f, x3 = 17.1f, y3 = 2.0f)
                horizontalLineToRelative(dx = -4.2f)
                curveTo(x1 = 9.4f, y1 = 2.0f, x2 = 8.0f, y2 = 3.4f, x3 = 8.0f, y3 = 6.9f)
                verticalLineTo(y = 8.0f)
                horizontalLineToRelative(dx = 3.1f)
                curveToRelative(dx1 = 3.5f, dy1 = 0.0f, dx2 = 4.9f, dy2 = 1.4f, dx3 = 4.9f, dy3 = 4.9f)
                verticalLineTo(y = 16.0f)
                horizontalLineToRelative(dx = 1.1f)
                curveToRelative(dx1 = 3.5f, dy1 = 0.0f, dx2 = 4.9f, dy2 = -1.4f, dx3 = 4.9f, dy3 = -4.9f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 2.0f, y = 17.1f)
                curveTo(x1 = 2.0f, y1 = 20.6f, x2 = 3.4f, y2 = 22.0f, x3 = 6.9f, y3 = 22.0f)
                horizontalLineToRelative(dx = 4.2f)
                curveToRelative(dx1 = 3.5f, dy1 = 0.0f, dx2 = 4.9f, dy2 = -1.4f, dx3 = 4.9f, dy3 = -4.9f)
                verticalLineToRelative(dy = -4.2f)
                curveTo(x1 = 16.0f, y1 = 9.4f, x2 = 14.6f, y2 = 8.0f, x3 = 11.1f, y3 = 8.0f)
                horizontalLineTo(x = 6.9f)
                curveTo(x1 = 3.4f, y1 = 8.0f, x2 = 2.0f, y2 = 9.4f, x3 = 2.0f, y3 = 12.9f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 6.08f, y = 15.0f)
                lineToRelative(dx = 1.95f, dy = 1.95f)
                lineToRelative(dx = 3.89f, dy = -3.9f)
            }
        }.build().also { _copySuccess = it }
    }

@Suppress("ObjectPropertyName")
private var _copySuccess: ImageVector? = null
