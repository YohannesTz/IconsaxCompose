package com.github.yohannestz.iconsax_compose.iconsax.outline

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
                moveTo(x = 7.17f, y = 22.75f)
                curveToRelative(dx1 = -2.38f, dy1 = 0.0f, dx2 = -4.33f, dy2 = -1.73f, dx3 = -4.33f, dy3 = -3.86f)
                verticalLineToRelative(dy = -2.04f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.4f, dx2 = 0.34f, dy2 = -0.75f, dx3 = 0.75f, dy3 = -0.75f)
                reflectiveCurveToRelative(dx1 = 0.75f, dy1 = 0.34f, dx2 = 0.75f, dy2 = 0.75f)
                curveToRelative(dx1 = 0.0f, dy1 = 1.25f, dx2 = 1.21f, dy2 = 2.2f, dx3 = 2.83f, dy3 = 2.2f)
                reflectiveCurveTo(x1 = 10.0f, y1 = 18.1f, x2 = 10.0f, y2 = 16.84f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.4f, dx2 = 0.34f, dy2 = -0.75f, dx3 = 0.75f, dy3 = -0.75f)
                reflectiveCurveToRelative(dx1 = 0.75f, dy1 = 0.34f, dx2 = 0.75f, dy2 = 0.75f)
                verticalLineToRelative(dy = 2.04f)
                curveToRelative(dx1 = 0.0f, dy1 = 2.13f, dx2 = -1.94f, dy2 = 3.86f, dx3 = -4.33f, dy3 = 3.86f)
                moveTo(x = 4.6f, y = 19.87f)
                curveToRelative(dx1 = 0.44f, dy1 = 0.82f, dx2 = 1.43f, dy2 = 1.38f, dx3 = 2.57f, dy3 = 1.38f)
                reflectiveCurveToRelative(dx1 = 2.13f, dy1 = -0.57f, dx2 = 2.57f, dy2 = -1.38f)
                arcToRelative(a = 5.0f, b = 5.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -2.57f, dy1 = 0.68f)
                arcToRelative(a = 5.0f, b = 5.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -2.57f, dy1 = -0.68f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 7.17f, y = 17.8f)
                arcToRelative(a = 4.5f, b = 4.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -3.84f, dy1 = -1.94f)
                arcToRelative(a = 3.4f, b = 3.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.49f, dy1 = -1.75f)
                arcToRelative(a = 3.6f, b = 3.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.3f, dy1 = -2.76f)
                arcToRelative(a = 4.8f, b = 4.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 6.04f, dy1 = 0.0f)
                arcToRelative(a = 3.7f, b = 3.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.31f, dy1 = 2.76f)
                arcTo(horizontalEllipseRadius = 3.4f, verticalEllipseRadius = 3.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 11.0f, y1 = 15.86f)
                arcToRelative(a = 4.4f, b = 4.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -3.83f, dy1 = 1.94f)
                moveToRelative(dx = 0.0f, dy = -6.05f)
                arcToRelative(a = 3.0f, b = 3.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -2.04f, dy1 = 0.73f)
                arcToRelative(a = 2.2f, b = 2.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.79f, dy1 = 1.63f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.27f, dy1 = 0.97f)
                curveToRelative(dx1 = 0.46f, dy1 = 0.76f, dx2 = 1.44f, dy2 = 1.23f, dx3 = 2.56f, dy3 = 1.23f)
                reflectiveCurveToRelative(dx1 = 2.1f, dy1 = -0.47f, dx2 = 2.55f, dy2 = -1.22f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.27f, dy1 = -0.97f)
                arcToRelative(a = 2.2f, b = 2.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.79f, dy1 = -1.64f)
                arcToRelative(a = 3.0f, b = 3.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -2.03f, dy1 = -0.73f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 7.17f, y = 20.55f)
                curveToRelative(dx1 = -2.47f, dy1 = 0.0f, dx2 = -4.33f, dy2 = -1.59f, dx3 = -4.33f, dy3 = -3.69f)
                verticalLineToRelative(dy = -2.75f)
                curveToRelative(dx1 = 0.0f, dy1 = -2.13f, dx2 = 1.94f, dy2 = -3.86f, dx3 = 4.33f, dy3 = -3.86f)
                arcToRelative(a = 4.6f, b = 4.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 3.02f, dy1 = 1.09f)
                arcToRelative(a = 3.7f, b = 3.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.31f, dy1 = 2.77f)
                verticalLineToRelative(dy = 2.75f)
                curveToRelative(dx1 = 0.0f, dy1 = 2.1f, dx2 = -1.86f, dy2 = 3.69f, dx3 = -4.33f, dy3 = 3.69f)
                moveToRelative(dx = 0.0f, dy = -8.8f)
                curveToRelative(dx1 = -1.56f, dy1 = 0.0f, dx2 = -2.83f, dy2 = 1.06f, dx3 = -2.83f, dy3 = 2.36f)
                verticalLineToRelative(dy = 2.75f)
                curveToRelative(dx1 = 0.0f, dy1 = 1.25f, dx2 = 1.21f, dy2 = 2.19f, dx3 = 2.83f, dy3 = 2.19f)
                reflectiveCurveTo(x1 = 10.0f, y1 = 18.11f, x2 = 10.0f, y2 = 16.86f)
                verticalLineToRelative(dy = -2.75f)
                arcToRelative(a = 2.2f, b = 2.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.79f, dy1 = -1.64f)
                arcToRelative(a = 3.0f, b = 3.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -2.04f, dy1 = -0.72f)
                moveToRelative(dx = 11.87f, dy = 3.05f)
                arcToRelative(a = 2.9f, b = 2.9f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -2.91f, dy1 = -2.56f)
                arcToRelative(a = 2.7f, b = 2.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.82f, dy1 = -2.23f)
                arcToRelative(a = 2.7f, b = 2.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.96f, dy1 = -0.81f)
                horizontalLineTo(x = 21.0f)
                arcToRelative(a = 1.8f, b = 1.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.75f, dy1 = 1.77f)
                verticalLineToRelative(dy = 2.06f)
                arcToRelative(a = 1.77f, b = 1.77f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.72f, dy1 = 1.77f)
                close()
                moveToRelative(dx = 1.93f, dy = -4.1f)
                horizontalLineToRelative(dx = -2.05f)
                arcToRelative(a = 1.2f, b = 1.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.9f, dy1 = 0.37f)
                arcToRelative(a = 1.3f, b = 1.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.39f, dy1 = 1.04f)
                curveToRelative(dx1 = 0.05f, dy1 = 0.66f, dx2 = 0.69f, dy2 = 1.19f, dx3 = 1.41f, dy3 = 1.19f)
                horizontalLineTo(x = 21.0f)
                curveToRelative(dx1 = 0.13f, dy1 = 0.0f, dx2 = 0.25f, dy2 = -0.12f, dx3 = 0.25f, dy3 = -0.27f)
                verticalLineToRelative(dy = -2.06f)
                quadToRelative(dx1 = -0.02f, dy1 = -0.24f, dx2 = -0.28f, dy2 = -0.27f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 16.0f, y = 21.25f)
                horizontalLineToRelative(dx = -2.5f)
                curveToRelative(dx1 = -0.4f, dy1 = 0.0f, dx2 = -0.75f, dy2 = -0.34f, dx3 = -0.75f, dy3 = -0.75f)
                reflectiveCurveToRelative(dx1 = 0.34f, dy1 = -0.75f, dx2 = 0.75f, dy2 = -0.75f)
                horizontalLineTo(x = 16.0f)
                curveToRelative(dx1 = 2.58f, dy1 = 0.0f, dx2 = 4.25f, dy2 = -1.67f, dx3 = 4.25f, dy3 = -4.25f)
                verticalLineToRelative(dy = -0.7f)
                horizontalLineToRelative(dx = -1.2f)
                arcToRelative(a = 2.9f, b = 2.9f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -2.92f, dy1 = -2.56f)
                arcToRelative(a = 2.7f, b = 2.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.82f, dy1 = -2.23f)
                arcToRelative(a = 2.7f, b = 2.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.96f, dy1 = -0.81f)
                horizontalLineToRelative(dx = 1.33f)
                verticalLineTo(y = 8.5f)
                curveToRelative(dx1 = 0.0f, dy1 = -2.34f, dx2 = -1.37f, dy2 = -3.95f, dx3 = -3.59f, dy3 = -4.21f)
                quadTo(x1 = 16.3f, y1 = 4.24f, x2 = 16.0f, y2 = 4.25f)
                horizontalLineTo(x = 7.0f)
                arcTo(horizontalEllipseRadius = 5.0f, verticalEllipseRadius = 5.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 6.3f, y1 = 4.3f)
                curveTo(x1 = 4.1f, y1 = 4.58f, x2 = 2.74f, y2 = 6.18f, x3 = 2.74f, y3 = 8.5f)
                verticalLineToRelative(dy = 2.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 0.41f, dx2 = -0.34f, dy2 = 0.75f, dx3 = -0.75f, dy3 = 0.75f)
                reflectiveCurveToRelative(dx1 = -0.75f, dy1 = -0.34f, dx2 = -0.75f, dy2 = -0.75f)
                verticalLineToRelative(dy = -2.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -3.08f, dx2 = 1.9f, dy2 = -5.31f, dx3 = 4.85f, dy3 = -5.68f)
                arcTo(horizontalEllipseRadius = 6.0f, verticalEllipseRadius = 6.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 7.0f, y1 = 2.75f)
                horizontalLineToRelative(dx = 9.0f)
                arcToRelative(a = 6.0f, b = 6.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.87f, dy1 = 0.06f)
                curveToRelative(dx1 = 2.95f, dy1 = 0.34f, dx2 = 4.88f, dy2 = 2.58f, dx3 = 4.88f, dy3 = 5.69f)
                verticalLineToRelative(dy = 1.45f)
                arcTo(horizontalEllipseRadius = 0.76f, verticalEllipseRadius = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 21.0f, y1 = 10.7f)
                horizontalLineToRelative(dx = -2.08f)
                arcToRelative(a = 1.2f, b = 1.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.9f, dy1 = 0.37f)
                arcToRelative(a = 1.3f, b = 1.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.39f, dy1 = 1.04f)
                curveToRelative(dx1 = 0.05f, dy1 = 0.66f, dx2 = 0.7f, dy2 = 1.19f, dx3 = 1.41f, dy3 = 1.19f)
                horizontalLineTo(x = 21.0f)
                arcToRelative(a = 0.76f, b = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.75f, dy1 = 0.75f)
                verticalLineToRelative(dy = 1.45f)
                curveToRelative(dx1 = 0.0f, dy1 = 3.44f, dx2 = -2.3f, dy2 = 5.75f, dx3 = -5.75f, dy3 = 5.75f)
            }
        }.build().also { _walletMoney = it }
    }

@Suppress("ObjectPropertyName")
private var _walletMoney: ImageVector? = null
