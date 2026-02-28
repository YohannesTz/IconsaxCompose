package com.github.yohannestz.iconsax_compose.iconsax.bulk

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val HeartAdd: ImageVector
    get() {
        val current = _heartAdd
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.HeartAdd",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 20.68f, y = 13.9f)
                arcToRelative(a = 4.8f, b = 4.8f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = 0.0f, dy1 = 0.01f)
                moveTo(x = 18.99f, y = 18.0f)
                horizontalLineToRelative(dx = -1.04f)
                verticalLineToRelative(dy = 1.1f)
                curveToRelative(dx1 = 0.0f, dy1 = 0.4f, dx2 = -0.34f, dy2 = 0.75f, dx3 = -0.75f, dy3 = 0.75f)
                reflectiveCurveToRelative(dx1 = -0.75f, dy1 = -0.34f, dx2 = -0.75f, dy2 = -0.75f)
                verticalLineTo(y = 18.0f)
                horizontalLineToRelative(dx = -1.04f)
                arcToRelative(a = 0.74f, b = 0.74f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.75f, dy1 = -0.74f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.74f, dy1 = -0.75f)
                horizontalLineToRelative(dx = 1.05f)
                verticalLineToRelative(dy = -1.0f)
                lineToRelative(dx = 0.01f, dy = -0.06f)
                arcToRelative(a = 0.74f, b = 0.74f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.74f, dy1 = -0.7f)
                curveToRelative(dx1 = 0.4f, dy1 = 0.0f, dx2 = 0.73f, dy2 = 0.33f, dx3 = 0.75f, dy3 = 0.73f)
                verticalLineToRelative(dy = 1.03f)
                horizontalLineToRelative(dx = 1.04f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.75f, dy1 = 0.75f)
                arcToRelative(a = 0.74f, b = 0.74f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.75f, dy1 = 0.75f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
                fillAlpha = 0.4f,
                strokeAlpha = 0.4f,
            ) {
                moveTo(x = 22.0f, y = 8.7f)
                arcToRelative(a = 10.7f, b = 10.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.32f, dy1 = 5.2f)
                arcToRelative(a = 4.8f, b = 4.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -7.05f, dy1 = 6.5f)
                arcToRelative(a = 10.0f, b = 10.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.01f, dy1 = 0.41f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.24f, dy1 = 0.0f)
                curveToRelative(dx1 = -2.41f, dy1 = -0.82f, dx2 = -7.28f, dy2 = -3.8f, dx3 = -8.86f, dy3 = -8.8f)
                arcTo(horizontalEllipseRadius = 11.0f, verticalEllipseRadius = 11.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 2.0f, y1 = 8.68f)
                arcToRelative(a = 5.55f, b = 5.55f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 10.0f, dy1 = -3.36f)
                arcToRelative(a = 5.6f, b = 5.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 4.44f, dy1 = -2.23f)
                curveTo(x1 = 19.51f, y1 = 3.1f, x2 = 22.0f, y2 = 5.6f, x3 = 22.0f, y3 = 8.7f)
            }
        }.build().also { _heartAdd = it }
    }

@Suppress("ObjectPropertyName")
private var _heartAdd: ImageVector? = null
