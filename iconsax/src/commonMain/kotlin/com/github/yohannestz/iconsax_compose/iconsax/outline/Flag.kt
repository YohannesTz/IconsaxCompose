package com.github.yohannestz.iconsax_compose.iconsax.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Flag: ImageVector
    get() {
        val current = _flag
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Flag",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 5.15f, y = 22.75f)
                arcTo(horizontalEllipseRadius = 0.76f, verticalEllipseRadius = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 4.4f, y1 = 22.0f)
                verticalLineTo(y = 2.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.41f, dx2 = 0.34f, dy2 = -0.75f, dx3 = 0.75f, dy3 = -0.75f)
                reflectiveCurveTo(x1 = 5.9f, y1 = 1.59f, x2 = 5.9f, y2 = 2.0f)
                verticalLineToRelative(dy = 20.0f)
                arcToRelative(a = 0.76f, b = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.75f, dy1 = 0.75f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 16.35f, y = 16.75f)
                horizontalLineTo(x = 5.15f)
                curveToRelative(dx1 = -0.41f, dy1 = 0.0f, dx2 = -0.75f, dy2 = -0.34f, dx3 = -0.75f, dy3 = -0.75f)
                reflectiveCurveToRelative(dx1 = 0.34f, dy1 = -0.75f, dx2 = 0.75f, dy2 = -0.75f)
                horizontalLineToRelative(dx = 11.2f)
                curveToRelative(dx1 = 1.09f, dy1 = 0.0f, dx2 = 1.6f, dy2 = -0.29f, dx3 = 1.7f, dy3 = -0.54f)
                reflectiveCurveTo(x1 = 18.0f, y1 = 13.9f, x2 = 17.22f, y2 = 13.13f)
                lineToRelative(dx = -1.2f, dy = -1.2f)
                arcToRelative(a = 2.5f, b = 2.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.82f, dy1 = -1.8f)
                arcToRelative(a = 2.8f, b = 2.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.82f, dy1 = -2.06f)
                lineToRelative(dx = 1.2f, dy = -1.2f)
                curveToRelative(dx1 = 0.74f, dy1 = -0.74f, dx2 = 0.97f, dy2 = -1.34f, dx3 = 0.86f, dy3 = -1.6f)
                reflectiveCurveToRelative(dx1 = -0.68f, dy1 = -0.52f, dx2 = -1.73f, dy2 = -0.52f)
                horizontalLineTo(x = 5.15f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = true, dx1 = 0.0f, dy1 = -1.5f)
                horizontalLineToRelative(dx = 11.2f)
                curveToRelative(dx1 = 2.19f, dy1 = 0.0f, dx2 = 2.89f, dy2 = 0.91f, dx3 = 3.12f, dy3 = 1.45f)
                reflectiveCurveToRelative(dx1 = 0.37f, dy1 = 1.68f, dx2 = -1.19f, dy2 = 3.24f)
                lineToRelative(dx = -1.2f, dy = 1.2f)
                arcToRelative(a = 1.3f, b = 1.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.38f, dy1 = 0.95f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.34f, dy1 = 0.76f)
                lineToRelative(dx = 1.24f, dy = 1.23f)
                curveToRelative(dx1 = 1.53f, dy1 = 1.53f, dx2 = 1.38f, dy2 = 2.67f, dx3 = 1.16f, dy3 = 3.22f)
                curveToRelative(dx1 = -0.23f, dy1 = 0.53f, dx2 = -0.94f, dy2 = 1.45f, dx3 = -3.09f, dy3 = 1.45f)
            }
        }.build().also { _flag = it }
    }

@Suppress("ObjectPropertyName")
private var _flag: ImageVector? = null
