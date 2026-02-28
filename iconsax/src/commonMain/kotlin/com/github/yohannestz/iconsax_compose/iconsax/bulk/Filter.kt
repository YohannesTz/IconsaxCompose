package com.github.yohannestz.iconsax_compose.iconsax.bulk

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Filter: ImageVector
    get() {
        val current = _filter
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Filter",
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
                moveTo(x = 20.6f, y = 4.1f)
                verticalLineToRelative(dy = 2.2f)
                curveToRelative(dx1 = 0.0f, dy1 = 0.8f, dx2 = -0.5f, dy2 = 1.8f, dx3 = -1.0f, dy3 = 2.3f)
                lineToRelative(dx = -4.3f, dy = 3.8f)
                curveToRelative(dx1 = -0.6f, dy1 = 0.5f, dx2 = -1.0f, dy2 = 1.5f, dx3 = -1.0f, dy3 = 2.3f)
                verticalLineTo(y = 19.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 0.6f, dx2 = -0.4f, dy2 = 1.4f, dx3 = -0.9f, dy3 = 1.7f)
                lineTo(x = 12.0f, y = 21.6f)
                curveToRelative(dx1 = -1.3f, dy1 = 0.8f, dx2 = -3.1f, dy2 = -0.1f, dx3 = -3.1f, dy3 = -1.7f)
                verticalLineToRelative(dy = -5.3f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.7f, dx2 = -0.4f, dy2 = -1.6f, dx3 = -0.8f, dy3 = -2.1f)
                lineToRelative(dx = -1.0f, dy = -1.05f)
                lineToRelative(dx = 5.82f, dy = -9.35f)
                horizontalLineToRelative(dx = 5.68f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 2.0f, dy1 = 2.0f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 11.3f, y = 2.1f)
                lineToRelative(dx = -5.18f, dy = 8.31f)
                lineToRelative(dx = -1.82f, dy = -1.9f)
                arcToRelative(a = 3.3f, b = 3.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.9f, dy1 = -2.0f)
                verticalLineTo(y = 4.2f)
                curveToRelative(dx1 = 0.0f, dy1 = -1.2f, dx2 = 0.9f, dy2 = -2.1f, dx3 = 2.0f, dy3 = -2.1f)
                close()
            }
        }.build().also { _filter = it }
    }

@Suppress("ObjectPropertyName")
private var _filter: ImageVector? = null
