package com.github.yohannestz.iconsax_compose.iconsax.bulk

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
                fillAlpha = 0.4f,
                strokeAlpha = 0.4f,
            ) {
                moveTo(x = 10.5f, y = 16.0f)
                horizontalLineToRelative(dx = 3.0f)
                curveToRelative(dx1 = 2.5f, dy1 = 0.0f, dx2 = 4.0f, dy2 = -1.8f, dx3 = 4.0f, dy3 = -4.0f)
                verticalLineTo(y = 6.91f)
                arcTo(horizontalEllipseRadius = 1.9f, verticalEllipseRadius = 1.9f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 15.59f, y1 = 5.0f)
                horizontalLineTo(x = 8.42f)
                arcToRelative(a = 1.9f, b = 1.9f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.91f, dy1 = 1.91f)
                verticalLineTo(y = 12.0f)
                arcToRelative(a = 3.8f, b = 3.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 3.99f, dy1 = 4.0f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 10.25f, y = 2.0f)
                verticalLineToRelative(dy = 3.0f)
                horizontalLineToRelative(dx = -1.5f)
                verticalLineTo(y = 2.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.41f, dx2 = 0.34f, dy2 = -0.75f, dx3 = 0.75f, dy3 = -0.75f)
                reflectiveCurveTo(x1 = 10.25f, y1 = 1.59f, x2 = 10.25f, y2 = 2.0f)
                moveToRelative(dx = 5.0f, dy = 0.0f)
                verticalLineToRelative(dy = 3.0f)
                horizontalLineToRelative(dx = -1.5f)
                verticalLineTo(y = 2.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.41f, dx2 = 0.34f, dy2 = -0.75f, dx3 = 0.75f, dy3 = -0.75f)
                reflectiveCurveTo(x1 = 15.25f, y1 = 1.59f, x2 = 15.25f, y2 = 2.0f)
                moveToRelative(dx = -2.5f, dy = 14.0f)
                verticalLineToRelative(dy = 6.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 0.41f, dx2 = -0.34f, dy2 = 0.75f, dx3 = -0.75f, dy3 = 0.75f)
                reflectiveCurveToRelative(dx1 = -0.75f, dy1 = -0.34f, dx2 = -0.75f, dy2 = -0.75f)
                verticalLineToRelative(dy = -6.0f)
                close()
            }
        }.build().also { _electricity = it }
    }

@Suppress("ObjectPropertyName")
private var _electricity: ImageVector? = null
