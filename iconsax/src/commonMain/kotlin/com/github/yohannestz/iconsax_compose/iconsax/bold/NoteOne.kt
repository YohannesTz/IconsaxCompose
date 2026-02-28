package com.github.yohannestz.iconsax_compose.iconsax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val NoteOne: ImageVector
    get() {
        val current = _noteOne
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.NoteOne",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 16.0f, y = 4.25f)
                arcToRelative(a = 2.25f, b = 2.25f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -2.25f, dy1 = 2.25f)
                horizontalLineToRelative(dx = -3.5f)
                arcTo(horizontalEllipseRadius = 2.24f, verticalEllipseRadius = 2.24f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 8.0f, y1 = 4.25f)
                arcTo(horizontalEllipseRadius = 2.25f, verticalEllipseRadius = 2.25f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 10.25f, y1 = 2.0f)
                horizontalLineToRelative(dx = 3.5f)
                arcTo(horizontalEllipseRadius = 2.24f, verticalEllipseRadius = 2.24f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 16.0f, y1 = 4.25f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 18.83f, y = 5.03f)
                arcToRelative(a = 3.0f, b = 3.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.77f, dy1 = -0.45f)
                curveTo(x1 = 17.77f, y1 = 4.47f, x2 = 17.48f, y2 = 4.7f, x3 = 17.42f, y3 = 5.0f)
                arcToRelative(a = 3.74f, b = 3.74f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -3.67f, dy1 = 3.0f)
                horizontalLineToRelative(dx = -3.5f)
                curveToRelative(dx1 = -1.0f, dy1 = 0.0f, dx2 = -1.94f, dy2 = -0.4f, dx3 = -2.65f, dy3 = -1.1f)
                arcTo(horizontalEllipseRadius = 3.7f, verticalEllipseRadius = 3.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 6.58f, y1 = 5.0f)
                curveTo(x1 = 6.52f, y1 = 4.7f, x2 = 6.22f, y2 = 4.48f, x3 = 5.93f, y3 = 4.6f)
                curveTo(x1 = 4.77f, y1 = 5.06f, x2 = 4.0f, y2 = 6.12f, x3 = 4.0f, y3 = 8.25f)
                verticalLineTo(y = 18.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 3.0f, dx2 = 1.79f, dy2 = 4.0f, dx3 = 4.0f, dy3 = 4.0f)
                horizontalLineToRelative(dx = 8.0f)
                curveToRelative(dx1 = 2.21f, dy1 = 0.0f, dx2 = 4.0f, dy2 = -1.0f, dx3 = 4.0f, dy3 = -4.0f)
                verticalLineTo(y = 8.25f)
                curveToRelative(dx1 = 0.0f, dy1 = -1.63f, dx2 = -0.45f, dy2 = -2.63f, dx3 = -1.17f, dy3 = -3.22f)
                moveTo(x = 8.0f, y = 12.25f)
                horizontalLineToRelative(dx = 4.0f)
                curveToRelative(dx1 = 0.41f, dy1 = 0.0f, dx2 = 0.75f, dy2 = 0.34f, dx3 = 0.75f, dy3 = 0.75f)
                reflectiveCurveToRelative(dx1 = -0.34f, dy1 = 0.75f, dx2 = -0.75f, dy2 = 0.75f)
                horizontalLineTo(x = 8.0f)
                curveToRelative(dx1 = -0.41f, dy1 = 0.0f, dx2 = -0.75f, dy2 = -0.34f, dx3 = -0.75f, dy3 = -0.75f)
                reflectiveCurveTo(x1 = 7.59f, y1 = 12.25f, x2 = 8.0f, y2 = 12.25f)
                moveToRelative(dx = 8.0f, dy = 5.5f)
                horizontalLineTo(x = 8.0f)
                curveToRelative(dx1 = -0.41f, dy1 = 0.0f, dx2 = -0.75f, dy2 = -0.34f, dx3 = -0.75f, dy3 = -0.75f)
                reflectiveCurveTo(x1 = 7.59f, y1 = 16.25f, x2 = 8.0f, y2 = 16.25f)
                horizontalLineToRelative(dx = 8.0f)
                curveToRelative(dx1 = 0.41f, dy1 = 0.0f, dx2 = 0.75f, dy2 = 0.34f, dx3 = 0.75f, dy3 = 0.75f)
                reflectiveCurveToRelative(dx1 = -0.34f, dy1 = 0.75f, dx2 = -0.75f, dy2 = 0.75f)
            }
        }.build().also { _noteOne = it }
    }

@Suppress("ObjectPropertyName")
private var _noteOne: ImageVector? = null
