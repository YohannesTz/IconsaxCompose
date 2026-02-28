package com.github.yohannestz.iconsax_compose.iconsax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Weight: ImageVector
    get() {
        val current = _weight
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Weight",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 17.18f, y = 5.25f)
                curveToRelative(dx1 = -1.71f, dy1 = 0.0f, dx2 = -3.75f, dy2 = 0.65f, dx3 = -3.75f, dy3 = 3.75f)
                verticalLineToRelative(dy = 6.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 3.1f, dx2 = 2.04f, dy2 = 3.75f, dx3 = 3.75f, dy3 = 3.75f)
                reflectiveCurveToRelative(dx1 = 3.75f, dy1 = -0.65f, dx2 = 3.75f, dy2 = -3.75f)
                verticalLineTo(y = 9.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -3.1f, dx2 = -2.04f, dy2 = -3.75f, dx3 = -3.75f, dy3 = -3.75f)
                moveToRelative(dx = -10.36f, dy = 0.0f)
                curveTo(x1 = 5.11f, y1 = 5.25f, x2 = 3.07f, y2 = 5.9f, x3 = 3.07f, y3 = 9.0f)
                verticalLineToRelative(dy = 6.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 3.1f, dx2 = 2.04f, dy2 = 3.75f, dx3 = 3.75f, dy3 = 3.75f)
                reflectiveCurveToRelative(dx1 = 3.75f, dy1 = -0.65f, dx2 = 3.75f, dy2 = -3.75f)
                verticalLineTo(y = 9.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -3.1f, dx2 = -2.04f, dy2 = -3.75f, dx3 = -3.75f, dy3 = -3.75f)
                moveToRelative(dx = 6.61f, dy = 6.0f)
                horizontalLineToRelative(dx = -2.86f)
                verticalLineToRelative(dy = 1.5f)
                horizontalLineToRelative(dx = 2.86f)
                close()
                moveToRelative(dx = 9.07f, dy = 4.0f)
                arcToRelative(a = 0.76f, b = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.75f, dy1 = -0.75f)
                verticalLineToRelative(dy = -5.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.41f, dx2 = 0.34f, dy2 = -0.75f, dx3 = 0.75f, dy3 = -0.75f)
                reflectiveCurveToRelative(dx1 = 0.75f, dy1 = 0.34f, dx2 = 0.75f, dy2 = 0.75f)
                verticalLineToRelative(dy = 5.0f)
                arcToRelative(a = 0.76f, b = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.75f, dy1 = 0.75f)
                moveToRelative(dx = -21.0f, dy = 0.0f)
                arcToRelative(a = 0.76f, b = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.75f, dy1 = -0.75f)
                verticalLineToRelative(dy = -5.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.41f, dx2 = 0.34f, dy2 = -0.75f, dx3 = 0.75f, dy3 = -0.75f)
                reflectiveCurveTo(x1 = 2.25f, y1 = 9.09f, x2 = 2.25f, y2 = 9.5f)
                verticalLineToRelative(dy = 5.0f)
                arcToRelative(a = 0.76f, b = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.75f, dy1 = 0.75f)
            }
        }.build().also { _weight = it }
    }

@Suppress("ObjectPropertyName")
private var _weight: ImageVector? = null
