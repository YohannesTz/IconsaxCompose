package com.github.yohannestz.iconsax_compose.iconsax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val PictureFrame: ImageVector
    get() {
        val current = _pictureFrame
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.PictureFrame",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 10.51f, y = 11.22f)
                lineToRelative(dx = -2.2f, dy = -8.83f)
                arcTo(horizontalEllipseRadius = 0.5f, verticalEllipseRadius = 0.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 7.81f, y1 = 2.0f)
                arcTo(horizontalEllipseRadius = 5.8f, verticalEllipseRadius = 5.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 2.0f, y1 = 7.81f)
                verticalLineToRelative(dy = 5.7f)
                arcTo(horizontalEllipseRadius = 0.5f, verticalEllipseRadius = 0.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 2.66f, y1 = 14.0f)
                lineToRelative(dx = 7.5f, dy = -2.17f)
                arcToRelative(a = 0.5f, b = 0.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.35f, dy1 = -0.61f)
                moveToRelative(dx = 0.61f, dy = 2.46f)
                arcToRelative(a = 0.5f, b = 0.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.64f, dy1 = -0.37f)
                lineToRelative(dx = -8.11f, dy = 2.36f)
                arcTo(horizontalEllipseRadius = 0.5f, verticalEllipseRadius = 0.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 2.0f, y1 = 16.17f)
                verticalLineToRelative(dy = 0.02f)
                arcToRelative(a = 5.8f, b = 5.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 5.81f, dy1 = 5.8f)
                horizontalLineToRelative(dx = 4.72f)
                arcToRelative(a = 0.52f, b = 0.52f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.5f, dy1 = -0.63f)
                close()
                moveTo(x = 16.19f, y = 2.0f)
                horizontalLineToRelative(dx = -5.75f)
                arcToRelative(a = 0.52f, b = 0.52f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.5f, dy1 = 0.64f)
                lineToRelative(dx = 4.74f, dy = 18.97f)
                arcToRelative(a = 0.5f, b = 0.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.5f, dy1 = 0.39f)
                horizontalLineToRelative(dx = 1.0f)
                curveTo(x1 = 19.4f, y1 = 22.0f, x2 = 22.0f, y2 = 19.4f, x3 = 22.0f, y3 = 16.19f)
                verticalLineTo(y = 7.81f)
                arcTo(horizontalEllipseRadius = 5.8f, verticalEllipseRadius = 5.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 16.19f, y1 = 2.0f)
            }
        }.build().also { _pictureFrame = it }
    }

@Suppress("ObjectPropertyName")
private var _pictureFrame: ImageVector? = null
