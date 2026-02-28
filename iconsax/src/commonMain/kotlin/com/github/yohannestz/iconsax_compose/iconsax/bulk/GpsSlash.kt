package com.github.yohannestz.iconsax_compose.iconsax.bulk

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val GpsSlash: ImageVector
    get() {
        val current = _gpsSlash
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.GpsSlash",
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
                moveTo(x = 18.94f, y = 8.06f)
                lineToRelative(dx = -3.83f, dy = 3.83f)
                verticalLineToRelative(dy = 0.1f)
                curveToRelative(dx1 = 0.0f, dy1 = 1.73f, dx2 = -1.4f, dy2 = 3.13f, dx3 = -3.11f, dy3 = 3.13f)
                lineToRelative(dx = -0.11f, dy = -0.01f)
                lineToRelative(dx = -3.83f, dy = 3.83f)
                arcTo(horizontalEllipseRadius = 8.0f, verticalEllipseRadius = 8.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 12.0f, y1 = 20.0f)
                curveToRelative(dx1 = 4.4f, dy1 = 0.0f, dx2 = 8.0f, dy2 = -3.6f, dx3 = 8.0f, dy3 = -8.0f)
                arcToRelative(a = 8.0f, b = 8.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.06f, dy1 = -3.94f)
                moveToRelative(dx = -1.29f, dy = -1.71f)
                lineTo(x = 14.2f, y = 9.8f)
                arcToRelative(a = 3.12f, b = 3.12f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -4.4f, dy1 = 4.4f)
                lineToRelative(dx = -3.45f, dy = 3.45f)
                arcTo(horizontalEllipseRadius = 8.0f, verticalEllipseRadius = 8.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 4.0f, y1 = 12.0f)
                arcToRelative(a = 8.01f, b = 8.01f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 13.65f, dy1 = -5.65f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 14.2f, y = 9.8f)
                lineToRelative(dx = -4.4f, dy = 4.4f)
                arcToRelative(a = 3.12f, b = 3.12f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 4.4f, dy1 = -4.4f)
                moveTo(x = 12.75f, y = 2.0f)
                verticalLineToRelative(dy = 2.04f)
                horizontalLineToRelative(dx = -0.01f)
                arcToRelative(a = 6.0f, b = 6.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.48f, dy1 = 0.0f)
                horizontalLineToRelative(dx = -0.01f)
                verticalLineTo(y = 2.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.41f, dx2 = 0.34f, dy2 = -0.75f, dx3 = 0.75f, dy3 = -0.75f)
                reflectiveCurveTo(x1 = 12.75f, y1 = 1.59f, x2 = 12.75f, y2 = 2.0f)
                moveTo(x = 4.0f, y = 12.0f)
                arcToRelative(a = 6.0f, b = 6.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.04f, dy1 = 0.75f)
                horizontalLineTo(x = 2.0f)
                curveToRelative(dx1 = -0.41f, dy1 = 0.0f, dx2 = -0.75f, dy2 = -0.34f, dx3 = -0.75f, dy3 = -0.75f)
                reflectiveCurveTo(x1 = 1.59f, y1 = 11.25f, x2 = 2.0f, y2 = 11.25f)
                horizontalLineToRelative(dx = 2.04f)
                arcTo(horizontalEllipseRadius = 6.0f, verticalEllipseRadius = 6.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 4.0f, y1 = 12.0f)
                moveToRelative(dx = 8.75f, dy = 7.96f)
                verticalLineTo(y = 22.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 0.41f, dx2 = -0.34f, dy2 = 0.75f, dx3 = -0.75f, dy3 = 0.75f)
                reflectiveCurveToRelative(dx1 = -0.75f, dy1 = -0.34f, dx2 = -0.75f, dy2 = -0.75f)
                verticalLineToRelative(dy = -2.04f)
                horizontalLineToRelative(dx = 0.01f)
                arcToRelative(a = 6.0f, b = 6.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.48f, dy1 = 0.0f)
                close()
                moveToRelative(dx = 10.0f, dy = -7.96f)
                arcTo(horizontalEllipseRadius = 0.76f, verticalEllipseRadius = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 22.0f, y1 = 12.75f)
                horizontalLineToRelative(dx = -2.04f)
                arcToRelative(a = 6.0f, b = 6.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = -1.5f)
                horizontalLineTo(x = 22.0f)
                arcTo(horizontalEllipseRadius = 0.76f, verticalEllipseRadius = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 22.75f, y1 = 12.0f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 21.77f, y = 2.23f)
                arcToRelative(a = 0.77f, b = 0.77f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.1f, dy1 = 0.0f)
                lineTo(x = 2.24f, y = 20.69f)
                arcToRelative(a = 0.77f, b = 0.77f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 1.09f)
                arcToRelative(a = 0.76f, b = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.08f, dy1 = -0.01f)
                lineTo(x = 21.77f, y = 3.3f)
                arcToRelative(a = 0.74f, b = 0.74f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = -1.08f)
            }
        }.build().also { _gpsSlash = it }
    }

@Suppress("ObjectPropertyName")
private var _gpsSlash: ImageVector? = null
