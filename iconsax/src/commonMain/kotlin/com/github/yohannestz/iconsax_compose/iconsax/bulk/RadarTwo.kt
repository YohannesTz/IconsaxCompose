package com.github.yohannestz.iconsax_compose.iconsax.bulk

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val RadarTwo: ImageVector
    get() {
        val current = _radarTwo
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.RadarTwo",
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
                moveTo(x = 12.0f, y = 22.0f)
                arcToRelative(a = 10.0f, b = 10.0f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = 0.0f, dy1 = -20.0f)
                arcToRelative(a = 10.0f, b = 10.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 20.0f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 12.0f, y = 4.25f)
                arcTo(horizontalEllipseRadius = 7.7f, verticalEllipseRadius = 7.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 7.35f, y1 = 5.8f)
                arcTo(horizontalEllipseRadius = 0.75f, verticalEllipseRadius = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 8.25f, y1 = 7.0f)
                arcTo(horizontalEllipseRadius = 6.0f, verticalEllipseRadius = 6.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 12.0f, y1 = 5.75f)
                arcToRelative(a = 6.25f, b = 6.25f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = true, dx1 = -5.76f, dy1 = 3.81f)
                lineToRelative(dx = 1.14f, dy = 0.65f)
                arcTo(horizontalEllipseRadius = 5.0f, verticalEllipseRadius = 5.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 7.04f, y1 = 12.0f)
                arcToRelative(a = 4.95f, b = 4.95f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 9.9f, dy1 = 0.0f)
                arcToRelative(a = 4.96f, b = 4.96f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -7.06f, dy1 = -4.48f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.36f, dy1 = 1.0f)
                arcToRelative(a = 0.76f, b = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.0f, dy1 = 0.36f)
                arcToRelative(a = 3.46f, b = 3.46f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = true, dx1 = 1.47f, dy1 = 6.57f)
                arcTo(horizontalEllipseRadius = 3.46f, verticalEllipseRadius = 3.46f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 8.54f, y1 = 12.0f)
                arcToRelative(a = 4.0f, b = 4.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.17f, dy1 = -1.02f)
                lineToRelative(dx = 2.9f, dy = 1.67f)
                arcToRelative(a = 0.74f, b = 0.74f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.03f, dy1 = -0.28f)
                arcToRelative(a = 0.74f, b = 0.74f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.28f, dy1 = -1.02f)
                lineTo(x = 6.29f, y = 7.86f)
                arcToRelative(a = 0.74f, b = 0.74f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.02f, dy1 = 0.28f)
                arcTo(horizontalEllipseRadius = 8.0f, verticalEllipseRadius = 8.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 4.24f, y1 = 12.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 4.27f, dx2 = 3.48f, dy2 = 7.75f, dx3 = 7.75f, dy3 = 7.75f)
                reflectiveCurveToRelative(dx1 = 7.75f, dy1 = -3.48f, dx2 = 7.75f, dy2 = -7.75f)
                reflectiveCurveTo(x1 = 16.27f, y1 = 4.25f, x2 = 12.0f, y2 = 4.25f)
            }
        }.build().also { _radarTwo = it }
    }

@Suppress("ObjectPropertyName")
private var _radarTwo: ImageVector? = null
