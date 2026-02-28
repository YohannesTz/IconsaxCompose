package com.github.yohannestz.iconsax_compose.iconsax.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Scanner: ImageVector
    get() {
        val current = _scanner
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Scanner",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 22.0f, y = 9.75f)
                arcTo(horizontalEllipseRadius = 0.76f, verticalEllipseRadius = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 21.25f, y1 = 9.0f)
                verticalLineTo(y = 7.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -2.58f, dx2 = -1.67f, dy2 = -4.25f, dx3 = -4.25f, dy3 = -4.25f)
                horizontalLineTo(x = 7.0f)
                curveTo(x1 = 4.42f, y1 = 2.75f, x2 = 2.75f, y2 = 4.42f, x3 = 2.75f, y3 = 7.0f)
                verticalLineToRelative(dy = 2.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 0.41f, dx2 = -0.34f, dy2 = 0.75f, dx3 = -0.75f, dy3 = 0.75f)
                reflectiveCurveTo(x1 = 1.25f, y1 = 9.41f, x2 = 1.25f, y2 = 9.0f)
                verticalLineTo(y = 7.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -3.44f, dx2 = 2.31f, dy2 = -5.75f, dx3 = 5.75f, dy3 = -5.75f)
                horizontalLineToRelative(dx = 10.0f)
                curveToRelative(dx1 = 3.44f, dy1 = 0.0f, dx2 = 5.75f, dy2 = 2.31f, dx3 = 5.75f, dy3 = 5.75f)
                verticalLineToRelative(dy = 2.0f)
                arcTo(horizontalEllipseRadius = 0.76f, verticalEllipseRadius = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 22.0f, y1 = 9.75f)
                moveToRelative(dx = -5.0f, dy = 13.0f)
                horizontalLineTo(x = 7.0f)
                curveToRelative(dx1 = -3.44f, dy1 = 0.0f, dx2 = -5.75f, dy2 = -2.31f, dx3 = -5.75f, dy3 = -5.75f)
                verticalLineToRelative(dy = -2.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.41f, dx2 = 0.34f, dy2 = -0.75f, dx3 = 0.75f, dy3 = -0.75f)
                reflectiveCurveTo(x1 = 2.75f, y1 = 14.59f, x2 = 2.75f, y2 = 15.0f)
                verticalLineToRelative(dy = 2.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 2.58f, dx2 = 1.67f, dy2 = 4.25f, dx3 = 4.25f, dy3 = 4.25f)
                horizontalLineToRelative(dx = 10.0f)
                curveToRelative(dx1 = 2.58f, dy1 = 0.0f, dx2 = 4.25f, dy2 = -1.67f, dx3 = 4.25f, dy3 = -4.25f)
                verticalLineToRelative(dy = -2.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.41f, dx2 = 0.34f, dy2 = -0.75f, dx3 = 0.75f, dy3 = -0.75f)
                reflectiveCurveToRelative(dx1 = 0.75f, dy1 = 0.34f, dx2 = 0.75f, dy2 = 0.75f)
                verticalLineToRelative(dy = 2.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 3.44f, dx2 = -2.31f, dy2 = 5.75f, dx3 = -5.75f, dy3 = 5.75f)
                moveToRelative(dx = 5.0f, dy = -10.0f)
                horizontalLineTo(x = 2.0f)
                curveToRelative(dx1 = -0.41f, dy1 = 0.0f, dx2 = -0.75f, dy2 = -0.34f, dx3 = -0.75f, dy3 = -0.75f)
                reflectiveCurveTo(x1 = 1.59f, y1 = 11.25f, x2 = 2.0f, y2 = 11.25f)
                horizontalLineToRelative(dx = 20.0f)
                curveToRelative(dx1 = 0.41f, dy1 = 0.0f, dx2 = 0.75f, dy2 = 0.34f, dx3 = 0.75f, dy3 = 0.75f)
                reflectiveCurveToRelative(dx1 = -0.34f, dy1 = 0.75f, dx2 = -0.75f, dy2 = 0.75f)
            }
        }.build().also { _scanner = it }
    }

@Suppress("ObjectPropertyName")
private var _scanner: ImageVector? = null
