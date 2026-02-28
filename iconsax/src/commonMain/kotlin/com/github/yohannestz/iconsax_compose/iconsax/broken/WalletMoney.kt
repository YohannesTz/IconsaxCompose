package com.github.yohannestz.iconsax_compose.iconsax.broken

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
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
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 10.75f, y = 16.86f)
                verticalLineToRelative(dy = 2.03f)
                curveToRelative(dx1 = 0.0f, dy1 = 1.72f, dx2 = -1.6f, dy2 = 3.11f, dx3 = -3.57f, dy3 = 3.11f)
                reflectiveCurveTo(x1 = 3.6f, y1 = 20.61f, x2 = 3.6f, y2 = 18.89f)
                verticalLineToRelative(dy = -2.03f)
                curveToRelative(dx1 = 0.0f, dy1 = 1.72f, dx2 = 1.6f, dy2 = 2.94f, dx3 = 3.58f, dy3 = 2.94f)
                curveToRelative(dx1 = 1.97f, dy1 = 0.0f, dx2 = 3.57f, dy2 = -1.23f, dx3 = 3.57f, dy3 = -2.94f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 10.75f, y = 14.11f)
                quadToRelative(dx1 = -0.01f, dy1 = 0.75f, dx2 = -0.38f, dy2 = 1.36f)
                curveToRelative(dx1 = -0.59f, dy1 = 0.97f, dx2 = -1.8f, dy2 = 1.58f, dx3 = -3.2f, dy3 = 1.58f)
                arcToRelative(a = 3.7f, b = 3.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -3.2f, dy1 = -1.58f)
                arcToRelative(a = 2.6f, b = 2.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.38f, dy1 = -1.36f)
                arcToRelative(a = 3.0f, b = 3.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.04f, dy1 = -2.19f)
                arcToRelative(a = 3.8f, b = 3.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 2.53f, dy1 = -0.9f)
                arcToRelative(a = 4.0f, b = 4.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 2.53f, dy1 = 0.9f)
                arcToRelative(a = 2.8f, b = 2.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.06f, dy1 = 2.2f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 10.75f, y = 14.11f)
                verticalLineToRelative(dy = 2.75f)
                curveToRelative(dx1 = 0.0f, dy1 = 1.72f, dx2 = -1.6f, dy2 = 2.94f, dx3 = -3.57f, dy3 = 2.94f)
                reflectiveCurveTo(x1 = 3.6f, y1 = 18.57f, x2 = 3.6f, y2 = 16.86f)
                verticalLineToRelative(dy = -2.75f)
                curveTo(x1 = 3.6f, y1 = 12.39f, x2 = 5.2f, y2 = 11.0f, x3 = 7.18f, y3 = 11.0f)
                arcToRelative(a = 4.0f, b = 4.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 2.53f, dy1 = 0.91f)
                arcToRelative(a = 3.0f, b = 3.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.04f, dy1 = 2.2f)
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
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 16.0f, y = 3.5f)
                arcToRelative(a = 5.0f, b = 5.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.75f, dy1 = 0.05f)
                curveTo(x1 = 19.33f, y1 = 3.85f, x2 = 21.0f, y2 = 5.76f, x3 = 21.0f, y3 = 8.5f)
                verticalLineToRelative(dy = 1.45f)
                horizontalLineToRelative(dx = -2.08f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.44f, dy1 = 0.6f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.6f, dy1 = 1.63f)
                curveToRelative(dx1 = 0.09f, dy1 = 1.08f, dx2 = 1.08f, dy2 = 1.87f, dx3 = 2.16f, dy3 = 1.87f)
                horizontalLineTo(x = 21.0f)
                verticalLineToRelative(dy = 1.45f)
                curveToRelative(dx1 = 0.0f, dy1 = 3.0f, dx2 = -2.0f, dy2 = 5.0f, dx3 = -5.0f, dy3 = 5.0f)
                horizontalLineToRelative(dx = -2.5f)
                moveTo(x = 2.0f, y = 10.5f)
                verticalLineToRelative(dy = -2.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -2.72f, dx2 = 1.64f, dy2 = -4.62f, dx3 = 4.19f, dy3 = -4.94f)
                arcTo(horizontalEllipseRadius = 5.0f, verticalEllipseRadius = 5.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 7.0f, y1 = 3.5f)
                horizontalLineToRelative(dx = 5.0f)
            }
        }.build().also { _walletMoney = it }
    }

@Suppress("ObjectPropertyName")
private var _walletMoney: ImageVector? = null
