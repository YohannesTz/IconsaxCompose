package com.github.yohannestz.iconsax_compose.iconsax.broken

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val CardRemoveOne: ImageVector
    get() {
        val current = _cardRemoveOne
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.CardRemoveOne",
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
                horizontalLineToRelative(dx = 11.5f)
                moveToRelative(dx = -7.5f, dy = 8.0f)
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
                moveTo(x = 2.0f, y = 11.03f)
                verticalLineTo(y = 7.89f)
                curveTo(x1 = 2.0f, y1 = 4.38f, x2 = 2.89f, y2 = 3.5f, x3 = 6.44f, y3 = 3.5f)
                horizontalLineToRelative(dx = 7.06f)
                moveToRelative(dx = 8.5f, dy = 8.53f)
                verticalLineToRelative(dy = 4.08f)
                curveToRelative(dx1 = 0.0f, dy1 = 3.51f, dx2 = -0.89f, dy2 = 4.4f, dx3 = -4.44f, dy3 = 4.4f)
                horizontalLineTo(x = 6.44f)
                curveTo(x1 = 2.89f, y1 = 20.5f, x2 = 2.0f, y2 = 19.61f, x3 = 2.0f, y3 = 16.1f)
                verticalLineToRelative(dy = -1.09f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 17.3f, y = 8.19f)
                lineTo(x = 21.2f, y = 4.3f)
                moveToRelative(dx = 0.0f, dy = 3.88f)
                lineTo(x = 17.3f, y = 4.3f)
            }
        }.build().also { _cardRemoveOne = it }
    }

@Suppress("ObjectPropertyName")
private var _cardRemoveOne: ImageVector? = null
