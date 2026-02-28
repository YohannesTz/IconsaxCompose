package com.github.yohannestz.iconsax_compose.iconsax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ShieldSearch: ImageVector
    get() {
        val current = _shieldSearch
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.ShieldSearch",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 19.45f, y = 6.94f)
                verticalLineToRelative(dy = 2.51f)
                curveToRelative(dx1 = 0.0f, dy1 = 0.71f, dx2 = -0.72f, dy2 = 1.17f, dx3 = -1.39f, dy3 = 0.92f)
                arcToRelative(a = 6.0f, b = 6.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -2.75f, dy1 = -0.33f)
                arcToRelative(a = 6.5f, b = 6.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -5.22f, dy1 = 4.92f)
                arcToRelative(a = 6.0f, b = 6.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.51f, dy1 = 5.11f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.63f, dy1 = 1.66f)
                curveToRelative(dx1 = -0.69f, dy1 = 0.08f, dx2 = -1.37f, dy2 = 0.06f, dx3 = -1.75f, dy3 = -0.22f)
                lineToRelative(dx = -5.5f, dy = -4.11f)
                arcToRelative(a = 3.3f, b = 3.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.18f, dy1 = -2.37f)
                verticalLineTo(y = 6.94f)
                arcToRelative(a = 3.2f, b = 3.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.91f, dy1 = -2.77f)
                lineToRelative(dx = 5.5f, dy = -2.06f)
                arcToRelative(a = 3.5f, b = 3.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 2.08f, dy1 = 0.0f)
                lineToRelative(dx = 5.5f, dy = 2.06f)
                arcToRelative(a = 3.2f, b = 3.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.92f, dy1 = 2.77f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 16.0f, y = 11.51f)
                arcToRelative(a = 4.5f, b = 4.5f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = 4.5f, dy1 = 4.5f)
                arcToRelative(a = 4.5f, b = 4.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -4.5f, dy1 = -4.5f)
                moveTo(x = 21.0f, y = 22.0f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.71f, dy1 = -0.29f)
                quadToRelative(dx1 = -0.07f, dy1 = -0.07f, dx2 = -0.12f, dy2 = -0.16f)
                lineToRelative(dx = -0.09f, dy = -0.17f)
                lineToRelative(dx = -0.06f, dy = -0.18f)
                lineTo(x = 20.0f, y = 21.0f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.08f, dy1 = -0.38f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.21f, dy1 = -0.33f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.26f, dy1 = -0.12f)
                quadToRelative(dx1 = 0.09f, dy1 = 0.05f, dx2 = 0.16f, dy2 = 0.12f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.21f, dy1 = 0.33f)
                arcTo(horizontalEllipseRadius = 1.0f, verticalEllipseRadius = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 22.0f, y1 = 21.0f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.29f, dy1 = 0.71f)
                lineToRelative(dx = -0.16f, dy = 0.12f)
                lineToRelative(dx = -0.17f, dy = 0.09f)
                lineToRelative(dx = -0.19f, dy = 0.06f)
                close()
            }
        }.build().also { _shieldSearch = it }
    }

@Suppress("ObjectPropertyName")
private var _shieldSearch: ImageVector? = null
