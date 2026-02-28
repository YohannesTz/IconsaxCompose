package com.github.yohannestz.iconsax_compose.iconsax.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val PathToolTwo: ImageVector
    get() {
        val current = _pathToolTwo
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.PathToolTwo",
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
                moveTo(x = 9.87f, y = 22.0f)
                horizontalLineToRelative(dx = 4.29f)
                curveToRelative(dx1 = 1.62f, dy1 = 0.0f, dx2 = 2.69f, dy2 = -1.16f, dx3 = 2.37f, dy3 = -2.57f)
                lineToRelative(dx = -0.69f, dy = -3.08f)
                horizontalLineTo(x = 8.2f)
                lineToRelative(dx = -0.69f, dy = 3.08f)
                curveTo(x1 = 7.2f, y1 = 20.76f, x2 = 8.34f, y2 = 22.0f, x3 = 9.87f, y3 = 22.0f)
                moveToRelative(dx = 5.96f, dy = -5.65f)
                lineToRelative(dx = 2.94f, dy = -2.6f)
                curveToRelative(dx1 = 1.64f, dy1 = -1.47f, dx2 = 1.71f, dy2 = -2.49f, dx3 = 0.41f, dy3 = -4.14f)
                lineToRelative(dx = -5.19f, dy = -6.58f)
                curveToRelative(dx1 = -1.09f, dy1 = -1.38f, dx2 = -2.87f, dy2 = -1.38f, dx3 = -3.97f, dy3 = 0.0f)
                lineTo(x = 4.84f, y = 9.61f)
                curveToRelative(dx1 = -1.3f, dy1 = 1.65f, dx2 = -1.3f, dy2 = 2.72f, dx3 = 0.41f, dy3 = 4.13f)
                lineToRelative(dx = 2.94f, dy = 2.61f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 12.01f, y = 2.67f)
                verticalLineToRelative(dy = 4.3f)
            }
        }.build().also { _pathToolTwo = it }
    }

@Suppress("ObjectPropertyName")
private var _pathToolTwo: ImageVector? = null
