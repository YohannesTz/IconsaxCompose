package com.github.yohannestz.iconsax_compose.iconsax.bulk

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
                fillAlpha = 0.4f,
                strokeAlpha = 0.4f,
            ) {
                moveTo(x = 22.0f, y = 9.0f)
                verticalLineToRelative(dy = 6.0f)
                horizontalLineToRelative(dx = -1.0f)
                curveToRelative(dx1 = -3.0f, dy1 = 0.0f, dx2 = -4.0f, dy2 = 1.0f, dx3 = -4.0f, dy3 = 4.0f)
                verticalLineToRelative(dy = 1.5f)
                horizontalLineTo(x = 7.0f)
                verticalLineTo(y = 19.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -3.0f, dx2 = -1.0f, dy2 = -4.0f, dx3 = -4.0f, dy3 = -4.0f)
                horizontalLineTo(x = 2.0f)
                verticalLineTo(y = 9.0f)
                horizontalLineToRelative(dx = 1.0f)
                curveToRelative(dx1 = 3.0f, dy1 = 0.0f, dx2 = 4.0f, dy2 = -1.0f, dx3 = 4.0f, dy3 = -4.0f)
                verticalLineTo(y = 3.5f)
                horizontalLineToRelative(dx = 10.0f)
                verticalLineTo(y = 5.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 3.0f, dx2 = 1.0f, dy2 = 4.0f, dx3 = 4.0f, dy3 = 4.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 12.0f, y = 15.0f)
                arcToRelative(a = 3.0f, b = 3.0f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = 0.0f, dy1 = -6.0f)
                arcToRelative(a = 3.0f, b = 3.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 6.0f)
                moveTo(x = 7.0f, y = 3.5f)
                verticalLineTo(y = 5.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 3.0f, dx2 = -1.0f, dy2 = 4.0f, dx3 = -4.0f, dy3 = 4.0f)
                horizontalLineTo(x = 2.0f)
                verticalLineTo(y = 8.5f)
                curveToRelative(dx1 = 0.0f, dy1 = -3.5f, dx2 = 2.0f, dy2 = -5.0f, dx3 = 5.0f, dy3 = -5.0f)
                moveToRelative(dx = 15.0f, dy = 5.0f)
                verticalLineTo(y = 9.0f)
                horizontalLineToRelative(dx = -1.0f)
                curveToRelative(dx1 = -3.0f, dy1 = 0.0f, dx2 = -4.0f, dy2 = -1.0f, dx3 = -4.0f, dy3 = -4.0f)
                verticalLineTo(y = 3.5f)
                curveToRelative(dx1 = 3.0f, dy1 = 0.0f, dx2 = 5.0f, dy2 = 1.5f, dx3 = 5.0f, dy3 = 5.0f)
                moveTo(x = 7.0f, y = 19.0f)
                verticalLineToRelative(dy = 1.5f)
                curveToRelative(dx1 = -3.0f, dy1 = 0.0f, dx2 = -5.0f, dy2 = -1.5f, dx3 = -5.0f, dy3 = -5.0f)
                verticalLineTo(y = 15.0f)
                horizontalLineToRelative(dx = 1.0f)
                curveToRelative(dx1 = 3.0f, dy1 = 0.0f, dx2 = 4.0f, dy2 = 1.0f, dx3 = 4.0f, dy3 = 4.0f)
                moveToRelative(dx = 15.0f, dy = -4.0f)
                verticalLineToRelative(dy = 0.5f)
                curveToRelative(dx1 = 0.0f, dy1 = 3.5f, dx2 = -2.0f, dy2 = 5.0f, dx3 = -5.0f, dy3 = 5.0f)
                verticalLineTo(y = 19.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -3.0f, dx2 = 1.0f, dy2 = -4.0f, dx3 = 4.0f, dy3 = -4.0f)
                close()
            }
        }.build().also { _moneyTwo = it }
    }

@Suppress("ObjectPropertyName")
private var _moneyTwo: ImageVector? = null
