package com.github.yohannestz.iconsax_compose.iconsax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val WalletTwo: ImageVector
    get() {
        val current = _walletTwo
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.WalletTwo",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
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
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 20.47f, y = 15.55f)
                horizontalLineToRelative(dx = -1.43f)
                curveToRelative(dx1 = -1.9f, dy1 = 0.0f, dx2 = -3.5f, dy2 = -1.43f, dx3 = -3.66f, dy3 = -3.25f)
                arcToRelative(a = 3.5f, b = 3.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.05f, dy1 = -2.82f)
                arcToRelative(a = 3.4f, b = 3.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 2.49f, dy1 = -1.03f)
                horizontalLineToRelative(dx = 1.55f)
                arcToRelative(a = 0.5f, b = 0.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.5f, dy1 = -0.53f)
                arcToRelative(a = 4.6f, b = 4.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -4.22f, dy1 = -4.37f)
                arcTo(horizontalEllipseRadius = 5.0f, verticalEllipseRadius = 5.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 16.0f, y1 = 3.5f)
                horizontalLineTo(x = 7.0f)
                arcToRelative(a = 5.0f, b = 5.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.81f, dy1 = 0.06f)
                curveTo(x1 = 3.64f, y1 = 3.88f, x2 = 2.0f, y2 = 5.78f, x3 = 2.0f, y3 = 8.5f)
                verticalLineToRelative(dy = 7.0f)
                arcToRelative(a = 5.0f, b = 5.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 5.0f, dy1 = 5.0f)
                horizontalLineToRelative(dx = 9.0f)
                curveToRelative(dx1 = 2.8f, dy1 = 0.0f, dx2 = 4.73f, dy2 = -1.75f, dx3 = 4.97f, dy3 = -4.42f)
                arcToRelative(a = 0.5f, b = 0.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.5f, dy1 = -0.53f)
                moveTo(x = 13.0f, y = 9.75f)
                horizontalLineTo(x = 7.0f)
                curveTo(x1 = 6.59f, y1 = 9.75f, x2 = 6.25f, y2 = 9.41f, x3 = 6.25f, y3 = 9.0f)
                reflectiveCurveTo(x1 = 6.59f, y1 = 8.25f, x2 = 7.0f, y2 = 8.25f)
                horizontalLineToRelative(dx = 6.0f)
                curveToRelative(dx1 = 0.41f, dy1 = 0.0f, dx2 = 0.75f, dy2 = 0.34f, dx3 = 0.75f, dy3 = 0.75f)
                reflectiveCurveTo(x1 = 13.41f, y1 = 9.75f, x2 = 13.0f, y2 = 9.75f)
            }
        }.build().also { _walletTwo = it }
    }

@Suppress("ObjectPropertyName")
private var _walletTwo: ImageVector? = null
