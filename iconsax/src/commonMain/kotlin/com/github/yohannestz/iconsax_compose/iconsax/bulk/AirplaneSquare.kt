package com.github.yohannestz.iconsax_compose.iconsax.bulk

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val AirplaneSquare: ImageVector
    get() {
        val current = _airplaneSquare
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.AirplaneSquare",
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
                moveTo(x = 16.19f, y = 2.0f)
                horizontalLineTo(x = 7.81f)
                curveTo(x1 = 4.17f, y1 = 2.0f, x2 = 2.0f, y2 = 4.17f, x3 = 2.0f, y3 = 7.81f)
                verticalLineToRelative(dy = 8.37f)
                curveTo(x1 = 2.0f, y1 = 19.83f, x2 = 4.17f, y2 = 22.0f, x3 = 7.81f, y3 = 22.0f)
                horizontalLineToRelative(dx = 8.37f)
                curveToRelative(dx1 = 3.64f, dy1 = 0.0f, dx2 = 5.81f, dy2 = -2.17f, dx3 = 5.81f, dy3 = -5.81f)
                verticalLineTo(y = 7.81f)
                curveTo(x1 = 22.0f, y1 = 4.17f, x2 = 19.83f, y2 = 2.0f, x3 = 16.19f, y3 = 2.0f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 9.86f, y = 19.0f)
                lineToRelative(dx = 1.68f, dy = -1.42f)
                arcToRelative(a = 0.8f, b = 0.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.93f, dy1 = 0.0f)
                lineTo(x = 14.14f, y = 19.0f)
                curveToRelative(dx1 = 0.39f, dy1 = 0.2f, dx2 = 0.87f, dy2 = 0.0f, dx3 = 1.01f, dy3 = -0.42f)
                lineToRelative(dx = 0.32f, dy = -0.96f)
                arcToRelative(a = 0.8f, b = 0.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.17f, dy1 = -0.74f)
                lineToRelative(dx = -1.64f, dy = -1.65f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.21f, dy1 = -0.51f)
                verticalLineToRelative(dy = -1.85f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.42f, dx2 = 0.31f, dy2 = -0.62f, dx3 = 0.7f, dy3 = -0.46f)
                lineToRelative(dx = 3.35f, dy = 1.44f)
                curveToRelative(dx1 = 0.55f, dy1 = 0.24f, dx2 = 1.01f, dy2 = -0.06f, dx3 = 1.01f, dy3 = -0.66f)
                verticalLineToRelative(dy = -0.93f)
                arcToRelative(a = 1.5f, b = 1.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.81f, dy1 = -1.23f)
                lineToRelative(dx = -3.94f, dy = -1.7f)
                arcToRelative(a = 0.5f, b = 0.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.3f, dy1 = -0.46f)
                verticalLineTo(y = 6.8f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.68f, dx2 = -0.5f, dy2 = -1.48f, dx3 = -1.1f, dy3 = -1.8f)
                arcToRelative(a = 0.8f, b = 0.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.69f, dy1 = 0.0f)
                arcToRelative(a = 2.2f, b = 2.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.1f, dy1 = 1.8f)
                verticalLineToRelative(dy = 2.07f)
                arcToRelative(a = 0.6f, b = 0.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.3f, dy1 = 0.46f)
                lineToRelative(dx = -3.94f, dy = 1.7f)
                arcToRelative(a = 1.5f, b = 1.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.81f, dy1 = 1.23f)
                verticalLineToRelative(dy = 0.93f)
                curveToRelative(dx1 = 0.0f, dy1 = 0.6f, dx2 = 0.45f, dy2 = 0.9f, dx3 = 1.01f, dy3 = 0.66f)
                lineToRelative(dx = 3.35f, dy = -1.44f)
                curveToRelative(dx1 = 0.38f, dy1 = -0.17f, dx2 = 0.7f, dy2 = 0.04f, dx3 = 0.7f, dy3 = 0.46f)
                verticalLineToRelative(dy = 1.85f)
                curveToRelative(dx1 = 0.0f, dy1 = 0.17f, dx2 = -0.1f, dy2 = 0.4f, dx3 = -0.21f, dy3 = 0.5f)
                lineTo(x = 8.7f, y = 16.88f)
                curveToRelative(dx1 = -0.17f, dy1 = 0.17f, dx2 = -0.25f, dy2 = 0.5f, dx3 = -0.17f, dy3 = 0.74f)
                lineToRelative(dx = 0.32f, dy = 0.96f)
                arcTo(horizontalEllipseRadius = 0.72f, verticalEllipseRadius = 0.72f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 9.86f, y1 = 19.0f)
            }
        }.build().also { _airplaneSquare = it }
    }

@Suppress("ObjectPropertyName")
private var _airplaneSquare: ImageVector? = null
