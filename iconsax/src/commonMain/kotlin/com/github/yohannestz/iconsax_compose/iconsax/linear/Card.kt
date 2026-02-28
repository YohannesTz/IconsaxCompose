package com.github.yohannestz.iconsax_compose.iconsax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Card: ImageVector
    get() {
        val current = _card
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Card",
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
                moveTo(x = 2.0f, y = 8.5f)
                horizontalLineToRelative(dx = 20.0f)
                moveToRelative(dx = -16.0f, dy = 8.0f)
                horizontalLineToRelative(dx = 2.0f)
                moveToRelative(dx = 2.5f, dy = 0.0f)
                horizontalLineToRelative(dx = 4.0f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 6.44f, y = 3.5f)
                horizontalLineToRelative(dx = 11.11f)
                curveTo(x1 = 21.11f, y1 = 3.5f, x2 = 22.0f, y2 = 4.39f, x3 = 22.0f, y3 = 7.9f)
                verticalLineToRelative(dy = 8.2f)
                curveToRelative(dx1 = 0.0f, dy1 = 3.51f, dx2 = -0.89f, dy2 = 4.4f, dx3 = -4.44f, dy3 = 4.4f)
                horizontalLineTo(x = 6.44f)
                curveTo(x1 = 2.89f, y1 = 20.5f, x2 = 2.0f, y2 = 19.63f, x3 = 2.0f, y3 = 16.12f)
                verticalLineTo(y = 7.9f)
                curveToRelative(dx1 = 0.0f, dy1 = -3.51f, dx2 = 0.89f, dy2 = -4.4f, dx3 = 4.44f, dy3 = -4.4f)
            }
        }.build().also { _card = it }
    }

@Suppress("ObjectPropertyName")
private var _card: ImageVector? = null
