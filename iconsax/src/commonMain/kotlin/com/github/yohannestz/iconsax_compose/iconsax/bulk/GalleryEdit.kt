package com.github.yohannestz.iconsax_compose.iconsax.bulk

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val GalleryEdit: ImageVector
    get() {
        val current = _galleryEdit
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.GalleryEdit",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 22.0f, y = 13.9f)
                verticalLineToRelative(dy = 2.29f)
                curveToRelative(dx1 = 0.0f, dy1 = 3.64f, dx2 = -2.17f, dy2 = 5.8f, dx3 = -5.81f, dy3 = 5.8f)
                horizontalLineTo(x = 7.8f)
                curveToRelative(dx1 = -2.55f, dy1 = 0.0f, dx2 = -4.4f, dy2 = -1.06f, dx3 = -5.25f, dy3 = -2.96f)
                lineToRelative(dx = 0.1f, dy = -0.08f)
                lineToRelative(dx = 4.93f, dy = -3.3f)
                arcToRelative(a = 2.2f, b = 2.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 2.64f, dy1 = 0.14f)
                lineToRelative(dx = 0.34f, dy = 0.28f)
                arcToRelative(a = 2.2f, b = 2.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 2.82f, dy1 = 0.0f)
                lineToRelative(dx = 4.16f, dy = -3.57f)
                arcToRelative(a = 2.2f, b = 2.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 2.82f, dy1 = 0.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
                fillAlpha = 0.4f,
                strokeAlpha = 0.4f,
            ) {
                moveTo(x = 20.97f, y = 8.0f)
                horizontalLineToRelative(dx = -2.94f)
                curveTo(x1 = 16.76f, y1 = 8.0f, x2 = 16.0f, y2 = 7.24f, x3 = 16.0f, y3 = 5.97f)
                verticalLineTo(y = 3.03f)
                quadToRelative(dx1 = 0.0f, dy1 = -0.6f, dx2 = 0.22f, dy2 = -1.03f)
                horizontalLineTo(x = 7.81f)
                curveTo(x1 = 4.17f, y1 = 2.0f, x2 = 2.0f, y2 = 4.17f, x3 = 2.0f, y3 = 7.81f)
                verticalLineToRelative(dy = 8.38f)
                arcToRelative(a = 7.0f, b = 7.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.56f, dy1 = 2.84f)
                lineToRelative(dx = 0.11f, dy = -0.08f)
                lineToRelative(dx = 4.92f, dy = -3.3f)
                arcToRelative(a = 2.2f, b = 2.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 2.64f, dy1 = 0.14f)
                lineToRelative(dx = 0.34f, dy = 0.28f)
                arcToRelative(a = 2.2f, b = 2.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 2.82f, dy1 = 0.0f)
                lineToRelative(dx = 4.16f, dy = -3.57f)
                arcToRelative(a = 2.2f, b = 2.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 2.82f, dy1 = 0.0f)
                lineTo(x = 22.0f, y = 13.9f)
                verticalLineTo(y = 7.78f)
                arcTo(horizontalEllipseRadius = 2.3f, verticalEllipseRadius = 2.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 20.97f, y1 = 8.0f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 9.0f, y = 10.38f)
                arcToRelative(a = 2.38f, b = 2.38f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = 0.0f, dy1 = -4.76f)
                arcToRelative(a = 2.38f, b = 2.38f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 4.76f)
                moveTo(x = 20.97f, y = 1.0f)
                horizontalLineToRelative(dx = -2.94f)
                curveTo(x1 = 16.76f, y1 = 1.0f, x2 = 16.0f, y2 = 1.76f, x3 = 16.0f, y3 = 3.03f)
                verticalLineToRelative(dy = 2.94f)
                curveTo(x1 = 16.0f, y1 = 7.24f, x2 = 16.76f, y2 = 8.0f, x3 = 18.03f, y3 = 8.0f)
                horizontalLineToRelative(dx = 2.94f)
                curveTo(x1 = 22.24f, y1 = 8.0f, x2 = 23.0f, y2 = 7.24f, x3 = 23.0f, y3 = 5.97f)
                verticalLineTo(y = 3.03f)
                curveTo(x1 = 23.0f, y1 = 1.76f, x2 = 22.24f, y2 = 1.0f, x3 = 20.97f, y3 = 1.0f)
                moveToRelative(dx = -1.96f, dy = 5.57f)
                arcToRelative(a = 0.3f, b = 0.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.15f, dy1 = 0.07f)
                lineToRelative(dx = -1.04f, dy = 0.15f)
                lineToRelative(dx = -0.1f, dy = 0.01f)
                arcToRelative(a = 0.5f, b = 0.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.37f, dy1 = -0.15f)
                arcToRelative(a = 0.5f, b = 0.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.14f, dy1 = -0.47f)
                lineToRelative(dx = 0.15f, dy = -1.04f)
                lineToRelative(dx = 0.07f, dy = -0.15f)
                lineToRelative(dx = 1.7f, dy = -1.7f)
                lineToRelative(dx = 0.09f, dy = 0.23f)
                lineToRelative(dx = 0.12f, dy = 0.22f)
                lineToRelative(dx = 0.11f, dy = 0.16f)
                lineToRelative(dx = 0.11f, dy = 0.15f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.32f, dy1 = 0.33f)
                lineToRelative(dx = 0.05f, dy = 0.04f)
                lineToRelative(dx = 0.15f, dy = 0.12f)
                lineToRelative(dx = 0.17f, dy = 0.11f)
                lineToRelative(dx = 0.46f, dy = 0.21f)
                close()
                moveToRelative(dx = 2.39f, dy = -2.39f)
                lineTo(x = 21.08f, y = 4.5f)
                arcTo(horizontalEllipseRadius = 0.1f, verticalEllipseRadius = 0.1f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 21.0f, y1 = 4.54f)
                horizontalLineToRelative(dx = -0.03f)
                arcToRelative(a = 2.2f, b = 2.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.5f, dy1 = -1.5f)
                arcToRelative(a = 0.1f, b = 0.1f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.03f, dy1 = -0.11f)
                lineToRelative(dx = 0.33f, dy = -0.33f)
                quadToRelative(dx1 = 0.8f, dy1 = -0.8f, dx2 = 1.58f, dy2 = 0.0f)
                quadToRelative(dx1 = 0.4f, dy1 = 0.4f, dx2 = 0.4f, dy2 = 0.79f)
                quadToRelative(dx1 = -0.01f, dy1 = 0.39f, dx2 = -0.41f, dy2 = 0.79f)
            }
        }.build().also { _galleryEdit = it }
    }

@Suppress("ObjectPropertyName")
private var _galleryEdit: ImageVector? = null
