package com.github.yohannestz.iconsax_compose.iconsax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Avalanche: ImageVector
    get() {
        val current = _avalanche
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Avalanche",
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
                moveTo(x = 6.1f, y = 15.6f)
                lineTo(x = 11.7f, y = 6.0f)
                curveToRelative(dx1 = 0.2f, dy1 = -0.3f, dx2 = 0.6f, dy2 = -0.3f, dx3 = 0.8f, dy3 = 0.0f)
                lineTo(x = 14.0f, y = 8.0f)
                curveToRelative(dx1 = 0.4f, dy1 = 0.6f, dx2 = 0.5f, dy2 = 1.4f, dx3 = 0.1f, dy3 = 2.0f)
                lineToRelative(dx = -3.3f, dy = 5.3f)
                arcToRelative(a = 1.9f, b = 1.9f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.5f, dy1 = 0.9f)
                horizontalLineTo(x = 6.4f)
                curveToRelative(dx1 = -0.3f, dy1 = 0.1f, dx2 = -0.5f, dy2 = -0.3f, dx3 = -0.3f, dy3 = -0.6f)
                moveToRelative(dx = 9.1f, dy = -3.2f)
                lineToRelative(dx = -1.9f, dy = 3.2f)
                curveToRelative(dx1 = -0.2f, dy1 = 0.3f, dx2 = 0.0f, dy2 = 0.7f, dx3 = 0.4f, dy3 = 0.7f)
                horizontalLineToRelative(dx = 3.8f)
                curveToRelative(dx1 = 0.4f, dy1 = 0.0f, dx2 = 0.6f, dy2 = -0.4f, dx3 = 0.4f, dy3 = -0.7f)
                lineTo(x = 16.0f, y = 12.4f)
                arcToRelative(a = 0.47f, b = 0.47f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.8f, dy1 = 0.0f)
            }
            path(
                stroke = SolidColor(Color(0xFF17191C)),
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 12.0f, y = 22.0f)
                arcToRelative(a = 10.0f, b = 10.0f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = 0.0f, dy1 = -20.0f)
                arcToRelative(a = 10.0f, b = 10.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 20.0f)
                close()
            }
        }.build().also { _avalanche = it }
    }

@Suppress("ObjectPropertyName")
private var _avalanche: ImageVector? = null
