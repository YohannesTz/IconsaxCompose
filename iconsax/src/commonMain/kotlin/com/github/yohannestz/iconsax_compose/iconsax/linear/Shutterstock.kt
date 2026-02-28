package com.github.yohannestz.iconsax_compose.iconsax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Shutterstock: ImageVector
    get() {
        val current = _shutterstock
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Shutterstock",
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
                moveTo(x = 11.0f, y = 5.0f)
                verticalLineToRelative(dy = 3.0f)
                horizontalLineTo(x = 9.0f)
                curveTo(x1 = 8.4f, y1 = 8.0f, x2 = 8.0f, y2 = 8.4f, x3 = 8.0f, y3 = 9.0f)
                verticalLineToRelative(dy = 2.0f)
                horizontalLineTo(x = 5.0f)
                verticalLineTo(y = 9.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -2.2f, dx2 = 1.8f, dy2 = -4.0f, dx3 = 4.0f, dy3 = -4.0f)
                close()
                moveToRelative(dx = 2.0f, dy = 14.0f)
                verticalLineToRelative(dy = -3.0f)
                horizontalLineToRelative(dx = 2.0f)
                curveToRelative(dx1 = 0.6f, dy1 = 0.0f, dx2 = 1.0f, dy2 = -0.4f, dx3 = 1.0f, dy3 = -1.0f)
                verticalLineToRelative(dy = -2.0f)
                horizontalLineToRelative(dx = 3.0f)
                verticalLineToRelative(dy = 2.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 2.2f, dx2 = -1.8f, dy2 = 4.0f, dx3 = -4.0f, dy3 = 4.0f)
                close()
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
        }.build().also { _shutterstock = it }
    }

@Suppress("ObjectPropertyName")
private var _shutterstock: ImageVector? = null
