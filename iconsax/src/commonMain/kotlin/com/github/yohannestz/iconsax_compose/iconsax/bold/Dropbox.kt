package com.github.yohannestz.iconsax_compose.iconsax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Dropbox: ImageVector
    get() {
        val current = _dropbox
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Dropbox",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                moveTo(x = 12.0f, y = 6.0f)
                lineToRelative(dx = -5.56f, dy = 4.0f)
                lineToRelative(dx = -3.25f, dy = -2.2f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.02f, dy1 = -1.64f)
                lineTo(x = 7.0f, y = 3.4f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.14f, dy1 = -0.02f)
                close()
                moveToRelative(dx = 8.81f, dy = 1.8f)
                lineTo(x = 17.56f, y = 10.0f)
                lineTo(x = 12.0f, y = 6.0f)
                lineToRelative(dx = 3.86f, dy = -2.61f)
                arcTo(horizontalEllipseRadius = 1.0f, verticalEllipseRadius = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 17.0f, y1 = 3.4f)
                lineToRelative(dx = 3.83f, dy = 2.76f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.02f, dy1 = 1.63f)
                moveTo(x = 12.0f, y = 14.0f)
                lineToRelative(dx = -4.44f, dy = 3.0f)
                lineTo(x = 5.0f, y = 15.16f)
                lineToRelative(dx = -1.84f, dy = -1.32f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.02f, dy1 = -1.64f)
                lineTo(x = 6.43f, y = 10.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                moveTo(x = 20.81f, y = 12.2f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.02f, dy1 = 1.64f)
                lineToRelative(dx = -1.84f, dy = 1.32f)
                lineTo(x = 16.43f, y = 17.0f)
                lineToRelative(dx = -4.44f, dy = -3.0f)
                lineToRelative(dx = 5.56f, dy = -4.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                moveTo(x = 18.68f, y = 17.34f)
                curveToRelative(dx1 = 0.13f, dy1 = -0.1f, dx2 = 0.32f, dy2 = 0.0f, dx3 = 0.32f, dy3 = 0.16f)
                verticalLineToRelative(dy = 0.73f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.58f, dy1 = 0.9f)
                lineToRelative(dx = -6.0f, dy = 2.78f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.84f, dy1 = 0.0f)
                lineToRelative(dx = -6.0f, dy = -2.77f)
                arcTo(horizontalEllipseRadius = 1.0f, verticalEllipseRadius = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 5.0f, y1 = 18.23f)
                verticalLineTo(y = 17.5f)
                arcToRelative(a = 0.2f, b = 0.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.32f, dy1 = -0.16f)
                lineToRelative(dx = 1.93f, dy = 1.39f)
                arcToRelative(a = 0.5f, b = 0.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.57f, dy1 = 0.0f)
                lineToRelative(dx = 3.9f, dy = -2.63f)
                arcToRelative(a = 0.5f, b = 0.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.56f, dy1 = 0.0f)
                lineToRelative(dx = 3.9f, dy = 2.64f)
                arcToRelative(a = 0.5f, b = 0.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.57f, dy1 = -0.01f)
                close()
            }
        }.build().also { _dropbox = it }
    }

@Suppress("ObjectPropertyName")
private var _dropbox: ImageVector? = null
