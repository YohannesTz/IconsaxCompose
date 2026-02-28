package com.github.yohannestz.iconsax_compose.iconsax.broken

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val EyeSlash: ImageVector
    get() {
        val current = _eyeSlash
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.EyeSlash",
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
                moveTo(x = 14.53f, y = 9.47f)
                lineToRelative(dx = -5.06f, dy = 5.06f)
                arcToRelative(a = 3.58f, b = 3.58f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = true, dx1 = 5.06f, dy1 = -5.06f)
                moveTo(x = 5.6f, y = 17.76f)
                quadToRelative(dx1 = -1.5f, dy1 = -1.3f, dx2 = -2.71f, dy2 = -3.17f)
                arcToRelative(a = 5.3f, b = 5.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = -5.2f)
                arcToRelative(a = 13.0f, b = 13.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 4.23f, dy1 = -4.26f)
                moveToRelative(dx = 10.7f, dy = 0.64f)
                arcTo(horizontalEllipseRadius = 9.6f, verticalEllipseRadius = 9.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 12.0f, y1 = 3.73f)
                moveToRelative(dx = -3.58f, dy = 15.8f)
                arcTo(horizontalEllipseRadius = 9.0f, verticalEllipseRadius = 9.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 12.0f, y1 = 20.27f)
                curveToRelative(dx1 = 3.53f, dy1 = 0.0f, dx2 = 6.82f, dy2 = -2.08f, dx3 = 9.11f, dy3 = -5.68f)
                arcToRelative(a = 5.3f, b = 5.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = -5.19f)
                arcToRelative(a = 16.0f, b = 16.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.06f, dy1 = -1.47f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 15.51f, y = 12.7f)
                arcToRelative(a = 3.6f, b = 3.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -2.82f, dy1 = 2.82f)
                moveToRelative(dx = -3.22f, dy = -0.99f)
                lineTo(x = 2.0f, y = 22.0f)
                moveTo(x = 22.0f, y = 2.0f)
                lineToRelative(dx = -7.47f, dy = 7.47f)
            }
        }.build().also { _eyeSlash = it }
    }

@Suppress("ObjectPropertyName")
private var _eyeSlash: ImageVector? = null
