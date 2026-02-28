package com.github.yohannestz.iconsax_compose.iconsax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Ghost: ImageVector
    get() {
        val current = _ghost
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Ghost",
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
                moveTo(x = 22.0f, y = 20.07f)
                verticalLineToRelative(dy = -7.89f)
                curveTo(x1 = 22.0f, y1 = 6.58f, x2 = 17.5f, y2 = 2.0f, x3 = 12.0f, y3 = 2.0f)
                reflectiveCurveTo(x1 = 2.0f, y1 = 6.58f, x2 = 2.0f, y2 = 12.18f)
                verticalLineToRelative(dy = 7.89f)
                curveToRelative(dx1 = 0.0f, dy1 = 1.26f, dx2 = 0.75f, dy2 = 1.6f, dx3 = 1.67f, dy3 = 0.76f)
                lineToRelative(dx = 1.0f, dy = -0.91f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.34f, dy1 = 0.0f)
                lineToRelative(dx = 2.0f, dy = 1.83f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.34f, dy1 = 0.0f)
                lineToRelative(dx = 2.0f, dy = -1.83f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.34f, dy1 = 0.0f)
                lineToRelative(dx = 2.0f, dy = 1.83f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.34f, dy1 = 0.0f)
                lineToRelative(dx = 2.0f, dy = -1.83f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.34f, dy1 = 0.0f)
                lineToRelative(dx = 1.0f, dy = 0.91f)
                curveToRelative(dx1 = 0.88f, dy1 = 0.84f, dx2 = 1.63f, dy2 = 0.5f, dx3 = 1.63f, dy3 = -0.76f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 8.0f, y = 14.0f)
                arcToRelative(a = 6.7f, b = 6.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 8.0f, dy1 = 0.0f)
                moveToRelative(dx = -4.0f, dy = -3.0f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = 0.0f, dy1 = -4.0f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 4.0f)
            }
        }.build().also { _ghost = it }
    }

@Suppress("ObjectPropertyName")
private var _ghost: ImageVector? = null
