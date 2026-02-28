package com.github.yohannestz.iconsax_compose.iconsax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Electricity: ImageVector
    get() {
        val current = _electricity
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Electricity",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 15.59f, y = 5.0f)
                horizontalLineToRelative(dx = -0.34f)
                verticalLineTo(y = 2.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.41f, dx2 = -0.34f, dy2 = -0.75f, dx3 = -0.75f, dy3 = -0.75f)
                reflectiveCurveTo(x1 = 13.75f, y1 = 1.59f, x2 = 13.75f, y2 = 2.0f)
                verticalLineToRelative(dy = 3.0f)
                horizontalLineToRelative(dx = -3.5f)
                verticalLineTo(y = 2.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.41f, dx2 = -0.34f, dy2 = -0.75f, dx3 = -0.75f, dy3 = -0.75f)
                reflectiveCurveTo(x1 = 8.75f, y1 = 1.59f, x2 = 8.75f, y2 = 2.0f)
                verticalLineToRelative(dy = 3.0f)
                horizontalLineTo(x = 8.41f)
                arcTo(horizontalEllipseRadius = 1.9f, verticalEllipseRadius = 1.9f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 6.5f, y1 = 6.91f)
                verticalLineTo(y = 12.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 2.2f, dx2 = 1.5f, dy2 = 4.0f, dx3 = 4.0f, dy3 = 4.0f)
                horizontalLineToRelative(dx = 0.75f)
                verticalLineToRelative(dy = 6.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 0.41f, dx2 = 0.34f, dy2 = 0.75f, dx3 = 0.75f, dy3 = 0.75f)
                reflectiveCurveToRelative(dx1 = 0.75f, dy1 = -0.34f, dx2 = 0.75f, dy2 = -0.75f)
                verticalLineToRelative(dy = -6.0f)
                horizontalLineToRelative(dx = 0.75f)
                curveToRelative(dx1 = 2.5f, dy1 = 0.0f, dx2 = 4.0f, dy2 = -1.8f, dx3 = 4.0f, dy3 = -4.0f)
                verticalLineTo(y = 6.91f)
                arcTo(horizontalEllipseRadius = 1.9f, verticalEllipseRadius = 1.9f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 15.59f, y1 = 5.0f)
            }
        }.build().also { _electricity = it }
    }

@Suppress("ObjectPropertyName")
private var _electricity: ImageVector? = null
