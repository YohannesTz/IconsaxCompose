package com.github.yohannestz.iconsax_compose.iconsax.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bitcoin: ImageVector
    get() {
        val current = _bitcoin
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Bitcoin",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 12.0f, y = 22.0f)
                arcToRelative(a = 10.0f, b = 10.0f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = 0.0f, dy1 = -20.0f)
                arcToRelative(a = 10.0f, b = 10.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 20.0f)
                close()
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 0.4f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 8.78f, y = 7.67f)
                horizontalLineToRelative(dx = 5.42f)
                curveToRelative(dx1 = 1.2f, dy1 = 0.0f, dx2 = 2.17f, dy2 = 1.08f, dx3 = 2.17f, dy3 = 2.17f)
                curveToRelative(dx1 = 0.0f, dy1 = 1.2f, dx2 = -0.97f, dy2 = 2.17f, dx3 = -2.17f, dy3 = 2.17f)
                horizontalLineTo(x = 8.78f)
                close()
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 0.4f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 8.78f, y = 12.0f)
                horizontalLineToRelative(dx = 6.2f)
                curveToRelative(dx1 = 1.36f, dy1 = 0.0f, dx2 = 2.47f, dy2 = 0.97f, dx3 = 2.47f, dy3 = 2.17f)
                reflectiveCurveToRelative(dx1 = -1.1f, dy1 = 2.17f, dx2 = -2.48f, dy2 = 2.17f)
                horizontalLineTo(x = 8.78f)
                close()
                moveToRelative(dx = 3.79f, dy = 4.33f)
                verticalLineToRelative(dy = 2.17f)
                moveToRelative(dx = -2.7f, dy = -2.17f)
                verticalLineToRelative(dy = 2.17f)
                moveToRelative(dx = 2.7f, dy = -13.0f)
                verticalLineToRelative(dy = 2.17f)
                moveTo(x = 9.87f, y = 5.5f)
                verticalLineToRelative(dy = 2.17f)
                moveToRelative(dx = 0.97f, dy = 0.0f)
                horizontalLineTo(x = 7.05f)
                moveToRelative(dx = 3.79f, dy = 8.66f)
                horizontalLineTo(x = 7.05f)
            }
        }.build().also { _bitcoin = it }
    }

@Suppress("ObjectPropertyName")
private var _bitcoin: ImageVector? = null
