package com.github.yohannestz.iconsax_compose.iconsax.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lock: ImageVector
    get() {
        val current = _lock
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Lock",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 18.0f, y = 10.75f)
                arcTo(horizontalEllipseRadius = 0.76f, verticalEllipseRadius = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 17.25f, y1 = 10.0f)
                verticalLineTo(y = 8.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -3.15f, dx2 = -0.89f, dy2 = -5.25f, dx3 = -5.25f, dy3 = -5.25f)
                reflectiveCurveTo(x1 = 6.75f, y1 = 4.85f, x2 = 6.75f, y2 = 8.0f)
                verticalLineToRelative(dy = 2.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 0.41f, dx2 = -0.34f, dy2 = 0.75f, dx3 = -0.75f, dy3 = 0.75f)
                reflectiveCurveTo(x1 = 5.25f, y1 = 10.41f, x2 = 5.25f, y2 = 10.0f)
                verticalLineTo(y = 8.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -2.9f, dx2 = 0.7f, dy2 = -6.75f, dx3 = 6.75f, dy3 = -6.75f)
                reflectiveCurveTo(x1 = 18.75f, y1 = 5.1f, x2 = 18.75f, y2 = 8.0f)
                verticalLineToRelative(dy = 2.0f)
                arcTo(horizontalEllipseRadius = 0.76f, verticalEllipseRadius = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 18.0f, y1 = 10.75f)
                moveToRelative(dx = -6.0f, dy = 8.5f)
                arcToRelative(a = 3.26f, b = 3.26f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = -6.5f)
                arcToRelative(a = 3.26f, b = 3.26f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = 6.5f)
                moveToRelative(dx = 0.0f, dy = -5.0f)
                curveToRelative(dx1 = -0.96f, dy1 = 0.0f, dx2 = -1.75f, dy2 = 0.79f, dx3 = -1.75f, dy3 = 1.75f)
                reflectiveCurveToRelative(dx1 = 0.79f, dy1 = 1.75f, dx2 = 1.75f, dy2 = 1.75f)
                reflectiveCurveToRelative(dx1 = 1.75f, dy1 = -0.79f, dx2 = 1.75f, dy2 = -1.75f)
                reflectiveCurveToRelative(dx1 = -0.79f, dy1 = -1.75f, dx2 = -1.75f, dy2 = -1.75f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 17.0f, y = 22.75f)
                horizontalLineTo(x = 7.0f)
                curveToRelative(dx1 = -4.41f, dy1 = 0.0f, dx2 = -5.75f, dy2 = -1.34f, dx3 = -5.75f, dy3 = -5.75f)
                verticalLineToRelative(dy = -2.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -4.41f, dx2 = 1.34f, dy2 = -5.75f, dx3 = 5.75f, dy3 = -5.75f)
                horizontalLineToRelative(dx = 10.0f)
                curveToRelative(dx1 = 4.41f, dy1 = 0.0f, dx2 = 5.75f, dy2 = 1.34f, dx3 = 5.75f, dy3 = 5.75f)
                verticalLineToRelative(dy = 2.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 4.41f, dx2 = -1.34f, dy2 = 5.75f, dx3 = -5.75f, dy3 = 5.75f)
                moveToRelative(dx = -10.0f, dy = -12.0f)
                curveToRelative(dx1 = -3.58f, dy1 = 0.0f, dx2 = -4.25f, dy2 = 0.68f, dx3 = -4.25f, dy3 = 4.25f)
                verticalLineToRelative(dy = 2.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 3.57f, dx2 = 0.67f, dy2 = 4.25f, dx3 = 4.25f, dy3 = 4.25f)
                horizontalLineToRelative(dx = 10.0f)
                curveToRelative(dx1 = 3.58f, dy1 = 0.0f, dx2 = 4.25f, dy2 = -0.68f, dx3 = 4.25f, dy3 = -4.25f)
                verticalLineToRelative(dy = -2.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -3.57f, dx2 = -0.67f, dy2 = -4.25f, dx3 = -4.25f, dy3 = -4.25f)
                close()
            }
        }.build().also { _lock = it }
    }

@Suppress("ObjectPropertyName")
private var _lock: ImageVector? = null
