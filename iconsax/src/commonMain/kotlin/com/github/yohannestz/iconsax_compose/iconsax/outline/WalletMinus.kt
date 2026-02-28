package com.github.yohannestz.iconsax_compose.iconsax.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val WalletMinus: ImageVector
    get() {
        val current = _walletMinus
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.WalletMinus",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 14.5f, y = 16.75f)
                horizontalLineToRelative(dx = -5.0f)
                curveToRelative(dx1 = -0.41f, dy1 = 0.0f, dx2 = -0.75f, dy2 = -0.34f, dx3 = -0.75f, dy3 = -0.75f)
                reflectiveCurveToRelative(dx1 = 0.34f, dy1 = -0.75f, dx2 = 0.75f, dy2 = -0.75f)
                horizontalLineToRelative(dx = 5.0f)
                curveToRelative(dx1 = 0.41f, dy1 = 0.0f, dx2 = 0.75f, dy2 = 0.34f, dx3 = 0.75f, dy3 = 0.75f)
                reflectiveCurveToRelative(dx1 = -0.34f, dy1 = 0.75f, dx2 = -0.75f, dy2 = 0.75f)
                moveToRelative(dx = -9.3f, dy = -6.29f)
                arcToRelative(a = 0.8f, b = 0.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.53f, dy1 = -0.22f)
                arcToRelative(a = 0.8f, b = 0.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.16f, dy1 = -0.82f)
                lineToRelative(dx = 1.86f, dy = -4.44f)
                quadToRelative(dx1 = 0.05f, dy1 = -0.13f, dx2 = 0.1f, dy2 = -0.2f)
                curveToRelative(dx1 = 1.47f, dy1 = -3.41f, dx2 = 3.36f, dy2 = -4.24f, dx3 = 6.7f, dy3 = -2.96f)
                arcToRelative(a = 0.76f, b = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.42f, dy1 = 1.0f)
                lineToRelative(dx = -2.93f, dy = 6.8f)
                arcToRelative(a = 0.8f, b = 0.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.69f, dy1 = 0.45f)
                horizontalLineTo(x = 7.12f)
                arcTo(horizontalEllipseRadius = 4.0f, verticalEllipseRadius = 4.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 5.5f, y1 = 10.4f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.29f, dy1 = 0.06f)
                moveToRelative(dx = 5.41f, dy = -7.71f)
                curveToRelative(dx1 = -1.24f, dy1 = 0.0f, dx2 = -2.0f, dy2 = 0.81f, dx3 = -2.79f, dy3 = 2.65f)
                quadTo(x1 = 7.81f, y1 = 5.44f, x2 = 7.78f, y2 = 5.49f)
                lineTo(x = 6.48f, y = 8.6f)
                lineToRelative(dx = 0.64f, dy = -0.03f)
                horizontalLineToRelative(dx = 2.35f)
                lineToRelative(dx = 2.41f, dy = -5.6f)
                arcToRelative(a = 4.0f, b = 4.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.27f, dy1 = -0.22f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 18.29f, y = 10.27f)
                lineToRelative(dx = -0.22f, dy = -0.03f)
                arcToRelative(a = 4.0f, b = 4.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.2f, dy1 = -0.17f)
                horizontalLineToRelative(dx = -6.9f)
                arcToRelative(a = 0.8f, b = 0.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.63f, dy1 = -0.34f)
                arcToRelative(a = 0.8f, b = 0.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.06f, dy1 = -0.71f)
                lineToRelative(dx = 2.9f, dy = -6.73f)
                curveToRelative(dx1 = 0.15f, dy1 = -0.36f, dx2 = 0.58f, dy2 = -0.6f, dx3 = 0.96f, dy3 = -0.48f)
                lineToRelative(dx = 0.35f, dy = 0.14f)
                lineToRelative(dx = 2.36f, dy = 0.99f)
                arcToRelative(a = 7.0f, b = 7.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 2.9f, dy1 = 1.89f)
                arcToRelative(a = 3.0f, b = 3.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.59f, dy1 = 1.03f)
                lineToRelative(dx = 0.1f, dy = 0.34f)
                curveTo(x1 = 19.74f, y1 = 7.14f, x2 = 19.6f, y2 = 8.3f, x3 = 19.0f, y3 = 9.8f)
                arcToRelative(a = 0.8f, b = 0.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.7f, dy1 = 0.47f)
                moveToRelative(dx = -7.18f, dy = -1.7f)
                horizontalLineToRelative(dx = 5.77f)
                arcToRelative(a = 6.0f, b = 6.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.94f, dy1 = 0.08f)
                arcTo(horizontalEllipseRadius = 3.6f, verticalEllipseRadius = 3.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 18.0f, y1 = 6.57f)
                lineTo(x = 17.95f, y = 6.4f)
                lineTo(x = 17.8f, y = 6.07f)
                quadToRelative(dx1 = -0.1f, dy1 = -0.16f, dx2 = -0.2f, dy2 = -0.3f)
                arcToRelative(a = 6.0f, b = 6.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -2.32f, dy1 = -1.45f)
                lineTo(x = 13.3f, y = 3.49f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 15.9f, y = 22.75f)
                horizontalLineTo(x = 8.1f)
                arcToRelative(a = 7.0f, b = 7.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.8f, dy1 = -0.05f)
                curveToRelative(dx1 = -3.51f, dy1 = -0.24f, dx2 = -5.51f, dy2 = -2.24f, dx3 = -5.75f, dy3 = -5.79f)
                arcToRelative(a = 6.0f, b = 6.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.05f, dy1 = -0.76f)
                verticalLineTo(y = 14.2f)
                arcToRelative(a = 5.65f, b = 5.65f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 5.63f, dy1 = -5.63f)
                horizontalLineToRelative(dx = 9.76f)
                arcToRelative(a = 5.67f, b = 5.67f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 5.63f, dy1 = 5.63f)
                verticalLineToRelative(dy = 1.95f)
                lineToRelative(dx = -0.02f, dy = 0.63f)
                curveToRelative(dx1 = -0.22f, dy1 = 3.91f, dx2 = -2.5f, dy2 = 5.97f, dx3 = -6.6f, dy3 = 5.97f)
                moveTo(x = 7.12f, y = 10.07f)
                arcToRelative(a = 4.13f, b = 4.13f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -4.13f, dy1 = 4.13f)
                verticalLineToRelative(dy = 1.95f)
                lineToRelative(dx = 0.04f, dy = 0.62f)
                curveToRelative(dx1 = 0.19f, dy1 = 2.85f, dx2 = 1.59f, dy2 = 4.25f, dx3 = 4.4f, dy3 = 4.44f)
                arcToRelative(a = 5.0f, b = 5.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.66f, dy1 = 0.05f)
                horizontalLineToRelative(dx = 7.8f)
                curveToRelative(dx1 = 3.3f, dy1 = 0.0f, dx2 = 4.92f, dy2 = -1.45f, dx3 = 5.08f, dy3 = -4.55f)
                lineToRelative(dx = 0.02f, dy = -0.56f)
                verticalLineTo(y = 14.2f)
                arcToRelative(a = 4.17f, b = 4.17f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -4.13f, dy1 = -4.13f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 2.24f, y = 14.95f)
                arcToRelative(a = 0.76f, b = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.75f, dy1 = -0.75f)
                verticalLineToRelative(dy = -2.93f)
                arcToRelative(a = 6.6f, b = 6.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 5.3f, dy1 = -6.47f)
                arcToRelative(a = 0.8f, b = 0.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.74f, dy1 = 0.26f)
                arcToRelative(a = 0.8f, b = 0.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.1f, dy1 = 0.76f)
                lineTo(x = 5.9f, y = 10.0f)
                arcToRelative(a = 0.8f, b = 0.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.4f, dy1 = 0.4f)
                arcTo(horizontalEllipseRadius = 4.1f, verticalEllipseRadius = 4.1f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 3.0f, y1 = 14.2f)
                arcToRelative(a = 0.76f, b = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.75f, dy1 = 0.75f)
                moveTo(x = 5.6f, y = 6.82f)
                arcToRelative(a = 5.1f, b = 5.1f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -2.5f, dy1 = 3.45f)
                arcToRelative(a = 6.0f, b = 6.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.53f, dy1 = -1.1f)
                close()
                moveToRelative(dx = 16.16f, dy = 8.13f)
                arcToRelative(a = 0.76f, b = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.75f, dy1 = -0.75f)
                arcToRelative(a = 4.2f, b = 4.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -2.93f, dy1 = -3.96f)
                arcToRelative(a = 0.74f, b = 0.74f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.48f, dy1 = -0.99f)
                curveToRelative(dx1 = 0.47f, dy1 = -1.17f, dx2 = 0.6f, dy2 = -2.02f, dx3 = 0.4f, dy3 = -2.68f)
                lineTo(x = 17.95f, y = 6.4f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.17f, dy1 = -0.85f)
                arcToRelative(a = 0.74f, b = 0.74f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.86f, dy1 = -0.12f)
                arcToRelative(a = 6.6f, b = 6.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 3.53f, dy1 = 5.84f)
                verticalLineToRelative(dy = 2.93f)
                arcToRelative(a = 0.76f, b = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.75f, dy1 = 0.75f)
                moveToRelative(dx = -2.5f, dy = -5.86f)
                arcToRelative(a = 6.0f, b = 6.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.65f, dy1 = 1.19f)
                arcToRelative(a = 5.0f, b = 5.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.35f, dy1 = -2.57f)
                arcToRelative(a = 7.0f, b = 7.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.3f, dy1 = 1.38f)
            }
        }.build().also { _walletMinus = it }
    }

@Suppress("ObjectPropertyName")
private var _walletMinus: ImageVector? = null
