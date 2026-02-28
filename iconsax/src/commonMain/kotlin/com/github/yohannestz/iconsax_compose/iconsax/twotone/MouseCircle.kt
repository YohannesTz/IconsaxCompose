package com.github.yohannestz.iconsax_compose.iconsax.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MouseCircle: ImageVector
    get() {
        val current = _mouseCircle
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.MouseCircle",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 20.96f, y = 17.84f)
                lineToRelative(dx = -1.63f, dy = 0.55f)
                arcToRelative(a = 1.5f, b = 1.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.96f, dy1 = 0.96f)
                lineToRelative(dx = -0.55f, dy = 1.63f)
                arcToRelative(a = 1.52f, b = 1.52f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -2.89f, dy1 = -0.03f)
                lineTo(x = 13.08f, y = 15.0f)
                arcToRelative(a = 1.52f, b = 1.52f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.9f, dy1 = -1.91f)
                lineToRelative(dx = 5.96f, dy = 1.85f)
                curveToRelative(dx1 = 1.4f, dy1 = 0.44f, dx2 = 1.42f, dy2 = 2.43f, dx3 = 0.02f, dy3 = 2.9f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 22.0f, y = 12.0f)
                arcToRelative(a = 10.0f, b = 10.0f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = -10.0f, dy1 = 10.0f)
            }
        }.build().also { _mouseCircle = it }
    }

@Suppress("ObjectPropertyName")
private var _mouseCircle: ImageVector? = null
