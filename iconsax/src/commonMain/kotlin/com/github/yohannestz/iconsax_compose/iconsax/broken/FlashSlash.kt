package com.github.yohannestz.iconsax_compose.iconsax.broken

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FlashSlash: ImageVector
    get() {
        val current = _flashSlash
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.FlashSlash",
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
                moveTo(x = 9.18f, y = 18.04f)
                verticalLineToRelative(dy = 2.44f)
                curveToRelative(dx1 = 0.0f, dy1 = 1.68f, dx2 = 0.91f, dy2 = 2.02f, dx3 = 2.02f, dy3 = 0.76f)
                lineToRelative(dx = 7.57f, dy = -8.6f)
                curveToRelative(dx1 = 0.93f, dy1 = -1.05f, dx2 = 0.54f, dy2 = -1.92f, dx3 = -0.87f, dy3 = -1.92f)
                horizontalLineToRelative(dx = -0.93f)
                moveTo(x = 9.98f, y = 5.96f)
                lineToRelative(dx = -4.76f, dy = 5.41f)
                curveToRelative(dx1 = -0.93f, dy1 = 1.05f, dx2 = -0.54f, dy2 = 1.92f, dx3 = 0.87f, dy3 = 1.92f)
                horizontalLineToRelative(dx = 3.09f)
                verticalLineToRelative(dy = 1.18f)
                moveToRelative(dx = 5.64f, dy = -5.63f)
                verticalLineTo(y = 3.52f)
                curveToRelative(dx1 = 0.0f, dy1 = -1.68f, dx2 = -0.91f, dy2 = -2.02f, dx3 = -2.02f, dy3 = -0.76f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 22.0f, y = 2.0f)
                lineTo(x = 2.0f, y = 22.0f)
            }
        }.build().also { _flashSlash = it }
    }

@Suppress("ObjectPropertyName")
private var _flashSlash: ImageVector? = null
