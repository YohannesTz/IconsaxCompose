package com.github.yohannestz.iconsax_compose.iconsax.bold

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
                moveTo(x = 8.5f, y = 6.38f)
                arcToRelative(a = 1.88f, b = 1.88f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = 3.76f)
                arcToRelative(a = 1.88f, b = 1.88f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = -3.76f)
                moveToRelative(dx = 3.5f, dy = 12.7f)
                arcToRelative(a = 4.9f, b = 4.9f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -4.88f, dy1 = -4.88f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.7f, dx2 = 0.57f, dy2 = -1.28f, dx3 = 1.27f, dy3 = -1.28f)
                horizontalLineToRelative(dx = 7.2f)
                curveToRelative(dx1 = 0.7f, dy1 = 0.0f, dx2 = 1.27f, dy2 = 0.57f, dx3 = 1.27f, dy3 = 1.28f)
                arcTo(horizontalEllipseRadius = 4.86f, verticalEllipseRadius = 4.86f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 12.0f, y1 = 19.08f)
                moveToRelative(dx = 3.5f, dy = -8.96f)
                arcToRelative(a = 1.88f, b = 1.88f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = true, dx1 = 0.0f, dy1 = -3.77f)
                arcToRelative(a = 1.88f, b = 1.88f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = 3.77f)
            }
        }.build().also { _emojiHappy = it }
    }

@Suppress("ObjectPropertyName")
private var _emojiHappy: ImageVector? = null
