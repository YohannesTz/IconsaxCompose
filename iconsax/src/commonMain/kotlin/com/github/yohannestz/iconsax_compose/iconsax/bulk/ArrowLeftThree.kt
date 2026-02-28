package com.github.yohannestz.iconsax_compose.iconsax.bulk

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ArrowLeftThree: ImageVector
    get() {
        val current = _arrowLeftThree
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.ArrowLeftThree",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 18.0f, y = 9.33f)
                verticalLineToRelative(dy = 5.34f)
                curveToRelative(dx1 = 0.0f, dy1 = 3.32f, dx2 = -2.35f, dy2 = 4.67f, dx3 = -5.22f, dy3 = 3.02f)
                lineToRelative(dx = -1.28f, dy = -0.74f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.5f, dy1 = -0.87f)
                verticalLineTo(y = 7.92f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.5f, dy1 = -0.87f)
                lineToRelative(dx = 1.28f, dy = -0.74f)
                curveTo(x1 = 15.65f, y1 = 4.66f, x2 = 18.0f, y2 = 6.01f, x3 = 18.0f, y3 = 9.33f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
                fillAlpha = 0.4f,
                strokeAlpha = 0.4f,
            ) {
                moveTo(x = 10.0f, y = 8.79f)
                verticalLineToRelative(dy = 6.43f)
                arcToRelative(a = 0.5f, b = 0.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.75f, dy1 = 0.43f)
                lineToRelative(dx = -1.1f, dy = -0.64f)
                curveToRelative(dx1 = -2.87f, dy1 = -1.65f, dx2 = -2.87f, dy2 = -4.37f, dx3 = 0.0f, dy3 = -6.02f)
                lineToRelative(dx = 1.1f, dy = -0.64f)
                arcTo(horizontalEllipseRadius = 0.5f, verticalEllipseRadius = 0.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 10.0f, y1 = 8.79f)
            }
        }.build().also { _arrowLeftThree = it }
    }

@Suppress("ObjectPropertyName")
private var _arrowLeftThree: ImageVector? = null
