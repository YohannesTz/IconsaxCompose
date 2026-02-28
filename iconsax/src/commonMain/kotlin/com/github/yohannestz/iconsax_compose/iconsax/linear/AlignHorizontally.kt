package com.github.yohannestz.iconsax_compose.iconsax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val AlignHorizontally: ImageVector
    get() {
        val current = _alignHorizontally
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.AlignHorizontally",
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
                moveTo(x = 4.75f, y = 17.4f)
                verticalLineTo(y = 6.6f)
                curveToRelative(dx1 = 0.0f, dy1 = -1.5f, dx2 = 0.64f, dy2 = -2.1f, dx3 = 2.23f, dy3 = -2.1f)
                horizontalLineToRelative(dx = 1.04f)
                curveToRelative(dx1 = 1.59f, dy1 = 0.0f, dx2 = 2.23f, dy2 = 0.6f, dx3 = 2.23f, dy3 = 2.1f)
                verticalLineToRelative(dy = 10.8f)
                curveToRelative(dx1 = 0.0f, dy1 = 1.5f, dx2 = -0.64f, dy2 = 2.1f, dx3 = -2.23f, dy3 = 2.1f)
                horizontalLineTo(x = 6.98f)
                curveToRelative(dx1 = -1.59f, dy1 = 0.0f, dx2 = -2.23f, dy2 = -0.6f, dx3 = -2.23f, dy3 = -2.1f)
                moveToRelative(dx = 8.5f, dy = -2.0f)
                verticalLineTo(y = 8.6f)
                curveToRelative(dx1 = 0.0f, dy1 = -1.5f, dx2 = 0.64f, dy2 = -2.1f, dx3 = 2.23f, dy3 = -2.1f)
                horizontalLineToRelative(dx = 1.04f)
                curveToRelative(dx1 = 1.59f, dy1 = 0.0f, dx2 = 2.23f, dy2 = 0.6f, dx3 = 2.23f, dy3 = 2.1f)
                verticalLineToRelative(dy = 6.8f)
                curveToRelative(dx1 = 0.0f, dy1 = 1.5f, dx2 = -0.64f, dy2 = 2.1f, dx3 = -2.23f, dy3 = 2.1f)
                horizontalLineToRelative(dx = -1.04f)
                curveToRelative(dx1 = -1.59f, dy1 = 0.0f, dx2 = -2.23f, dy2 = -0.6f, dx3 = -2.23f, dy3 = -2.1f)
                moveTo(x = 2.0f, y = 12.0f)
                horizontalLineToRelative(dx = 2.4f)
                moveToRelative(dx = 6.6f, dy = 0.0f)
                horizontalLineToRelative(dx = 2.0f)
                moveToRelative(dx = 9.0f, dy = 0.0f)
                horizontalLineToRelative(dx = -2.69f)
            }
        }.build().also { _alignHorizontally = it }
    }

@Suppress("ObjectPropertyName")
private var _alignHorizontally: ImageVector? = null
