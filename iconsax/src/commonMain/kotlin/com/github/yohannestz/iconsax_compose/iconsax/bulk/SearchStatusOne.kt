package com.github.yohannestz.iconsax_compose.iconsax.bulk

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SearchStatusOne: ImageVector
    get() {
        val current = _searchStatusOne
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.SearchStatusOne",
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
                moveTo(x = 11.0f, y = 20.0f)
                arcTo(horizontalEllipseRadius = 9.01f, verticalEllipseRadius = 9.01f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, x1 = 11.0f, y1 = 2.0f)
                arcTo(horizontalEllipseRadius = 9.01f, verticalEllipseRadius = 9.01f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 11.0f, y1 = 20.0f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 14.0f, y = 10.25f)
                horizontalLineTo(x = 8.0f)
                curveToRelative(dx1 = -0.41f, dy1 = 0.0f, dx2 = -0.75f, dy2 = -0.34f, dx3 = -0.75f, dy3 = -0.75f)
                reflectiveCurveTo(x1 = 7.59f, y1 = 8.75f, x2 = 8.0f, y2 = 8.75f)
                horizontalLineToRelative(dx = 6.0f)
                curveToRelative(dx1 = 0.41f, dy1 = 0.0f, dx2 = 0.75f, dy2 = 0.34f, dx3 = 0.75f, dy3 = 0.75f)
                reflectiveCurveToRelative(dx1 = -0.34f, dy1 = 0.75f, dx2 = -0.75f, dy2 = 0.75f)
                moveToRelative(dx = -3.0f, dy = 3.0f)
                horizontalLineTo(x = 8.0f)
                curveToRelative(dx1 = -0.41f, dy1 = 0.0f, dx2 = -0.75f, dy2 = -0.34f, dx3 = -0.75f, dy3 = -0.75f)
                reflectiveCurveTo(x1 = 7.59f, y1 = 11.75f, x2 = 8.0f, y2 = 11.75f)
                horizontalLineToRelative(dx = 3.0f)
                curveToRelative(dx1 = 0.41f, dy1 = 0.0f, dx2 = 0.75f, dy2 = 0.34f, dx3 = 0.75f, dy3 = 0.75f)
                reflectiveCurveToRelative(dx1 = -0.34f, dy1 = 0.75f, dx2 = -0.75f, dy2 = 0.75f)
                moveToRelative(dx = 10.99f, dy = 5.7f)
                curveTo(x1 = 21.66f, y1 = 18.34f, x2 = 20.96f, y2 = 18.0f, x3 = 20.02f, y3 = 18.0f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.68f, dy1 = 0.79f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.22f, dy1 = 1.84f)
                curveToRelative(dx1 = 0.43f, dy1 = 1.3f, dx2 = 1.18f, dy2 = 1.59f, dx3 = 1.59f, dy3 = 1.64f)
                lineToRelative(dx = 0.19f, dy = 0.01f)
                curveToRelative(dx1 = 0.44f, dy1 = 0.0f, dx2 = 1.12f, dy2 = -0.19f, dx3 = 1.78f, dy3 = -1.18f)
                curveToRelative(dx1 = 0.53f, dy1 = -0.77f, dx2 = 0.63f, dy2 = -1.54f, dx3 = 0.31f, dy3 = -2.15f)
            }
        }.build().also { _searchStatusOne = it }
    }

@Suppress("ObjectPropertyName")
private var _searchStatusOne: ImageVector? = null
