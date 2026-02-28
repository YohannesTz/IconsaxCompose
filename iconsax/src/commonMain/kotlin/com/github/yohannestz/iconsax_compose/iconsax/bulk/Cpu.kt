package com.github.yohannestz.iconsax_compose.iconsax.bulk

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Cpu: ImageVector
    get() {
        val current = _cpu
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Cpu",
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
                moveTo(x = 15.0f, y = 4.0f)
                horizontalLineTo(x = 9.0f)
                arcToRelative(a = 5.0f, b = 5.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -5.0f, dy1 = 5.0f)
                verticalLineToRelative(dy = 6.0f)
                arcToRelative(a = 5.0f, b = 5.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 5.0f, dy1 = 5.0f)
                horizontalLineToRelative(dx = 6.0f)
                arcToRelative(a = 5.0f, b = 5.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 5.0f, dy1 = -5.0f)
                verticalLineTo(y = 9.0f)
                arcToRelative(a = 5.0f, b = 5.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -5.0f, dy1 = -5.0f)
                moveToRelative(dx = 2.26f, dy = 10.26f)
                arcToRelative(a = 3.0f, b = 3.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -3.0f, dy1 = 3.0f)
                horizontalLineTo(x = 9.74f)
                arcToRelative(a = 3.0f, b = 3.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -3.0f, dy1 = -3.0f)
                verticalLineTo(y = 9.74f)
                arcToRelative(a = 3.0f, b = 3.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 3.0f, dy1 = -3.0f)
                horizontalLineToRelative(dx = 4.51f)
                arcToRelative(a = 3.0f, b = 3.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 3.0f, dy1 = 3.0f)
                verticalLineToRelative(dy = 4.52f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 9.06f, y = 2.75f)
                verticalLineTo(y = 4.0f)
                horizontalLineTo(x = 9.0f)
                arcToRelative(a = 5.0f, b = 5.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.44f, dy1 = 0.21f)
                verticalLineTo(y = 2.75f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = true, dx1 = 1.5f, dy1 = 0.0f)
                moveToRelative(dx = 3.69f, dy = 0.0f)
                verticalLineTo(y = 4.0f)
                horizontalLineToRelative(dx = -1.5f)
                verticalLineTo(y = 2.75f)
                curveTo(x1 = 11.25f, y1 = 2.34f, x2 = 11.59f, y2 = 2.0f, x3 = 12.0f, y3 = 2.0f)
                reflectiveCurveToRelative(dx1 = 0.75f, dy1 = 0.34f, dx2 = 0.75f, dy2 = 0.75f)
                moveToRelative(dx = 3.7f, dy = 0.0f)
                verticalLineToRelative(dy = 1.46f)
                arcTo(horizontalEllipseRadius = 5.0f, verticalEllipseRadius = 5.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 15.0f, y1 = 4.0f)
                horizontalLineToRelative(dx = -0.05f)
                verticalLineTo(y = 2.75f)
                curveTo(x1 = 14.95f, y1 = 2.34f, x2 = 15.29f, y2 = 2.0f, x3 = 15.7f, y3 = 2.0f)
                reflectiveCurveToRelative(dx1 = 0.75f, dy1 = 0.34f, dx2 = 0.75f, dy2 = 0.75f)
                moveTo(x = 22.0f, y = 8.3f)
                arcToRelative(a = 0.74f, b = 0.74f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.75f, dy1 = 0.75f)
                horizontalLineTo(x = 20.0f)
                verticalLineTo(y = 9.0f)
                quadToRelative(dx1 = 0.0f, dy1 = -0.75f, dx2 = -0.21f, dy2 = -1.45f)
                horizontalLineToRelative(dx = 1.46f)
                arcTo(horizontalEllipseRadius = 0.75f, verticalEllipseRadius = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 22.0f, y1 = 8.3f)
                moveToRelative(dx = 0.0f, dy = 3.7f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.75f, dy1 = 0.75f)
                horizontalLineTo(x = 20.0f)
                verticalLineToRelative(dy = -1.5f)
                horizontalLineToRelative(dx = 1.25f)
                arcTo(horizontalEllipseRadius = 0.74f, verticalEllipseRadius = 0.74f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 22.0f, y1 = 12.0f)
                moveToRelative(dx = 0.0f, dy = 3.7f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.75f, dy1 = 0.75f)
                horizontalLineToRelative(dx = -1.46f)
                arcTo(horizontalEllipseRadius = 5.0f, verticalEllipseRadius = 5.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 20.0f, y1 = 15.0f)
                verticalLineToRelative(dy = -0.05f)
                horizontalLineToRelative(dx = 1.25f)
                arcTo(horizontalEllipseRadius = 0.74f, verticalEllipseRadius = 0.74f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 22.0f, y1 = 15.7f)
                moveToRelative(dx = -5.55f, dy = 4.09f)
                verticalLineToRelative(dy = 1.46f)
                curveToRelative(dx1 = 0.0f, dy1 = 0.41f, dx2 = -0.34f, dy2 = 0.75f, dx3 = -0.75f, dy3 = 0.75f)
                reflectiveCurveToRelative(dx1 = -0.75f, dy1 = -0.34f, dx2 = -0.75f, dy2 = -0.75f)
                verticalLineTo(y = 20.0f)
                horizontalLineTo(x = 15.0f)
                quadToRelative(dx1 = 0.75f, dy1 = 0.0f, dx2 = 1.45f, dy2 = -0.21f)
                moveTo(x = 12.76f, y = 20.0f)
                verticalLineToRelative(dy = 1.25f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = true, dx1 = -1.5f, dy1 = 0.0f)
                verticalLineTo(y = 20.0f)
                close()
                moveToRelative(dx = -3.7f, dy = 0.0f)
                verticalLineToRelative(dy = 1.25f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = true, dx1 = -1.5f, dy1 = 0.0f)
                verticalLineToRelative(dy = -1.46f)
                arcTo(horizontalEllipseRadius = 5.0f, verticalEllipseRadius = 5.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 9.0f, y1 = 20.0f)
                close()
                moveTo(x = 4.21f, y = 7.55f)
                arcTo(horizontalEllipseRadius = 5.0f, verticalEllipseRadius = 5.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 4.0f, y1 = 9.0f)
                verticalLineToRelative(dy = 0.05f)
                horizontalLineTo(x = 2.75f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = true, dx1 = 0.0f, dy1 = -1.5f)
                close()
                moveTo(x = 4.0f, y = 11.25f)
                verticalLineToRelative(dy = 1.5f)
                horizontalLineTo(x = 2.75f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = true, dx1 = 0.0f, dy1 = -1.5f)
                close()
                moveToRelative(dx = 0.21f, dy = 5.2f)
                horizontalLineTo(x = 2.75f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = true, dx1 = 0.0f, dy1 = -1.5f)
                horizontalLineTo(x = 4.0f)
                verticalLineTo(y = 15.0f)
                quadToRelative(dx1 = 0.0f, dy1 = 0.75f, dx2 = 0.21f, dy2 = 1.45f)
                moveToRelative(dx = 13.05f, dy = -6.71f)
                verticalLineToRelative(dy = 4.5f)
                arcToRelative(a = 3.0f, b = 3.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -3.0f, dy1 = 3.0f)
                horizontalLineTo(x = 9.74f)
                arcToRelative(a = 3.0f, b = 3.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -3.0f, dy1 = -3.0f)
                verticalLineToRelative(dy = -4.5f)
                arcToRelative(a = 3.0f, b = 3.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 3.0f, dy1 = -3.0f)
                horizontalLineToRelative(dx = 4.51f)
                arcToRelative(a = 3.0f, b = 3.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 3.01f, dy1 = 3.0f)
            }
        }.build().also { _cpu = it }
    }

@Suppress("ObjectPropertyName")
private var _cpu: ImageVector? = null
