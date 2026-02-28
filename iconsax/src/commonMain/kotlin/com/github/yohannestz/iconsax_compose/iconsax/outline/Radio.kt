package com.github.yohannestz.iconsax_compose.iconsax.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Radio: ImageVector
    get() {
        val current = _radio
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Radio",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 17.0f, y = 22.75f)
                horizontalLineTo(x = 7.0f)
                curveToRelative(dx1 = -3.44f, dy1 = 0.0f, dx2 = -5.75f, dy2 = -2.31f, dx3 = -5.75f, dy3 = -5.75f)
                verticalLineToRelative(dy = -7.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -3.44f, dx2 = 2.31f, dy2 = -5.75f, dx3 = 5.75f, dy3 = -5.75f)
                horizontalLineToRelative(dx = 10.0f)
                curveToRelative(dx1 = 3.44f, dy1 = 0.0f, dx2 = 5.75f, dy2 = 2.31f, dx3 = 5.75f, dy3 = 5.75f)
                verticalLineToRelative(dy = 7.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 3.44f, dx2 = -2.31f, dy2 = 5.75f, dx3 = -5.75f, dy3 = 5.75f)
                moveToRelative(dx = -10.0f, dy = -17.0f)
                curveToRelative(dx1 = -2.58f, dy1 = 0.0f, dx2 = -4.25f, dy2 = 1.67f, dx3 = -4.25f, dy3 = 4.25f)
                verticalLineToRelative(dy = 7.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 2.58f, dx2 = 1.67f, dy2 = 4.25f, dx3 = 4.25f, dy3 = 4.25f)
                horizontalLineToRelative(dx = 10.0f)
                curveToRelative(dx1 = 2.58f, dy1 = 0.0f, dx2 = 4.25f, dy2 = -1.67f, dx3 = 4.25f, dy3 = -4.25f)
                verticalLineToRelative(dy = -7.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -2.58f, dx2 = -1.67f, dy2 = -4.25f, dx3 = -4.25f, dy3 = -4.25f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 7.0f, y = 5.75f)
                arcTo(horizontalEllipseRadius = 0.76f, verticalEllipseRadius = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 6.25f, y1 = 5.0f)
                verticalLineTo(y = 2.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.41f, dx2 = 0.34f, dy2 = -0.75f, dx3 = 0.75f, dy3 = -0.75f)
                reflectiveCurveTo(x1 = 7.75f, y1 = 1.59f, x2 = 7.75f, y2 = 2.0f)
                verticalLineToRelative(dy = 3.0f)
                arcTo(horizontalEllipseRadius = 0.76f, verticalEllipseRadius = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 7.0f, y1 = 5.75f)
                moveToRelative(dx = 1.5f, dy = 11.0f)
                arcToRelative(a = 3.26f, b = 3.26f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = -6.5f)
                arcToRelative(a = 3.26f, b = 3.26f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = 6.5f)
                moveToRelative(dx = 0.0f, dy = -5.0f)
                curveToRelative(dx1 = -0.96f, dy1 = 0.0f, dx2 = -1.75f, dy2 = 0.79f, dx3 = -1.75f, dy3 = 1.75f)
                reflectiveCurveToRelative(dx1 = 0.79f, dy1 = 1.75f, dx2 = 1.75f, dy2 = 1.75f)
                reflectiveCurveToRelative(dx1 = 1.75f, dy1 = -0.79f, dx2 = 1.75f, dy2 = -1.75f)
                reflectiveCurveToRelative(dx1 = -0.79f, dy1 = -1.75f, dx2 = -1.75f, dy2 = -1.75f)
                moveToRelative(dx = 10.0f, dy = 0.0f)
                horizontalLineToRelative(dx = -4.0f)
                curveToRelative(dx1 = -0.41f, dy1 = 0.0f, dx2 = -0.75f, dy2 = -0.34f, dx3 = -0.75f, dy3 = -0.75f)
                reflectiveCurveToRelative(dx1 = 0.34f, dy1 = -0.75f, dx2 = 0.75f, dy2 = -0.75f)
                horizontalLineToRelative(dx = 4.0f)
                curveToRelative(dx1 = 0.41f, dy1 = 0.0f, dx2 = 0.75f, dy2 = 0.34f, dx3 = 0.75f, dy3 = 0.75f)
                reflectiveCurveToRelative(dx1 = -0.34f, dy1 = 0.75f, dx2 = -0.75f, dy2 = 0.75f)
                moveToRelative(dx = -3.5f, dy = 4.0f)
                horizontalLineToRelative(dx = -0.5f)
                curveToRelative(dx1 = -0.41f, dy1 = 0.0f, dx2 = -0.75f, dy2 = -0.34f, dx3 = -0.75f, dy3 = -0.75f)
                reflectiveCurveToRelative(dx1 = 0.34f, dy1 = -0.75f, dx2 = 0.75f, dy2 = -0.75f)
                horizontalLineTo(x = 15.0f)
                curveToRelative(dx1 = 0.41f, dy1 = 0.0f, dx2 = 0.75f, dy2 = 0.34f, dx3 = 0.75f, dy3 = 0.75f)
                reflectiveCurveToRelative(dx1 = -0.34f, dy1 = 0.75f, dx2 = -0.75f, dy2 = 0.75f)
                moveToRelative(dx = 3.5f, dy = 0.0f)
                horizontalLineTo(x = 18.0f)
                curveToRelative(dx1 = -0.41f, dy1 = 0.0f, dx2 = -0.75f, dy2 = -0.34f, dx3 = -0.75f, dy3 = -0.75f)
                reflectiveCurveToRelative(dx1 = 0.34f, dy1 = -0.75f, dx2 = 0.75f, dy2 = -0.75f)
                horizontalLineToRelative(dx = 0.5f)
                curveToRelative(dx1 = 0.41f, dy1 = 0.0f, dx2 = 0.75f, dy2 = 0.34f, dx3 = 0.75f, dy3 = 0.75f)
                reflectiveCurveToRelative(dx1 = -0.34f, dy1 = 0.75f, dx2 = -0.75f, dy2 = 0.75f)
            }
        }.build().also { _radio = it }
    }

@Suppress("ObjectPropertyName")
private var _radio: ImageVector? = null
