package com.github.yohannestz.iconsax_compose.iconsax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val EmojiSad: ImageVector
    get() {
        val current = _emojiSad
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.EmojiSad",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
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
                moveTo(x = 6.47f, y = 9.28f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = -1.06f)
                arcToRelative(a = 3.34f, b = 3.34f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 4.7f, dy1 = 0.0f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = 1.06f)
                quadTo(x1 = 10.94f, y1 = 9.5f, x2 = 10.64f, y2 = 9.5f)
                curveToRelative(dx1 = -0.3f, dy1 = 0.0f, dx2 = -0.38f, dy2 = -0.07f, dx3 = -0.53f, dy3 = -0.22f)
                arcToRelative(a = 1.83f, b = 1.83f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -2.58f, dy1 = 0.0f)
                arcToRelative(a = 0.74f, b = 0.74f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.06f, dy1 = 0.0f)
                moveToRelative(dx = 9.13f, dy = 8.8f)
                horizontalLineTo(x = 8.4f)
                arcToRelative(a = 1.27f, b = 1.27f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.27f, dy1 = -1.28f)
                arcToRelative(a = 4.89f, b = 4.89f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 9.76f, dy1 = 0.0f)
                arcToRelative(a = 1.3f, b = 1.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.29f, dy1 = 1.28f)
                moveToRelative(dx = 1.93f, dy = -8.8f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.06f, dy1 = 0.0f)
                arcToRelative(a = 1.83f, b = 1.83f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -2.58f, dy1 = 0.0f)
                quadTo(x1 = 13.65f, y1 = 9.5f, x2 = 13.36f, y2 = 9.5f)
                curveToRelative(dx1 = -0.29f, dy1 = 0.0f, dx2 = -0.38f, dy2 = -0.07f, dx3 = -0.53f, dy3 = -0.22f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = -1.06f)
                arcToRelative(a = 3.34f, b = 3.34f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 4.7f, dy1 = 0.0f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = 1.06f)
            }
        }.build().also { _emojiSad = it }
    }

@Suppress("ObjectPropertyName")
private var _emojiSad: ImageVector? = null
