package com.github.yohannestz.iconsax_compose.iconsax.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Money: ImageVector
    get() {
        val current = _money
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Money",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 17.0f, y = 21.25f)
                horizontalLineTo(x = 7.0f)
                curveToRelative(dx1 = -3.65f, dy1 = 0.0f, dx2 = -5.75f, dy2 = -2.1f, dx3 = -5.75f, dy3 = -5.75f)
                verticalLineToRelative(dy = -7.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -3.65f, dx2 = 2.1f, dy2 = -5.75f, dx3 = 5.75f, dy3 = -5.75f)
                horizontalLineToRelative(dx = 10.0f)
                curveToRelative(dx1 = 3.65f, dy1 = 0.0f, dx2 = 5.75f, dy2 = 2.1f, dx3 = 5.75f, dy3 = 5.75f)
                verticalLineToRelative(dy = 7.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 3.65f, dx2 = -2.1f, dy2 = 5.75f, dx3 = -5.75f, dy3 = 5.75f)
                moveToRelative(dx = -10.0f, dy = -17.0f)
                curveToRelative(dx1 = -2.86f, dy1 = 0.0f, dx2 = -4.25f, dy2 = 1.39f, dx3 = -4.25f, dy3 = 4.25f)
                verticalLineToRelative(dy = 7.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 2.86f, dx2 = 1.39f, dy2 = 4.25f, dx3 = 4.25f, dy3 = 4.25f)
                horizontalLineToRelative(dx = 10.0f)
                quadToRelative(dx1 = 4.27f, dy1 = 0.02f, dx2 = 4.25f, dy2 = -4.25f)
                verticalLineToRelative(dy = -7.0f)
                quadTo(x1 = 21.27f, y1 = 4.23f, x2 = 17.0f, y2 = 4.25f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 12.0f, y = 15.75f)
                arcToRelative(a = 3.75f, b = 3.75f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = true, dx1 = 0.0f, dy1 = -7.5f)
                arcToRelative(a = 3.75f, b = 3.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = 7.5f)
                moveToRelative(dx = 0.0f, dy = -6.0f)
                arcToRelative(a = 2.25f, b = 2.25f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = 0.0f, dy1 = 4.5f)
                arcToRelative(a = 2.25f, b = 2.25f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = -4.5f)
                moveToRelative(dx = -6.5f, dy = 5.5f)
                arcToRelative(a = 0.76f, b = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.75f, dy1 = -0.75f)
                verticalLineToRelative(dy = -5.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.41f, dx2 = 0.34f, dy2 = -0.75f, dx3 = 0.75f, dy3 = -0.75f)
                reflectiveCurveTo(x1 = 6.25f, y1 = 9.09f, x2 = 6.25f, y2 = 9.5f)
                verticalLineToRelative(dy = 5.0f)
                arcToRelative(a = 0.76f, b = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.75f, dy1 = 0.75f)
                moveToRelative(dx = 13.0f, dy = 0.0f)
                arcToRelative(a = 0.76f, b = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.75f, dy1 = -0.75f)
                verticalLineToRelative(dy = -5.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.41f, dx2 = 0.34f, dy2 = -0.75f, dx3 = 0.75f, dy3 = -0.75f)
                reflectiveCurveToRelative(dx1 = 0.75f, dy1 = 0.34f, dx2 = 0.75f, dy2 = 0.75f)
                verticalLineToRelative(dy = 5.0f)
                arcToRelative(a = 0.76f, b = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.75f, dy1 = 0.75f)
            }
        }.build().also { _money = it }
    }

@Suppress("ObjectPropertyName")
private var _money: ImageVector? = null
