package com.github.yohannestz.iconsax_compose.iconsax.broken

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MessageAddOne: ImageVector
    get() {
        val current = _messageAddOne
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.MessageAddOne",
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
                moveTo(x = 22.0f, y = 8.0f)
                quadToRelative(dx1 = 0.0f, dy1 = -6.0f, dx2 = -6.0f, dy2 = -6.0f)
                horizontalLineTo(x = 8.0f)
                quadTo(x1 = 2.0f, y1 = 2.0f, x2 = 2.0f, y2 = 8.0f)
                verticalLineToRelative(dy = 13.0f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.0f, dy1 = 1.0f)
                horizontalLineToRelative(dx = 13.0f)
                quadToRelative(dx1 = 6.0f, dy1 = 0.0f, dx2 = 6.0f, dy2 = -6.0f)
                verticalLineToRelative(dy = -4.0f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 14.5f, y = 12.0f)
                horizontalLineToRelative(dx = 1.0f)
                moveToRelative(dx = -7.0f, dy = 0.0f)
                horizontalLineTo(x = 12.0f)
                moveToRelative(dx = 0.0f, dy = 3.5f)
                verticalLineToRelative(dy = -7.0f)
            }
        }.build().also { _messageAddOne = it }
    }

@Suppress("ObjectPropertyName")
private var _messageAddOne: ImageVector? = null
