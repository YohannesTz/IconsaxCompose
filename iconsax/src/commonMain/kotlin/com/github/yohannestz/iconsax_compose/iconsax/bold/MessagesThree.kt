package com.github.yohannestz.iconsax_compose.iconsax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MessagesThree: ImageVector
    get() {
        val current = _messagesThree
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.MessagesThree",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 15.59f, y = 12.4f)
                verticalLineToRelative(dy = 4.07f)
                quadToRelative(dx1 = 0.0f, dy1 = 0.54f, dx2 = -0.13f, dy2 = 1.01f)
                curveToRelative(dx1 = -0.37f, dy1 = 1.47f, dx2 = -1.59f, dy2 = 2.39f, dx3 = -3.27f, dy3 = 2.39f)
                horizontalLineTo(x = 9.47f)
                lineToRelative(dx = -3.02f, dy = 2.01f)
                arcToRelative(a = 0.67f, b = 0.67f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.05f, dy1 = -0.56f)
                verticalLineToRelative(dy = -1.45f)
                arcToRelative(a = 3.4f, b = 3.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -2.46f, dy1 = -0.93f)
                arcTo(horizontalEllipseRadius = 3.4f, verticalEllipseRadius = 3.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 2.0f, y1 = 16.47f)
                verticalLineTo(y = 12.4f)
                curveToRelative(dx1 = 0.0f, dy1 = -1.9f, dx2 = 1.18f, dy2 = -3.21f, dx3 = 3.0f, dy3 = -3.38f)
                lineTo(x = 5.4f, y = 9.0f)
                horizontalLineToRelative(dx = 6.79f)
                curveToRelative(dx1 = 2.04f, dy1 = 0.0f, dx2 = 3.4f, dy2 = 1.36f, dx3 = 3.4f, dy3 = 3.4f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 17.75f, y = 15.6f)
                arcToRelative(a = 4.2f, b = 4.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 3.08f, dy1 = -1.17f)
                arcTo(horizontalEllipseRadius = 4.2f, verticalEllipseRadius = 4.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 22.0f, y1 = 11.35f)
                verticalLineToRelative(dy = -5.1f)
                curveTo(x1 = 22.0f, y1 = 3.9f, x2 = 20.1f, y2 = 2.0f, x3 = 17.75f, y3 = 2.0f)
                horizontalLineToRelative(dx = -8.5f)
                arcTo(horizontalEllipseRadius = 4.25f, verticalEllipseRadius = 4.25f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 5.0f, y1 = 6.25f)
                verticalLineTo(y = 7.0f)
                arcToRelative(a = 0.5f, b = 0.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.5f, dy1 = 0.5f)
                horizontalLineToRelative(dx = 6.69f)
                arcToRelative(a = 4.9f, b = 4.9f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 4.9f, dy1 = 4.9f)
                verticalLineToRelative(dy = 2.7f)
                arcToRelative(a = 0.5f, b = 0.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.5f, dy1 = 0.5f)
                close()
            }
        }.build().also { _messagesThree = it }
    }

@Suppress("ObjectPropertyName")
private var _messagesThree: ImageVector? = null
