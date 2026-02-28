package com.github.yohannestz.iconsax_compose.iconsax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val EthereumClassic: ImageVector
    get() {
        val current = _ethereumClassic
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.EthereumClassic",
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
                moveTo(x = 6.9f, y = 9.1f)
                lineTo(x = 11.7f, y = 7.0f)
                curveToRelative(dx1 = 0.2f, dy1 = -0.1f, dx2 = 0.4f, dy2 = -0.1f, dx3 = 0.7f, dy3 = 0.0f)
                lineToRelative(dx = 4.8f, dy = 2.1f)
                curveToRelative(dx1 = 0.4f, dy1 = 0.2f, dx2 = 0.8f, dy2 = -0.3f, dx3 = 0.5f, dy3 = -0.7f)
                lineToRelative(dx = -5.0f, dy = -6.1f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.2f, dy1 = 0.0f)
                lineToRelative(dx = -5.0f, dy = 6.1f)
                curveToRelative(dx1 = -0.4f, dy1 = 0.4f, dx2 = 0.0f, dy2 = 0.9f, dx3 = 0.4f, dy3 = 0.7f)
                moveToRelative(dx = 0.0f, dy = 5.8f)
                lineToRelative(dx = 4.8f, dy = 2.1f)
                curveToRelative(dx1 = 0.2f, dy1 = 0.1f, dx2 = 0.4f, dy2 = 0.1f, dx3 = 0.7f, dy3 = 0.0f)
                lineToRelative(dx = 4.8f, dy = -2.1f)
                curveToRelative(dx1 = 0.4f, dy1 = -0.2f, dx2 = 0.8f, dy2 = 0.3f, dx3 = 0.5f, dy3 = 0.7f)
                lineToRelative(dx = -5.0f, dy = 6.1f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.2f, dy1 = 0.0f)
                lineToRelative(dx = -5.0f, dy = -6.1f)
                curveToRelative(dx1 = -0.4f, dy1 = -0.4f, dx2 = 0.0f, dy2 = -0.9f, dx3 = 0.4f, dy3 = -0.7f)
                moveTo(x = 12.0f, y = 9.4f)
                lineTo(x = 6.8f, y = 12.0f)
                lineToRelative(dx = 5.2f, dy = 2.6f)
                lineToRelative(dx = 5.2f, dy = -2.6f)
                close()
            }
        }.build().also { _ethereumClassic = it }
    }

@Suppress("ObjectPropertyName")
private var _ethereumClassic: ImageVector? = null
