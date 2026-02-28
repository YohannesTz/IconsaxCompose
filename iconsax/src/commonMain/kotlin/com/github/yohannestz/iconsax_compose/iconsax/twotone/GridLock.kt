package com.github.yohannestz.iconsax_compose.iconsax.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val GridLock: ImageVector
    get() {
        val current = _gridLock
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.GridLock",
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
                moveTo(x = 22.0f, y = 11.0f)
                verticalLineTo(y = 9.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -5.0f, dx2 = -2.0f, dy2 = -7.0f, dx3 = -7.0f, dy3 = -7.0f)
                horizontalLineTo(x = 9.0f)
                curveTo(x1 = 4.0f, y1 = 2.0f, x2 = 2.0f, y2 = 4.0f, x3 = 2.0f, y3 = 9.0f)
                verticalLineToRelative(dy = 6.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 5.0f, dx2 = 2.0f, dy2 = 7.0f, dx3 = 7.0f, dy3 = 7.0f)
                horizontalLineToRelative(dx = 1.0f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 2.03f, y = 8.5f)
                horizontalLineTo(x = 22.0f)
                moveToRelative(dx = -19.97f, dy = 7.0f)
                horizontalLineTo(x = 12.0f)
                moveToRelative(dx = -3.49f, dy = 6.49f)
                verticalLineTo(y = 2.0f)
                moveToRelative(dx = 7.0f, dy = 9.98f)
                verticalLineTo(y = 2.0f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 15.6f, y = 17.2f)
                verticalLineToRelative(dy = -0.8f)
                curveToRelative(dx1 = 0.0f, dy1 = -1.33f, dx2 = 0.4f, dy2 = -2.4f, dx3 = 2.4f, dy3 = -2.4f)
                reflectiveCurveToRelative(dx1 = 2.4f, dy1 = 1.07f, dx2 = 2.4f, dy2 = 2.4f)
                verticalLineToRelative(dy = 0.8f)
                moveTo(x = 20.0f, y = 22.0f)
                horizontalLineToRelative(dx = -4.0f)
                curveToRelative(dx1 = -1.6f, dy1 = 0.0f, dx2 = -2.0f, dy2 = -0.4f, dx3 = -2.0f, dy3 = -2.0f)
                verticalLineToRelative(dy = -0.8f)
                curveToRelative(dx1 = 0.0f, dy1 = -1.6f, dx2 = 0.4f, dy2 = -2.0f, dx3 = 2.0f, dy3 = -2.0f)
                horizontalLineToRelative(dx = 4.0f)
                curveToRelative(dx1 = 1.6f, dy1 = 0.0f, dx2 = 2.0f, dy2 = 0.4f, dx3 = 2.0f, dy3 = 2.0f)
                verticalLineTo(y = 20.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 1.6f, dx2 = -0.4f, dy2 = 2.0f, dx3 = -2.0f, dy3 = 2.0f)
            }
        }.build().also { _gridLock = it }
    }

@Suppress("ObjectPropertyName")
private var _gridLock: ImageVector? = null
