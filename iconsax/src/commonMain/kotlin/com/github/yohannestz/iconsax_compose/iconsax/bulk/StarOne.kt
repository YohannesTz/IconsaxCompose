package com.github.yohannestz.iconsax_compose.iconsax.bulk

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val StarOne: ImageVector
    get() {
        val current = _starOne
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.StarOne",
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
                moveTo(x = 5.74f, y = 16.0f)
                arcToRelative(a = 1.9f, b = 1.9f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.44f, dy1 = -1.54f)
                lineToRelative(dx = -2.43f, dy = -2.43f)
                curveToRelative(dx1 = -0.76f, dy1 = -0.76f, dx2 = -1.06f, dy2 = -1.57f, dx3 = -0.84f, dy3 = -2.27f)
                reflectiveCurveToRelative(dx1 = 0.94f, dy1 = -1.18f, dx2 = 2.0f, dy2 = -1.36f)
                lineToRelative(dx = 3.12f, dy = -0.52f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.21f, dy1 = -0.89f)
                lineToRelative(dx = 1.72f, dy = -3.45f)
                curveTo(x1 = 10.58f, y1 = 2.55f, x2 = 11.26f, y2 = 2.0f, x3 = 12.0f, y3 = 2.0f)
                reflectiveCurveToRelative(dx1 = 1.42f, dy1 = 0.55f, dx2 = 1.92f, dy2 = 1.54f)
                lineToRelative(dx = 1.72f, dy = 3.45f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.69f, dy1 = 0.68f)
                lineTo(x = 5.56f, y = 18.44f)
                curveToRelative(dx1 = -0.14f, dy1 = 0.14f, dx2 = -0.38f, dy2 = 0.01f, dx3 = -0.34f, dy3 = -0.19f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 18.7f, y = 14.46f)
                arcTo(horizontalEllipseRadius = 1.8f, verticalEllipseRadius = 1.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 18.26f, y1 = 16.0f)
                lineToRelative(dx = 0.69f, dy = 3.01f)
                curveToRelative(dx1 = 0.29f, dy1 = 1.25f, dx2 = 0.11f, dy2 = 2.2f, dx3 = -0.51f, dy3 = 2.64f)
                arcToRelative(a = 1.5f, b = 1.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.9f, dy1 = 0.27f)
                arcToRelative(a = 3.6f, b = 3.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.77f, dy1 = -0.58f)
                lineToRelative(dx = -2.93f, dy = -1.74f)
                arcToRelative(a = 1.8f, b = 1.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.68f, dy1 = 0.0f)
                lineToRelative(dx = -2.93f, dy = 1.74f)
                curveTo(x1 = 7.12f, y1 = 22.0f, x2 = 6.17f, y2 = 22.1f, x3 = 5.56f, y3 = 21.65f)
                arcToRelative(a = 1.5f, b = 1.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.51f, dy1 = -0.7f)
                lineTo(x = 17.21f, y = 8.8f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.74f, dy1 = -0.56f)
                lineToRelative(dx = 1.01f, dy = 0.17f)
                curveToRelative(dx1 = 1.06f, dy1 = 0.18f, dx2 = 1.77f, dy2 = 0.66f, dx3 = 2.0f, dy3 = 1.36f)
                reflectiveCurveToRelative(dx1 = -0.08f, dy1 = 1.51f, dx2 = -0.84f, dy2 = 2.27f)
                close()
            }
        }.build().also { _starOne = it }
    }

@Suppress("ObjectPropertyName")
private var _starOne: ImageVector? = null
