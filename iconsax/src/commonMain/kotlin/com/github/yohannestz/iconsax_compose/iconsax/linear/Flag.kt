package com.github.yohannestz.iconsax_compose.iconsax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Flag: ImageVector
    get() {
        val current = _flag
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Flag",
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
                moveTo(x = 5.15f, y = 2.0f)
                verticalLineToRelative(dy = 20.0f)
                moveToRelative(dx = 0.0f, dy = -18.0f)
                horizontalLineToRelative(dx = 11.2f)
                curveToRelative(dx1 = 2.7f, dy1 = 0.0f, dx2 = 3.3f, dy2 = 1.5f, dx3 = 1.4f, dy3 = 3.4f)
                lineToRelative(dx = -1.2f, dy = 1.2f)
                curveToRelative(dx1 = -0.8f, dy1 = 0.8f, dx2 = -0.8f, dy2 = 2.1f, dx3 = 0.0f, dy3 = 2.8f)
                lineToRelative(dx = 1.2f, dy = 1.2f)
                curveToRelative(dx1 = 1.9f, dy1 = 1.9f, dx2 = 1.2f, dy2 = 3.4f, dx3 = -1.4f, dy3 = 3.4f)
                horizontalLineTo(x = 5.15f)
            }
        }.build().also { _flag = it }
    }

@Suppress("ObjectPropertyName")
private var _flag: ImageVector? = null
