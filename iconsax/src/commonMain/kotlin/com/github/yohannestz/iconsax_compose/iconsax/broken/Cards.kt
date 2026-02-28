package com.github.yohannestz.iconsax_compose.iconsax.broken

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Cards: ImageVector
    get() {
        val current = _cards
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Cards",
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
                moveTo(x = 2.0f, y = 12.61f)
                horizontalLineToRelative(dx = 17.0f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 10.74f, y = 21.0f)
                horizontalLineTo(x = 5.78f)
                curveTo(x1 = 2.76f, y1 = 21.0f, x2 = 2.0f, y2 = 20.25f, x3 = 2.0f, y3 = 17.27f)
                verticalLineToRelative(dy = -6.99f)
                curveToRelative(dx1 = 0.0f, dy1 = -2.7f, dx2 = 0.63f, dy2 = -3.57f, dx3 = 3.0f, dy3 = -3.71f)
                lineToRelative(dx = 0.78f, dy = -0.02f)
                horizontalLineToRelative(dx = 9.44f)
                curveToRelative(dx1 = 3.02f, dy1 = 0.0f, dx2 = 3.78f, dy2 = 0.75f, dx3 = 3.78f, dy3 = 3.73f)
                verticalLineToRelative(dy = 7.15f)
                curveTo(x1 = 18.97f, y1 = 20.28f, x2 = 18.19f, y2 = 21.0f, x3 = 15.22f, y3 = 21.0f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 22.0f, y = 6.73f)
                verticalLineToRelative(dy = 6.99f)
                curveToRelative(dx1 = 0.0f, dy1 = 2.7f, dx2 = -0.63f, dy2 = 3.57f, dx3 = -3.0f, dy3 = 3.71f)
                verticalLineToRelative(dy = -7.15f)
                curveToRelative(dx1 = 0.0f, dy1 = -2.98f, dx2 = -0.76f, dy2 = -3.73f, dx3 = -3.78f, dy3 = -3.73f)
                horizontalLineTo(x = 5.78f)
                lineTo(x = 5.0f, y = 6.57f)
                curveTo(x1 = 5.03f, y1 = 3.72f, x2 = 5.81f, y2 = 3.0f, x3 = 8.78f, y3 = 3.0f)
                horizontalLineToRelative(dx = 9.44f)
                curveTo(x1 = 21.24f, y1 = 3.0f, x2 = 22.0f, y2 = 3.75f, x3 = 22.0f, y3 = 6.73f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 5.25f, y = 17.8f)
                horizontalLineToRelative(dx = 1.72f)
                moveToRelative(dx = 2.14f, dy = 0.0f)
                horizontalLineToRelative(dx = 3.44f)
            }
        }.build().also { _cards = it }
    }

@Suppress("ObjectPropertyName")
private var _cards: ImageVector? = null
