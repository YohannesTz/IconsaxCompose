package com.github.yohannestz.iconsax_compose.iconsax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val BuyCrypto: ImageVector
    get() {
        val current = _buyCrypto
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.BuyCrypto",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 22.0f, y = 8.5f)
                arcToRelative(a = 6.5f, b = 6.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -5.52f, dy1 = 6.42f)
                verticalLineToRelative(dy = -0.06f)
                arcToRelative(a = 8.06f, b = 8.06f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -7.37f, dy1 = -7.34f)
                horizontalLineTo(x = 9.08f)
                arcTo(horizontalEllipseRadius = 6.5f, verticalEllipseRadius = 6.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 15.5f, y1 = 2.0f)
                arcTo(horizontalEllipseRadius = 6.5f, verticalEllipseRadius = 6.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 22.0f, y1 = 8.5f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 14.98f, y = 14.98f)
                arcTo(horizontalEllipseRadius = 6.5f, verticalEllipseRadius = 6.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 8.5f, y1 = 9.0f)
                arcToRelative(a = 6.5f, b = 6.5f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = 6.48f, dy1 = 5.98f)
                moveToRelative(dx = -5.6f, dy = 1.4f)
                lineTo(x = 8.5f, y = 18.0f)
                lineToRelative(dx = -0.88f, dy = -1.62f)
                lineTo(x = 6.0f, y = 15.5f)
                lineToRelative(dx = 1.62f, dy = -0.88f)
                lineTo(x = 8.5f, y = 13.0f)
                lineToRelative(dx = 0.88f, dy = 1.62f)
                lineTo(x = 11.0f, y = 15.5f)
                close()
            }
        }.build().also { _buyCrypto = it }
    }

@Suppress("ObjectPropertyName")
private var _buyCrypto: ImageVector? = null
