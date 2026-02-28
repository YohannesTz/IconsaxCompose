package com.github.yohannestz.iconsax_compose.iconsax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Xd: ImageVector
    get() {
        val current = _xd
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Xd",
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
                moveTo(x = 18.0f, y = 8.5f)
                verticalLineToRelative(dy = 7.1f)
                horizontalLineToRelative(dx = -1.8f)
                curveToRelative(dx1 = -1.0f, dy1 = 0.0f, dx2 = -1.8f, dy2 = -0.8f, dx3 = -1.8f, dy3 = -1.8f)
                reflectiveCurveToRelative(dx1 = 0.8f, dy1 = -1.8f, dx2 = 1.8f, dy2 = -1.8f)
                horizontalLineTo(x = 18.0f)
                moveTo(x = 6.0f, y = 8.5f)
                lineToRelative(dx = 5.7f, dy = 7.0f)
                moveToRelative(dx = 0.0f, dy = -7.0f)
                lineToRelative(dx = -5.7f, dy = 7.0f)
            }
        }.build().also { _xd = it }
    }

@Suppress("ObjectPropertyName")
private var _xd: ImageVector? = null
