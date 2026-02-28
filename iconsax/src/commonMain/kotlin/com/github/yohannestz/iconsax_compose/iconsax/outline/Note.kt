package com.github.yohannestz.iconsax_compose.iconsax.outline

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
            ) {
                moveTo(x = 8.0f, y = 5.75f)
                arcTo(horizontalEllipseRadius = 0.76f, verticalEllipseRadius = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 7.25f, y1 = 5.0f)
                verticalLineTo(y = 2.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.41f, dx2 = 0.34f, dy2 = -0.75f, dx3 = 0.75f, dy3 = -0.75f)
                reflectiveCurveTo(x1 = 8.75f, y1 = 1.59f, x2 = 8.75f, y2 = 2.0f)
                verticalLineToRelative(dy = 3.0f)
                arcTo(horizontalEllipseRadius = 0.76f, verticalEllipseRadius = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 8.0f, y1 = 5.75f)
                moveToRelative(dx = 8.0f, dy = 0.0f)
                arcTo(horizontalEllipseRadius = 0.76f, verticalEllipseRadius = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 15.25f, y1 = 5.0f)
                verticalLineTo(y = 2.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.41f, dx2 = 0.34f, dy2 = -0.75f, dx3 = 0.75f, dy3 = -0.75f)
                reflectiveCurveTo(x1 = 16.75f, y1 = 1.59f, x2 = 16.75f, y2 = 2.0f)
                verticalLineToRelative(dy = 3.0f)
                arcTo(horizontalEllipseRadius = 0.76f, verticalEllipseRadius = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 16.0f, y1 = 5.75f)
                moveToRelative(dx = -1.0f, dy = 8.0f)
                horizontalLineTo(x = 7.0f)
                curveToRelative(dx1 = -0.41f, dy1 = 0.0f, dx2 = -0.75f, dy2 = -0.34f, dx3 = -0.75f, dy3 = -0.75f)
                reflectiveCurveTo(x1 = 6.59f, y1 = 12.25f, x2 = 7.0f, y2 = 12.25f)
                horizontalLineToRelative(dx = 8.0f)
                curveToRelative(dx1 = 0.41f, dy1 = 0.0f, dx2 = 0.75f, dy2 = 0.34f, dx3 = 0.75f, dy3 = 0.75f)
                reflectiveCurveToRelative(dx1 = -0.34f, dy1 = 0.75f, dx2 = -0.75f, dy2 = 0.75f)
                moveToRelative(dx = -3.0f, dy = 4.0f)
                horizontalLineTo(x = 7.0f)
                curveToRelative(dx1 = -0.41f, dy1 = 0.0f, dx2 = -0.75f, dy2 = -0.34f, dx3 = -0.75f, dy3 = -0.75f)
                reflectiveCurveTo(x1 = 6.59f, y1 = 16.25f, x2 = 7.0f, y2 = 16.25f)
                horizontalLineToRelative(dx = 5.0f)
                curveToRelative(dx1 = 0.41f, dy1 = 0.0f, dx2 = 0.75f, dy2 = 0.34f, dx3 = 0.75f, dy3 = 0.75f)
                reflectiveCurveToRelative(dx1 = -0.34f, dy1 = 0.75f, dx2 = -0.75f, dy2 = 0.75f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 15.0f, y = 22.75f)
                horizontalLineTo(x = 9.0f)
                curveToRelative(dx1 = -5.62f, dy1 = 0.0f, dx2 = -6.75f, dy2 = -2.65f, dx3 = -6.75f, dy3 = -6.93f)
                verticalLineTo(y = 9.65f)
                curveToRelative(dx1 = 0.0f, dy1 = -4.74f, dx2 = 1.6f, dy2 = -6.67f, dx3 = 5.71f, dy3 = -6.9f)
                horizontalLineToRelative(dx = 8.08f)
                curveToRelative(dx1 = 4.11f, dy1 = 0.23f, dx2 = 5.71f, dy2 = 2.16f, dx3 = 5.71f, dy3 = 6.9f)
                verticalLineToRelative(dy = 6.17f)
                curveToRelative(dx1 = 0.0f, dy1 = 4.28f, dx2 = -1.13f, dy2 = 6.93f, dx3 = -6.75f, dy3 = 6.93f)
                moveTo(x = 8.0f, y = 4.25f)
                curveToRelative(dx1 = -2.8f, dy1 = 0.16f, dx2 = -4.25f, dy2 = 1.04f, dx3 = -4.25f, dy3 = 5.4f)
                verticalLineToRelative(dy = 6.17f)
                curveToRelative(dx1 = 0.0f, dy1 = 3.83f, dx2 = 0.73f, dy2 = 5.43f, dx3 = 5.25f, dy3 = 5.43f)
                horizontalLineToRelative(dx = 6.0f)
                curveToRelative(dx1 = 4.52f, dy1 = 0.0f, dx2 = 5.25f, dy2 = -1.6f, dx3 = 5.25f, dy3 = -5.43f)
                verticalLineTo(y = 9.65f)
                curveToRelative(dx1 = 0.0f, dy1 = -4.35f, dx2 = -1.44f, dy2 = -5.24f, dx3 = -4.27f, dy3 = -5.4f)
                close()
            }
        }.build().also { _note = it }
    }

@Suppress("ObjectPropertyName")
private var _note: ImageVector? = null
