package com.github.yohannestz.iconsax_compose.iconsax.bulk

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Shield: ImageVector
    get() {
        val current = _shield
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Shield",
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
                moveTo(x = 20.41f, y = 6.96f)
                verticalLineTo(y = 9.8f)
                lineTo(x = 7.4f, y = 19.34f)
                lineToRelative(dx = -2.63f, dy = -1.97f)
                arcToRelative(a = 3.3f, b = 3.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.18f, dy1 = -2.35f)
                verticalLineTo(y = 6.96f)
                arcTo(horizontalEllipseRadius = 3.2f, verticalEllipseRadius = 3.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 5.5f, y1 = 4.21f)
                lineToRelative(dx = 5.47f, dy = -2.05f)
                arcToRelative(a = 3.5f, b = 3.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 2.06f, dy1 = 0.0f)
                lineToRelative(dx = 5.47f, dy = 2.05f)
                arcToRelative(a = 3.2f, b = 3.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.91f, dy1 = 2.75f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 20.41f, y = 11.17f)
                verticalLineToRelative(dy = 3.85f)
                arcToRelative(a = 3.3f, b = 3.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.18f, dy1 = 2.35f)
                lineToRelative(dx = -5.47f, dy = 4.1f)
                arcTo(horizontalEllipseRadius = 3.0f, verticalEllipseRadius = 3.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 12.0f, y1 = 22.0f)
                arcToRelative(a = 3.0f, b = 3.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.76f, dy1 = -0.54f)
                lineToRelative(dx = -1.92f, dy = -1.43f)
                close()
            }
        }.build().also { _shield = it }
    }

@Suppress("ObjectPropertyName")
private var _shield: ImageVector? = null
