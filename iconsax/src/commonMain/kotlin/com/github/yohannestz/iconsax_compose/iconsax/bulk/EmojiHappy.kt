package com.github.yohannestz.iconsax_compose.iconsax.bulk

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val EmojiHappy: ImageVector
    get() {
        val current = _emojiHappy
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.EmojiHappy",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
                fillAlpha = 0.4f,
                strokeAlpha = 0.4f,
            ) {
                moveTo(x = 16.19f, y = 2.0f)
                horizontalLineTo(x = 7.81f)
                curveTo(x1 = 4.17f, y1 = 2.0f, x2 = 2.0f, y2 = 4.17f, x3 = 2.0f, y3 = 7.81f)
                verticalLineToRelative(dy = 8.37f)
                curveTo(x1 = 2.0f, y1 = 19.83f, x2 = 4.17f, y2 = 22.0f, x3 = 7.81f, y3 = 22.0f)
                horizontalLineToRelative(dx = 8.37f)
                curveToRelative(dx1 = 3.64f, dy1 = 0.0f, dx2 = 5.81f, dy2 = -2.17f, dx3 = 5.81f, dy3 = -5.81f)
                verticalLineTo(y = 7.81f)
                curveTo(x1 = 22.0f, y1 = 4.17f, x2 = 19.83f, y2 = 2.0f, x3 = 16.19f, y3 = 2.0f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 15.5f, y = 10.13f)
                arcToRelative(a = 1.88f, b = 1.88f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = 0.0f, dy1 = -3.76f)
                arcToRelative(a = 1.88f, b = 1.88f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 3.76f)
                moveToRelative(dx = -7.0f, dy = 0.0f)
                arcToRelative(a = 1.88f, b = 1.88f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = 0.0f, dy1 = -3.76f)
                arcToRelative(a = 1.88f, b = 1.88f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 3.76f)
                moveToRelative(dx = 7.1f, dy = 2.8f)
                horizontalLineTo(x = 8.4f)
                arcToRelative(a = 1.27f, b = 1.27f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.27f, dy1 = 1.27f)
                arcToRelative(a = 4.89f, b = 4.89f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 9.76f, dy1 = 0.0f)
                arcToRelative(a = 1.3f, b = 1.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.29f, dy1 = -1.28f)
            }
        }.build().also { _emojiHappy = it }
    }

@Suppress("ObjectPropertyName")
private var _emojiHappy: ImageVector? = null
