package com.github.yohannestz.iconsax_compose.iconsax.broken

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Moon: ImageVector
    get() {
        val current = _moon
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Moon",
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
                moveTo(x = 4.18f, y = 5.38f)
                arcToRelative(a = 10.2f, b = 10.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -2.15f, dy1 = 7.04f)
                arcToRelative(a = 10.49f, b = 10.49f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 18.93f, dy1 = 5.3f)
                curveToRelative(dx1 = 0.82f, dy1 = -1.11f, dx2 = 0.38f, dy2 = -1.85f, dx3 = -0.99f, dy3 = -1.6f)
                arcTo(horizontalEllipseRadius = 9.32f, verticalEllipseRadius = 9.32f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 8.98f, y1 = 7.14f)
                arcToRelative(a = 9.0f, b = 9.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.75f, dy1 = -3.65f)
                curveToRelative(dx1 = 0.54f, dy1 = -1.24f, dx2 = -0.11f, dy2 = -1.83f, dx3 = -1.36f, dy3 = -1.3f)
            }
        }.build().also { _moon = it }
    }

@Suppress("ObjectPropertyName")
private var _moon: ImageVector? = null
