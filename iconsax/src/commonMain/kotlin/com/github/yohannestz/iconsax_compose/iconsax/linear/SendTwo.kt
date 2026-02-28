package com.github.yohannestz.iconsax_compose.iconsax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SendTwo: ImageVector
    get() {
        val current = _sendTwo
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.SendTwo",
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
                moveTo(x = 7.4f, y = 6.32f)
                lineToRelative(dx = 8.49f, dy = -2.83f)
                curveToRelative(dx1 = 3.81f, dy1 = -1.27f, dx2 = 5.88f, dy2 = 0.81f, dx3 = 4.62f, dy3 = 4.62f)
                lineToRelative(dx = -2.83f, dy = 8.49f)
                curveToRelative(dx1 = -1.9f, dy1 = 5.71f, dx2 = -5.02f, dy2 = 5.71f, dx3 = -6.92f, dy3 = 0.0f)
                lineToRelative(dx = -0.84f, dy = -2.52f)
                lineToRelative(dx = -2.52f, dy = -0.84f)
                curveToRelative(dx1 = -5.71f, dy1 = -1.9f, dx2 = -5.71f, dy2 = -5.01f, dx3 = 0.0f, dy3 = -6.92f)
                moveToRelative(dx = 2.71f, dy = 7.33f)
                lineToRelative(dx = 3.58f, dy = -3.59f)
            }
        }.build().also { _sendTwo = it }
    }

@Suppress("ObjectPropertyName")
private var _sendTwo: ImageVector? = null
