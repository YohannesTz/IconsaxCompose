package com.github.yohannestz.iconsax_compose.iconsax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Convertshape: ImageVector
    get() {
        val current = _convertshape
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Convertshape",
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
                moveTo(x = 22.0f, y = 5.15f)
                verticalLineToRelative(dy = 3.7f)
                curveTo(x1 = 22.0f, y1 = 11.1f, x2 = 21.1f, y2 = 12.0f, x3 = 18.85f, y3 = 12.0f)
                horizontalLineToRelative(dx = -2.7f)
                curveTo(x1 = 13.9f, y1 = 12.0f, x2 = 13.0f, y2 = 11.1f, x3 = 13.0f, y3 = 8.85f)
                verticalLineToRelative(dy = -3.7f)
                curveTo(x1 = 13.0f, y1 = 2.9f, x2 = 13.9f, y2 = 2.0f, x3 = 16.15f, y3 = 2.0f)
                horizontalLineToRelative(dx = 2.7f)
                curveTo(x1 = 21.1f, y1 = 2.0f, x2 = 22.0f, y2 = 2.9f, x3 = 22.0f, y3 = 5.15f)
                moveToRelative(dx = -11.0f, dy = 10.0f)
                verticalLineToRelative(dy = 3.7f)
                curveTo(x1 = 11.0f, y1 = 21.1f, x2 = 10.1f, y2 = 22.0f, x3 = 7.85f, y3 = 22.0f)
                horizontalLineToRelative(dx = -2.7f)
                curveTo(x1 = 2.9f, y1 = 22.0f, x2 = 2.0f, y2 = 21.1f, x3 = 2.0f, y3 = 18.85f)
                verticalLineToRelative(dy = -3.7f)
                curveTo(x1 = 2.0f, y1 = 12.9f, x2 = 2.9f, y2 = 12.0f, x3 = 5.15f, y3 = 12.0f)
                horizontalLineToRelative(dx = 2.7f)
                curveTo(x1 = 10.1f, y1 = 12.0f, x2 = 11.0f, y2 = 12.9f, x3 = 11.0f, y3 = 15.15f)
                moveTo(x = 22.0f, y = 15.0f)
                arcToRelative(a = 7.0f, b = 7.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -7.0f, dy1 = 7.0f)
                lineToRelative(dx = 1.05f, dy = -1.75f)
                moveTo(x = 2.0f, y = 9.0f)
                arcToRelative(a = 7.0f, b = 7.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 7.0f, dy1 = -7.0f)
                lineTo(x = 7.95f, y = 3.75f)
            }
        }.build().also { _convertshape = it }
    }

@Suppress("ObjectPropertyName")
private var _convertshape: ImageVector? = null
