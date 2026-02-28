package com.github.yohannestz.iconsax_compose.iconsax.bulk

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
                fill = SolidColor(Color(0xFF292D32)),
                fillAlpha = 0.4f,
                strokeAlpha = 0.4f,
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
                moveToRelative(dx = 8.81f, dy = -1.8f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.02f, dy1 = 1.64f)
                lineTo(x = 19.0f, y = 15.16f)
                lineTo(x = 16.44f, y = 17.0f)
                lineTo(x = 12.0f, y = 14.0f)
                lineToRelative(dx = 5.56f, dy = -4.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 19.0f, y = 15.16f)
                verticalLineToRelative(dy = 2.97f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.58f, dy1 = 0.91f)
                lineToRelative(dx = -6.0f, dy = 2.77f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.84f, dy1 = 0.0f)
                lineToRelative(dx = -6.0f, dy = -2.77f)
                arcTo(horizontalEllipseRadius = 1.0f, verticalEllipseRadius = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 5.0f, y1 = 18.13f)
                verticalLineToRelative(dy = -2.97f)
                lineTo(x = 7.56f, y = 17.0f)
                lineTo(x = 12.0f, y = 14.0f)
                lineToRelative(dx = 4.44f, dy = 3.0f)
                close()
            }
        }.build().also { _dropbox = it }
    }

@Suppress("ObjectPropertyName")
private var _dropbox: ImageVector? = null
