package com.github.yohannestz.iconsax_compose.iconsax.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MonitorMobbile: ImageVector
    get() {
        val current = _monitorMobbile
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.MonitorMobbile",
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
                moveTo(x = 10.0f, y = 16.95f)
                horizontalLineTo(x = 6.21f)
                curveToRelative(dx1 = -3.37f, dy1 = 0.0f, dx2 = -4.21f, dy2 = -0.84f, dx3 = -4.21f, dy3 = -4.2f)
                verticalLineToRelative(dy = -6.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -3.38f, dx2 = 0.84f, dy2 = -4.22f, dx3 = 4.21f, dy3 = -4.22f)
                horizontalLineToRelative(dx = 10.53f)
                curveToRelative(dx1 = 3.37f, dy1 = 0.0f, dx2 = 4.21f, dy2 = 0.84f, dx3 = 4.21f, dy3 = 4.21f)
                moveTo(x = 10.0f, y = 21.47f)
                verticalLineToRelative(dy = -4.52f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 2.0f, y = 12.95f)
                horizontalLineToRelative(dx = 8.0f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 6.74f, y = 21.47f)
                horizontalLineTo(x = 10.0f)
                moveToRelative(dx = 12.0f, dy = -8.67f)
                verticalLineToRelative(dy = 5.71f)
                curveToRelative(dx1 = 0.0f, dy1 = 2.37f, dx2 = -0.59f, dy2 = 2.96f, dx3 = -2.96f, dy3 = 2.96f)
                horizontalLineToRelative(dx = -3.55f)
                curveToRelative(dx1 = -2.37f, dy1 = 0.0f, dx2 = -2.96f, dy2 = -0.59f, dx3 = -2.96f, dy3 = -2.96f)
                verticalLineTo(y = 12.8f)
                curveToRelative(dx1 = 0.0f, dy1 = -2.37f, dx2 = 0.59f, dy2 = -2.96f, dx3 = 2.96f, dy3 = -2.96f)
                horizontalLineToRelative(dx = 3.55f)
                curveToRelative(dx1 = 2.37f, dy1 = 0.0f, dx2 = 2.96f, dy2 = 0.59f, dx3 = 2.96f, dy3 = 2.96f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                moveTo(x = 17.24f, y = 18.25f)
                horizontalLineToRelative(dx = 0.01f)
            }
        }.build().also { _monitorMobbile = it }
    }

@Suppress("ObjectPropertyName")
private var _monitorMobbile: ImageVector? = null
