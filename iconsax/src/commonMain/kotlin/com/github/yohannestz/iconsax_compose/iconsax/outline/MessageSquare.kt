package com.github.yohannestz.iconsax_compose.iconsax.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MessageSquare: ImageVector
    get() {
        val current = _messageSquare
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.MessageSquare",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 12.0f, y = 19.35f)
                arcToRelative(a = 1.7f, b = 1.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.36f, dy1 = -0.72f)
                lineToRelative(dx = -0.91f, dy = -1.2f)
                horizontalLineTo(x = 9.48f)
                curveToRelative(dx1 = -2.71f, dy1 = 0.0f, dx2 = -4.51f, dy2 = -0.78f, dx3 = -4.51f, dy3 = -4.52f)
                verticalLineTo(y = 9.77f)
                curveToRelative(dx1 = 0.0f, dy1 = -2.68f, dx2 = 1.37f, dy2 = -4.27f, dx3 = 3.86f, dy3 = -4.48f)
                lineToRelative(dx = 0.65f, dy = -0.03f)
                horizontalLineToRelative(dx = 5.03f)
                curveToRelative(dx1 = 2.9f, dy1 = 0.0f, dx2 = 4.5f, dy2 = 1.6f, dx3 = 4.5f, dy3 = 4.51f)
                verticalLineToRelative(dy = 3.14f)
                arcToRelative(a = 5.0f, b = 5.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.03f, dy1 = 0.68f)
                curveToRelative(dx1 = -0.21f, dy1 = 2.46f, dx2 = -1.8f, dy2 = 3.83f, dx3 = -4.48f, dy3 = 3.83f)
                horizontalLineToRelative(dx = -0.25f)
                lineToRelative(dx = -0.91f, dy = 1.21f)
                arcTo(horizontalEllipseRadius = 1.7f, verticalEllipseRadius = 1.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 12.0f, y1 = 19.35f)
                moveTo(x = 9.49f, y = 6.75f)
                lineToRelative(dx = -0.5f, dy = 0.03f)
                curveToRelative(dx1 = -1.75f, dy1 = 0.15f, dx2 = -2.52f, dy2 = 1.07f, dx3 = -2.52f, dy3 = 3.0f)
                verticalLineToRelative(dy = 3.13f)
                curveToRelative(dx1 = 0.0f, dy1 = 2.58f, dx2 = 0.75f, dy2 = 3.01f, dx3 = 3.0f, dy3 = 3.01f)
                horizontalLineTo(x = 9.8f)
                curveToRelative(dx1 = 0.4f, dy1 = 0.0f, dx2 = 0.85f, dy2 = 0.22f, dx3 = 1.1f, dy3 = 0.54f)
                lineToRelative(dx = 0.95f, dy = 1.27f)
                quadToRelative(dx1 = 0.1f, dy1 = 0.12f, dx2 = 0.15f, dy2 = 0.12f)
                quadToRelative(dx1 = 0.07f, dy1 = 0.0f, dx2 = 0.15f, dy2 = -0.12f)
                lineToRelative(dx = 0.94f, dy = -1.26f)
                arcToRelative(a = 1.4f, b = 1.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.1f, dy1 = -0.55f)
                horizontalLineToRelative(dx = 0.3f)
                curveToRelative(dx1 = 1.93f, dy1 = 0.0f, dx2 = 2.85f, dy2 = -0.77f, dx3 = 3.0f, dy3 = -2.49f)
                lineToRelative(dx = 0.03f, dy = -0.53f)
                verticalLineTo(y = 9.76f)
                curveToRelative(dx1 = 0.0f, dy1 = -2.08f, dx2 = -0.93f, dy2 = -3.0f, dx3 = -3.01f, dy3 = -3.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 15.0f, y = 22.75f)
                horizontalLineTo(x = 9.0f)
                curveToRelative(dx1 = -5.43f, dy1 = 0.0f, dx2 = -7.75f, dy2 = -2.32f, dx3 = -7.75f, dy3 = -7.75f)
                verticalLineTo(y = 9.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -5.43f, dx2 = 2.32f, dy2 = -7.75f, dx3 = 7.75f, dy3 = -7.75f)
                horizontalLineToRelative(dx = 6.0f)
                curveToRelative(dx1 = 5.43f, dy1 = 0.0f, dx2 = 7.75f, dy2 = 2.32f, dx3 = 7.75f, dy3 = 7.75f)
                verticalLineToRelative(dy = 6.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 5.43f, dx2 = -2.32f, dy2 = 7.75f, dx3 = -7.75f, dy3 = 7.75f)
                moveToRelative(dx = -6.0f, dy = -20.0f)
                curveTo(x1 = 4.39f, y1 = 2.75f, x2 = 2.75f, y2 = 4.39f, x3 = 2.75f, y3 = 9.0f)
                verticalLineToRelative(dy = 6.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 4.61f, dx2 = 1.64f, dy2 = 6.25f, dx3 = 6.25f, dy3 = 6.25f)
                horizontalLineToRelative(dx = 6.0f)
                curveToRelative(dx1 = 4.61f, dy1 = 0.0f, dx2 = 6.25f, dy2 = -1.64f, dx3 = 6.25f, dy3 = -6.25f)
                verticalLineTo(y = 9.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -4.61f, dx2 = -1.64f, dy2 = -6.25f, dx3 = -6.25f, dy3 = -6.25f)
                close()
            }
        }.build().also { _messageSquare = it }
    }

@Suppress("ObjectPropertyName")
private var _messageSquare: ImageVector? = null
