package com.github.yohannestz.iconsax_compose.iconsax.bulk

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val WalletSearch: ImageVector
    get() {
        val current = _walletSearch
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.WalletSearch",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 17.75f, y = 7.05f)
                arcTo(horizontalEllipseRadius = 5.0f, verticalEllipseRadius = 5.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 17.0f, y1 = 7.0f)
                horizontalLineTo(x = 7.0f)
                arcToRelative(a = 5.0f, b = 5.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.8f, dy1 = 0.06f)
                arcToRelative(a = 3.0f, b = 3.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.57f, dy1 = -0.78f)
                lineToRelative(dx = 3.25f, dy = -3.26f)
                arcToRelative(a = 3.53f, b = 3.53f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 4.96f, dy1 = 0.0f)
                lineToRelative(dx = 1.75f, dy = 1.77f)
                arcToRelative(a = 3.4f, b = 3.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.02f, dy1 = 2.26f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
                fillAlpha = 0.4f,
                strokeAlpha = 0.4f,
            ) {
                moveTo(x = 2.0f, y = 16.36f)
                verticalLineTo(y = 12.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -2.72f, dx2 = 1.64f, dy2 = -4.62f, dx3 = 4.19f, dy3 = -4.94f)
                arcTo(horizontalEllipseRadius = 5.0f, verticalEllipseRadius = 5.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 7.0f, y1 = 7.0f)
                horizontalLineToRelative(dx = 10.0f)
                arcToRelative(a = 5.0f, b = 5.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.75f, dy1 = 0.05f)
                curveTo(x1 = 20.33f, y1 = 7.35f, x2 = 22.0f, y2 = 9.26f, x3 = 22.0f, y3 = 12.0f)
                verticalLineToRelative(dy = 5.0f)
                arcToRelative(a = 5.0f, b = 5.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -5.0f, dy1 = 5.0f)
                horizontalLineTo(x = 7.0f)
                arcToRelative(a = 5.0f, b = 5.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -5.0f, dy1 = -5.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 22.0f, y = 12.5f)
                horizontalLineToRelative(dx = -3.0f)
                curveToRelative(dx1 = -1.1f, dy1 = 0.0f, dx2 = -2.0f, dy2 = 0.9f, dx3 = -2.0f, dy3 = 2.0f)
                reflectiveCurveToRelative(dx1 = 0.9f, dy1 = 2.0f, dx2 = 2.0f, dy2 = 2.0f)
                horizontalLineToRelative(dx = 3.0f)
                moveTo(x = 1.23f, y = 21.68f)
                lineToRelative(dx = 0.76f, dy = -0.76f)
                arcToRelative(a = 3.8f, b = 3.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.63f, dy1 = -2.09f)
                arcToRelative(a = 3.82f, b = 3.82f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = true, dx1 = 3.82f, dy1 = 3.82f)
                arcToRelative(a = 3.8f, b = 3.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -2.1f, dy1 = -0.63f)
                lineToRelative(dx = -0.75f, dy = 0.76f)
                arcToRelative(a = 0.8f, b = 0.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.55f, dy1 = 0.23f)
                quadToRelative(dx1 = -0.31f, dy1 = 0.0f, dx2 = -0.55f, dy2 = -0.23f)
                arcToRelative(a = 0.77f, b = 0.77f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = -1.1f)
            }
        }.build().also { _walletSearch = it }
    }

@Suppress("ObjectPropertyName")
private var _walletSearch: ImageVector? = null
