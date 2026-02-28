package com.github.yohannestz.iconsax_compose.iconsax.bulk

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Next: ImageVector
    get() {
        val current = _next
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Next",
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
                moveTo(x = 3.76f, y = 7.22f)
                verticalLineToRelative(dy = 9.57f)
                arcTo(horizontalEllipseRadius = 2.56f, verticalEllipseRadius = 2.56f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 7.6f, y1 = 19.0f)
                lineToRelative(dx = 4.15f, dy = -2.39f)
                lineToRelative(dx = 4.15f, dy = -2.4f)
                arcToRelative(a = 2.54f, b = 2.54f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = -4.41f)
                lineToRelative(dx = -4.15f, dy = -2.4f)
                lineTo(x = 7.6f, y = 5.01f)
                arcToRelative(a = 2.55f, b = 2.55f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -3.83f, dy1 = 2.21f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 20.24f, y = 18.93f)
                arcToRelative(a = 0.76f, b = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.75f, dy1 = -0.75f)
                verticalLineTo(y = 5.82f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.41f, dx2 = 0.34f, dy2 = -0.75f, dx3 = 0.75f, dy3 = -0.75f)
                reflectiveCurveToRelative(dx1 = 0.75f, dy1 = 0.34f, dx2 = 0.75f, dy2 = 0.75f)
                verticalLineToRelative(dy = 12.36f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.75f, dy1 = 0.75f)
            }
        }.build().also { _next = it }
    }

@Suppress("ObjectPropertyName")
private var _next: ImageVector? = null
