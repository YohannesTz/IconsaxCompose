package com.github.yohannestz.iconsax_compose.iconsax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Shapes: ImageVector
    get() {
        val current = _shapes
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Shapes",
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
                moveTo(x = 16.97f, y = 12.25f)
                verticalLineToRelative(dy = 4.5f)
                curveToRelative(dx1 = 0.0f, dy1 = 3.75f, dx2 = -1.5f, dy2 = 5.25f, dx3 = -5.25f, dy3 = 5.25f)
                horizontalLineToRelative(dx = -4.5f)
                curveToRelative(dx1 = -3.75f, dy1 = 0.0f, dx2 = -5.25f, dy2 = -1.5f, dx3 = -5.25f, dy3 = -5.25f)
                verticalLineToRelative(dy = -4.5f)
                curveTo(x1 = 1.97f, y1 = 8.5f, x2 = 3.47f, y2 = 7.0f, x3 = 7.22f, y3 = 7.0f)
                horizontalLineToRelative(dx = 4.5f)
                curveToRelative(dx1 = 3.75f, dy1 = 0.0f, dx2 = 5.25f, dy2 = 1.5f, dx3 = 5.25f, dy3 = 5.25f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 21.97f, y = 7.5f)
                arcToRelative(a = 5.5f, b = 5.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -5.0f, dy1 = 5.47f)
                verticalLineToRelative(dy = -0.72f)
                curveToRelative(dx1 = 0.0f, dy1 = -3.75f, dx2 = -1.5f, dy2 = -5.25f, dx3 = -5.25f, dy3 = -5.25f)
                horizontalLineTo(x = 11.0f)
                arcToRelative(a = 5.49f, b = 5.49f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 10.97f, dy1 = 0.5f)
            }
        }.build().also { _shapes = it }
    }

@Suppress("ObjectPropertyName")
private var _shapes: ImageVector? = null
