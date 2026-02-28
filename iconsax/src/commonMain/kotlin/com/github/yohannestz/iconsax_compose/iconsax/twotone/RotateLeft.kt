package com.github.yohannestz.iconsax_compose.iconsax.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val RotateLeft: ImageVector
    get() {
        val current = _rotateLeft
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.RotateLeft",
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
                moveTo(x = 7.25f, y = 22.0f)
                horizontalLineToRelative(dx = 4.5f)
                curveTo(x1 = 15.5f, y1 = 22.0f, x2 = 17.0f, y2 = 20.5f, x3 = 17.0f, y3 = 16.75f)
                verticalLineToRelative(dy = -4.5f)
                curveTo(x1 = 17.0f, y1 = 8.5f, x2 = 15.5f, y2 = 7.0f, x3 = 11.75f, y3 = 7.0f)
                horizontalLineToRelative(dx = -4.5f)
                curveTo(x1 = 3.5f, y1 = 7.0f, x2 = 2.0f, y2 = 8.5f, x3 = 2.0f, y3 = 12.25f)
                verticalLineToRelative(dy = 4.5f)
                curveTo(x1 = 2.0f, y1 = 20.5f, x2 = 3.5f, y2 = 22.0f, x3 = 7.25f, y3 = 22.0f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 22.0f, y = 9.0f)
                arcToRelative(a = 7.0f, b = 7.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -7.0f, dy1 = -7.0f)
                lineToRelative(dx = 1.05f, dy = 1.75f)
            }
        }.build().also { _rotateLeft = it }
    }

@Suppress("ObjectPropertyName")
private var _rotateLeft: ImageVector? = null
