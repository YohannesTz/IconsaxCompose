package com.github.yohannestz.iconsax_compose.iconsax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val EmojiNormal: ImageVector
    get() {
        val current = _emojiNormal
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.EmojiNormal",
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
                moveTo(x = 9.0f, y = 22.0f)
                horizontalLineToRelative(dx = 6.0f)
                curveToRelative(dx1 = 5.0f, dy1 = 0.0f, dx2 = 7.0f, dy2 = -2.0f, dx3 = 7.0f, dy3 = -7.0f)
                verticalLineTo(y = 9.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -5.0f, dx2 = -2.0f, dy2 = -7.0f, dx3 = -7.0f, dy3 = -7.0f)
                horizontalLineTo(x = 9.0f)
                curveTo(x1 = 4.0f, y1 = 2.0f, x2 = 2.0f, y2 = 4.0f, x3 = 2.0f, y3 = 9.0f)
                verticalLineToRelative(dy = 6.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 5.0f, dx2 = 2.0f, dy2 = 7.0f, dx3 = 7.0f, dy3 = 7.0f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 7.0f, y = 8.25f)
                curveToRelative(dx1 = 1.0f, dy1 = 1.0f, dx2 = 2.63f, dy2 = 1.0f, dx3 = 3.64f, dy3 = 0.0f)
                moveToRelative(dx = 2.72f, dy = 0.0f)
                curveToRelative(dx1 = 1.0f, dy1 = 1.0f, dx2 = 2.63f, dy2 = 1.0f, dx3 = 3.64f, dy3 = 0.0f)
                moveTo(x = 8.4f, y = 13.0f)
                horizontalLineToRelative(dx = 7.2f)
                curveToRelative(dx1 = 0.5f, dy1 = 0.0f, dx2 = 0.9f, dy2 = 0.4f, dx3 = 0.9f, dy3 = 0.9f)
                arcToRelative(a = 4.5f, b = 4.5f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = true, dx1 = -9.0f, dy1 = 0.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.5f, dx2 = 0.4f, dy2 = -0.9f, dx3 = 0.9f, dy3 = -0.9f)
            }
        }.build().also { _emojiNormal = it }
    }

@Suppress("ObjectPropertyName")
private var _emojiNormal: ImageVector? = null
