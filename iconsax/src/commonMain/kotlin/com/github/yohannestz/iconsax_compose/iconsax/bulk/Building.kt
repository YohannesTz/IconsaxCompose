package com.github.yohannestz.iconsax_compose.iconsax.bulk

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
                fillAlpha = 0.4f,
                strokeAlpha = 0.4f,
            ) {
                moveTo(x = 12.5f, y = 7.41f)
                verticalLineTo(y = 22.0f)
                horizontalLineTo(x = 4.08f)
                arcToRelative(a = 2.1f, b = 2.1f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -2.11f, dy1 = -2.07f)
                verticalLineTo(y = 5.09f)
                curveToRelative(dx1 = 0.0f, dy1 = -2.62f, dx2 = 1.96f, dy2 = -3.81f, dx3 = 4.35f, dy3 = -2.64f)
                lineToRelative(dx = 4.43f, dy = 2.19f)
                arcToRelative(a = 3.4f, b = 3.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.75f, dy1 = 2.77f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 8.97f, y = 9.75f)
                horizontalLineTo(x = 5.5f)
                curveTo(x1 = 5.09f, y1 = 9.75f, x2 = 4.75f, y2 = 9.41f, x3 = 4.75f, y3 = 9.0f)
                reflectiveCurveTo(x1 = 5.09f, y1 = 8.25f, x2 = 5.5f, y2 = 8.25f)
                horizontalLineToRelative(dx = 3.47f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = true, dx1 = 0.0f, dy1 = 1.5f)
                moveToRelative(dx = 0.0f, dy = 4.0f)
                horizontalLineTo(x = 5.5f)
                curveToRelative(dx1 = -0.41f, dy1 = 0.0f, dx2 = -0.75f, dy2 = -0.34f, dx3 = -0.75f, dy3 = -0.75f)
                reflectiveCurveToRelative(dx1 = 0.34f, dy1 = -0.75f, dx2 = 0.75f, dy2 = -0.75f)
                horizontalLineToRelative(dx = 3.47f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = true, dx1 = 0.0f, dy1 = 1.5f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
                fillAlpha = 0.6f,
                strokeAlpha = 0.6f,
            ) {
                moveTo(x = 22.0f, y = 15.05f)
                verticalLineToRelative(dy = 4.45f)
                arcToRelative(a = 2.5f, b = 2.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -2.5f, dy1 = 2.5f)
                horizontalLineToRelative(dx = -7.0f)
                verticalLineTo(y = 10.42f)
                lineToRelative(dx = 0.47f, dy = 0.1f)
                lineToRelative(dx = 4.04f, dy = 0.9f)
                lineToRelative(dx = 0.48f, dy = 0.11f)
                lineTo(x = 19.53f, y = 12.0f)
                arcToRelative(a = 4.0f, b = 4.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.33f, dy1 = 0.52f)
                lineToRelative(dx = 0.01f, dy = 0.01f)
                lineToRelative(dx = 0.29f, dy = 0.24f)
                arcToRelative(a = 3.2f, b = 3.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.83f, dy1 = 2.11f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 12.5f, y = 10.42f)
                verticalLineToRelative(dy = 6.0f)
                arcToRelative(a = 2.5f, b = 2.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 4.51f, dy1 = -1.5f)
                verticalLineToRelative(dy = -3.49f)
                lineToRelative(dx = -4.04f, dy = -0.9f)
                close()
                moveToRelative(dx = 9.49f, dy = 4.45f)
                arcToRelative(a = 3.2f, b = 3.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.83f, dy1 = -2.1f)
                lineToRelative(dx = -0.29f, dy = -0.25f)
                horizontalLineToRelative(dx = -0.01f)
                arcToRelative(a = 4.0f, b = 4.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.33f, dy1 = -0.53f)
                lineToRelative(dx = -2.04f, dy = -0.46f)
                lineToRelative(dx = -0.48f, dy = -0.1f)
                verticalLineToRelative(dy = 3.5f)
                arcToRelative(a = 2.5f, b = 2.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 2.5f, dy1 = 2.5f)
                arcTo(horizontalEllipseRadius = 2.5f, verticalEllipseRadius = 2.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 22.0f, y1 = 15.05f)
                close()
            }
        }.build().also { _building = it }
    }

@Suppress("ObjectPropertyName")
private var _building: ImageVector? = null
