package com.github.yohannestz.iconsax_compose.iconsax.bulk

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Forward: ImageVector
    get() {
        val current = _forward
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Forward",
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
                moveTo(x = 2.0f, y = 8.34f)
                verticalLineToRelative(dy = 7.32f)
                curveToRelative(dx1 = 0.0f, dy1 = 1.5f, dx2 = 1.63f, dy2 = 2.44f, dx3 = 2.93f, dy3 = 1.69f)
                lineToRelative(dx = 3.17f, dy = -1.83f)
                lineToRelative(dx = 3.17f, dy = -1.83f)
                lineToRelative(dx = 0.49f, dy = -0.28f)
                verticalLineToRelative(dy = -2.82f)
                lineToRelative(dx = -0.49f, dy = -0.28f)
                lineTo(x = 8.1f, y = 8.48f)
                lineTo(x = 4.93f, y = 6.65f)
                arcTo(horizontalEllipseRadius = 1.95f, verticalEllipseRadius = 1.95f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 2.0f, y1 = 8.34f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 11.76f, y = 8.34f)
                verticalLineToRelative(dy = 7.32f)
                curveToRelative(dx1 = 0.0f, dy1 = 1.5f, dx2 = 1.63f, dy2 = 2.44f, dx3 = 2.92f, dy3 = 1.69f)
                lineToRelative(dx = 3.18f, dy = -1.83f)
                lineToRelative(dx = 3.17f, dy = -1.83f)
                arcToRelative(a = 1.96f, b = 1.96f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = -3.38f)
                lineToRelative(dx = -3.17f, dy = -1.83f)
                lineToRelative(dx = -3.18f, dy = -1.83f)
                arcToRelative(a = 1.95f, b = 1.95f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -2.92f, dy1 = 1.69f)
            }
        }.build().also { _forward = it }
    }

@Suppress("ObjectPropertyName")
private var _forward: ImageVector? = null
