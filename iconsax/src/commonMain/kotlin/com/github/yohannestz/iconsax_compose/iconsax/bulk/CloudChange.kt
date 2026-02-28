package com.github.yohannestz.iconsax_compose.iconsax.bulk

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val CloudChange: ImageVector
    get() {
        val current = _cloudChange
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.CloudChange",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 8.11f, y = 11.85f)
                curveToRelative(dx1 = -2.82f, dy1 = 0.2f, dx2 = -2.81f, dy2 = 4.3f, dx3 = 0.0f, dy3 = 4.5f)
                horizontalLineToRelative(dx = 6.67f)
                arcToRelative(a = 3.2f, b = 3.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 2.19f, dy1 = -0.84f)
                curveToRelative(dx1 = 1.98f, dy1 = -1.73f, dx2 = 0.92f, dy2 = -5.2f, dx3 = -1.68f, dy3 = -5.53f)
                curveToRelative(dx1 = -0.93f, dy1 = -5.64f, dx2 = -9.08f, dy2 = -3.5f, dx3 = -7.15f, dy3 = 1.87f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
                fillAlpha = 0.4f,
                strokeAlpha = 0.4f,
            ) {
                moveTo(x = 9.0f, y = 22.75f)
                arcTo(horizontalEllipseRadius = 7.76f, verticalEllipseRadius = 7.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 1.25f, y1 = 15.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.41f, dx2 = 0.34f, dy2 = -0.75f, dx3 = 0.75f, dy3 = -0.75f)
                reflectiveCurveTo(x1 = 2.75f, y1 = 14.59f, x2 = 2.75f, y2 = 15.0f)
                arcToRelative(a = 6.26f, b = 6.26f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 4.83f, dy1 = 6.09f)
                lineToRelative(dx = -0.27f, dy = -0.45f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = true, dx1 = 1.29f, dy1 = -0.77f)
                lineToRelative(dx = 1.05f, dy = 1.75f)
                arcToRelative(a = 0.8f, b = 0.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.01f, dy1 = 0.75f)
                arcTo(horizontalEllipseRadius = 0.8f, verticalEllipseRadius = 0.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 9.0f, y1 = 22.75f)
                moveToRelative(dx = 13.0f, dy = -13.0f)
                arcTo(horizontalEllipseRadius = 0.76f, verticalEllipseRadius = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 21.25f, y1 = 9.0f)
                arcToRelative(a = 6.26f, b = 6.26f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -4.83f, dy1 = -6.09f)
                lineToRelative(dx = 0.27f, dy = 0.45f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = true, dx1 = -1.29f, dy1 = 0.77f)
                lineToRelative(dx = -1.05f, dy = -1.75f)
                arcToRelative(a = 0.8f, b = 0.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.01f, dy1 = -0.75f)
                arcToRelative(a = 0.7f, b = 0.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.65f, dy1 = -0.38f)
                arcTo(horizontalEllipseRadius = 7.76f, verticalEllipseRadius = 7.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 22.74f, y1 = 9.0f)
                arcTo(horizontalEllipseRadius = 0.74f, verticalEllipseRadius = 0.74f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 22.0f, y1 = 9.75f)
            }
        }.build().also { _cloudChange = it }
    }

@Suppress("ObjectPropertyName")
private var _cloudChange: ImageVector? = null
