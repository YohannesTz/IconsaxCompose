package com.github.yohannestz.iconsax_compose.iconsax.bulk

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Mask: ImageVector
    get() {
        val current = _mask
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Mask",
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
                moveTo(x = 22.0f, y = 12.0f)
                arcToRelative(a = 10.01f, b = 10.01f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -17.07f, dy1 = 7.07f)
                arcTo(horizontalEllipseRadius = 10.0f, verticalEllipseRadius = 10.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 2.0f, y1 = 12.0f)
                arcToRelative(a = 10.0f, b = 10.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 17.07f, dy1 = -7.07f)
                arcTo(horizontalEllipseRadius = 10.0f, verticalEllipseRadius = 10.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 22.0f, y1 = 12.0f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 14.83f, y = 10.23f)
                lineToRelative(dx = -2.48f, dy = 2.48f)
                lineToRelative(dx = 6.53f, dy = 6.53f)
                arcToRelative(a = 10.0f, b = 10.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.16f, dy1 = 0.96f)
                lineToRelative(dx = -6.43f, dy = -6.43f)
                lineToRelative(dx = -2.47f, dy = 2.47f)
                lineToRelative(dx = 5.12f, dy = 5.13f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.21f, dy1 = 0.4f)
                arcTo(horizontalEllipseRadius = 9.0f, verticalEllipseRadius = 9.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 12.44f, y1 = 22.0f)
                lineTo(x = 7.76f, y = 17.3f)
                lineToRelative(dx = -2.28f, dy = 2.28f)
                lineToRelative(dx = -0.55f, dy = -0.5f)
                lineToRelative(dx = -0.51f, dy = -0.56f)
                lineToRelative(dx = 14.1f, dy = -14.1f)
                arcToRelative(a = 9.0f, b = 9.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.06f, dy1 = 1.06f)
                lineToRelative(dx = -3.69f, dy = 3.7f)
                lineToRelative(dx = 5.69f, dy = 5.68f)
                arcToRelative(a = 10.0f, b = 10.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.6f, dy1 = 1.52f)
                close()
            }
        }.build().also { _mask = it }
    }

@Suppress("ObjectPropertyName")
private var _mask: ImageVector? = null
