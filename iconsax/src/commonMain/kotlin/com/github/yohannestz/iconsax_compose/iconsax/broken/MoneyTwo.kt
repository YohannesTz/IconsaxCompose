package com.github.yohannestz.iconsax_compose.iconsax.broken

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
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
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 2.0f, y = 12.53f)
                verticalLineToRelative(dy = 2.97f)
                curveToRelative(dx1 = 0.0f, dy1 = 3.5f, dx2 = 2.0f, dy2 = 5.0f, dx3 = 5.0f, dy3 = 5.0f)
                horizontalLineToRelative(dx = 10.0f)
                curveToRelative(dx1 = 3.0f, dy1 = 0.0f, dx2 = 5.0f, dy2 = -1.5f, dx3 = 5.0f, dy3 = -5.0f)
                verticalLineToRelative(dy = -7.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -3.5f, dx2 = -2.0f, dy2 = -5.0f, dx3 = -5.0f, dy3 = -5.0f)
                horizontalLineTo(x = 7.0f)
                curveToRelative(dx1 = -3.0f, dy1 = 0.0f, dx2 = -5.0f, dy2 = 1.5f, dx3 = -5.0f, dy3 = 5.0f)
                verticalLineTo(y = 9.0f)
                horizontalLineToRelative(dx = 1.0f)
                curveToRelative(dx1 = 3.0f, dy1 = 0.0f, dx2 = 4.0f, dy2 = -1.0f, dx3 = 4.0f, dy3 = -4.0f)
                verticalLineTo(y = 4.0f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 15.0f, y = 12.0f)
                arcToRelative(a = 3.0f, b = 3.0f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = -3.0f, dy1 = 3.0f)
                moveToRelative(dx = 10.0f, dy = -6.0f)
                horizontalLineToRelative(dx = -1.0f)
                curveToRelative(dx1 = -3.0f, dy1 = 0.0f, dx2 = -4.0f, dy2 = -1.0f, dx3 = -4.0f, dy3 = -4.0f)
                verticalLineTo(y = 4.0f)
                moveTo(x = 2.0f, y = 15.0f)
                horizontalLineToRelative(dx = 1.0f)
                curveToRelative(dx1 = 3.0f, dy1 = 0.0f, dx2 = 4.0f, dy2 = 1.0f, dx3 = 4.0f, dy3 = 4.0f)
                verticalLineToRelative(dy = 1.0f)
                moveToRelative(dx = 15.0f, dy = -5.0f)
                horizontalLineToRelative(dx = -1.0f)
                curveToRelative(dx1 = -3.0f, dy1 = 0.0f, dx2 = -4.0f, dy2 = 1.0f, dx3 = -4.0f, dy3 = 4.0f)
                verticalLineToRelative(dy = 1.0f)
            }
        }.build().also { _moneyTwo = it }
    }

@Suppress("ObjectPropertyName")
private var _moneyTwo: ImageVector? = null
