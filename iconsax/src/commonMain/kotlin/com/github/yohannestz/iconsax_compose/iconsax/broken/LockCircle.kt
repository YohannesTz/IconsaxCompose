package com.github.yohannestz.iconsax_compose.iconsax.broken

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val LockCircle: ImageVector
    get() {
        val current = _lockCircle
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.LockCircle",
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
                moveTo(x = 9.0f, y = 11.0f)
                verticalLineToRelative(dy = -1.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -1.66f, dx2 = 0.5f, dy2 = -3.0f, dx3 = 3.0f, dy3 = -3.0f)
                reflectiveCurveToRelative(dx1 = 3.0f, dy1 = 1.34f, dx2 = 3.0f, dy2 = 3.0f)
                verticalLineToRelative(dy = 1.0f)
                moveToRelative(dx = -3.0f, dy = 3.6f)
                arcToRelative(a = 0.6f, b = 0.6f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = 0.0f, dy1 = -1.2f)
                arcToRelative(a = 0.6f, b = 0.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 1.2f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 14.5f, y = 17.0f)
                horizontalLineToRelative(dx = -5.0f)
                curveToRelative(dx1 = -2.0f, dy1 = 0.0f, dx2 = -2.5f, dy2 = -0.5f, dx3 = -2.5f, dy3 = -2.5f)
                verticalLineToRelative(dy = -1.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -2.0f, dx2 = 0.5f, dy2 = -2.5f, dx3 = 2.5f, dy3 = -2.5f)
                horizontalLineToRelative(dx = 5.0f)
                curveToRelative(dx1 = 2.0f, dy1 = 0.0f, dx2 = 2.5f, dy2 = 0.5f, dx3 = 2.5f, dy3 = 2.5f)
                verticalLineToRelative(dy = 1.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 2.0f, dx2 = -0.5f, dy2 = 2.5f, dx3 = -2.5f, dy3 = 2.5f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 4.0f, y = 6.0f)
                arcToRelative(a = 10.0f, b = 10.0f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = 3.97f, dy1 = -3.15f)
            }
        }.build().also { _lockCircle = it }
    }

@Suppress("ObjectPropertyName")
private var _lockCircle: ImageVector? = null
