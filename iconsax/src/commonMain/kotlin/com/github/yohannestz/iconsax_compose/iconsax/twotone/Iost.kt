package com.github.yohannestz.iconsax_compose.iconsax.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Iost: ImageVector
    get() {
        val current = _iost
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Iost",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 10.99f, y = 2.6f)
                lineToRelative(dx = -6.5f, dy = 3.82f)
                arcTo(horizontalEllipseRadius = 2.0f, verticalEllipseRadius = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 3.5f, y1 = 8.14f)
                verticalLineToRelative(dy = 7.71f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.99f, dy1 = 1.72f)
                lineToRelative(dx = 6.5f, dy = 3.82f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 2.03f, dy1 = 0.0f)
                lineToRelative(dx = 6.5f, dy = -3.82f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.99f, dy1 = -1.72f)
                verticalLineToRelative(dy = -7.7f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.99f, dy1 = -1.73f)
                lineToRelative(dx = -6.5f, dy = -3.82f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -2.03f, dy1 = 0.0f)
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
                moveTo(x = 17.0f, y = 9.0f)
                lineToRelative(dx = -5.0f, dy = -3.0f)
                lineToRelative(dx = -5.0f, dy = 3.0f)
                lineToRelative(dx = 10.0f, dy = 6.0f)
                lineToRelative(dx = -5.0f, dy = 3.0f)
                lineToRelative(dx = -5.0f, dy = -3.0f)
                moveToRelative(dx = 4.5f, dy = -5.0f)
                lineToRelative(dx = -2.0f, dy = 2.0f)
                moveToRelative(dx = 5.0f, dy = 0.0f)
                lineToRelative(dx = -2.0f, dy = 2.0f)
            }
        }.build().also { _iost = it }
    }

@Suppress("ObjectPropertyName")
private var _iost: ImageVector? = null
