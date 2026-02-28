package com.github.yohannestz.iconsax_compose.iconsax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Photoshop: ImageVector
    get() {
        val current = _photoshop
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Photoshop",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
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
            path(
                stroke = SolidColor(Color(0xFF17191C)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 7.5f, y = 16.0f)
                verticalLineTo(y = 8.0f)
                horizontalLineToRelative(dx = 2.0f)
                curveToRelative(dx1 = 1.1f, dy1 = 0.0f, dx2 = 2.0f, dy2 = 0.9f, dx3 = 2.0f, dy3 = 2.0f)
                reflectiveCurveToRelative(dx1 = -0.9f, dy1 = 2.0f, dx2 = -2.0f, dy2 = 2.0f)
                horizontalLineToRelative(dx = -2.0f)
                moveToRelative(dx = 9.0f, dy = -1.0f)
                horizontalLineToRelative(dx = -1.3f)
                curveToRelative(dx1 = -0.7f, dy1 = 0.0f, dx2 = -1.2f, dy2 = 0.6f, dx3 = -1.2f, dy3 = 1.2f)
                curveToRelative(dx1 = 0.0f, dy1 = 0.7f, dx2 = 0.6f, dy2 = 1.2f, dx3 = 1.2f, dy3 = 1.2f)
                curveToRelative(dx1 = 0.7f, dy1 = 0.0f, dx2 = 1.2f, dy2 = 0.6f, dx3 = 1.2f, dy3 = 1.2f)
                curveToRelative(dx1 = 0.0f, dy1 = 0.7f, dx2 = -0.6f, dy2 = 1.2f, dx3 = -1.2f, dy3 = 1.2f)
                horizontalLineTo(x = 14.0f)
            }
        }.build().also { _photoshop = it }
    }

@Suppress("ObjectPropertyName")
private var _photoshop: ImageVector? = null
