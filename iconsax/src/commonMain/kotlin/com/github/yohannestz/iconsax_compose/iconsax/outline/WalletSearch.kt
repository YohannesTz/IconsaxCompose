package com.github.yohannestz.iconsax_compose.iconsax.outline

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
                moveTo(x = 17.0f, y = 22.75f)
                horizontalLineToRelative(dx = -5.0f)
                curveToRelative(dx1 = -0.41f, dy1 = 0.0f, dx2 = -0.75f, dy2 = -0.34f, dx3 = -0.75f, dy3 = -0.75f)
                reflectiveCurveToRelative(dx1 = 0.34f, dy1 = -0.75f, dx2 = 0.75f, dy2 = -0.75f)
                horizontalLineToRelative(dx = 5.0f)
                curveToRelative(dx1 = 2.58f, dy1 = 0.0f, dx2 = 4.25f, dy2 = -1.67f, dx3 = 4.25f, dy3 = -4.25f)
                verticalLineToRelative(dy = -5.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -2.29f, dx2 = -1.42f, dy2 = -4.0f, dx3 = -3.54f, dy3 = -4.25f)
                horizontalLineTo(x = 7.0f)
                curveToRelative(dx1 = -0.28f, dy1 = 0.0f, dx2 = -0.38f, dy2 = 0.0f, dx3 = -0.56f, dy3 = 0.06f)
                lineTo(x = 6.29f, y = 7.84f)
                curveTo(x1 = 4.08f, y1 = 8.1f, x2 = 2.75f, y2 = 9.65f, x3 = 2.75f, y3 = 12.0f)
                verticalLineToRelative(dy = 1.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 0.41f, dx2 = -0.34f, dy2 = 0.75f, dx3 = -0.75f, dy3 = 0.75f)
                reflectiveCurveTo(x1 = 1.25f, y1 = 13.41f, x2 = 1.25f, y2 = 13.0f)
                verticalLineToRelative(dy = -1.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -3.06f, dx2 = 1.88f, dy2 = -5.27f, dx3 = 4.79f, dy3 = -5.64f)
                curveTo(x1 = 6.42f, y1 = 6.25f, x2 = 6.7f, y2 = 6.25f, x3 = 7.0f, y3 = 6.25f)
                horizontalLineToRelative(dx = 10.8f)
                curveToRelative(dx1 = 3.0f, dy1 = 0.35f, dx2 = 4.95f, dy2 = 2.66f, dx3 = 4.95f, dy3 = 5.75f)
                verticalLineToRelative(dy = 5.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 3.44f, dx2 = -2.31f, dy2 = 5.75f, dx3 = -5.75f, dy3 = 5.75f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 6.2f, y = 7.85f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.7f, dy1 = -0.99f)
                curveTo(x1 = 5.64f, y1 = 6.4f, x2 = 5.93f, y2 = 6.1f, x3 = 6.26f, y3 = 5.77f)
                lineToRelative(dx = 3.2f, dy = -3.29f)
                arcToRelative(a = 4.35f, b = 4.35f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 6.06f, dy1 = 0.0f)
                lineToRelative(dx = 1.8f, dy = 1.8f)
                arcToRelative(a = 4.4f, b = 4.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.21f, dy1 = 2.63f)
                arcToRelative(a = 0.8f, b = 0.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.18f, dy1 = 0.6f)
                arcToRelative(a = 0.8f, b = 0.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.56f, dy1 = 0.24f)
                horizontalLineTo(x = 7.0f)
                curveToRelative(dx1 = -0.28f, dy1 = 0.0f, dx2 = -0.38f, dy2 = 0.0f, dx3 = -0.56f, dy3 = 0.06f)
                arcTo(horizontalEllipseRadius = 1.0f, verticalEllipseRadius = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 6.2f, y1 = 7.85f)
                moveToRelative(dx = 1.7f, dy = -1.6f)
                horizontalLineToRelative(dx = 8.95f)
                arcToRelative(a = 3.0f, b = 3.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.58f, dy1 = -0.92f)
                lineToRelative(dx = -1.8f, dy = -1.8f)
                arcToRelative(a = 2.8f, b = 2.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -3.94f, dy1 = 0.0f)
                close()
                moveToRelative(dx = 14.1f, dy = 11.0f)
                horizontalLineToRelative(dx = -3.0f)
                arcToRelative(a = 2.75f, b = 2.75f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = true, dx1 = 0.0f, dy1 = -5.5f)
                horizontalLineToRelative(dx = 3.0f)
                curveToRelative(dx1 = 0.41f, dy1 = 0.0f, dx2 = 0.75f, dy2 = 0.34f, dx3 = 0.75f, dy3 = 0.75f)
                reflectiveCurveToRelative(dx1 = -0.34f, dy1 = 0.75f, dx2 = -0.75f, dy2 = 0.75f)
                horizontalLineToRelative(dx = -3.0f)
                arcToRelative(a = 1.25f, b = 1.25f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 2.5f)
                horizontalLineToRelative(dx = 3.0f)
                curveToRelative(dx1 = 0.41f, dy1 = 0.0f, dx2 = 0.75f, dy2 = 0.34f, dx3 = 0.75f, dy3 = 0.75f)
                reflectiveCurveToRelative(dx1 = -0.34f, dy1 = 0.75f, dx2 = -0.75f, dy2 = 0.75f)
                moveToRelative(dx = -16.2f, dy = 4.9f)
                arcToRelative(a = 3.95f, b = 3.95f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = true, dx1 = 0.0f, dy1 = -7.9f)
                arcToRelative(a = 3.95f, b = 3.95f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = 7.9f)
                moveToRelative(dx = 0.0f, dy = -6.4f)
                arcToRelative(a = 2.45f, b = 2.45f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = 0.01f, dy1 = 4.9f)
                arcToRelative(a = 2.45f, b = 2.45f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = -4.9f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 2.0f, y = 22.75f)
                arcToRelative(a = 0.7f, b = 0.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.53f, dy1 = -0.22f)
                arcToRelative(a = 0.76f, b = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = -1.06f)
                lineToRelative(dx = 1.0f, dy = -1.0f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.06f, dy1 = 0.0f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = 1.06f)
                lineToRelative(dx = -1.0f, dy = 1.0f)
                arcTo(horizontalEllipseRadius = 0.7f, verticalEllipseRadius = 0.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 2.0f, y1 = 22.75f)
            }
        }.build().also { _walletSearch = it }
    }

@Suppress("ObjectPropertyName")
private var _walletSearch: ImageVector? = null
