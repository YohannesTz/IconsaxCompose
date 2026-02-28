package com.github.yohannestz.iconsax_compose.iconsax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val PasswordCheck: ImageVector
    get() {
        val current = _passwordCheck
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.PasswordCheck",
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
                moveTo(x = 11.02f, y = 19.5f)
                horizontalLineTo(x = 7.5f)
                quadToRelative(dx1 = -0.93f, dy1 = 0.0f, dx2 = -1.66f, dy2 = -0.09f)
                curveTo(x1 = 3.21f, y1 = 19.12f, x2 = 2.5f, y2 = 17.88f, x3 = 2.5f, y3 = 14.5f)
                verticalLineToRelative(dy = -5.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -3.38f, dx2 = 0.71f, dy2 = -4.62f, dx3 = 3.34f, dy3 = -4.91f)
                arcTo(horizontalEllipseRadius = 12.0f, verticalEllipseRadius = 12.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 7.5f, y1 = 4.5f)
                horizontalLineToRelative(dx = 3.46f)
                moveToRelative(dx = 4.06f, dy = 0.0f)
                horizontalLineToRelative(dx = 1.48f)
                quadToRelative(dx1 = 0.93f, dy1 = 0.0f, dx2 = 1.66f, dy2 = 0.09f)
                curveToRelative(dx1 = 2.63f, dy1 = 0.29f, dx2 = 3.34f, dy2 = 1.53f, dx3 = 3.34f, dy3 = 4.91f)
                verticalLineToRelative(dy = 5.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 3.38f, dx2 = -0.71f, dy2 = 4.62f, dx3 = -3.34f, dy3 = 4.91f)
                arcToRelative(a = 12.0f, b = 12.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.66f, dy1 = 0.09f)
                horizontalLineToRelative(dx = -1.48f)
                moveTo(x = 15.0f, y = 2.0f)
                verticalLineToRelative(dy = 20.0f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                moveTo(x = 11.1f, y = 12.0f)
                close()
                moveToRelative(dx = -4.0f, dy = 0.0f)
                close()
            }
        }.build().also { _passwordCheck = it }
    }

@Suppress("ObjectPropertyName")
private var _passwordCheck: ImageVector? = null
