package com.github.yohannestz.iconsax_compose.iconsax.linear

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
                moveTo(x = 18.67f, y = 18.67f)
                lineToRelative(dx = 2.22f, dy = -1.11f)
                verticalLineToRelative(dy = -2.78f)
                moveToRelative(dx = -6.67f, dy = -5.0f)
                lineTo(x = 12.0f, y = 10.89f)
                close()
                moveTo(x = 12.0f, y = 10.89f)
                lineTo(x = 9.78f, y = 9.78f)
                close()
                moveToRelative(dx = 0.0f, dy = 0.0f)
                verticalLineToRelative(dy = 2.78f)
                close()
                moveToRelative(dx = 8.89f, dy = -4.45f)
                lineToRelative(dx = -2.22f, dy = 1.11f)
                close()
                moveToRelative(dx = 0.0f, dy = 0.0f)
                lineToRelative(dx = -2.22f, dy = -1.11f)
                close()
                moveToRelative(dx = 0.0f, dy = 0.0f)
                verticalLineToRelative(dy = 2.78f)
                close()
                moveToRelative(dx = -6.67f, dy = -3.33f)
                lineTo(x = 12.0f, y = 2.0f)
                lineTo(x = 9.78f, y = 3.11f)
                close()
                moveTo(x = 3.11f, y = 6.44f)
                lineToRelative(dx = 2.22f, dy = -1.11f)
                close()
                moveToRelative(dx = 0.0f, dy = 0.0f)
                lineToRelative(dx = 2.22f, dy = 1.11f)
                close()
                moveToRelative(dx = 0.0f, dy = 0.0f)
                verticalLineToRelative(dy = 2.78f)
                close()
                moveTo(x = 12.0f, y = 22.0f)
                lineToRelative(dx = -2.22f, dy = -1.11f)
                close()
                moveToRelative(dx = 0.0f, dy = 0.0f)
                lineToRelative(dx = 2.22f, dy = -1.11f)
                close()
                moveToRelative(dx = 0.0f, dy = 0.0f)
                verticalLineToRelative(dy = -2.78f)
                close()
                moveToRelative(dx = -6.67f, dy = -3.33f)
                lineToRelative(dx = -2.22f, dy = -1.11f)
                verticalLineToRelative(dy = -2.78f)
                close()
            }
        }.build().also { _boxTwo = it }
    }

@Suppress("ObjectPropertyName")
private var _boxTwo: ImageVector? = null
