package com.github.yohannestz.iconsax_compose.iconsax.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Radar: ImageVector
    get() {
        val current = _radar
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Radar",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 12.0f, y = 22.75f)
                arcTo(horizontalEllipseRadius = 10.76f, verticalEllipseRadius = 10.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 2.68f, y1 = 6.64f)
                arcTo(horizontalEllipseRadius = 0.75f, verticalEllipseRadius = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 3.7f, y1 = 6.36f)
                lineToRelative(dx = 8.67f, dy = 4.98f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.28f, dy1 = 1.02f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.02f, dy1 = 0.28f)
                lineToRelative(dx = -8.0f, dy = -4.6f)
                arcTo(horizontalEllipseRadius = 9.0f, verticalEllipseRadius = 9.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 2.75f, y1 = 12.0f)
                arcToRelative(a = 9.26f, b = 9.26f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 18.5f, dy1 = 0.0f)
                arcToRelative(a = 9.26f, b = 9.26f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -14.8f, dy1 = -7.4f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.9f, dy1 = -1.2f)
                arcTo(horizontalEllipseRadius = 10.76f, verticalEllipseRadius = 10.76f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = true, x1 = 12.0f, y1 = 22.75f)
            }
        }.build().also { _radar = it }
    }

@Suppress("ObjectPropertyName")
private var _radar: ImageVector? = null
