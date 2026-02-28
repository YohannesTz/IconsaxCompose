package com.github.yohannestz.iconsax_compose.iconsax.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MessageEdit: ImageVector
    get() {
        val current = _messageEdit
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.MessageEdit",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 16.0f, y = 22.75f)
                horizontalLineTo(x = 3.0f)
                arcTo(horizontalEllipseRadius = 1.76f, verticalEllipseRadius = 1.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 1.25f, y1 = 21.0f)
                verticalLineTo(y = 8.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -4.42f, dx2 = 2.33f, dy2 = -6.75f, dx3 = 6.75f, dy3 = -6.75f)
                horizontalLineToRelative(dx = 8.0f)
                curveToRelative(dx1 = 4.42f, dy1 = 0.0f, dx2 = 6.75f, dy2 = 2.33f, dx3 = 6.75f, dy3 = 6.75f)
                verticalLineToRelative(dy = 8.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 4.42f, dx2 = -2.33f, dy2 = 6.75f, dx3 = -6.75f, dy3 = 6.75f)
                moveToRelative(dx = -8.0f, dy = -20.0f)
                curveTo(x1 = 4.42f, y1 = 2.75f, x2 = 2.75f, y2 = 4.42f, x3 = 2.75f, y3 = 8.0f)
                verticalLineToRelative(dy = 13.0f)
                arcTo(horizontalEllipseRadius = 0.25f, verticalEllipseRadius = 0.25f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 3.0f, y1 = 21.25f)
                horizontalLineToRelative(dx = 13.0f)
                curveToRelative(dx1 = 3.58f, dy1 = 0.0f, dx2 = 5.25f, dy2 = -1.67f, dx3 = 5.25f, dy3 = -5.25f)
                verticalLineTo(y = 8.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -3.58f, dx2 = -1.67f, dy2 = -5.25f, dx3 = -5.25f, dy3 = -5.25f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 7.95f, y = 17.75f)
                arcToRelative(a = 1.7f, b = 1.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.22f, dy1 = -0.48f)
                arcToRelative(a = 1.7f, b = 1.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.46f, dy1 = -1.5f)
                lineToRelative(dx = 0.28f, dy = -1.98f)
                arcToRelative(a = 2.5f, b = 2.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.64f, dy1 = -1.29f)
                lineToRelative(dx = 5.19f, dy = -5.19f)
                curveToRelative(dx1 = 1.78f, dy1 = -1.78f, dx2 = 3.33f, dy2 = -0.98f, dx3 = 4.31f, dy3 = 0.0f)
                quadToRelative(dx1 = 1.16f, dy1 = 1.17f, dx2 = 1.04f, dy2 = 2.39f)
                arcToRelative(a = 3.2f, b = 3.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.04f, dy1 = 1.92f)
                lineToRelative(dx = -5.19f, dy = 5.19f)
                arcToRelative(a = 2.6f, b = 2.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.29f, dy1 = 0.65f)
                lineToRelative(dx = -1.98f, dy = 0.28f)
                close()
                moveToRelative(dx = 6.58f, dy = -10.0f)
                curveToRelative(dx1 = -0.37f, dy1 = 0.0f, dx2 = -0.7f, dy2 = 0.24f, dx3 = -1.08f, dy3 = 0.61f)
                lineToRelative(dx = -5.19f, dy = 5.19f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.22f, dy1 = 0.44f)
                lineToRelative(dx = -0.28f, dy = 1.98f)
                quadTo(x1 = 7.74f, y1 = 16.13f, x2 = 7.8f, y2 = 16.2f)
                quadToRelative(dx1 = 0.07f, dy1 = 0.06f, dx2 = 0.23f, dy2 = 0.04f)
                lineToRelative(dx = 1.98f, dy = -0.28f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.44f, dy1 = -0.22f)
                lineToRelative(dx = 5.19f, dy = -5.19f)
                quadToRelative(dx1 = 0.57f, dy1 = -0.57f, dx2 = 0.61f, dy2 = -1.01f)
                quadToRelative(dx1 = 0.05f, dy1 = -0.52f, dx2 = -0.61f, dy2 = -1.18f)
                quadTo(x1 = 15.0f, y1 = 7.74f, x2 = 14.53f, y2 = 7.75f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 15.42f, y = 12.58f)
                lineToRelative(dx = -0.2f, dy = -0.03f)
                arcToRelative(a = 5.5f, b = 5.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -3.77f, dy1 = -3.77f)
                arcToRelative(a = 0.76f, b = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.52f, dy1 = -0.93f)
                arcToRelative(a = 0.74f, b = 0.74f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.92f, dy1 = 0.52f)
                arcToRelative(a = 4.0f, b = 4.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 2.73f, dy1 = 2.73f)
                arcToRelative(a = 0.76f, b = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.2f, dy1 = 1.48f)
            }
        }.build().also { _messageEdit = it }
    }

@Suppress("ObjectPropertyName")
private var _messageEdit: ImageVector? = null
