package com.github.yohannestz.iconsax_compose.iconsax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bluetooth: ImageVector
    get() {
        val current = _bluetooth
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Bluetooth",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 5.64f, y = 18.64f)
                lineTo(x = 17.99f, y = 7.32f)
                arcToRelative(a = 1.08f, b = 1.08f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.04f, dy1 = -1.67f)
                lineTo(x = 14.1f, y = 2.44f)
                curveToRelative(dx1 = -1.0f, dy1 = -0.83f, dx2 = -1.82f, dy2 = -0.45f, dx3 = -1.82f, dy3 = 0.85f)
                verticalLineToRelative(dy = 17.42f)
                curveToRelative(dx1 = 0.0f, dy1 = 1.3f, dx2 = 0.82f, dy2 = 1.68f, dx3 = 1.82f, dy3 = 0.85f)
                lineToRelative(dx = 3.85f, dy = -3.21f)
                arcToRelative(a = 1.08f, b = 1.08f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.04f, dy1 = -1.67f)
                lineTo(x = 5.64f, y = 5.36f)
            }
        }.build().also { _bluetooth = it }
    }

@Suppress("ObjectPropertyName")
private var _bluetooth: ImageVector? = null
