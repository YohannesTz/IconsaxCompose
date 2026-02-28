package com.github.yohannestz.iconsax_compose.iconsax.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Velas: ImageVector
    get() {
        val current = _velas
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Velas",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                moveTo(x = 22.0f, y = 3.78f)
                horizontalLineTo(x = 2.0f)
                curveToRelative(dx1 = -0.41f, dy1 = 0.0f, dx2 = -0.75f, dy2 = -0.34f, dx3 = -0.75f, dy3 = -0.75f)
                reflectiveCurveTo(x1 = 1.59f, y1 = 2.28f, x2 = 2.0f, y2 = 2.28f)
                horizontalLineToRelative(dx = 20.0f)
                curveToRelative(dx1 = 0.41f, dy1 = 0.0f, dx2 = 0.75f, dy2 = 0.34f, dx3 = 0.75f, dy3 = 0.75f)
                reflectiveCurveTo(x1 = 22.41f, y1 = 3.78f, x2 = 22.0f, y2 = 3.78f)
                moveTo(x = 12.0f, y = 21.72f)
                arcToRelative(a = 1.9f, b = 1.9f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.57f, dy1 = -0.85f)
                lineTo(x = 2.47f, y = 8.48f)
                arcToRelative(a = 1.86f, b = 1.86f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.56f, dy1 = -2.87f)
                horizontalLineToRelative(dx = 15.93f)
                arcToRelative(a = 1.9f, b = 1.9f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.63f, dy1 = 0.97f)
                arcToRelative(a = 1.9f, b = 1.9f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.07f, dy1 = 1.9f)
                lineToRelative(dx = -7.96f, dy = 12.39f)
                arcTo(horizontalEllipseRadius = 1.8f, verticalEllipseRadius = 1.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 12.0f, y1 = 21.72f)
                moveTo(x = 4.04f, y = 7.11f)
                arcTo(horizontalEllipseRadius = 0.4f, verticalEllipseRadius = 0.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 3.72f, y1 = 7.3f)
                arcToRelative(a = 0.4f, b = 0.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.01f, dy1 = 0.37f)
                lineToRelative(dx = 7.96f, dy = 12.39f)
                arcToRelative(a = 0.4f, b = 0.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.3f, dy1 = 0.17f)
                arcToRelative(a = 0.3f, b = 0.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.3f, dy1 = -0.17f)
                lineToRelative(dx = 7.96f, dy = -12.39f)
                arcToRelative(a = 0.4f, b = 0.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.01f, dy1 = -0.37f)
                arcToRelative(a = 0.3f, b = 0.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.32f, dy1 = -0.19f)
                close()
            }
        }.build().also { _velas = it }
    }

@Suppress("ObjectPropertyName")
private var _velas: ImageVector? = null
