package com.github.yohannestz.iconsax_compose.iconsax.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val PresentionChart: ImageVector
    get() {
        val current = _presentionChart
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.PresentionChart",
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
                moveTo(x = 5.9f, y = 17.0f)
                horizontalLineToRelative(dx = 12.19f)
                curveToRelative(dx1 = 1.9f, dy1 = 0.0f, dx2 = 2.9f, dy2 = -1.0f, dx3 = 2.9f, dy3 = -2.9f)
                verticalLineTo(y = 2.0f)
                horizontalLineToRelative(dx = -18.0f)
                verticalLineToRelative(dy = 12.1f)
                curveTo(x1 = 3.0f, y1 = 16.0f, x2 = 4.0f, y2 = 17.0f, x3 = 5.9f, y3 = 17.0f)
                moveTo(x = 2.0f, y = 2.0f)
                horizontalLineToRelative(dx = 20.0f)
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
                moveTo(x = 8.0f, y = 22.0f)
                lineToRelative(dx = 4.0f, dy = -2.0f)
                moveToRelative(dx = 0.0f, dy = 0.0f)
                verticalLineToRelative(dy = -3.0f)
                moveToRelative(dx = 0.0f, dy = 3.0f)
                lineToRelative(dx = 4.0f, dy = 2.0f)
                moveTo(x = 7.5f, y = 11.0f)
                lineToRelative(dx = 3.15f, dy = -2.63f)
                curveToRelative(dx1 = 0.25f, dy1 = -0.21f, dx2 = 0.58f, dy2 = -0.15f, dx3 = 0.75f, dy3 = 0.13f)
                lineToRelative(dx = 1.2f, dy = 2.0f)
                arcToRelative(a = 0.5f, b = 0.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.75f, dy1 = 0.13f)
                lineTo(x = 16.5f, y = 8.0f)
            }
        }.build().also { _presentionChart = it }
    }

@Suppress("ObjectPropertyName")
private var _presentionChart: ImageVector? = null
