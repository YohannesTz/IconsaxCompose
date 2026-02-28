package com.github.yohannestz.iconsax_compose.iconsax.bulk

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Book: ImageVector
    get() {
        val current = _book
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Book",
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
                moveTo(x = 12.0f, y = 5.3f)
                verticalLineToRelative(dy = 16.03f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.49f, dy1 = -0.1f)
                lineToRelative(dx = -0.04f, dy = -0.03f)
                arcToRelative(a = 26.0f, b = 26.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -7.44f, dy1 = -2.44f)
                lineToRelative(dx = -0.29f, dy = -0.04f)
                arcTo(horizontalEllipseRadius = 2.05f, verticalEllipseRadius = 2.05f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 2.0f, y1 = 16.74f)
                verticalLineTo(y = 4.66f)
                arcToRelative(a = 1.97f, b = 1.97f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 2.16f, dy1 = -1.99f)
                arcToRelative(a = 19.0f, b = 19.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 7.06f, dy1 = 2.34f)
                lineToRelative(dx = 0.25f, dy = 0.15f)
                arcTo(horizontalEllipseRadius = 1.0f, verticalEllipseRadius = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 12.0f, y1 = 5.3f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 22.0f, y = 4.67f)
                verticalLineToRelative(dy = 12.07f)
                arcToRelative(a = 2.05f, b = 2.05f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.74f, dy1 = 1.98f)
                lineToRelative(dx = -0.33f, dy = 0.04f)
                arcToRelative(a = 26.0f, b = 26.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -7.46f, dy1 = 2.46f)
                arcTo(horizontalEllipseRadius = 1.0f, verticalEllipseRadius = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 12.0f, y1 = 21.33f)
                verticalLineTo(y = 5.3f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.53f, dy1 = -0.14f)
                lineToRelative(dx = 0.17f, dy = -0.11f)
                arcToRelative(a = 19.0f, b = 19.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 7.07f, dy1 = -2.37f)
                horizontalLineToRelative(dx = 0.06f)
                arcTo(horizontalEllipseRadius = 1.97f, verticalEllipseRadius = 1.97f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 22.0f, y1 = 4.67f)
                moveTo(x = 7.75f, y = 9.24f)
                horizontalLineTo(x = 5.5f)
                curveToRelative(dx1 = -0.41f, dy1 = 0.0f, dx2 = -0.75f, dy2 = -0.34f, dx3 = -0.75f, dy3 = -0.75f)
                reflectiveCurveTo(x1 = 5.09f, y1 = 7.74f, x2 = 5.5f, y2 = 7.74f)
                horizontalLineToRelative(dx = 2.25f)
                curveToRelative(dx1 = 0.41f, dy1 = 0.0f, dx2 = 0.75f, dy2 = 0.34f, dx3 = 0.75f, dy3 = 0.75f)
                reflectiveCurveTo(x1 = 8.16f, y1 = 9.24f, x2 = 7.75f, y2 = 9.24f)
                moveToRelative(dx = 0.75f, dy = 3.0f)
                horizontalLineToRelative(dx = -3.0f)
                curveToRelative(dx1 = -0.41f, dy1 = 0.0f, dx2 = -0.75f, dy2 = -0.34f, dx3 = -0.75f, dy3 = -0.75f)
                reflectiveCurveToRelative(dx1 = 0.34f, dy1 = -0.75f, dx2 = 0.75f, dy2 = -0.75f)
                horizontalLineToRelative(dx = 3.0f)
                curveToRelative(dx1 = 0.41f, dy1 = 0.0f, dx2 = 0.75f, dy2 = 0.34f, dx3 = 0.75f, dy3 = 0.75f)
                reflectiveCurveToRelative(dx1 = -0.34f, dy1 = 0.75f, dx2 = -0.75f, dy2 = 0.75f)
            }
        }.build().also { _book = it }
    }

@Suppress("ObjectPropertyName")
private var _book: ImageVector? = null
