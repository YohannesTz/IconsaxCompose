package com.github.yohannestz.iconsax_compose.iconsax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lock: ImageVector
    get() {
        val current = _lock
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Lock",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 12.0f, y = 17.35f)
                arcToRelative(a = 1.63f, b = 1.63f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = 0.0f, dy1 = -3.26f)
                arcToRelative(a = 1.63f, b = 1.63f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 3.26f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 18.28f, y = 9.53f)
                verticalLineTo(y = 8.28f)
                curveTo(x1 = 18.28f, y1 = 5.58f, x2 = 17.63f, y2 = 2.0f, x3 = 12.0f, y3 = 2.0f)
                reflectiveCurveTo(x1 = 5.72f, y1 = 5.58f, x2 = 5.72f, y2 = 8.28f)
                verticalLineToRelative(dy = 1.25f)
                curveTo(x1 = 2.92f, y1 = 9.88f, x2 = 2.0f, y2 = 11.3f, x3 = 2.0f, y3 = 14.79f)
                verticalLineToRelative(dy = 1.86f)
                curveTo(x1 = 2.0f, y1 = 20.75f, x2 = 3.25f, y2 = 22.0f, x3 = 7.35f, y3 = 22.0f)
                horizontalLineToRelative(dx = 9.3f)
                curveToRelative(dx1 = 4.1f, dy1 = 0.0f, dx2 = 5.35f, dy2 = -1.25f, dx3 = 5.35f, dy3 = -5.35f)
                verticalLineToRelative(dy = -1.86f)
                curveToRelative(dx1 = 0.0f, dy1 = -3.49f, dx2 = -0.92f, dy2 = -4.91f, dx3 = -3.72f, dy3 = -5.26f)
                moveTo(x = 12.0f, y = 18.74f)
                arcToRelative(a = 3.02f, b = 3.02f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = -6.04f)
                arcToRelative(a = 3.03f, b = 3.03f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 3.02f, dy1 = 3.02f)
                arcTo(horizontalEllipseRadius = 3.0f, verticalEllipseRadius = 3.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 12.0f, y1 = 18.74f)
                moveToRelative(dx = -4.65f, dy = -9.3f)
                horizontalLineTo(x = 7.12f)
                verticalLineTo(y = 8.28f)
                curveTo(x1 = 7.12f, y1 = 5.35f, x2 = 7.95f, y2 = 3.4f, x3 = 12.0f, y3 = 3.4f)
                reflectiveCurveToRelative(dx1 = 4.88f, dy1 = 1.95f, dx2 = 4.88f, dy2 = 4.88f)
                verticalLineToRelative(dy = 1.17f)
                close()
            }
        }.build().also { _lock = it }
    }

@Suppress("ObjectPropertyName")
private var _lock: ImageVector? = null
