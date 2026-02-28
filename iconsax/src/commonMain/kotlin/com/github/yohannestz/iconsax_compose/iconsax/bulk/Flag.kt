package com.github.yohannestz.iconsax_compose.iconsax.bulk

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
                moveTo(x = 5.15f, y = 22.0f)
                arcToRelative(a = 0.76f, b = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.75f, dy1 = -0.75f)
                verticalLineTo(y = 2.75f)
                curveTo(x1 = 4.4f, y1 = 2.34f, x2 = 4.74f, y2 = 2.0f, x3 = 5.15f, y3 = 2.0f)
                reflectiveCurveTo(x1 = 5.9f, y1 = 2.34f, x2 = 5.9f, y2 = 2.75f)
                verticalLineToRelative(dy = 18.5f)
                arcTo(horizontalEllipseRadius = 0.76f, verticalEllipseRadius = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 5.15f, y1 = 22.0f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
                fillAlpha = 0.4f,
                strokeAlpha = 0.4f,
            ) {
                moveTo(x = 18.02f, y = 12.33f)
                lineToRelative(dx = -1.22f, dy = -1.22f)
                arcToRelative(a = 1.4f, b = 1.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.47f, dy1 = -1.03f)
                arcToRelative(a = 1.7f, b = 1.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.49f, dy1 = -1.23f)
                lineToRelative(dx = 1.2f, dy = -1.2f)
                curveToRelative(dx1 = 1.04f, dy1 = -1.04f, dx2 = 1.43f, dy2 = -2.04f, dx3 = 1.1f, dy3 = -2.83f)
                curveToRelative(dx1 = -0.32f, dy1 = -0.78f, dx2 = -1.31f, dy2 = -1.21f, dx3 = -2.77f, dy3 = -1.21f)
                horizontalLineTo(x = 5.15f)
                arcTo(horizontalEllipseRadius = 0.4f, verticalEllipseRadius = 0.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 4.77f, y1 = 4.0f)
                verticalLineToRelative(dy = 12.0f)
                arcToRelative(a = 0.4f, b = 0.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.38f, dy1 = 0.38f)
                horizontalLineToRelative(dx = 11.2f)
                curveToRelative(dx1 = 1.44f, dy1 = 0.0f, dx2 = 2.41f, dy2 = -0.44f, dx3 = 2.74f, dy3 = -1.23f)
                curveToRelative(dx1 = 0.33f, dy1 = -0.8f, dx2 = -0.05f, dy2 = -1.79f, dx3 = -1.07f, dy3 = -2.82f)
            }
        }.build().also { _flag = it }
    }

@Suppress("ObjectPropertyName")
private var _flag: ImageVector? = null
