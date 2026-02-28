package com.github.yohannestz.iconsax_compose.iconsax.broken

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val CardPos: ImageVector
    get() {
        val current = _cardPos
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.CardPos",
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
                moveTo(x = 3.93f, y = 15.88f)
                lineTo(x = 15.88f, y = 3.93f)
                moveTo(x = 11.1f, y = 18.28f)
                lineToRelative(dx = 1.2f, dy = -1.2f)
                moveToRelative(dx = 1.49f, dy = -1.49f)
                lineToRelative(dx = 2.39f, dy = -2.39f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 20.43f, y = 8.48f)
                curveToRelative(dx1 = 2.1f, dy1 = 2.1f, dx2 = 2.1f, dy2 = 3.16f, dx3 = -0.03f, dy3 = 5.28f)
                lineToRelative(dx = -6.64f, dy = 6.64f)
                curveToRelative(dx1 = -2.12f, dy1 = 2.12f, dx2 = -3.18f, dy2 = 2.13f, dx3 = -5.28f, dy3 = 0.03f)
                lineToRelative(dx = -4.9f, dy = -4.9f)
                curveToRelative(dx1 = -2.1f, dy1 = -2.1f, dx2 = -2.1f, dy2 = -3.17f, dx3 = 0.02f, dy3 = -5.29f)
                lineToRelative(dx = 6.64f, dy = -6.64f)
                curveToRelative(dx1 = 2.12f, dy1 = -2.12f, dx2 = 3.18f, dy2 = -2.13f, dx3 = 5.28f, dy3 = -0.03f)
                lineToRelative(dx = 1.9f, dy = 1.9f)
                moveTo(x = 2.0f, y = 22.0f)
                horizontalLineToRelative(dx = 20.0f)
            }
        }.build().also { _cardPos = it }
    }

@Suppress("ObjectPropertyName")
private var _cardPos: ImageVector? = null
