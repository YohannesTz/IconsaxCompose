package com.github.yohannestz.iconsax_compose.iconsax.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DirectboxReceive: ImageVector
    get() {
        val current = _directboxReceive
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.DirectboxReceive",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 12.0f, y = 2.0f)
                verticalLineToRelative(dy = 6.0f)
                lineToRelative(dx = 2.0f, dy = -2.0f)
                moveToRelative(dx = -2.0f, dy = 2.0f)
                lineToRelative(dx = -2.0f, dy = -2.0f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 7.0f, y = 12.0f)
                curveToRelative(dx1 = -4.0f, dy1 = 0.0f, dx2 = -4.0f, dy2 = 1.79f, dx3 = -4.0f, dy3 = 4.0f)
                verticalLineToRelative(dy = 1.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 2.76f, dx2 = 0.0f, dy2 = 5.0f, dx3 = 5.0f, dy3 = 5.0f)
                horizontalLineToRelative(dx = 8.0f)
                curveToRelative(dx1 = 4.0f, dy1 = 0.0f, dx2 = 5.0f, dy2 = -2.24f, dx3 = 5.0f, dy3 = -5.0f)
                verticalLineToRelative(dy = -1.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -2.21f, dx2 = 0.0f, dy2 = -4.0f, dx3 = -4.0f, dy3 = -4.0f)
                curveToRelative(dx1 = -1.0f, dy1 = 0.0f, dx2 = -1.28f, dy2 = 0.21f, dx3 = -1.8f, dy3 = 0.6f)
                lineToRelative(dx = -1.02f, dy = 1.08f)
                arcToRelative(a = 3.0f, b = 3.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -4.37f, dy1 = 0.0f)
                lineTo(x = 8.8f, y = 12.6f)
                curveTo(x1 = 8.28f, y1 = 12.21f, x2 = 8.0f, y2 = 12.0f, x3 = 7.0f, y3 = 12.0f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 5.0f, y = 12.0f)
                verticalLineTo(y = 8.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -2.01f, dx2 = 0.0f, dy2 = -3.67f, dx3 = 3.0f, dy3 = -3.96f)
                moveTo(x = 19.0f, y = 12.0f)
                verticalLineTo(y = 8.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -2.01f, dx2 = 0.0f, dy2 = -3.67f, dx3 = -3.0f, dy3 = -3.96f)
            }
        }.build().also { _directboxReceive = it }
    }

@Suppress("ObjectPropertyName")
private var _directboxReceive: ImageVector? = null
