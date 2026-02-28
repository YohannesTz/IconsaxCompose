package com.github.yohannestz.iconsax_compose.iconsax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Building: ImageVector
    get() {
        val current = _building
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Building",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 10.75f, y = 4.64f)
                lineTo(x = 6.32f, y = 2.45f)
                curveTo(x1 = 3.93f, y1 = 1.28f, x2 = 1.97f, y2 = 2.47f, x3 = 1.97f, y3 = 5.09f)
                verticalLineToRelative(dy = 14.84f)
                arcTo(horizontalEllipseRadius = 2.1f, verticalEllipseRadius = 2.1f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 4.08f, y1 = 22.0f)
                horizontalLineToRelative(dx = 7.42f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.0f, dy1 = -1.0f)
                verticalLineTo(y = 7.41f)
                arcToRelative(a = 3.4f, b = 3.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.75f, dy1 = -2.77f)
                moveToRelative(dx = -1.78f, dy = 9.11f)
                horizontalLineTo(x = 5.5f)
                curveToRelative(dx1 = -0.41f, dy1 = 0.0f, dx2 = -0.75f, dy2 = -0.34f, dx3 = -0.75f, dy3 = -0.75f)
                reflectiveCurveToRelative(dx1 = 0.34f, dy1 = -0.75f, dx2 = 0.75f, dy2 = -0.75f)
                horizontalLineToRelative(dx = 3.47f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = true, dx1 = 0.0f, dy1 = 1.5f)
                moveToRelative(dx = 0.0f, dy = -4.0f)
                horizontalLineTo(x = 5.5f)
                curveTo(x1 = 5.09f, y1 = 9.75f, x2 = 4.75f, y2 = 9.41f, x3 = 4.75f, y3 = 9.0f)
                reflectiveCurveTo(x1 = 5.09f, y1 = 8.25f, x2 = 5.5f, y2 = 8.25f)
                horizontalLineToRelative(dx = 3.47f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = true, dx1 = 0.0f, dy1 = 1.5f)
                moveTo(x = 22.0f, y = 18.04f)
                verticalLineToRelative(dy = 1.46f)
                arcToRelative(a = 2.5f, b = 2.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -2.5f, dy1 = 2.5f)
                horizontalLineToRelative(dx = -4.53f)
                arcTo(horizontalEllipseRadius = 0.96f, verticalEllipseRadius = 0.96f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 14.0f, y1 = 21.03f)
                verticalLineToRelative(dy = -2.16f)
                arcToRelative(a = 4.0f, b = 4.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 3.01f, dy1 = -0.83f)
                arcToRelative(a = 3.96f, b = 3.96f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 4.99f, dy1 = 0.0f)
                moveToRelative(dx = 0.0f, dy = -2.99f)
                close()
                arcToRelative(a = 2.5f, b = 2.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -2.49f, dy1 = 2.36f)
                arcToRelative(a = 2.5f, b = 2.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -2.5f, dy1 = -2.5f)
                arcTo(horizontalEllipseRadius = 2.52f, verticalEllipseRadius = 2.52f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 14.0f, y1 = 17.37f)
                verticalLineTo(y = 12.0f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.22f, dy1 = -0.98f)
                lineToRelative(dx = 1.79f, dy = 0.4f)
                lineToRelative(dx = 0.48f, dy = 0.11f)
                lineToRelative(dx = 2.04f, dy = 0.46f)
                arcToRelative(a = 4.0f, b = 4.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.33f, dy1 = 0.52f)
                lineToRelative(dx = 0.01f, dy = 0.01f)
                lineToRelative(dx = 0.29f, dy = 0.24f)
                arcToRelative(a = 3.2f, b = 3.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.83f, dy1 = 2.11f)
                close()
            }
        }.build().also { _building = it }
    }

@Suppress("ObjectPropertyName")
private var _building: ImageVector? = null
