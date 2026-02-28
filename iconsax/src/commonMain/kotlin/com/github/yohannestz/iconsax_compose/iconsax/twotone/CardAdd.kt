package com.github.yohannestz.iconsax_compose.iconsax.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val CardAdd: ImageVector
    get() {
        val current = _cardAdd
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.CardAdd",
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
                moveTo(x = 6.0f, y = 16.5f)
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
                moveTo(x = 22.0f, y = 12.03f)
                verticalLineToRelative(dy = 4.08f)
                curveToRelative(dx1 = 0.0f, dy1 = 3.51f, dx2 = -0.89f, dy2 = 4.39f, dx3 = -4.44f, dy3 = 4.39f)
                horizontalLineTo(x = 6.44f)
                curveTo(x1 = 2.89f, y1 = 20.5f, x2 = 2.0f, y2 = 19.62f, x3 = 2.0f, y3 = 16.11f)
                verticalLineTo(y = 7.89f)
                curveTo(x1 = 2.0f, y1 = 4.38f, x2 = 2.89f, y2 = 3.5f, x3 = 6.44f, y3 = 3.5f)
                horizontalLineToRelative(dx = 7.06f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineCap = StrokeCap.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 16.5f, y = 6.25f)
                horizontalLineTo(x = 22.0f)
                moveTo(x = 19.25f, y = 9.0f)
                verticalLineTo(y = 3.5f)
            }
        }.build().also { _cardAdd = it }
    }

@Suppress("ObjectPropertyName")
private var _cardAdd: ImageVector? = null
