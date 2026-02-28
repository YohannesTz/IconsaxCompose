package com.github.yohannestz.iconsax_compose.iconsax.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MessageCircle: ImageVector
    get() {
        val current = _messageCircle
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.MessageCircle",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 12.0f, y = 18.31f)
                arcToRelative(a = 1.6f, b = 1.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.23f, dy1 = -0.65f)
                lineToRelative(dx = -0.72f, dy = -0.96f)
                horizontalLineTo(x = 9.9f)
                curveToRelative(dx1 = -2.02f, dy1 = 0.0f, dx2 = -3.9f, dy2 = -0.47f, dx3 = -3.9f, dy3 = -3.9f)
                verticalLineToRelative(dy = -2.63f)
                curveTo(x1 = 6.0f, y1 = 7.86f, x2 = 7.19f, y2 = 6.49f, x3 = 9.34f, y3 = 6.3f)
                lineTo(x = 9.9f, y = 6.27f)
                horizontalLineToRelative(dx = 4.2f)
                curveToRelative(dx1 = 2.51f, dy1 = 0.0f, dx2 = 3.9f, dy2 = 1.38f, dx3 = 3.9f, dy3 = 3.9f)
                verticalLineToRelative(dy = 2.63f)
                quadToRelative(dx1 = 0.0f, dy1 = 0.3f, dx2 = -0.03f, dy2 = 0.58f)
                curveToRelative(dx1 = -0.18f, dy1 = 2.12f, dx2 = -1.55f, dy2 = 3.31f, dx3 = -3.86f, dy3 = 3.31f)
                horizontalLineToRelative(dx = -0.15f)
                lineToRelative(dx = -0.72f, dy = 0.96f)
                arcTo(horizontalEllipseRadius = 1.5f, verticalEllipseRadius = 1.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 12.0f, y1 = 18.31f)
                moveTo(x = 9.9f, y = 7.79f)
                quadToRelative(dx1 = -0.2f, dy1 = 0.0f, dx2 = -0.4f, dy2 = 0.02f)
                curveToRelative(dx1 = -1.41f, dy1 = 0.12f, dx2 = -2.0f, dy2 = 0.83f, dx3 = -2.0f, dy3 = 2.38f)
                verticalLineToRelative(dy = 2.63f)
                curveToRelative(dx1 = 0.0f, dy1 = 2.07f, dx2 = 0.57f, dy2 = 2.4f, dx3 = 2.4f, dy3 = 2.4f)
                horizontalLineToRelative(dx = 0.26f)
                curveToRelative(dx1 = 0.38f, dy1 = 0.0f, dx2 = 0.79f, dy2 = 0.2f, dx3 = 1.02f, dy3 = 0.5f)
                lineToRelative(dx = 0.79f, dy = 1.06f)
                lineToRelative(dx = 0.85f, dy = -1.05f)
                arcToRelative(a = 1.3f, b = 1.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.02f, dy1 = -0.51f)
                horizontalLineToRelative(dx = 0.26f)
                curveToRelative(dx1 = 1.55f, dy1 = 0.0f, dx2 = 2.25f, dy2 = -0.59f, dx3 = 2.37f, dy3 = -1.97f)
                quadToRelative(dx1 = 0.03f, dy1 = -0.23f, dx2 = 0.02f, dy2 = -0.43f)
                verticalLineToRelative(dy = -2.63f)
                curveToRelative(dx1 = 0.0f, dy1 = -1.68f, dx2 = -0.72f, dy2 = -2.4f, dx3 = -2.4f, dy3 = -2.4f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 12.0f, y = 22.75f)
                arcToRelative(a = 10.76f, b = 10.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = -21.5f)
                arcToRelative(a = 10.76f, b = 10.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = 21.5f)
                moveToRelative(dx = 0.0f, dy = -20.0f)
                arcToRelative(a = 9.26f, b = 9.26f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 18.5f)
                arcToRelative(a = 9.26f, b = 9.26f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = -18.5f)
            }
        }.build().also { _messageCircle = it }
    }

@Suppress("ObjectPropertyName")
private var _messageCircle: ImageVector? = null
