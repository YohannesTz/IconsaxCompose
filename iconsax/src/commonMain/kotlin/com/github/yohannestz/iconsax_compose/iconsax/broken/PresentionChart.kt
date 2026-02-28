package com.github.yohannestz.iconsax_compose.iconsax.broken

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
                moveTo(x = 21.0f, y = 10.0f)
                verticalLineTo(y = 2.0f)
                horizontalLineTo(x = 3.0f)
                verticalLineToRelative(dy = 12.1f)
                quadToRelative(dx1 = 0.0f, dy1 = 1.07f, dx2 = 0.42f, dy2 = 1.76f)
                quadToRelative(dx1 = 0.7f, dy1 = 1.14f, dx2 = 2.49f, dy2 = 1.15f)
                horizontalLineTo(x = 18.1f)
                curveToRelative(dx1 = 1.9f, dy1 = 0.0f, dx2 = 2.9f, dy2 = -1.0f, dx3 = 2.9f, dy3 = -2.9f)
                moveTo(x = 2.0f, y = 2.0f)
                horizontalLineToRelative(dx = 20.0f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 8.0f, y = 22.0f)
                lineToRelative(dx = 4.0f, dy = -2.0f)
                verticalLineToRelative(dy = -3.0f)
                moveToRelative(dx = 4.0f, dy = 5.0f)
                lineToRelative(dx = -4.0f, dy = -2.0f)
                moveToRelative(dx = -4.5f, dy = -9.0f)
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
