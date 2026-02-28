package com.github.yohannestz.iconsax_compose.iconsax.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val User: ImageVector
    get() {
        val current = _user
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.User",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 12.0f, y = 12.75f)
                arcToRelative(a = 5.76f, b = 5.76f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = true, dx1 = 0.01f, dy1 = -11.51f)
                arcTo(horizontalEllipseRadius = 5.76f, verticalEllipseRadius = 5.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 12.0f, y1 = 12.75f)
                moveToRelative(dx = 0.0f, dy = -10.0f)
                arcTo(horizontalEllipseRadius = 4.26f, verticalEllipseRadius = 4.26f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 7.75f, y1 = 7.0f)
                arcTo(horizontalEllipseRadius = 4.26f, verticalEllipseRadius = 4.26f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 12.0f, y1 = 11.25f)
                arcTo(horizontalEllipseRadius = 4.26f, verticalEllipseRadius = 4.26f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 16.25f, y1 = 7.0f)
                arcTo(horizontalEllipseRadius = 4.26f, verticalEllipseRadius = 4.26f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 12.0f, y1 = 2.75f)
                moveToRelative(dx = 8.59f, dy = 20.0f)
                arcTo(horizontalEllipseRadius = 0.76f, verticalEllipseRadius = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 19.84f, y1 = 22.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -3.45f, dx2 = -3.52f, dy2 = -6.25f, dx3 = -7.84f, dy3 = -6.25f)
                reflectiveCurveTo(x1 = 4.16f, y1 = 18.55f, x2 = 4.16f, y2 = 22.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 0.41f, dx2 = -0.34f, dy2 = 0.75f, dx3 = -0.75f, dy3 = 0.75f)
                reflectiveCurveTo(x1 = 2.66f, y1 = 22.41f, x2 = 2.66f, y2 = 22.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -4.27f, dx2 = 4.19f, dy2 = -7.75f, dx3 = 9.34f, dy3 = -7.75f)
                reflectiveCurveToRelative(dx1 = 9.34f, dy1 = 3.48f, dx2 = 9.34f, dy2 = 7.75f)
                arcToRelative(a = 0.76f, b = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.75f, dy1 = 0.75f)
            }
        }.build().also { _user = it }
    }

@Suppress("ObjectPropertyName")
private var _user: ImageVector? = null
