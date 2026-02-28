package com.github.yohannestz.iconsax_compose.iconsax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Dai: ImageVector
    get() {
        val current = _dai
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Dai",
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
                moveTo(x = 12.0f, y = 22.0f)
                arcToRelative(a = 10.0f, b = 10.0f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = 0.0f, dy1 = -20.0f)
                arcToRelative(a = 10.0f, b = 10.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 20.0f)
            }
            path(
                stroke = SolidColor(Color(0xFF17191C)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 8.0f, y = 7.0f)
                verticalLineToRelative(dy = 10.0f)
                horizontalLineToRelative(dx = 4.0f)
                curveToRelative(dx1 = 2.8f, dy1 = 0.0f, dx2 = 5.0f, dy2 = -2.2f, dx3 = 5.0f, dy3 = -5.0f)
                reflectiveCurveToRelative(dx1 = -2.2f, dy1 = -5.0f, dx2 = -5.0f, dy2 = -5.0f)
                close()
                moveToRelative(dx = -1.5f, dy = 3.0f)
                horizontalLineToRelative(dx = 12.0f)
                moveToRelative(dx = -12.0f, dy = 4.0f)
                horizontalLineToRelative(dx = 12.0f)
            }
        }.build().also { _dai = it }
    }

@Suppress("ObjectPropertyName")
private var _dai: ImageVector? = null
