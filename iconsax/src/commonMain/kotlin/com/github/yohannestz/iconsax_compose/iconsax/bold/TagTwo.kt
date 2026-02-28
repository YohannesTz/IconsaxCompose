package com.github.yohannestz.iconsax_compose.iconsax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val TagTwo: ImageVector
    get() {
        val current = _tagTwo
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.TagTwo",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 19.83f, y = 8.7f)
                lineTo(x = 15.3f, y = 4.17f)
                arcToRelative(a = 4.8f, b = 4.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -3.6f, dy1 = -1.39f)
                lineToRelative(dx = -5.0f, dy = 0.24f)
                arcToRelative(a = 3.86f, b = 3.86f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -3.69f, dy1 = 3.67f)
                lineToRelative(dx = -0.24f, dy = 5.0f)
                arcToRelative(a = 4.8f, b = 4.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.39f, dy1 = 3.6f)
                lineToRelative(dx = 4.53f, dy = 4.53f)
                arcToRelative(a = 4.8f, b = 4.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 6.75f, dy1 = 0.0f)
                lineToRelative(dx = 4.39f, dy = -4.39f)
                arcToRelative(a = 4.74f, b = 4.74f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = -6.73f)
                moveTo(x = 9.5f, y = 12.38f)
                arcToRelative(a = 2.89f, b = 2.89f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = -5.76f)
                arcToRelative(a = 2.89f, b = 2.89f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = 5.76f)
                moveToRelative(dx = 8.03f, dy = 1.15f)
                lineToRelative(dx = -4.0f, dy = 4.0f)
                quadTo(x1 = 13.3f, y1 = 17.75f, x2 = 13.0f, y2 = 17.75f)
                curveToRelative(dx1 = -0.3f, dy1 = 0.0f, dx2 = -0.38f, dy2 = -0.07f, dx3 = -0.53f, dy3 = -0.22f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = -1.06f)
                lineToRelative(dx = 4.0f, dy = -4.0f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.06f, dy1 = 0.0f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = 1.06f)
            }
        }.build().also { _tagTwo = it }
    }

@Suppress("ObjectPropertyName")
private var _tagTwo: ImageVector? = null
