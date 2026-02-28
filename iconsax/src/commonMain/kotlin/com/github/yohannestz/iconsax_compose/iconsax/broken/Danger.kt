package com.github.yohannestz.iconsax_compose.iconsax.broken

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Danger: ImageVector
    get() {
        val current = _danger
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Danger",
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
                moveTo(x = 12.0f, y = 9.0f)
                verticalLineToRelative(dy = 5.0f)
                moveToRelative(dx = 8.24f, dy = 0.0f)
                lineToRelative(dx = 1.06f, dy = 1.9f)
                curveToRelative(dx1 = 1.68f, dy1 = 3.03f, dx2 = 0.22f, dy2 = 5.51f, dx3 = -3.24f, dy3 = 5.51f)
                horizontalLineTo(x = 5.94f)
                curveToRelative(dx1 = -3.47f, dy1 = 0.0f, dx2 = -4.92f, dy2 = -2.48f, dx3 = -3.24f, dy3 = -5.5f)
                lineToRelative(dx = 3.12f, dy = -5.63f)
                lineTo(x = 8.76f, y = 5.0f)
                curveToRelative(dx1 = 1.78f, dy1 = -3.2f, dx2 = 4.7f, dy2 = -3.2f, dx3 = 6.48f, dy3 = 0.0f)
                lineToRelative(dx = 2.94f, dy = 5.3f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                moveTo(x = 12.0f, y = 17.0f)
                close()
            }
        }.build().also { _danger = it }
    }

@Suppress("ObjectPropertyName")
private var _danger: ImageVector? = null
