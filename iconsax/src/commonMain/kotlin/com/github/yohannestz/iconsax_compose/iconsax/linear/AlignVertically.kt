package com.github.yohannestz.iconsax_compose.iconsax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val AlignVertically: ImageVector
    get() {
        val current = _alignVertically
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.AlignVertically",
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
                moveTo(x = 17.4f, y = 19.25f)
                horizontalLineTo(x = 6.6f)
                curveToRelative(dx1 = -1.5f, dy1 = 0.0f, dx2 = -2.1f, dy2 = -0.64f, dx3 = -2.1f, dy3 = -2.23f)
                verticalLineToRelative(dy = -1.04f)
                curveToRelative(dx1 = 0.0f, dy1 = -1.59f, dx2 = 0.6f, dy2 = -2.23f, dx3 = 2.1f, dy3 = -2.23f)
                horizontalLineToRelative(dx = 10.8f)
                curveToRelative(dx1 = 1.5f, dy1 = 0.0f, dx2 = 2.1f, dy2 = 0.64f, dx3 = 2.1f, dy3 = 2.23f)
                verticalLineToRelative(dy = 1.04f)
                curveToRelative(dx1 = 0.0f, dy1 = 1.59f, dx2 = -0.6f, dy2 = 2.23f, dx3 = -2.1f, dy3 = 2.23f)
                moveToRelative(dx = -2.0f, dy = -8.5f)
                horizontalLineTo(x = 8.6f)
                curveToRelative(dx1 = -1.5f, dy1 = 0.0f, dx2 = -2.1f, dy2 = -0.64f, dx3 = -2.1f, dy3 = -2.23f)
                verticalLineTo(y = 7.48f)
                curveToRelative(dx1 = 0.0f, dy1 = -1.59f, dx2 = 0.6f, dy2 = -2.23f, dx3 = 2.1f, dy3 = -2.23f)
                horizontalLineToRelative(dx = 6.8f)
                curveToRelative(dx1 = 1.5f, dy1 = 0.0f, dx2 = 2.1f, dy2 = 0.64f, dx3 = 2.1f, dy3 = 2.23f)
                verticalLineToRelative(dy = 1.04f)
                curveToRelative(dx1 = 0.0f, dy1 = 1.59f, dx2 = -0.6f, dy2 = 2.23f, dx3 = -2.1f, dy3 = 2.23f)
                moveTo(x = 12.0f, y = 22.0f)
                verticalLineToRelative(dy = -2.4f)
                moveToRelative(dx = 0.0f, dy = -6.6f)
                verticalLineToRelative(dy = -2.0f)
                moveToRelative(dx = 0.0f, dy = -9.0f)
                verticalLineToRelative(dy = 2.69f)
            }
        }.build().also { _alignVertically = it }
    }

@Suppress("ObjectPropertyName")
private var _alignVertically: ImageVector? = null
