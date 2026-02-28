package com.github.yohannestz.iconsax_compose.iconsax.bulk

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MainComponent: ImageVector
    get() {
        val current = _mainComponent
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.MainComponent",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
                fillAlpha = 0.4f,
                strokeAlpha = 0.4f,
            ) {
                moveTo(x = 20.95f, y = 14.55f)
                lineToRelative(dx = -2.67f, dy = 2.67f)
                lineToRelative(dx = -1.06f, dy = 1.06f)
                lineToRelative(dx = -2.67f, dy = 2.67f)
                arcToRelative(a = 3.6f, b = 3.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -5.1f, dy1 = 0.0f)
                lineToRelative(dx = -2.67f, dy = -2.67f)
                lineToRelative(dx = -1.06f, dy = -1.06f)
                lineToRelative(dx = -2.67f, dy = -2.67f)
                arcToRelative(a = 3.6f, b = 3.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = -5.1f)
                lineToRelative(dx = 2.67f, dy = -2.67f)
                lineToRelative(dx = 1.06f, dy = -1.06f)
                lineToRelative(dx = 2.67f, dy = -2.67f)
                curveToRelative(dx1 = 1.4f, dy1 = -1.4f, dx2 = 3.7f, dy2 = -1.4f, dx3 = 5.1f, dy3 = 0.0f)
                lineToRelative(dx = 2.67f, dy = 2.67f)
                lineToRelative(dx = 1.06f, dy = 1.06f)
                lineToRelative(dx = 2.67f, dy = 2.67f)
                curveToRelative(dx1 = 1.4f, dy1 = 1.4f, dx2 = 1.4f, dy2 = 3.7f, dx3 = 0.0f, dy3 = 5.1f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 13.06f, y = 12.0f)
                lineToRelative(dx = 5.22f, dy = 5.22f)
                lineToRelative(dx = -1.06f, dy = 1.06f)
                lineTo(x = 12.0f, y = 13.06f)
                lineToRelative(dx = -5.22f, dy = 5.22f)
                lineToRelative(dx = -1.06f, dy = -1.06f)
                lineTo(x = 10.94f, y = 12.0f)
                lineTo(x = 5.72f, y = 6.78f)
                lineToRelative(dx = 1.06f, dy = -1.06f)
                lineTo(x = 12.0f, y = 10.94f)
                lineToRelative(dx = 5.22f, dy = -5.22f)
                lineToRelative(dx = 1.06f, dy = 1.06f)
                close()
            }
        }.build().also { _mainComponent = it }
    }

@Suppress("ObjectPropertyName")
private var _mainComponent: ImageVector? = null
