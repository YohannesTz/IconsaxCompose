package com.github.yohannestz.iconsax_compose.iconsax.bulk

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val VideoPlay: ImageVector
    get() {
        val current = _videoPlay
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.VideoPlay",
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
                verticalLineToRelative(dy = 8.38f)
                curveToRelative(dx1 = 0.0f, dy1 = 3.64f, dx2 = -2.17f, dy2 = 5.81f, dx3 = -5.81f, dy3 = 5.81f)
                horizontalLineTo(x = 7.81f)
                curveTo(x1 = 4.17f, y1 = 22.0f, x2 = 2.0f, y2 = 19.83f, x3 = 2.0f, y3 = 16.19f)
                verticalLineTo(y = 7.81f)
                quadToRelative(dx1 = 0.0f, dy1 = -0.77f, dx2 = 0.13f, dy2 = -1.45f)
                curveTo(x1 = 2.64f, y1 = 3.61f, x2 = 4.67f, y2 = 2.01f, x3 = 7.77f, y3 = 2.0f)
                horizontalLineToRelative(dx = 8.46f)
                curveToRelative(dx1 = 3.1f, dy1 = 0.01f, dx2 = 5.13f, dy2 = 1.61f, dx3 = 5.64f, dy3 = 4.36f)
                arcTo(horizontalEllipseRadius = 8.0f, verticalEllipseRadius = 8.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 22.0f, y1 = 7.81f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 22.0f, y = 7.81f)
                verticalLineToRelative(dy = 0.05f)
                horizontalLineTo(x = 2.0f)
                verticalLineTo(y = 7.81f)
                quadToRelative(dx1 = 0.0f, dy1 = -0.77f, dx2 = 0.13f, dy2 = -1.45f)
                horizontalLineToRelative(dx = 5.64f)
                verticalLineTo(y = 2.0f)
                horizontalLineToRelative(dx = 1.5f)
                verticalLineToRelative(dy = 4.36f)
                horizontalLineToRelative(dx = 5.46f)
                verticalLineTo(y = 2.0f)
                horizontalLineToRelative(dx = 1.5f)
                verticalLineToRelative(dy = 4.36f)
                horizontalLineToRelative(dx = 5.64f)
                arcTo(horizontalEllipseRadius = 8.0f, verticalEllipseRadius = 8.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 22.0f, y1 = 7.81f)
                moveToRelative(dx = -7.56f, dy = 4.91f)
                lineToRelative(dx = -2.08f, dy = -1.2f)
                curveToRelative(dx1 = -0.77f, dy1 = -0.44f, dx2 = -1.5f, dy2 = -0.5f, dx3 = -2.09f, dy3 = -0.17f)
                reflectiveCurveToRelative(dx1 = -0.9f, dy1 = 1.01f, dx2 = -0.9f, dy2 = 1.89f)
                verticalLineToRelative(dy = 2.4f)
                curveToRelative(dx1 = 0.0f, dy1 = 0.88f, dx2 = 0.32f, dy2 = 1.56f, dx3 = 0.9f, dy3 = 1.89f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.82f, dy1 = 0.21f)
                arcToRelative(a = 2.6f, b = 2.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.27f, dy1 = -0.38f)
                lineToRelative(dx = 2.08f, dy = -1.2f)
                curveToRelative(dx1 = 0.77f, dy1 = -0.44f, dx2 = 1.2f, dy2 = -1.06f, dx3 = 1.2f, dy3 = -1.73f)
                reflectiveCurveToRelative(dx1 = -0.44f, dy1 = -1.26f, dx2 = -1.2f, dy2 = -1.71f)
            }
        }.build().also { _videoPlay = it }
    }

@Suppress("ObjectPropertyName")
private var _videoPlay: ImageVector? = null
