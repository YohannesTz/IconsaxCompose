package com.github.yohannestz.iconsax_compose.iconsax.broken

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Keyboard: ImageVector
    get() {
        val current = _keyboard
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Keyboard",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 2.5f, y = 9.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -3.38f, dx2 = 0.71f, dy2 = -4.62f, dx3 = 3.34f, dy3 = -4.91f)
                arcTo(horizontalEllipseRadius = 12.0f, verticalEllipseRadius = 12.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 7.5f, y1 = 4.0f)
                horizontalLineToRelative(dx = 9.0f)
                quadToRelative(dx1 = 0.93f, dy1 = 0.0f, dx2 = 1.66f, dy2 = 0.09f)
                curveTo(x1 = 20.79f, y1 = 4.38f, x2 = 21.5f, y2 = 5.62f, x3 = 21.5f, y3 = 9.0f)
                verticalLineToRelative(dy = 6.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 3.38f, dx2 = -0.71f, dy2 = 4.62f, dx3 = -3.34f, dy3 = 4.91f)
                arcTo(horizontalEllipseRadius = 12.0f, verticalEllipseRadius = 12.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 16.5f, y1 = 20.0f)
                horizontalLineToRelative(dx = -9.0f)
                quadToRelative(dx1 = -0.93f, dy1 = 0.0f, dx2 = -1.66f, dy2 = -0.09f)
                curveTo(x1 = 3.21f, y1 = 19.62f, x2 = 2.5f, y2 = 18.38f, x3 = 2.5f, y3 = 15.0f)
                verticalLineToRelative(dy = -2.08f)
                moveToRelative(dx = 11.0f, dy = -2.92f)
                horizontalLineTo(x = 17.0f)
                moveTo(x = 7.0f, y = 15.5f)
                horizontalLineToRelative(dx = 10.0f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                moveTo(x = 10.1f, y = 10.0f)
                close()
                moveToRelative(dx = -3.0f, dy = 0.0f)
                close()
            }
        }.build().also { _keyboard = it }
    }

@Suppress("ObjectPropertyName")
private var _keyboard: ImageVector? = null
