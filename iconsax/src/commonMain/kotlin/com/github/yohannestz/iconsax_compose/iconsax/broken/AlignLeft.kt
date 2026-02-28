package com.github.yohannestz.iconsax_compose.iconsax.broken

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val AlignLeft: ImageVector
    get() {
        val current = _alignLeft
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.AlignLeft",
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
                moveTo(x = 5.1f, y = 19.25f)
                horizontalLineToRelative(dx = 11.8f)
                curveToRelative(dx1 = 1.5f, dy1 = 0.0f, dx2 = 2.1f, dy2 = -0.64f, dx3 = 2.1f, dy3 = -2.23f)
                verticalLineToRelative(dy = -1.04f)
                curveToRelative(dx1 = 0.0f, dy1 = -1.59f, dx2 = -0.6f, dy2 = -2.23f, dx3 = -2.1f, dy3 = -2.23f)
                horizontalLineTo(x = 5.1f)
                moveToRelative(dx = 0.0f, dy = -3.0f)
                horizontalLineToRelative(dx = 6.8f)
                curveToRelative(dx1 = 1.5f, dy1 = 0.0f, dx2 = 2.1f, dy2 = -0.64f, dx3 = 2.1f, dy3 = -2.23f)
                moveTo(x = 5.1f, y = 5.25f)
                horizontalLineToRelative(dx = 6.8f)
                moveTo(x = 5.0f, y = 1.99f)
                verticalLineToRelative(dy = 20.0f)
            }
        }.build().also { _alignLeft = it }
    }

@Suppress("ObjectPropertyName")
private var _alignLeft: ImageVector? = null
