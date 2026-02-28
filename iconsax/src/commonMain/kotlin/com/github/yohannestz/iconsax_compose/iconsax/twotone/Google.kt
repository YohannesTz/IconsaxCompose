package com.github.yohannestz.iconsax_compose.iconsax.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Google: ImageVector
    get() {
        val current = _google
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Google",
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
                moveTo(x = 21.59f, y = 10.18f)
                horizontalLineTo(x = 12.2f)
                verticalLineToRelative(dy = 3.7f)
                horizontalLineToRelative(dx = 5.51f)
                arcToRelative(a = 4.9f, b = 4.9f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -2.04f, dy1 = 3.25f)
                arcToRelative(a = 6.0f, b = 6.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -3.47f, dy1 = 1.0f)
                arcToRelative(a = 6.0f, b = 6.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -5.69f, dy1 = -4.16f)
                arcToRelative(a = 6.2f, b = 6.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.2f, dy1 = -4.5f)
                arcToRelative(a = 6.0f, b = 6.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 5.49f, dy1 = -3.61f)
                arcToRelative(a = 5.6f, b = 5.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 3.87f, dy1 = 1.49f)
                lineToRelative(dx = 2.82f, dy = -2.76f)
                arcTo(horizontalEllipseRadius = 9.98f, verticalEllipseRadius = 9.98f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 3.27f, y1 = 16.48f)
                lineToRelative(dx = 0.01f, dy = -0.01f)
                verticalLineToRelative(dy = 0.0f)
                arcTo(horizontalEllipseRadius = 10.0f, verticalEllipseRadius = 10.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 12.2f, y1 = 22.0f)
                curveToRelative(dx1 = 2.7f, dy1 = 0.0f, dx2 = 4.97f, dy2 = -0.9f, dx3 = 6.62f, dy3 = -2.42f)
                curveToRelative(dx1 = 1.89f, dy1 = -1.74f, dx2 = 2.98f, dy2 = -4.31f, dx3 = 2.98f, dy3 = -7.36f)
                arcToRelative(a = 9.0f, b = 9.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.21f, dy1 = -2.03f)
            }
        }.build().also { _google = it }
    }

@Suppress("ObjectPropertyName")
private var _google: ImageVector? = null
