package com.github.yohannestz.iconsax_compose.iconsax.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val House: ImageVector
    get() {
        val current = _house
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.House",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 22.0f, y = 22.75f)
                horizontalLineTo(x = 2.0f)
                curveToRelative(dx1 = -0.41f, dy1 = 0.0f, dx2 = -0.75f, dy2 = -0.34f, dx3 = -0.75f, dy3 = -0.75f)
                reflectiveCurveTo(x1 = 1.59f, y1 = 21.25f, x2 = 2.0f, y2 = 21.25f)
                horizontalLineToRelative(dx = 20.0f)
                curveToRelative(dx1 = 0.41f, dy1 = 0.0f, dx2 = 0.75f, dy2 = 0.34f, dx3 = 0.75f, dy3 = 0.75f)
                reflectiveCurveToRelative(dx1 = -0.34f, dy1 = 0.75f, dx2 = -0.75f, dy2 = 0.75f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 3.7f, y = 22.0f)
                horizontalLineTo(x = 2.2f)
                lineTo(x = 2.25f, y = 9.97f)
                arcTo(horizontalEllipseRadius = 2.7f, verticalEllipseRadius = 2.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 3.31f, y1 = 7.8f)
                lineToRelative(dx = 7.0f, dy = -5.45f)
                arcToRelative(a = 2.76f, b = 2.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 3.38f, dy1 = 0.0f)
                lineToRelative(dx = 7.0f, dy = 5.44f)
                arcToRelative(a = 2.8f, b = 2.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.06f, dy1 = 2.17f)
                verticalLineTo(y = 22.0f)
                horizontalLineToRelative(dx = -1.5f)
                verticalLineTo(y = 9.98f)
                arcToRelative(a = 1.3f, b = 1.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.48f, dy1 = -1.0f)
                lineToRelative(dx = -7.0f, dy = -5.43f)
                arcToRelative(a = 1.26f, b = 1.26f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.54f, dy1 = 0.0f)
                lineTo(x = 4.23f, y = 9.0f)
                arcToRelative(a = 1.3f, b = 1.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.48f, dy1 = 0.98f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 14.5f, y = 22.75f)
                horizontalLineToRelative(dx = -5.0f)
                arcTo(horizontalEllipseRadius = 0.76f, verticalEllipseRadius = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 8.75f, y1 = 22.0f)
                verticalLineToRelative(dy = -3.5f)
                arcTo(horizontalEllipseRadius = 2.25f, verticalEllipseRadius = 2.25f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 11.0f, y1 = 16.25f)
                horizontalLineToRelative(dx = 2.0f)
                arcToRelative(a = 2.25f, b = 2.25f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 2.25f, dy1 = 2.25f)
                verticalLineTo(y = 22.0f)
                arcToRelative(a = 0.76f, b = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.75f, dy1 = 0.75f)
                moveToRelative(dx = -4.25f, dy = -1.5f)
                horizontalLineToRelative(dx = 3.5f)
                verticalLineTo(y = 18.5f)
                arcTo(horizontalEllipseRadius = 0.76f, verticalEllipseRadius = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 13.0f, y1 = 17.75f)
                horizontalLineToRelative(dx = -2.0f)
                arcToRelative(a = 0.76f, b = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.75f, dy1 = 0.75f)
                close()
                moveTo(x = 9.5f, y = 14.5f)
                horizontalLineToRelative(dx = -2.0f)
                arcToRelative(a = 1.76f, b = 1.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.75f, dy1 = -1.75f)
                verticalLineToRelative(dy = -1.5f)
                arcTo(horizontalEllipseRadius = 1.76f, verticalEllipseRadius = 1.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 7.5f, y1 = 9.5f)
                horizontalLineToRelative(dx = 2.0f)
                arcToRelative(a = 1.76f, b = 1.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.75f, dy1 = 1.75f)
                verticalLineToRelative(dy = 1.5f)
                arcTo(horizontalEllipseRadius = 1.76f, verticalEllipseRadius = 1.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 9.5f, y1 = 14.5f)
                moveToRelative(dx = -2.0f, dy = -3.5f)
                arcToRelative(a = 0.25f, b = 0.25f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.25f, dy1 = 0.25f)
                verticalLineToRelative(dy = 1.5f)
                arcTo(horizontalEllipseRadius = 0.25f, verticalEllipseRadius = 0.25f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 7.5f, y1 = 13.0f)
                horizontalLineToRelative(dx = 2.0f)
                arcToRelative(a = 0.25f, b = 0.25f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.25f, dy1 = -0.25f)
                verticalLineToRelative(dy = -1.5f)
                arcTo(horizontalEllipseRadius = 0.25f, verticalEllipseRadius = 0.25f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 9.5f, y1 = 11.0f)
                close()
                moveToRelative(dx = 9.0f, dy = 3.5f)
                horizontalLineToRelative(dx = -2.0f)
                arcToRelative(a = 1.76f, b = 1.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.75f, dy1 = -1.75f)
                verticalLineToRelative(dy = -1.5f)
                arcTo(horizontalEllipseRadius = 1.76f, verticalEllipseRadius = 1.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 14.5f, y1 = 9.5f)
                horizontalLineToRelative(dx = 2.0f)
                arcToRelative(a = 1.76f, b = 1.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.75f, dy1 = 1.75f)
                verticalLineToRelative(dy = 1.5f)
                arcToRelative(a = 1.76f, b = 1.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.75f, dy1 = 1.75f)
                moveToRelative(dx = -2.0f, dy = -3.5f)
                arcToRelative(a = 0.25f, b = 0.25f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.25f, dy1 = 0.25f)
                verticalLineToRelative(dy = 1.5f)
                arcTo(horizontalEllipseRadius = 0.25f, verticalEllipseRadius = 0.25f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 14.5f, y1 = 13.0f)
                horizontalLineToRelative(dx = 2.0f)
                arcToRelative(a = 0.25f, b = 0.25f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.25f, dy1 = -0.25f)
                verticalLineToRelative(dy = -1.5f)
                arcTo(horizontalEllipseRadius = 0.25f, verticalEllipseRadius = 0.25f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 16.5f, y1 = 11.0f)
                close()
                moveTo(x = 19.0f, y = 7.75f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.75f, dy1 = -0.74f)
                lineToRelative(dx = -0.02f, dy = -2.26f)
                horizontalLineToRelative(dx = -3.65f)
                curveToRelative(dx1 = -0.41f, dy1 = 0.0f, dx2 = -0.75f, dy2 = -0.34f, dx3 = -0.75f, dy3 = -0.75f)
                reflectiveCurveToRelative(dx1 = 0.34f, dy1 = -0.75f, dx2 = 0.75f, dy2 = -0.75f)
                horizontalLineToRelative(dx = 4.4f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.75f, dy1 = 0.74f)
                lineToRelative(dx = 0.03f, dy = 3.0f)
                arcTo(horizontalEllipseRadius = 0.77f, verticalEllipseRadius = 0.77f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 19.0f, y1 = 7.75f)
            }
        }.build().also { _house = it }
    }

@Suppress("ObjectPropertyName")
private var _house: ImageVector? = null
