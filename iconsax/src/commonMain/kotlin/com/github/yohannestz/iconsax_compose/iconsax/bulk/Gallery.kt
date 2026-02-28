package com.github.yohannestz.iconsax_compose.iconsax.bulk

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gallery: ImageVector
    get() {
        val current = _gallery
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Gallery",
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
                moveTo(x = 22.0f, y = 7.81f)
                verticalLineToRelative(dy = 6.09f)
                lineToRelative(dx = -1.63f, dy = -1.4f)
                arcToRelative(a = 2.2f, b = 2.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -2.82f, dy1 = 0.0f)
                lineToRelative(dx = -4.16f, dy = 3.57f)
                arcToRelative(a = 2.2f, b = 2.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -2.82f, dy1 = 0.0f)
                lineToRelative(dx = -0.34f, dy = -0.28f)
                arcToRelative(a = 2.2f, b = 2.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -2.64f, dy1 = -0.14f)
                lineToRelative(dx = -4.92f, dy = 3.3f)
                lineToRelative(dx = -0.11f, dy = 0.08f)
                arcTo(horizontalEllipseRadius = 7.0f, verticalEllipseRadius = 7.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 2.0f, y1 = 16.19f)
                verticalLineTo(y = 7.81f)
                curveTo(x1 = 2.0f, y1 = 4.17f, x2 = 4.17f, y2 = 2.0f, x3 = 7.81f, y3 = 2.0f)
                horizontalLineToRelative(dx = 8.38f)
                curveTo(x1 = 19.83f, y1 = 2.0f, x2 = 22.0f, y2 = 4.17f, x3 = 22.0f, y3 = 7.81f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 9.0f, y = 10.38f)
                arcToRelative(a = 2.38f, b = 2.38f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = 0.0f, dy1 = -4.76f)
                arcToRelative(a = 2.38f, b = 2.38f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 4.76f)
                moveToRelative(dx = 13.0f, dy = 3.52f)
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
        }.build().also { _gallery = it }
    }

@Suppress("ObjectPropertyName")
private var _gallery: ImageVector? = null
