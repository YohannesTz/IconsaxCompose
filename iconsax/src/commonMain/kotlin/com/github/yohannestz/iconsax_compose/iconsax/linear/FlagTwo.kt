package com.github.yohannestz.iconsax_compose.iconsax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FlagTwo: ImageVector
    get() {
        val current = _flagTwo
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.FlagTwo",
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
                moveTo(x = 6.45f, y = 2.0f)
                verticalLineToRelative(dy = 20.0f)
                moveToRelative(dx = 0.5f, dy = -18.0f)
                lineToRelative(dx = 8.1f, dy = 3.5f)
                curveToRelative(dx1 = 3.3f, dy1 = 1.4f, dx2 = 3.3f, dy2 = 3.8f, dx3 = 0.2f, dy3 = 5.4f)
                lineTo(x = 6.95f, y = 17.0f)
            }
        }.build().also { _flagTwo = it }
    }

@Suppress("ObjectPropertyName")
private var _flagTwo: ImageVector? = null
