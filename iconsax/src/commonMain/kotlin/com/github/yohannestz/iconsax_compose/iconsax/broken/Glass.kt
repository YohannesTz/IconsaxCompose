package com.github.yohannestz.iconsax_compose.iconsax.broken

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Glass: ImageVector
    get() {
        val current = _glass
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Glass",
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
                moveTo(x = 10.0f, y = 17.5f)
                horizontalLineToRelative(dx = 4.0f)
                moveToRelative(dx = -12.0f, dy = 0.0f)
                verticalLineToRelative(dy = -10.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -4.0f, dx2 = 1.0f, dy2 = -5.0f, dx3 = 5.0f, dy3 = -5.0f)
                moveToRelative(dx = 15.0f, dy = 15.0f)
                verticalLineToRelative(dy = -10.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -4.0f, dx2 = -1.0f, dy2 = -5.0f, dx3 = -5.0f, dy3 = -5.0f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 10.0f, y = 15.91f)
                verticalLineToRelative(dy = 3.29f)
                curveToRelative(dx1 = 0.0f, dy1 = 2.0f, dx2 = -0.8f, dy2 = 2.8f, dx3 = -2.8f, dy3 = 2.8f)
                horizontalLineTo(x = 4.8f)
                curveToRelative(dx1 = -2.0f, dy1 = 0.0f, dx2 = -2.8f, dy2 = -0.8f, dx3 = -2.8f, dy3 = -2.8f)
                verticalLineToRelative(dy = -3.29f)
                curveToRelative(dx1 = 0.0f, dy1 = -2.0f, dx2 = 0.8f, dy2 = -2.8f, dx3 = 2.8f, dy3 = -2.8f)
                horizontalLineToRelative(dx = 2.4f)
                moveToRelative(dx = 14.8f, dy = 2.8f)
                verticalLineToRelative(dy = 3.29f)
                curveToRelative(dx1 = 0.0f, dy1 = 2.0f, dx2 = -0.8f, dy2 = 2.8f, dx3 = -2.8f, dy3 = 2.8f)
                horizontalLineToRelative(dx = -2.4f)
                curveToRelative(dx1 = -2.0f, dy1 = 0.0f, dx2 = -2.8f, dy2 = -0.8f, dx3 = -2.8f, dy3 = -2.8f)
                verticalLineToRelative(dy = -3.29f)
                curveToRelative(dx1 = 0.0f, dy1 = -2.0f, dx2 = 0.8f, dy2 = -2.8f, dx3 = 2.8f, dy3 = -2.8f)
                horizontalLineToRelative(dx = 2.4f)
                curveToRelative(dx1 = 2.0f, dy1 = 0.0f, dx2 = 2.8f, dy2 = 0.8f, dx3 = 2.8f, dy3 = 2.8f)
            }
        }.build().also { _glass = it }
    }

@Suppress("ObjectPropertyName")
private var _glass: ImageVector? = null
