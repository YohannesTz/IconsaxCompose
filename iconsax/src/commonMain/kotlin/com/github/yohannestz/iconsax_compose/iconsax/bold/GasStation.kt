package com.github.yohannestz.iconsax_compose.iconsax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val GasStation: ImageVector
    get() {
        val current = _gasStation
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.GasStation",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 22.34f, y = 9.33f)
                lineToRelative(dx = -2.0f, dy = -1.0f)
                arcToRelative(a = 0.76f, b = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.01f, dy1 = 0.33f)
                arcToRelative(a = 0.74f, b = 0.74f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.33f, dy1 = 1.01f)
                lineToRelative(dx = 1.59f, dy = 0.79f)
                verticalLineToRelative(dy = 4.79f)
                lineToRelative(dx = -3.75f, dy = 0.01f)
                verticalLineTo(y = 5.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -2.0f, dx2 = -1.34f, dy2 = -3.0f, dx3 = -3.0f, dy3 = -3.0f)
                horizontalLineToRelative(dx = -8.0f)
                curveToRelative(dx1 = -1.66f, dy1 = 0.0f, dx2 = -3.0f, dy2 = 1.0f, dx3 = -3.0f, dy3 = 3.0f)
                verticalLineToRelative(dy = 16.25f)
                horizontalLineTo(x = 2.0f)
                curveToRelative(dx1 = -0.41f, dy1 = 0.0f, dx2 = -0.75f, dy2 = 0.34f, dx3 = -0.75f, dy3 = 0.75f)
                reflectiveCurveTo(x1 = 1.59f, y1 = 22.75f, x2 = 2.0f, y2 = 22.75f)
                horizontalLineToRelative(dx = 17.0f)
                curveToRelative(dx1 = 0.41f, dy1 = 0.0f, dx2 = 0.75f, dy2 = -0.34f, dx3 = 0.75f, dy3 = -0.75f)
                reflectiveCurveToRelative(dx1 = -0.34f, dy1 = -0.75f, dx2 = -0.75f, dy2 = -0.75f)
                horizontalLineToRelative(dx = -1.5f)
                verticalLineToRelative(dy = -4.49f)
                lineToRelative(dx = 4.5f, dy = -0.01f)
                arcTo(horizontalEllipseRadius = 0.75f, verticalEllipseRadius = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 22.75f, y1 = 16.0f)
                verticalLineToRelative(dy = -6.0f)
                arcToRelative(a = 0.8f, b = 0.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.41f, dy1 = -0.67f)
                moveTo(x = 6.0f, y = 6.89f)
                curveTo(x1 = 6.0f, y1 = 5.5f, x2 = 6.85f, y2 = 5.0f, x3 = 7.89f, y3 = 5.0f)
                horizontalLineToRelative(dx = 5.23f)
                curveTo(x1 = 14.15f, y1 = 5.0f, x2 = 15.0f, y2 = 5.5f, x3 = 15.0f, y3 = 6.89f)
                verticalLineToRelative(dy = 1.23f)
                curveTo(x1 = 15.0f, y1 = 9.5f, x2 = 14.15f, y2 = 10.0f, x3 = 13.11f, y3 = 10.0f)
                horizontalLineTo(x = 7.89f)
                curveTo(x1 = 6.85f, y1 = 10.0f, x2 = 6.0f, y2 = 9.5f, x3 = 6.0f, y3 = 8.11f)
                close()
                moveToRelative(dx = 0.5f, dy = 5.36f)
                horizontalLineToRelative(dx = 3.0f)
                curveToRelative(dx1 = 0.41f, dy1 = 0.0f, dx2 = 0.75f, dy2 = 0.34f, dx3 = 0.75f, dy3 = 0.75f)
                reflectiveCurveToRelative(dx1 = -0.34f, dy1 = 0.75f, dx2 = -0.75f, dy2 = 0.75f)
                horizontalLineToRelative(dx = -3.0f)
                curveToRelative(dx1 = -0.41f, dy1 = 0.0f, dx2 = -0.75f, dy2 = -0.34f, dx3 = -0.75f, dy3 = -0.75f)
                reflectiveCurveToRelative(dx1 = 0.34f, dy1 = -0.75f, dx2 = 0.75f, dy2 = -0.75f)
            }
        }.build().also { _gasStation = it }
    }

@Suppress("ObjectPropertyName")
private var _gasStation: ImageVector? = null
