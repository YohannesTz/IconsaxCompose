package com.github.yohannestz.iconsax_compose.iconsax.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val LinkTwo: ImageVector
    get() {
        val current = _linkTwo
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.LinkTwo",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 8.99f, y = 21.5f)
                arcToRelative(a = 6.49f, b = 6.49f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -4.6f, dy1 = -11.09f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.06f, dy1 = 0.0f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = 1.06f)
                arcToRelative(a = 5.0f, b = 5.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 7.07f)
                arcToRelative(a = 5.0f, b = 5.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 7.07f, dy1 = 0.0f)
                arcToRelative(a = 5.01f, b = 5.01f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = -7.08f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = -1.06f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.06f, dy1 = 0.0f)
                arcToRelative(a = 6.5f, b = 6.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.9f, dy1 = 4.6f)
                arcToRelative(a = 6.5f, b = 6.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.9f, dy1 = 4.6f)
                arcToRelative(a = 6.4f, b = 6.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -4.59f, dy1 = 1.9f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 19.07f, y = 14.16f)
                arcToRelative(a = 0.7f, b = 0.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.53f, dy1 = -0.22f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = -1.06f)
                arcToRelative(a = 5.24f, b = 5.24f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = -7.42f, dy1 = -7.42f)
                arcToRelative(a = 5.2f, b = 5.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.54f, dy1 = 3.7f)
                curveToRelative(dx1 = 0.0f, dy1 = 1.4f, dx2 = 0.55f, dy2 = 2.73f, dx3 = 1.54f, dy3 = 3.72f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = 1.06f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.06f, dy1 = 0.0f)
                arcToRelative(a = 6.7f, b = 6.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.98f, dy1 = -4.77f)
                arcTo(horizontalEllipseRadius = 6.77f, verticalEllipseRadius = 6.77f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 19.6f, y1 = 4.4f)
                arcToRelative(a = 6.77f, b = 6.77f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = 9.55f)
                arcToRelative(a = 0.8f, b = 0.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.54f, dy1 = 0.2f)
            }
        }.build().also { _linkTwo = it }
    }

@Suppress("ObjectPropertyName")
private var _linkTwo: ImageVector? = null
