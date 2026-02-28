package com.github.yohannestz.iconsax_compose.iconsax.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val PaperclipTwo: ImageVector
    get() {
        val current = _paperclipTwo
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.PaperclipTwo",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 12.33f, y = 21.34f)
                arcToRelative(a = 4.2f, b = 4.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -3.01f, dy1 = -1.24f)
                arcToRelative(a = 4.25f, b = 4.25f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = -6.01f)
                lineToRelative(dx = 2.48f, dy = -2.47f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.06f, dy1 = 0.0f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = 1.06f)
                lineToRelative(dx = -2.48f, dy = 2.47f)
                arcToRelative(a = 2.76f, b = 2.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 3.89f)
                arcToRelative(a = 2.76f, b = 2.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 3.89f, dy1 = 0.0f)
                lineToRelative(dx = 3.89f, dy = -3.89f)
                arcToRelative(a = 6.2f, b = 6.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.83f, dy1 = -4.42f)
                arcToRelative(a = 6.2f, b = 6.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.83f, dy1 = -4.42f)
                arcToRelative(a = 6.25f, b = 6.25f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -8.84f, dy1 = 0.0f)
                lineToRelative(dx = -4.24f, dy = 4.24f)
                arcToRelative(a = 5.2f, b = 5.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.54f, dy1 = 3.71f)
                curveToRelative(dx1 = 0.0f, dy1 = 1.4f, dx2 = 0.55f, dy2 = 2.72f, dx3 = 1.54f, dy3 = 3.71f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = 1.06f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.06f, dy1 = 0.0f)
                arcToRelative(a = 6.7f, b = 6.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.98f, dy1 = -4.77f)
                curveToRelative(dx1 = 0.0f, dy1 = -1.8f, dx2 = 0.7f, dy2 = -3.5f, dx3 = 1.98f, dy3 = -4.77f)
                lineToRelative(dx = 4.24f, dy = -4.24f)
                arcToRelative(a = 7.76f, b = 7.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 10.96f, dy1 = 0.0f)
                arcToRelative(a = 7.7f, b = 7.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 2.27f, dy1 = 5.48f)
                arcToRelative(a = 7.7f, b = 7.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -2.27f, dy1 = 5.48f)
                lineToRelative(dx = -3.89f, dy = 3.89f)
                arcToRelative(a = 4.2f, b = 4.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -3.0f, dy1 = 1.24f)
            }
        }.build().also { _paperclipTwo = it }
    }

@Suppress("ObjectPropertyName")
private var _paperclipTwo: ImageVector? = null
