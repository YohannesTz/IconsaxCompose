package com.github.yohannestz.iconsax_compose.iconsax.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Mirror: ImageVector
    get() {
        val current = _mirror
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Mirror",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 12.0f, y = 18.75f)
                arcToRelative(a = 8.76f, b = 8.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = -17.5f)
                arcToRelative(a = 8.76f, b = 8.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = 17.5f)
                moveToRelative(dx = 0.0f, dy = -16.0f)
                arcToRelative(a = 7.26f, b = 7.26f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = 0.01f, dy1 = 14.51f)
                arcTo(horizontalEllipseRadius = 7.26f, verticalEllipseRadius = 7.26f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 12.0f, y1 = 2.75f)
                moveToRelative(dx = 6.0f, dy = 20.0f)
                horizontalLineTo(x = 6.0f)
                curveToRelative(dx1 = -0.41f, dy1 = 0.0f, dx2 = -0.75f, dy2 = -0.34f, dx3 = -0.75f, dy3 = -0.75f)
                reflectiveCurveTo(x1 = 5.59f, y1 = 21.25f, x2 = 6.0f, y2 = 21.25f)
                horizontalLineToRelative(dx = 12.0f)
                curveToRelative(dx1 = 0.41f, dy1 = 0.0f, dx2 = 0.75f, dy2 = 0.34f, dx3 = 0.75f, dy3 = 0.75f)
                reflectiveCurveToRelative(dx1 = -0.34f, dy1 = 0.75f, dx2 = -0.75f, dy2 = 0.75f)
            }
        }.build().also { _mirror = it }
    }

@Suppress("ObjectPropertyName")
private var _mirror: ImageVector? = null
