package com.github.yohannestz.iconsax_compose.iconsax.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val BoxTwo: ImageVector
    get() {
        val current = _boxTwo
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.BoxTwo",
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
                moveTo(x = 14.22f, y = 9.78f)
                lineTo(x = 12.0f, y = 10.89f)
                moveToRelative(dx = 0.0f, dy = 0.0f)
                lineTo(x = 9.78f, y = 9.78f)
                moveTo(x = 12.0f, y = 10.89f)
                verticalLineToRelative(dy = 2.78f)
                moveToRelative(dx = 2.22f, dy = -10.56f)
                lineTo(x = 12.0f, y = 2.0f)
                lineTo(x = 9.78f, y = 3.11f)
                moveTo(x = 5.33f, y = 18.67f)
                lineToRelative(dx = -2.22f, dy = -1.11f)
                verticalLineToRelative(dy = -2.78f)
                moveToRelative(dx = 15.56f, dy = 3.89f)
                lineToRelative(dx = 2.22f, dy = -1.11f)
                verticalLineToRelative(dy = -2.78f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 20.89f, y = 6.91f)
                lineToRelative(dx = -2.22f, dy = 1.11f)
                moveToRelative(dx = 2.22f, dy = -1.11f)
                lineTo(x = 18.67f, y = 5.8f)
                moveToRelative(dx = 2.22f, dy = 1.11f)
                verticalLineToRelative(dy = 2.78f)
                moveTo(x = 3.11f, y = 6.91f)
                lineTo(x = 5.33f, y = 5.8f)
                moveTo(x = 3.11f, y = 6.91f)
                lineToRelative(dx = 2.22f, dy = 1.11f)
                moveTo(x = 3.11f, y = 6.91f)
                verticalLineToRelative(dy = 2.78f)
                moveTo(x = 12.0f, y = 22.47f)
                lineToRelative(dx = -2.22f, dy = -1.11f)
                moveTo(x = 12.0f, y = 22.47f)
                lineToRelative(dx = 2.22f, dy = -1.11f)
                moveTo(x = 12.0f, y = 22.47f)
                verticalLineTo(y = 19.7f)
            }
        }.build().also { _boxTwo = it }
    }

@Suppress("ObjectPropertyName")
private var _boxTwo: ImageVector? = null
