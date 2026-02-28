package com.github.yohannestz.iconsax_compose.iconsax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Map: ImageVector
    get() {
        val current = _map
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Map",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 9.15f, y = 7.49f)
                curveToRelative(dx1 = -0.56f, dy1 = 0.0f, dx2 = -1.0f, dy2 = 0.45f, dx3 = -1.0f, dy3 = 1.0f)
                reflectiveCurveToRelative(dx1 = 0.45f, dy1 = 1.0f, dx2 = 1.0f, dy2 = 1.0f)
                reflectiveCurveToRelative(dx1 = 1.0f, dy1 = -0.45f, dx2 = 1.0f, dy2 = -1.0f)
                reflectiveCurveToRelative(dx1 = -0.45f, dy1 = -1.0f, dx2 = -1.0f, dy2 = -1.0f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 21.46f, y = 5.04f)
                curveTo(x1 = 20.62f, y1 = 3.09f, x2 = 18.77f, y2 = 2.0f, x3 = 16.19f, y3 = 2.0f)
                horizontalLineTo(x = 7.81f)
                arcTo(horizontalEllipseRadius = 5.8f, verticalEllipseRadius = 5.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 2.0f, y1 = 7.81f)
                verticalLineToRelative(dy = 8.38f)
                curveToRelative(dx1 = 0.0f, dy1 = 2.58f, dx2 = 1.09f, dy2 = 4.43f, dx3 = 3.04f, dy3 = 5.27f)
                arcToRelative(a = 0.5f, b = 0.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.55f, dy1 = -0.11f)
                lineTo(x = 21.35f, y = 5.59f)
                arcToRelative(a = 0.5f, b = 0.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.11f, dy1 = -0.55f)
                moveToRelative(dx = -10.93f, dy = 7.2f)
                arcToRelative(a = 2.05f, b = 2.05f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -2.82f, dy1 = 0.0f)
                curveTo(x1 = 6.69f, y1 = 11.28f, x2 = 5.57f, y2 = 9.75f, x3 = 6.0f, y3 = 7.93f)
                curveToRelative(dx1 = 0.38f, dy1 = -1.65f, dx2 = 1.84f, dy2 = -2.39f, dx3 = 3.12f, dy3 = -2.39f)
                reflectiveCurveToRelative(dx1 = 2.74f, dy1 = 0.74f, dx2 = 3.12f, dy2 = 2.4f)
                curveToRelative(dx1 = 0.42f, dy1 = 1.81f, dx2 = -0.7f, dy2 = 3.34f, dx3 = -1.71f, dy3 = 4.3f)
                moveToRelative(dx = 8.94f, dy = 8.29f)
                curveToRelative(dx1 = 0.22f, dy1 = 0.22f, dx2 = 0.19f, dy2 = 0.58f, dx3 = -0.08f, dy3 = 0.73f)
                arcToRelative(a = 6.5f, b = 6.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -3.2f, dy1 = 0.74f)
                horizontalLineTo(x = 7.8f)
                curveToRelative(dx1 = -0.3f, dy1 = 0.0f, dx2 = -0.41f, dy2 = -0.34f, dx3 = -0.21f, dy3 = -0.54f)
                lineToRelative(dx = 6.04f, dy = -6.04f)
                arcToRelative(a = 0.5f, b = 0.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.7f, dy1 = 0.0f)
                close()
                moveTo(x = 22.0f, y = 7.81f)
                verticalLineToRelative(dy = 8.38f)
                arcToRelative(a = 6.5f, b = 6.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.74f, dy1 = 3.2f)
                curveToRelative(dx1 = -0.15f, dy1 = 0.27f, dx2 = -0.5f, dy2 = 0.29f, dx3 = -0.73f, dy3 = 0.08f)
                lineToRelative(dx = -5.12f, dy = -5.12f)
                arcToRelative(a = 0.5f, b = 0.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = -0.71f)
                lineToRelative(dx = 6.04f, dy = -6.04f)
                curveTo(x1 = 21.66f, y1 = 7.4f, x2 = 22.0f, y2 = 7.52f, x3 = 22.0f, y3 = 7.8f)
            }
        }.build().also { _map = it }
    }

@Suppress("ObjectPropertyName")
private var _map: ImageVector? = null
