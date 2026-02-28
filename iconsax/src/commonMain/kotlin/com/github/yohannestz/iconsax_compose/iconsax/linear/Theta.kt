package com.github.yohannestz.iconsax_compose.iconsax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Theta: ImageVector
    get() {
        val current = _theta
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Theta",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF17191C)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 15.1f, y = 18.0f)
                horizontalLineTo(x = 8.9f)
                curveToRelative(dx1 = -1.0f, dy1 = 0.0f, dx2 = -1.9f, dy2 = -0.8f, dx3 = -1.9f, dy3 = -1.9f)
                verticalLineTo(y = 7.9f)
                curveTo(x1 = 7.0f, y1 = 6.8f, x2 = 7.8f, y2 = 6.0f, x3 = 8.9f, y3 = 6.0f)
                horizontalLineToRelative(dx = 6.3f)
                curveToRelative(dx1 = 1.0f, dy1 = 0.0f, dx2 = 1.9f, dy2 = 0.8f, dx3 = 1.9f, dy3 = 1.9f)
                verticalLineToRelative(dy = 8.3f)
                curveToRelative(dx1 = -0.1f, dy1 = 1.0f, dx2 = -0.9f, dy2 = 1.8f, dx3 = -2.0f, dy3 = 1.8f)
                moveTo(x = 12.0f, y = 8.5f)
                verticalLineToRelative(dy = 2.0f)
                moveToRelative(dx = -2.0f, dy = 0.0f)
                horizontalLineToRelative(dx = 4.0f)
                moveToRelative(dx = -2.0f, dy = 5.0f)
                verticalLineToRelative(dy = -2.0f)
                moveToRelative(dx = -2.0f, dy = 0.0f)
                horizontalLineToRelative(dx = 4.0f)
            }
            path(
                stroke = SolidColor(Color(0xFF17191C)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 15.0f, y = 22.0f)
                horizontalLineTo(x = 9.0f)
                curveToRelative(dx1 = -5.0f, dy1 = 0.0f, dx2 = -7.0f, dy2 = -2.0f, dx3 = -7.0f, dy3 = -7.0f)
                verticalLineTo(y = 9.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -5.0f, dx2 = 2.0f, dy2 = -7.0f, dx3 = 7.0f, dy3 = -7.0f)
                horizontalLineToRelative(dx = 6.0f)
                curveToRelative(dx1 = 5.0f, dy1 = 0.0f, dx2 = 7.0f, dy2 = 2.0f, dx3 = 7.0f, dy3 = 7.0f)
                verticalLineToRelative(dy = 6.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 5.0f, dx2 = -2.0f, dy2 = 7.0f, dx3 = -7.0f, dy3 = 7.0f)
            }
        }.build().also { _theta = it }
    }

@Suppress("ObjectPropertyName")
private var _theta: ImageVector? = null
