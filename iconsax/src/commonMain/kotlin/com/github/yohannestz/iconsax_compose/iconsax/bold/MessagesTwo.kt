package com.github.yohannestz.iconsax_compose.iconsax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MessagesTwo: ImageVector
    get() {
        val current = _messagesTwo
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.MessagesTwo",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 18.47f, y = 16.83f)
                lineToRelative(dx = 0.39f, dy = 3.16f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.5f, dy1 = 0.98f)
                lineToRelative(dx = -3.46f, dy = -2.06f)
                curveToRelative(dx1 = -0.24f, dy1 = -0.14f, dx2 = -0.3f, dy2 = -0.44f, dx3 = -0.17f, dy3 = -0.68f)
                arcToRelative(a = 6.3f, b = 6.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.77f, dy1 = -3.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -3.66f, dx2 = -3.14f, dy2 = -6.64f, dx3 = -7.0f, dy3 = -6.64f)
                arcToRelative(a = 7.0f, b = 7.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -2.28f, dy1 = 0.36f)
                arcToRelative(a = 0.5f, b = 0.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.64f, dy1 = -0.6f)
                curveTo(x1 = 5.49f, y1 = 4.71f, x2 = 8.99f, y2 = 2.0f, x3 = 13.17f, y3 = 2.0f)
                curveTo(x1 = 18.05f, y1 = 2.0f, x2 = 22.0f, y2 = 5.69f, x3 = 22.0f, y3 = 10.24f)
                curveToRelative(dx1 = 0.0f, dy1 = 2.7f, dx2 = -1.39f, dy2 = 5.09f, dx3 = -3.53f, dy3 = 6.59f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 13.0f, y = 15.23f)
                arcToRelative(a = 5.0f, b = 5.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.18f, dy1 = 3.16f)
                arcToRelative(a = 5.6f, b = 5.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -4.32f, dy1 = 1.97f)
                lineToRelative(dx = -2.61f, dy = 1.55f)
                curveToRelative(dx1 = -0.44f, dy1 = 0.27f, dx2 = -1.0f, dy2 = -0.1f, dx3 = -0.94f, dy3 = -0.61f)
                lineToRelative(dx = 0.25f, dy = -1.97f)
                arcToRelative(a = 5.0f, b = 5.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -2.2f, dy1 = -4.1f)
                arcTo(horizontalEllipseRadius = 5.0f, verticalEllipseRadius = 5.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 4.38f, y1 = 11.0f)
                arcToRelative(a = 5.7f, b = 5.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 3.12f, dy1 = -0.91f)
                curveToRelative(dx1 = 3.04f, dy1 = 0.0f, dx2 = 5.5f, dy2 = 2.3f, dx3 = 5.5f, dy3 = 5.14f)
            }
        }.build().also { _messagesTwo = it }
    }

@Suppress("ObjectPropertyName")
private var _messagesTwo: ImageVector? = null
