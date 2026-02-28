package com.github.yohannestz.iconsax_compose.iconsax.bulk

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Nem: ImageVector
    get() {
        val current = _nem
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Nem",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
                fillAlpha = 0.6f,
                strokeAlpha = 0.6f,
            ) {
                moveTo(x = 16.36f, y = 18.49f)
                lineToRelative(dx = -0.01f, dy = 0.02f)
                arcTo(horizontalEllipseRadius = 20.0f, verticalEllipseRadius = 20.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 12.0f, y1 = 22.0f)
                reflectiveCurveTo(x1 = 3.16f, y1 = 17.58f, x2 = 2.1f, y2 = 7.08f)
                curveTo(x1 = 5.21f, y1 = 17.15f, x2 = 12.0f, y2 = 10.0f, x3 = 12.0f, y3 = 10.0f)
                curveToRelative(dx1 = 6.76f, dy1 = 2.9f, dx2 = 4.52f, dy2 = 8.14f, dx3 = 4.36f, dy3 = 8.49f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
                fillAlpha = 0.4f,
                strokeAlpha = 0.4f,
            ) {
                moveTo(x = 16.36f, y = 18.49f)
                curveToRelative(dx1 = 0.16f, dy1 = -0.35f, dx2 = 2.4f, dy2 = -5.59f, dx3 = -4.36f, dy3 = -8.49f)
                curveToRelative(dx1 = -1.0f, dy1 = -6.0f, dx2 = 4.07f, dy2 = -7.06f, dx3 = 4.07f, dy3 = -7.06f)
                lineToRelative(dx = 0.59f, dy = -0.12f)
                horizontalLineToRelative(dx = 0.01f)
                arcTo(horizontalEllipseRadius = 19.0f, verticalEllipseRadius = 19.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 22.0f, y1 = 5.0f)
                reflectiveCurveToRelative(dx1 = 0.0f, dy1 = 7.5f, dx2 = -5.64f, dy2 = 13.49f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 16.66f, y = 2.82f)
                lineToRelative(dx = -0.59f, dy = 0.12f)
                reflectiveCurveTo(x1 = 11.0f, y1 = 4.0f, x2 = 12.0f, y2 = 10.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 0.0f, dx2 = -6.79f, dy2 = 7.15f, dx3 = -9.9f, dy3 = -2.92f)
                arcTo(horizontalEllipseRadius = 23.0f, verticalEllipseRadius = 23.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 2.0f, y1 = 5.0f)
                reflectiveCurveToRelative(dx1 = 6.72f, dy1 = -4.03f, dx2 = 14.66f, dy2 = -2.18f)
            }
        }.build().also { _nem = it }
    }

@Suppress("ObjectPropertyName")
private var _nem: ImageVector? = null
