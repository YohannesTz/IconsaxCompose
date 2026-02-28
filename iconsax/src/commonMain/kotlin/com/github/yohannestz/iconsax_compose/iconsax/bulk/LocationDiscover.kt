package com.github.yohannestz.iconsax_compose.iconsax.bulk

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val LocationDiscover: ImageVector
    get() {
        val current = _locationDiscover
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.LocationDiscover",
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
                moveTo(x = 12.0f, y = 22.0f)
                arcToRelative(a = 10.0f, b = 10.0f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = 0.0f, dy1 = -20.0f)
                arcToRelative(a = 10.0f, b = 10.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 20.0f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 14.33f, y = 14.33f)
                curveToRelative(dx1 = 1.88f, dy1 = -1.89f, dx2 = 2.36f, dy2 = -4.45f, dx3 = 1.08f, dy3 = -5.74f)
                curveToRelative(dx1 = -1.29f, dy1 = -1.28f, dx2 = -3.85f, dy2 = -0.8f, dx3 = -5.74f, dy3 = 1.08f)
                curveToRelative(dx1 = -1.88f, dy1 = 1.89f, dx2 = -2.36f, dy2 = 4.45f, dx3 = -1.08f, dy3 = 5.74f)
                curveToRelative(dx1 = 1.29f, dy1 = 1.28f, dx2 = 3.85f, dy2 = 0.8f, dx3 = 5.74f, dy3 = -1.08f)
            }
        }.build().also { _locationDiscover = it }
    }

@Suppress("ObjectPropertyName")
private var _locationDiscover: ImageVector? = null
