package com.github.yohannestz.iconsax_compose.iconsax.bulk

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Threedcube: ImageVector
    get() {
        val current = _threedcube
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Threedcube",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 19.33f, y = 5.68f)
                lineTo(x = 13.06f, y = 2.3f)
                arcToRelative(a = 2.2f, b = 2.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -2.12f, dy1 = 0.0f)
                lineTo(x = 4.67f, y = 5.68f)
                arcToRelative(a = 1.4f, b = 1.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.74f, dy1 = 1.28f)
                arcToRelative(a = 1.4f, b = 1.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.74f, dy1 = 1.28f)
                lineToRelative(dx = 6.27f, dy = 3.38f)
                arcToRelative(a = 2.2f, b = 2.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 2.12f, dy1 = 0.0f)
                lineToRelative(dx = 6.27f, dy = -3.38f)
                curveToRelative(dx1 = 0.46f, dy1 = -0.25f, dx2 = 0.74f, dy2 = -0.73f, dx3 = 0.74f, dy3 = -1.28f)
                reflectiveCurveToRelative(dx1 = -0.28f, dy1 = -1.03f, dx2 = -0.74f, dy2 = -1.28f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
                fillAlpha = 0.4f,
                strokeAlpha = 0.4f,
            ) {
                moveTo(x = 9.91f, y = 12.79f)
                lineTo(x = 4.07f, y = 9.87f)
                arcTo(horizontalEllipseRadius = 1.43f, verticalEllipseRadius = 1.43f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 2.0f, y1 = 11.15f)
                verticalLineToRelative(dy = 5.51f)
                arcToRelative(a = 2.5f, b = 2.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.38f, dy1 = 2.24f)
                lineToRelative(dx = 5.83f, dy = 2.92f)
                arcToRelative(a = 1.4f, b = 1.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.39f, dy1 = -0.06f)
                arcToRelative(a = 1.4f, b = 1.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.68f, dy1 = -1.22f)
                verticalLineToRelative(dy = -5.51f)
                arcToRelative(a = 2.5f, b = 2.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.37f, dy1 = -2.24f)
                moveToRelative(dx = 11.41f, dy = -2.86f)
                arcToRelative(a = 1.4f, b = 1.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.39f, dy1 = -0.06f)
                lineToRelative(dx = -5.83f, dy = 2.92f)
                arcToRelative(a = 2.5f, b = 2.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.38f, dy1 = 2.24f)
                verticalLineToRelative(dy = 5.51f)
                curveToRelative(dx1 = 0.0f, dy1 = 0.5f, dx2 = 0.25f, dy2 = 0.96f, dx3 = 0.68f, dy3 = 1.22f)
                arcToRelative(a = 1.4f, b = 1.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.39f, dy1 = 0.06f)
                lineToRelative(dx = 5.83f, dy = -2.92f)
                arcTo(horizontalEllipseRadius = 2.5f, verticalEllipseRadius = 2.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 22.0f, y1 = 16.66f)
                verticalLineToRelative(dy = -5.51f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.5f, dx2 = -0.25f, dy2 = -0.95f, dx3 = -0.68f, dy3 = -1.22f)
            }
        }.build().also { _threedcube = it }
    }

@Suppress("ObjectPropertyName")
private var _threedcube: ImageVector? = null
