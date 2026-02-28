package com.github.yohannestz.iconsax_compose.iconsax.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ExportCurve: ImageVector
    get() {
        val current = _exportCurve
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.ExportCurve",
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
                moveTo(x = 16.44f, y = 8.9f)
                curveToRelative(dx1 = 3.6f, dy1 = 0.31f, dx2 = 5.07f, dy2 = 2.16f, dx3 = 5.07f, dy3 = 6.21f)
                verticalLineToRelative(dy = 0.13f)
                curveToRelative(dx1 = 0.0f, dy1 = 4.47f, dx2 = -1.79f, dy2 = 6.26f, dx3 = -6.26f, dy3 = 6.26f)
                horizontalLineTo(x = 8.74f)
                curveToRelative(dx1 = -4.47f, dy1 = 0.0f, dx2 = -6.26f, dy2 = -1.79f, dx3 = -6.26f, dy3 = -6.26f)
                verticalLineToRelative(dy = -0.13f)
                curveToRelative(dx1 = 0.0f, dy1 = -4.02f, dx2 = 1.45f, dy2 = -5.87f, dx3 = 4.99f, dy3 = -6.2f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 12.0f, y = 15.0f)
                verticalLineTo(y = 3.62f)
                moveToRelative(dx = 3.35f, dy = 2.23f)
                lineTo(x = 12.0f, y = 2.5f)
                lineTo(x = 8.65f, y = 5.85f)
            }
        }.build().also { _exportCurve = it }
    }

@Suppress("ObjectPropertyName")
private var _exportCurve: ImageVector? = null
