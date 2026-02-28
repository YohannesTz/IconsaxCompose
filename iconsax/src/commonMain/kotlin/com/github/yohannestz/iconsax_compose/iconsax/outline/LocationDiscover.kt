package com.github.yohannestz.iconsax_compose.iconsax.outline

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
            ) {
                moveTo(x = 12.0f, y = 22.75f)
                arcToRelative(a = 10.76f, b = 10.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = -21.5f)
                arcToRelative(a = 10.76f, b = 10.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = 21.5f)
                moveToRelative(dx = 0.0f, dy = -20.0f)
                arcToRelative(a = 9.26f, b = 9.26f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 18.5f)
                arcToRelative(a = 9.26f, b = 9.26f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = -18.5f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 10.5f, y = 16.75f)
                arcToRelative(a = 3.26f, b = 3.26f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -3.25f, dy1 = -3.25f)
                curveToRelative(dx1 = 0.0f, dy1 = -3.45f, dx2 = 2.8f, dy2 = -6.25f, dx3 = 6.25f, dy3 = -6.25f)
                arcToRelative(a = 3.26f, b = 3.26f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 3.25f, dy1 = 3.25f)
                curveToRelative(dx1 = 0.0f, dy1 = 3.45f, dx2 = -2.8f, dy2 = 6.25f, dx3 = -6.25f, dy3 = 6.25f)
                moveToRelative(dx = 3.0f, dy = -8.0f)
                arcToRelative(a = 4.75f, b = 4.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -4.75f, dy1 = 4.75f)
                arcToRelative(a = 1.76f, b = 1.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.75f, dy1 = 1.75f)
                arcToRelative(a = 4.75f, b = 4.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 4.75f, dy1 = -4.75f)
                arcToRelative(a = 1.76f, b = 1.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.75f, dy1 = -1.75f)
            }
        }.build().also { _locationDiscover = it }
    }

@Suppress("ObjectPropertyName")
private var _locationDiscover: ImageVector? = null
