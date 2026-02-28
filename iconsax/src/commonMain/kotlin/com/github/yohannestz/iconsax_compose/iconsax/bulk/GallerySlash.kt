package com.github.yohannestz.iconsax_compose.iconsax.bulk

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val GallerySlash: ImageVector
    get() {
        val current = _gallerySlash
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.GallerySlash",
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
                moveTo(x = 20.46f, y = 3.54f)
                lineTo(x = 3.54f, y = 20.46f)
                curveToRelative(dx1 = -1.0f, dy1 = -1.0f, dx2 = -1.54f, dy2 = -2.45f, dx3 = -1.54f, dy3 = -4.27f)
                verticalLineTo(y = 7.81f)
                curveTo(x1 = 2.0f, y1 = 4.17f, x2 = 4.17f, y2 = 2.0f, x3 = 7.81f, y3 = 2.0f)
                horizontalLineToRelative(dx = 8.38f)
                arcToRelative(a = 5.8f, b = 5.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 4.27f, dy1 = 1.54f)
                moveTo(x = 22.0f, y = 7.81f)
                verticalLineToRelative(dy = 6.09f)
                lineToRelative(dx = -1.63f, dy = -1.4f)
                arcToRelative(a = 2.2f, b = 2.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -2.82f, dy1 = 0.0f)
                lineToRelative(dx = -4.16f, dy = 3.57f)
                arcToRelative(a = 2.2f, b = 2.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -2.6f, dy1 = 0.15f)
                lineTo(x = 21.6f, y = 5.39f)
                arcTo(horizontalEllipseRadius = 7.82f, verticalEllipseRadius = 7.82f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 22.0f, y1 = 7.81f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 22.0f, y = 13.9f)
                verticalLineToRelative(dy = 2.29f)
                curveToRelative(dx1 = 0.0f, dy1 = 3.64f, dx2 = -2.17f, dy2 = 5.8f, dx3 = -5.81f, dy3 = 5.8f)
                horizontalLineTo(x = 7.81f)
                arcToRelative(a = 8.0f, b = 8.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -2.42f, dy1 = -0.38f)
                lineToRelative(dx = 5.39f, dy = -5.4f)
                arcToRelative(a = 2.2f, b = 2.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 2.61f, dy1 = -0.14f)
                lineToRelative(dx = 4.16f, dy = -3.57f)
                arcToRelative(a = 2.2f, b = 2.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 2.82f, dy1 = 0.0f)
                close()
                moveTo(x = 21.77f, y = 2.23f)
                arcToRelative(a = 0.77f, b = 0.77f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.1f, dy1 = 0.0f)
                lineTo(x = 2.24f, y = 20.69f)
                arcToRelative(a = 0.77f, b = 0.77f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 1.09f)
                arcToRelative(a = 0.76f, b = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.08f, dy1 = -0.01f)
                lineTo(x = 21.77f, y = 3.3f)
                arcToRelative(a = 0.74f, b = 0.74f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = -1.08f)
                moveTo(x = 8.0f, y = 10.38f)
                arcToRelative(a = 2.38f, b = 2.38f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = 0.0f, dy1 = -4.76f)
                arcToRelative(a = 2.38f, b = 2.38f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 4.76f)
            }
        }.build().also { _gallerySlash = it }
    }

@Suppress("ObjectPropertyName")
private var _gallerySlash: ImageVector? = null
