package com.github.yohannestz.iconsax_compose.iconsax.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Home: ImageVector
    get() {
        val current = _home
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Home",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 12.0f, y = 18.75f)
                arcTo(horizontalEllipseRadius = 0.76f, verticalEllipseRadius = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 11.25f, y1 = 18.0f)
                verticalLineToRelative(dy = -3.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.41f, dx2 = 0.34f, dy2 = -0.75f, dx3 = 0.75f, dy3 = -0.75f)
                reflectiveCurveToRelative(dx1 = 0.75f, dy1 = 0.34f, dx2 = 0.75f, dy2 = 0.75f)
                verticalLineToRelative(dy = 3.0f)
                arcTo(horizontalEllipseRadius = 0.76f, verticalEllipseRadius = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 12.0f, y1 = 18.75f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 17.6f, y = 22.56f)
                horizontalLineTo(x = 6.4f)
                arcToRelative(a = 3.9f, b = 3.9f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -3.78f, dy1 = -3.19f)
                lineTo(x = 1.29f, y = 11.4f)
                arcToRelative(a = 4.1f, b = 4.1f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.38f, dy1 = -3.62f)
                lineTo(x = 9.6f, y = 2.23f)
                arcToRelative(a = 3.96f, b = 3.96f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 4.8f, dy1 = 0.01f)
                lineToRelative(dx = 6.93f, dy = 5.54f)
                arcToRelative(a = 4.2f, b = 4.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.38f, dy1 = 3.62f)
                lineToRelative(dx = -1.33f, dy = 7.96f)
                curveToRelative(dx1 = -0.3f, dy1 = 1.77f, dx2 = -2.0f, dy2 = 3.2f, dx3 = -3.78f, dy3 = 3.2f)
                moveTo(x = 11.99f, y = 2.93f)
                arcToRelative(a = 2.4f, b = 2.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.45f, dy1 = 0.47f)
                lineTo(x = 3.61f, y = 8.96f)
                arcToRelative(a = 2.7f, b = 2.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.84f, dy1 = 2.2f)
                lineToRelative(dx = 1.33f, dy = 7.96f)
                arcToRelative(a = 2.45f, b = 2.45f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 2.3f, dy1 = 1.94f)
                horizontalLineToRelative(dx = 11.2f)
                arcToRelative(a = 2.45f, b = 2.45f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 2.3f, dy1 = -1.95f)
                lineToRelative(dx = 1.33f, dy = -7.96f)
                arcToRelative(a = 2.7f, b = 2.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.84f, dy1 = -2.2f)
                lineToRelative(dx = -6.93f, dy = -5.54f)
                arcToRelative(a = 2.4f, b = 2.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.47f, dy1 = -0.48f)
            }
        }.build().also { _home = it }
    }

@Suppress("ObjectPropertyName")
private var _home: ImageVector? = null
