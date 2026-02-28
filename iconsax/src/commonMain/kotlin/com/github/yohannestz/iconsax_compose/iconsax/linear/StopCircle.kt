package com.github.yohannestz.iconsax_compose.iconsax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val StopCircle: ImageVector
    get() {
        val current = _stopCircle
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.StopCircle",
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
                moveTo(x = 11.97f, y = 22.0f)
                arcToRelative(a = 10.0f, b = 10.0f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = 0.0f, dy1 = -20.0f)
                arcToRelative(a = 10.0f, b = 10.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 20.0f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 10.73f, y = 16.23f)
                horizontalLineToRelative(dx = 2.54f)
                curveToRelative(dx1 = 2.12f, dy1 = 0.0f, dx2 = 2.96f, dy2 = -0.85f, dx3 = 2.96f, dy3 = -2.96f)
                verticalLineToRelative(dy = -2.54f)
                curveToRelative(dx1 = 0.0f, dy1 = -2.12f, dx2 = -0.85f, dy2 = -2.96f, dx3 = -2.96f, dy3 = -2.96f)
                horizontalLineToRelative(dx = -2.54f)
                curveToRelative(dx1 = -2.12f, dy1 = 0.0f, dx2 = -2.96f, dy2 = 0.85f, dx3 = -2.96f, dy3 = 2.96f)
                verticalLineToRelative(dy = 2.54f)
                curveToRelative(dx1 = 0.0f, dy1 = 2.11f, dx2 = 0.85f, dy2 = 2.96f, dx3 = 2.96f, dy3 = 2.96f)
            }
        }.build().also { _stopCircle = it }
    }

@Suppress("ObjectPropertyName")
private var _stopCircle: ImageVector? = null
