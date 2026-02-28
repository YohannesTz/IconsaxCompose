package com.github.yohannestz.iconsax_compose.iconsax.bulk

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Hospital: ImageVector
    get() {
        val current = _hospital
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Hospital",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 22.0f, y = 21.25f)
                horizontalLineTo(x = 2.0f)
                curveToRelative(dx1 = -0.41f, dy1 = 0.0f, dx2 = -0.75f, dy2 = 0.34f, dx3 = -0.75f, dy3 = 0.75f)
                reflectiveCurveTo(x1 = 1.59f, y1 = 22.75f, x2 = 2.0f, y2 = 22.75f)
                horizontalLineToRelative(dx = 20.0f)
                curveToRelative(dx1 = 0.41f, dy1 = 0.0f, dx2 = 0.75f, dy2 = -0.34f, dx3 = 0.75f, dy3 = -0.75f)
                reflectiveCurveToRelative(dx1 = -0.34f, dy1 = -0.75f, dx2 = -0.75f, dy2 = -0.75f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
                fillAlpha = 0.4f,
                strokeAlpha = 0.4f,
            ) {
                moveTo(x = 17.0f, y = 2.0f)
                horizontalLineTo(x = 7.0f)
                curveTo(x1 = 4.0f, y1 = 2.0f, x2 = 3.0f, y2 = 3.79f, x3 = 3.0f, y3 = 6.0f)
                verticalLineToRelative(dy = 16.0f)
                horizontalLineToRelative(dx = 18.0f)
                verticalLineTo(y = 6.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -2.21f, dx2 = -1.0f, dy2 = -4.0f, dx3 = -4.0f, dy3 = -4.0f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 14.06f, y = 15.0f)
                horizontalLineTo(x = 9.93f)
                arcToRelative(a = 0.95f, b = 0.95f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.94f, dy1 = 0.94f)
                verticalLineTo(y = 22.0f)
                horizontalLineToRelative(dx = 6.0f)
                verticalLineToRelative(dy = -6.06f)
                arcTo(horizontalEllipseRadius = 0.9f, verticalEllipseRadius = 0.9f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 14.06f, y1 = 15.0f)
                moveToRelative(dx = 0.44f, dy = -7.25f)
                horizontalLineToRelative(dx = -1.75f)
                verticalLineTo(y = 6.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.41f, dx2 = -0.34f, dy2 = -0.75f, dx3 = -0.75f, dy3 = -0.75f)
                reflectiveCurveTo(x1 = 11.25f, y1 = 5.59f, x2 = 11.25f, y2 = 6.0f)
                verticalLineToRelative(dy = 1.75f)
                horizontalLineTo(x = 9.5f)
                curveToRelative(dx1 = -0.41f, dy1 = 0.0f, dx2 = -0.75f, dy2 = 0.34f, dx3 = -0.75f, dy3 = 0.75f)
                reflectiveCurveTo(x1 = 9.09f, y1 = 9.25f, x2 = 9.5f, y2 = 9.25f)
                horizontalLineToRelative(dx = 1.75f)
                verticalLineTo(y = 11.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 0.41f, dx2 = 0.34f, dy2 = 0.75f, dx3 = 0.75f, dy3 = 0.75f)
                reflectiveCurveToRelative(dx1 = 0.75f, dy1 = -0.34f, dx2 = 0.75f, dy2 = -0.75f)
                verticalLineTo(y = 9.25f)
                horizontalLineToRelative(dx = 1.75f)
                curveToRelative(dx1 = 0.41f, dy1 = 0.0f, dx2 = 0.75f, dy2 = -0.34f, dx3 = 0.75f, dy3 = -0.75f)
                reflectiveCurveToRelative(dx1 = -0.34f, dy1 = -0.75f, dx2 = -0.75f, dy2 = -0.75f)
            }
        }.build().also { _hospital = it }
    }

@Suppress("ObjectPropertyName")
private var _hospital: ImageVector? = null
