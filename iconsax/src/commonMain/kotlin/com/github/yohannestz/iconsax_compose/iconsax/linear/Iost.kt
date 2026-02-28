package com.github.yohannestz.iconsax_compose.iconsax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Iost: ImageVector
    get() {
        val current = _iost
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Iost",
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
                moveTo(x = 11.0f, y = 2.6f)
                lineTo(x = 4.5f, y = 6.4f)
                curveToRelative(dx1 = -0.6f, dy1 = 0.4f, dx2 = -1.0f, dy2 = 1.0f, dx3 = -1.0f, dy3 = 1.7f)
                verticalLineToRelative(dy = 7.7f)
                curveToRelative(dx1 = 0.0f, dy1 = 0.7f, dx2 = 0.4f, dy2 = 1.4f, dx3 = 1.0f, dy3 = 1.7f)
                lineToRelative(dx = 6.5f, dy = 3.8f)
                curveToRelative(dx1 = 0.6f, dy1 = 0.4f, dx2 = 1.4f, dy2 = 0.4f, dx3 = 2.0f, dy3 = 0.0f)
                lineToRelative(dx = 6.5f, dy = -3.8f)
                curveToRelative(dx1 = 0.6f, dy1 = -0.4f, dx2 = 1.0f, dy2 = -1.0f, dx3 = 1.0f, dy3 = -1.7f)
                verticalLineTo(y = 8.1f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.7f, dx2 = -0.4f, dy2 = -1.4f, dx3 = -1.0f, dy3 = -1.7f)
                lineTo(x = 13.0f, y = 2.6f)
                arcToRelative(a = 1.8f, b = 1.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -2.0f, dy1 = 0.0f)
            }
            path(
                stroke = SolidColor(Color(0xFF17191C)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 17.0f, y = 9.0f)
                lineToRelative(dx = -5.0f, dy = -3.0f)
                lineToRelative(dx = -5.0f, dy = 3.0f)
                lineToRelative(dx = 10.0f, dy = 6.0f)
                lineToRelative(dx = -5.0f, dy = 3.0f)
                lineToRelative(dx = -5.0f, dy = -3.0f)
                moveToRelative(dx = 4.5f, dy = -5.0f)
                lineToRelative(dx = -2.0f, dy = 2.0f)
                moveToRelative(dx = 5.0f, dy = 0.0f)
                lineToRelative(dx = -2.0f, dy = 2.0f)
            }
        }.build().also { _iost = it }
    }

@Suppress("ObjectPropertyName")
private var _iost: ImageVector? = null
