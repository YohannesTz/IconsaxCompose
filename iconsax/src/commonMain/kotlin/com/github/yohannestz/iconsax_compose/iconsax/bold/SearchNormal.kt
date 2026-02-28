package com.github.yohannestz.iconsax_compose.iconsax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SearchNormal: ImageVector
    get() {
        val current = _searchNormal
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.SearchNormal",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 11.01f, y = 20.02f)
                arcToRelative(a = 9.01f, b = 9.01f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = 0.0f, dy1 = -18.02f)
                arcToRelative(a = 9.01f, b = 9.01f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 18.02f)
                moveToRelative(dx = 10.98f, dy = -1.07f)
                curveTo(x1 = 21.66f, y1 = 18.34f, x2 = 20.96f, y2 = 18.0f, x3 = 20.02f, y3 = 18.0f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.68f, dy1 = 0.79f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.22f, dy1 = 1.84f)
                curveToRelative(dx1 = 0.43f, dy1 = 1.3f, dx2 = 1.18f, dy2 = 1.59f, dx3 = 1.59f, dy3 = 1.64f)
                lineToRelative(dx = 0.19f, dy = 0.01f)
                curveToRelative(dx1 = 0.44f, dy1 = 0.0f, dx2 = 1.12f, dy2 = -0.19f, dx3 = 1.78f, dy3 = -1.18f)
                curveToRelative(dx1 = 0.53f, dy1 = -0.77f, dx2 = 0.63f, dy2 = -1.54f, dx3 = 0.31f, dy3 = -2.15f)
            }
        }.build().also { _searchNormal = it }
    }

@Suppress("ObjectPropertyName")
private var _searchNormal: ImageVector? = null
