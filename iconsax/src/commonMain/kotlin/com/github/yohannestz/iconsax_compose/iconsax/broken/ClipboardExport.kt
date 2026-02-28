package com.github.yohannestz.iconsax_compose.iconsax.broken

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ClipboardExport: ImageVector
    get() {
        val current = _clipboardExport
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.ClipboardExport",
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
                moveTo(x = 3.0f, y = 10.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -4.56f, dx2 = 1.67f, dy2 = -5.8f, dx3 = 5.0f, dy3 = -5.98f)
                moveTo(x = 14.0f, y = 22.0f)
                horizontalLineTo(x = 9.0f)
                curveToRelative(dx1 = -5.0f, dy1 = 0.0f, dx2 = -6.0f, dy2 = -2.0f, dx3 = -6.0f, dy3 = -6.0f)
                verticalLineToRelative(dy = -2.0f)
                moveToRelative(dx = 13.0f, dy = -9.98f)
                curveToRelative(dx1 = 3.33f, dy1 = 0.18f, dx2 = 5.0f, dy2 = 1.41f, dx3 = 5.0f, dy3 = 5.98f)
                verticalLineToRelative(dy = 5.0f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 11.0f, y = 2.0f)
                horizontalLineToRelative(dx = -0.96f)
                curveToRelative(dx1 = -1.0f, dy1 = 0.0f, dx2 = -2.0f, dy2 = 0.0f, dx3 = -2.0f, dy3 = 2.0f)
                reflectiveCurveToRelative(dx1 = 1.0f, dy1 = 2.0f, dx2 = 2.0f, dy2 = 2.0f)
                horizontalLineToRelative(dx = 4.0f)
                curveToRelative(dx1 = 2.0f, dy1 = 0.0f, dx2 = 2.0f, dy2 = -1.0f, dx3 = 2.0f, dy3 = -2.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -2.0f, dx2 = -1.0f, dy2 = -2.0f, dx3 = -2.0f, dy3 = -2.0f)
                moveTo(x = 15.0f, y = 19.0f)
                verticalLineToRelative(dy = -3.0f)
                horizontalLineToRelative(dx = 3.0f)
                moveToRelative(dx = 3.0f, dy = 6.0f)
                lineToRelative(dx = -5.96f, dy = -5.96f)
            }
        }.build().also { _clipboardExport = it }
    }

@Suppress("ObjectPropertyName")
private var _clipboardExport: ImageVector? = null
