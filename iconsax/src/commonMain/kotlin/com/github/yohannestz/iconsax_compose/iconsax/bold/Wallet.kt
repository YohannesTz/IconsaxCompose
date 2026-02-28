package com.github.yohannestz.iconsax_compose.iconsax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Wallet: ImageVector
    get() {
        val current = _wallet
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Wallet",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 21.45f, y = 13.64f)
                verticalLineToRelative(dy = 1.0f)
                arcToRelative(a = 0.5f, b = 0.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.49f, dy1 = 0.5f)
                horizontalLineTo(x = 19.5f)
                curveToRelative(dx1 = -0.53f, dy1 = 0.0f, dx2 = -1.01f, dy2 = -0.39f, dx3 = -1.05f, dy3 = -0.91f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.29f, dy1 = -0.8f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.7f, dy1 = -0.29f)
                horizontalLineToRelative(dx = 1.51f)
                arcToRelative(a = 0.5f, b = 0.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.5f, dy1 = 0.5f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 17.99f, y = 12.69f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.54f, dy1 = 1.98f)
                arcToRelative(a = 2.2f, b = 2.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 2.13f, dy1 = 1.52f)
                horizontalLineToRelative(dx = 0.87f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.0f, dy1 = 1.0f)
                verticalLineToRelative(dy = 0.19f)
                arcToRelative(a = 3.77f, b = 3.77f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -3.76f, dy1 = 3.76f)
                horizontalLineTo(x = 6.21f)
                arcToRelative(a = 3.77f, b = 3.77f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -3.76f, dy1 = -3.76f)
                verticalLineToRelative(dy = -6.73f)
                arcToRelative(a = 3.74f, b = 3.74f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 3.76f, dy1 = -3.76f)
                horizontalLineToRelative(dx = 11.48f)
                arcToRelative(a = 3.77f, b = 3.77f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 3.76f, dy1 = 3.76f)
                verticalLineToRelative(dy = 0.44f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.0f, dy1 = 1.0f)
                horizontalLineToRelative(dx = -1.02f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.44f, dy1 = 0.6f)
                moveTo(x = 16.2f, y = 4.82f)
                curveToRelative(dx1 = 0.27f, dy1 = 0.27f, dx2 = 0.04f, dy2 = 0.69f, dx3 = -0.34f, dy3 = 0.69f)
                lineTo(x = 8.18f, y = 5.5f)
                curveToRelative(dx1 = -0.44f, dy1 = 0.0f, dx2 = -0.67f, dy2 = -0.54f, dx3 = -0.35f, dy3 = -0.85f)
                lineToRelative(dx = 1.62f, dy = -1.63f)
                arcToRelative(a = 3.53f, b = 3.53f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 4.96f, dy1 = 0.0f)
                lineToRelative(dx = 1.75f, dy = 1.77f)
                close()
            }
        }.build().also { _wallet = it }
    }

@Suppress("ObjectPropertyName")
private var _wallet: ImageVector? = null
