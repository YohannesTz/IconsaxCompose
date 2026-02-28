package com.github.yohannestz.iconsax_compose.iconsax.bulk

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Note: ImageVector
    get() {
        val current = _note
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Note",
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
                moveTo(x = 20.0f, y = 8.25f)
                verticalLineTo(y = 18.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 3.0f, dx2 = -1.79f, dy2 = 4.0f, dx3 = -4.0f, dy3 = 4.0f)
                horizontalLineTo(x = 8.0f)
                curveToRelative(dx1 = -2.21f, dy1 = 0.0f, dx2 = -4.0f, dy2 = -1.0f, dx3 = -4.0f, dy3 = -4.0f)
                verticalLineTo(y = 8.25f)
                curveToRelative(dx1 = 0.0f, dy1 = -3.25f, dx2 = 1.79f, dy2 = -4.0f, dx3 = 4.0f, dy3 = -4.0f)
                arcToRelative(a = 2.24f, b = 2.24f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 2.25f, dy1 = 2.25f)
                horizontalLineToRelative(dx = 3.5f)
                arcTo(horizontalEllipseRadius = 2.25f, verticalEllipseRadius = 2.25f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 16.0f, y1 = 4.25f)
                curveToRelative(dx1 = 2.21f, dy1 = 0.0f, dx2 = 4.0f, dy2 = 0.75f, dx3 = 4.0f, dy3 = 4.0f)
            }
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
                moveToRelative(dx = -4.0f, dy = 9.5f)
                horizontalLineTo(x = 8.0f)
                curveToRelative(dx1 = -0.41f, dy1 = 0.0f, dx2 = -0.75f, dy2 = -0.34f, dx3 = -0.75f, dy3 = -0.75f)
                reflectiveCurveTo(x1 = 7.59f, y1 = 12.25f, x2 = 8.0f, y2 = 12.25f)
                horizontalLineToRelative(dx = 4.0f)
                curveToRelative(dx1 = 0.41f, dy1 = 0.0f, dx2 = 0.75f, dy2 = 0.34f, dx3 = 0.75f, dy3 = 0.75f)
                reflectiveCurveToRelative(dx1 = -0.34f, dy1 = 0.75f, dx2 = -0.75f, dy2 = 0.75f)
                moveToRelative(dx = 4.0f, dy = 4.0f)
                horizontalLineTo(x = 8.0f)
                curveToRelative(dx1 = -0.41f, dy1 = 0.0f, dx2 = -0.75f, dy2 = -0.34f, dx3 = -0.75f, dy3 = -0.75f)
                reflectiveCurveTo(x1 = 7.59f, y1 = 16.25f, x2 = 8.0f, y2 = 16.25f)
                horizontalLineToRelative(dx = 8.0f)
                curveToRelative(dx1 = 0.41f, dy1 = 0.0f, dx2 = 0.75f, dy2 = 0.34f, dx3 = 0.75f, dy3 = 0.75f)
                reflectiveCurveToRelative(dx1 = -0.34f, dy1 = 0.75f, dx2 = -0.75f, dy2 = 0.75f)
            }
        }.build().also { _note = it }
    }

@Suppress("ObjectPropertyName")
private var _note: ImageVector? = null
