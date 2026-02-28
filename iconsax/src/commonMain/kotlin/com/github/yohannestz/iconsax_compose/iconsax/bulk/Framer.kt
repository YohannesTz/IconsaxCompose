package com.github.yohannestz.iconsax_compose.iconsax.bulk

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Framer: ImageVector
    get() {
        val current = _framer
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Framer",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 4.5f, y = 10.49f)
                verticalLineToRelative(dy = 5.94f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.37f, dy1 = 0.8f)
                lineToRelative(dx = 5.36f, dy = 4.6f)
                arcTo(horizontalEllipseRadius = 1.07f, verticalEllipseRadius = 1.07f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 12.0f, y1 = 21.02f)
                verticalLineToRelative(dy = -4.1f)
                horizontalLineToRelative(dx = 4.91f)
                arcToRelative(a = 1.07f, b = 1.07f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.76f, dy1 = -1.83f)
                lineTo(x = 12.0f, y = 9.42f)
                horizontalLineTo(x = 5.57f)
                arcToRelative(a = 1.06f, b = 1.06f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.07f, dy1 = 1.07f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
                fillAlpha = 0.4f,
                strokeAlpha = 0.4f,
            ) {
                moveTo(x = 18.43f, y = 1.91f)
                horizontalLineTo(x = 7.09f)
                arcToRelative(a = 1.07f, b = 1.07f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.76f, dy1 = 1.83f)
                lineTo(x = 12.0f, y = 9.41f)
                horizontalLineToRelative(dx = 6.43f)
                arcToRelative(a = 1.07f, b = 1.07f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.07f, dy1 = -1.07f)
                verticalLineTo(y = 2.98f)
                arcToRelative(a = 1.07f, b = 1.07f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.07f, dy1 = -1.07f)
            }
        }.build().also { _framer = it }
    }

@Suppress("ObjectPropertyName")
private var _framer: ImageVector? = null
