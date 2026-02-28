package com.github.yohannestz.iconsax_compose.iconsax.bulk

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val BookOne: ImageVector
    get() {
        val current = _bookOne
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.BookOne",
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
                moveTo(x = 20.5f, y = 7.0f)
                verticalLineToRelative(dy = 8.0f)
                horizontalLineTo(x = 6.35f)
                arcToRelative(a = 2.86f, b = 2.86f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -2.85f, dy1 = 2.85f)
                verticalLineTo(y = 7.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -4.0f, dx2 = 1.0f, dy2 = -5.0f, dx3 = 5.0f, dy3 = -5.0f)
                horizontalLineToRelative(dx = 7.0f)
                curveToRelative(dx1 = 4.0f, dy1 = 0.0f, dx2 = 5.0f, dy2 = 1.0f, dx3 = 5.0f, dy3 = 5.0f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 20.5f, y = 15.0f)
                verticalLineToRelative(dy = 3.5f)
                arcTo(horizontalEllipseRadius = 3.5f, verticalEllipseRadius = 3.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 17.0f, y1 = 22.0f)
                horizontalLineTo(x = 7.0f)
                arcToRelative(a = 3.5f, b = 3.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -3.5f, dy1 = -3.5f)
                verticalLineToRelative(dy = -0.65f)
                arcTo(horizontalEllipseRadius = 2.86f, verticalEllipseRadius = 2.86f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 6.35f, y1 = 15.0f)
                close()
                moveTo(x = 16.0f, y = 7.75f)
                horizontalLineTo(x = 8.0f)
                curveTo(x1 = 7.59f, y1 = 7.75f, x2 = 7.25f, y2 = 7.41f, x3 = 7.25f, y3 = 7.0f)
                reflectiveCurveTo(x1 = 7.59f, y1 = 6.25f, x2 = 8.0f, y2 = 6.25f)
                horizontalLineToRelative(dx = 8.0f)
                curveToRelative(dx1 = 0.41f, dy1 = 0.0f, dx2 = 0.75f, dy2 = 0.34f, dx3 = 0.75f, dy3 = 0.75f)
                reflectiveCurveTo(x1 = 16.41f, y1 = 7.75f, x2 = 16.0f, y2 = 7.75f)
                moveToRelative(dx = -3.0f, dy = 3.5f)
                horizontalLineTo(x = 8.0f)
                curveToRelative(dx1 = -0.41f, dy1 = 0.0f, dx2 = -0.75f, dy2 = -0.34f, dx3 = -0.75f, dy3 = -0.75f)
                reflectiveCurveTo(x1 = 7.59f, y1 = 9.75f, x2 = 8.0f, y2 = 9.75f)
                horizontalLineToRelative(dx = 5.0f)
                curveToRelative(dx1 = 0.41f, dy1 = 0.0f, dx2 = 0.75f, dy2 = 0.34f, dx3 = 0.75f, dy3 = 0.75f)
                reflectiveCurveToRelative(dx1 = -0.34f, dy1 = 0.75f, dx2 = -0.75f, dy2 = 0.75f)
            }
        }.build().also { _bookOne = it }
    }

@Suppress("ObjectPropertyName")
private var _bookOne: ImageVector? = null
