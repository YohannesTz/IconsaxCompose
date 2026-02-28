package com.github.yohannestz.iconsax_compose.iconsax.bulk

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Siacoin: ImageVector
    get() {
        val current = _siacoin
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Siacoin",
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
                moveTo(x = 12.0f, y = 22.75f)
                arcTo(horizontalEllipseRadius = 10.76f, verticalEllipseRadius = 10.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 2.14f, y1 = 7.72f)
                arcToRelative(a = 0.76f, b = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.99f, dy1 = -0.39f)
                arcToRelative(a = 0.76f, b = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.39f, dy1 = 0.99f)
                arcToRelative(a = 9.25f, b = 9.25f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = 4.76f, dy1 = -4.79f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.61f, dy1 = -1.37f)
                arcTo(horizontalEllipseRadius = 10.76f, verticalEllipseRadius = 10.76f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = true, x1 = 12.0f, y1 = 22.75f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 16.0f, y = 15.25f)
                verticalLineTo(y = 12.0f)
                arcToRelative(a = 4.25f, b = 4.25f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = -4.25f, dy1 = 4.25f)
                horizontalLineTo(x = 15.0f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.0f, dy1 = -1.0f)
                moveTo(x = 5.0f, y = 6.88f)
                arcToRelative(a = 1.88f, b = 1.88f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = 0.0f, dy1 = -3.76f)
                arcToRelative(a = 1.88f, b = 1.88f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 3.76f)
            }
        }.build().also { _siacoin = it }
    }

@Suppress("ObjectPropertyName")
private var _siacoin: ImageVector? = null
