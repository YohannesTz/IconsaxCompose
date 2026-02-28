package com.github.yohannestz.iconsax_compose.iconsax.bulk

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Reserve: ImageVector
    get() {
        val current = _reserve
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Reserve",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 21.97f, y = 18.0f)
                verticalLineToRelative(dy = 1.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 1.65f, dx2 = 0.0f, dy2 = 3.0f, dx3 = -3.0f, dy3 = 3.0f)
                horizontalLineToRelative(dx = -14.0f)
                curveToRelative(dx1 = -3.0f, dy1 = 0.0f, dx2 = -3.0f, dy2 = -1.35f, dx3 = -3.0f, dy3 = -3.0f)
                verticalLineToRelative(dy = -1.0f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.0f, dy1 = -1.0f)
                horizontalLineToRelative(dx = 18.0f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.0f, dy1 = 1.0f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
                fillAlpha = 0.4f,
                strokeAlpha = 0.4f,
            ) {
                moveTo(x = 20.72f, y = 13.0f)
                verticalLineToRelative(dy = 4.0f)
                horizontalLineTo(x = 3.27f)
                verticalLineToRelative(dy = -4.0f)
                arcToRelative(a = 8.0f, b = 8.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 8.0f, dy1 = -8.0f)
                horizontalLineToRelative(dx = 1.45f)
                arcToRelative(a = 8.0f, b = 8.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 8.0f, dy1 = 8.0f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 14.5f, y = 4.5f)
                arcToRelative(a = 3.0f, b = 3.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.09f, dy1 = 0.68f)
                arcTo(horizontalEllipseRadius = 8.0f, verticalEllipseRadius = 8.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 12.72f, y1 = 5.0f)
                horizontalLineToRelative(dx = -1.45f)
                arcToRelative(a = 8.0f, b = 8.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.68f, dy1 = 0.18f)
                arcTo(horizontalEllipseRadius = 3.0f, verticalEllipseRadius = 3.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 9.5f, y1 = 4.5f)
                arcToRelative(a = 2.5f, b = 2.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 5.0f, dy1 = 0.0f)
                moveToRelative(dx = 0.5f, dy = 7.25f)
                horizontalLineTo(x = 9.0f)
                curveToRelative(dx1 = -0.41f, dy1 = 0.0f, dx2 = -0.75f, dy2 = -0.34f, dx3 = -0.75f, dy3 = -0.75f)
                reflectiveCurveTo(x1 = 8.59f, y1 = 10.25f, x2 = 9.0f, y2 = 10.25f)
                horizontalLineToRelative(dx = 6.0f)
                curveToRelative(dx1 = 0.41f, dy1 = 0.0f, dx2 = 0.75f, dy2 = 0.34f, dx3 = 0.75f, dy3 = 0.75f)
                reflectiveCurveToRelative(dx1 = -0.34f, dy1 = 0.75f, dx2 = -0.75f, dy2 = 0.75f)
            }
        }.build().also { _reserve = it }
    }

@Suppress("ObjectPropertyName")
private var _reserve: ImageVector? = null
