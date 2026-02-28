package com.github.yohannestz.iconsax_compose.iconsax.bulk

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MusicDashboard: ImageVector
    get() {
        val current = _musicDashboard
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.MusicDashboard",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 7.0f, y = 2.05f)
                verticalLineToRelative(dy = 19.9f)
                curveToRelative(dx1 = -3.15f, dy1 = -0.29f, dx2 = -5.0f, dy2 = -2.4f, dx3 = -5.0f, dy3 = -5.76f)
                verticalLineTo(y = 7.81f)
                curveToRelative(dx1 = 0.0f, dy1 = -3.36f, dx2 = 1.85f, dy2 = -5.47f, dx3 = 5.0f, dy3 = -5.76f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
                fillAlpha = 0.4f,
                strokeAlpha = 0.4f,
            ) {
                moveTo(x = 22.0f, y = 7.81f)
                verticalLineToRelative(dy = 8.38f)
                curveToRelative(dx1 = 0.0f, dy1 = 3.64f, dx2 = -2.17f, dy2 = 5.81f, dx3 = -5.81f, dy3 = 5.81f)
                horizontalLineTo(x = 7.81f)
                arcTo(horizontalEllipseRadius = 5.0f, verticalEllipseRadius = 5.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 7.0f, y1 = 21.95f)
                verticalLineTo(y = 2.05f)
                arcTo(horizontalEllipseRadius = 5.0f, verticalEllipseRadius = 5.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 7.81f, y1 = 2.0f)
                horizontalLineToRelative(dx = 8.38f)
                curveTo(x1 = 19.83f, y1 = 2.0f, x2 = 22.0f, y2 = 4.17f, x3 = 22.0f, y3 = 7.81f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 18.49f, y = 6.8f)
                curveToRelative(dx1 = -0.32f, dy1 = -0.25f, dx2 = -0.9f, dy2 = -0.5f, dx3 = -1.82f, dy3 = -0.24f)
                lineToRelative(dx = -2.98f, dy = 0.82f)
                arcToRelative(a = 1.9f, b = 1.9f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.47f, dy1 = 1.92f)
                verticalLineToRelative(dy = 3.9f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.74f, dy1 = -0.13f)
                arcToRelative(a = 2.24f, b = 2.24f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -2.24f, dy1 = 2.24f)
                arcToRelative(a = 2.25f, b = 2.25f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 2.24f, dy1 = 2.24f)
                arcToRelative(a = 2.25f, b = 2.25f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 2.24f, dy1 = -2.2f)
                verticalLineToRelative(dy = -3.73f)
                lineToRelative(dx = 3.98f, dy = -1.08f)
                verticalLineToRelative(dy = 1.68f)
                arcToRelative(a = 2.24f, b = 2.24f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = 1.49f, dy1 = 2.13f)
                verticalLineTo(y = 8.48f)
                quadToRelative(dx1 = -0.01f, dy1 = -1.14f, dx2 = -0.7f, dy2 = -1.68f)
                moveToRelative(dx = -7.02f, dy = 9.25f)
                arcToRelative(a = 0.74f, b = 0.74f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = true, dx1 = 0.0f, dy1 = -1.48f)
                arcToRelative(a = 0.74f, b = 0.74f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = true, dx1 = 0.0f, dy1 = 1.48f)
                moveToRelative(dx = 5.46f, dy = -1.0f)
                arcToRelative(a = 0.74f, b = 0.74f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = true, dx1 = 0.0f, dy1 = -1.48f)
                arcToRelative(a = 0.74f, b = 0.74f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = true, dx1 = 0.0f, dy1 = 1.48f)
            }
        }.build().also { _musicDashboard = it }
    }

@Suppress("ObjectPropertyName")
private var _musicDashboard: ImageVector? = null
