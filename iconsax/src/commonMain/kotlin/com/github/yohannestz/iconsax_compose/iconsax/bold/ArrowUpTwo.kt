package com.github.yohannestz.iconsax_compose.iconsax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ArrowUpTwo: ImageVector
    get() {
        val current = _arrowUpTwo
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.ArrowUpTwo",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 18.68f, y = 13.98f)
                lineToRelative(dx = -3.21f, dy = -3.21f)
                lineToRelative(dx = -1.96f, dy = -1.97f)
                arcToRelative(a = 2.13f, b = 2.13f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -3.01f, dy1 = 0.0f)
                lineToRelative(dx = -5.18f, dy = 5.18f)
                arcToRelative(a = 1.08f, b = 1.08f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.76f, dy1 = 1.84f)
                horizontalLineToRelative(dx = 11.84f)
                arcToRelative(a = 1.08f, b = 1.08f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.76f, dy1 = -1.84f)
            }
        }.build().also { _arrowUpTwo = it }
    }

@Suppress("ObjectPropertyName")
private var _arrowUpTwo: ImageVector? = null
