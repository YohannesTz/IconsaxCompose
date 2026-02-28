package com.github.yohannestz.iconsax_compose.iconsax.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val HashtagDown: ImageVector
    get() {
        val current = _hashtagDown
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.HashtagDown",
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
                moveTo(x = 22.0f, y = 13.0f)
                verticalLineTo(y = 9.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -5.0f, dx2 = -2.0f, dy2 = -7.0f, dx3 = -7.0f, dy3 = -7.0f)
                horizontalLineTo(x = 9.0f)
                curveTo(x1 = 4.0f, y1 = 2.0f, x2 = 2.0f, y2 = 4.0f, x3 = 2.0f, y3 = 9.0f)
                verticalLineToRelative(dy = 6.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 5.0f, dx2 = 2.0f, dy2 = 7.0f, dx3 = 7.0f, dy3 = 7.0f)
                horizontalLineToRelative(dx = 5.0f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 19.0f, y = 16.0f)
                verticalLineToRelative(dy = 6.0f)
                lineToRelative(dx = 2.0f, dy = -2.0f)
                moveToRelative(dx = -2.0f, dy = 2.0f)
                lineToRelative(dx = -2.0f, dy = -2.0f)
                moveTo(x = 9.95f, y = 6.26f)
                lineTo(x = 8.9f, y = 15.73f)
                moveToRelative(dx = 4.21f, dy = -9.47f)
                lineToRelative(dx = -1.05f, dy = 9.47f)
                moveTo(x = 6.53f, y = 9.42f)
                horizontalLineTo(x = 16.0f)
                moveTo(x = 6.0f, y = 12.58f)
                horizontalLineToRelative(dx = 9.47f)
            }
        }.build().also { _hashtagDown = it }
    }

@Suppress("ObjectPropertyName")
private var _hashtagDown: ImageVector? = null
