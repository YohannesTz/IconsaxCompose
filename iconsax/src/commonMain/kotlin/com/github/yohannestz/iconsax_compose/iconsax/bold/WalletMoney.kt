package com.github.yohannestz.iconsax_compose.iconsax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val WalletMoney: ImageVector
    get() {
        val current = _walletMoney
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.WalletMoney",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 20.97f, y = 16.08f)
                curveTo(x1 = 20.73f, y1 = 18.75f, x2 = 18.8f, y2 = 20.5f, x3 = 16.0f, y3 = 20.5f)
                horizontalLineTo(x = 7.0f)
                arcToRelative(a = 5.0f, b = 5.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -5.0f, dy1 = -5.0f)
                verticalLineToRelative(dy = -7.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -2.72f, dx2 = 1.64f, dy2 = -4.62f, dx3 = 4.19f, dy3 = -4.94f)
                arcTo(horizontalEllipseRadius = 5.0f, verticalEllipseRadius = 5.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 7.0f, y1 = 3.5f)
                horizontalLineToRelative(dx = 9.0f)
                arcToRelative(a = 5.0f, b = 5.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.75f, dy1 = 0.05f)
                arcToRelative(a = 4.6f, b = 4.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 4.22f, dy1 = 4.37f)
                arcToRelative(a = 0.5f, b = 0.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.5f, dy1 = 0.53f)
                horizontalLineToRelative(dx = -1.55f)
                arcToRelative(a = 3.4f, b = 3.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -2.49f, dy1 = 1.03f)
                arcToRelative(a = 3.5f, b = 3.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.05f, dy1 = 2.82f)
                arcToRelative(a = 3.65f, b = 3.65f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 3.66f, dy1 = 3.25f)
                horizontalLineToRelative(dx = 1.43f)
                arcToRelative(a = 0.5f, b = 0.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.5f, dy1 = 0.53f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 22.0f, y = 10.97f)
                verticalLineToRelative(dy = 2.06f)
                curveToRelative(dx1 = 0.0f, dy1 = 0.55f, dx2 = -0.44f, dy2 = 1.0f, dx3 = -1.0f, dy3 = 1.02f)
                horizontalLineToRelative(dx = -1.96f)
                curveToRelative(dx1 = -1.08f, dy1 = 0.0f, dx2 = -2.07f, dy2 = -0.79f, dx3 = -2.16f, dy3 = -1.87f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.6f, dy1 = -1.63f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.44f, dy1 = -0.6f)
                horizontalLineTo(x = 21.0f)
                arcToRelative(a = 1.03f, b = 1.03f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.0f, dy1 = 1.02f)
            }
        }.build().also { _walletMoney = it }
    }

@Suppress("ObjectPropertyName")
private var _walletMoney: ImageVector? = null
