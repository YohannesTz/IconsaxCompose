package com.github.yohannestz.iconsax_compose.iconsax.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Link: ImageVector
    get() {
        val current = _link
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Link",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 7.75f, y = 18.5f)
                curveToRelative(dx1 = -3.58f, dy1 = 0.0f, dx2 = -6.5f, dy2 = -2.92f, dx3 = -6.5f, dy3 = -6.5f)
                reflectiveCurveToRelative(dx1 = 2.92f, dy1 = -6.5f, dx2 = 6.5f, dy2 = -6.5f)
                curveToRelative(dx1 = 0.41f, dy1 = 0.0f, dx2 = 0.75f, dy2 = 0.34f, dx3 = 0.75f, dy3 = 0.75f)
                reflectiveCurveTo(x1 = 8.16f, y1 = 7.0f, x2 = 7.75f, y2 = 7.0f)
                arcToRelative(a = 5.0f, b = 5.0f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = 5.0f, dy1 = 5.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.41f, dx2 = 0.34f, dy2 = -0.75f, dx3 = 0.75f, dy3 = -0.75f)
                reflectiveCurveToRelative(dx1 = 0.75f, dy1 = 0.34f, dx2 = 0.75f, dy2 = 0.75f)
                curveToRelative(dx1 = 0.0f, dy1 = 3.58f, dx2 = -2.92f, dy2 = 6.5f, dx3 = -6.5f, dy3 = 6.5f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 16.0f, y = 18.75f)
                curveToRelative(dx1 = -0.41f, dy1 = 0.0f, dx2 = -0.75f, dy2 = -0.34f, dx3 = -0.75f, dy3 = -0.75f)
                reflectiveCurveToRelative(dx1 = 0.34f, dy1 = -0.75f, dx2 = 0.75f, dy2 = -0.75f)
                arcToRelative(a = 5.26f, b = 5.26f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = -10.5f)
                arcTo(horizontalEllipseRadius = 5.26f, verticalEllipseRadius = 5.26f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 10.75f, y1 = 12.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 0.41f, dx2 = -0.34f, dy2 = 0.75f, dx3 = -0.75f, dy3 = 0.75f)
                reflectiveCurveTo(x1 = 9.25f, y1 = 12.41f, x2 = 9.25f, y2 = 12.0f)
                arcToRelative(a = 6.76f, b = 6.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 13.5f, dy1 = 0.0f)
                arcTo(horizontalEllipseRadius = 6.76f, verticalEllipseRadius = 6.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 16.0f, y1 = 18.75f)
            }
        }.build().also { _link = it }
    }

@Suppress("ObjectPropertyName")
private var _link: ImageVector? = null
