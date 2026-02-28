package com.github.yohannestz.iconsax_compose.iconsax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MoneyTwo: ImageVector
    get() {
        val current = _moneyTwo
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.MoneyTwo",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 12.0f, y = 15.0f)
                arcToRelative(a = 3.0f, b = 3.0f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = 0.0f, dy1 = -6.0f)
                arcToRelative(a = 3.0f, b = 3.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 6.0f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 17.0f, y = 3.5f)
                horizontalLineTo(x = 7.0f)
                curveToRelative(dx1 = -3.0f, dy1 = 0.0f, dx2 = -5.0f, dy2 = 1.5f, dx3 = -5.0f, dy3 = 5.0f)
                verticalLineToRelative(dy = 7.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 3.5f, dx2 = 2.0f, dy2 = 5.0f, dx3 = 5.0f, dy3 = 5.0f)
                horizontalLineToRelative(dx = 10.0f)
                curveToRelative(dx1 = 3.0f, dy1 = 0.0f, dx2 = 5.0f, dy2 = -1.5f, dx3 = 5.0f, dy3 = -5.0f)
                verticalLineToRelative(dy = -7.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -3.5f, dx2 = -2.0f, dy2 = -5.0f, dx3 = -5.0f, dy3 = -5.0f)
                moveTo(x = 7.0f, y = 19.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -2.82f, dx2 = -0.91f, dy2 = -3.86f, dx3 = -3.5f, dy3 = -3.98f)
                verticalLineTo(y = 8.98f)
                curveTo(x1 = 6.09f, y1 = 8.86f, x2 = 7.0f, y2 = 7.82f, x3 = 7.0f, y3 = 5.0f)
                horizontalLineToRelative(dx = 10.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 2.82f, dx2 = 0.91f, dy2 = 3.86f, dx3 = 3.5f, dy3 = 3.98f)
                verticalLineToRelative(dy = 6.04f)
                curveTo(x1 = 17.91f, y1 = 15.14f, x2 = 17.0f, y2 = 16.18f, x3 = 17.0f, y3 = 19.0f)
                close()
            }
        }.build().also { _moneyTwo = it }
    }

@Suppress("ObjectPropertyName")
private var _moneyTwo: ImageVector? = null
