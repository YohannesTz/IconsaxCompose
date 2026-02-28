package com.github.yohannestz.iconsax_compose.iconsax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lamp: ImageVector
    get() {
        val current = _lamp
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Lamp",
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
                moveTo(x = 20.78f, y = 13.65f)
                verticalLineToRelative(dy = 4.94f)
                horizontalLineTo(x = 3.22f)
                verticalLineToRelative(dy = -4.94f)
                curveToRelative(dx1 = 0.0f, dy1 = -4.82f, dx2 = 3.9f, dy2 = -8.72f, dx3 = 8.72f, dy3 = -8.72f)
                horizontalLineToRelative(dx = 0.12f)
                curveToRelative(dx1 = 4.82f, dy1 = 0.0f, dx2 = 8.72f, dy2 = 3.9f, dx3 = 8.72f, dy3 = 8.72f)
                moveTo(x = 12.0f, y = 2.0f)
                verticalLineToRelative(dy = 2.93f)
                moveToRelative(dx = 3.65f, dy = 13.66f)
                arcTo(horizontalEllipseRadius = 3.66f, verticalEllipseRadius = 3.66f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 12.0f, y1 = 22.0f)
                arcToRelative(a = 3.66f, b = 3.66f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -3.65f, dy1 = -3.41f)
                close()
            }
        }.build().also { _lamp = it }
    }

@Suppress("ObjectPropertyName")
private var _lamp: ImageVector? = null
