package com.github.yohannestz.iconsax_compose.iconsax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val WalletThree: ImageVector
    get() {
        val current = _walletThree
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.WalletThree",
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
                moveTo(x = 13.0f, y = 11.15f)
                horizontalLineTo(x = 7.0f)
                moveToRelative(dx = -5.0f, dy = 0.0f)
                verticalLineTo(y = 6.53f)
                arcToRelative(a = 3.7f, b = 3.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 3.69f, dy1 = -3.69f)
                horizontalLineToRelative(dx = 5.62f)
                curveToRelative(dx1 = 2.04f, dy1 = 0.0f, dx2 = 3.69f, dy2 = 1.27f, dx3 = 3.69f, dy3 = 3.31f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 17.48f, y = 12.2f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.54f, dy1 = 1.98f)
                curveToRelative(dx1 = 0.25f, dy1 = 0.93f, dx2 = 1.17f, dy2 = 1.52f, dx3 = 2.13f, dy3 = 1.52f)
                horizontalLineTo(x = 20.0f)
                verticalLineToRelative(dy = 1.45f)
                arcToRelative(a = 4.0f, b = 4.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -4.0f, dy1 = 4.0f)
                horizontalLineTo(x = 6.0f)
                arcToRelative(a = 4.0f, b = 4.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -4.0f, dy1 = -4.0f)
                verticalLineToRelative(dy = -7.0f)
                arcToRelative(a = 4.0f, b = 4.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 4.0f, dy1 = -4.0f)
                horizontalLineToRelative(dx = 10.0f)
                curveToRelative(dx1 = 2.2f, dy1 = 0.0f, dx2 = 4.0f, dy2 = 1.8f, dx3 = 4.0f, dy3 = 4.0f)
                verticalLineToRelative(dy = 1.45f)
                horizontalLineToRelative(dx = -1.08f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.44f, dy1 = 0.6f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 22.0f, y = 12.62f)
                verticalLineToRelative(dy = 2.06f)
                arcToRelative(a = 1.03f, b = 1.03f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.03f, dy1 = 1.02f)
                horizontalLineToRelative(dx = -1.93f)
                curveToRelative(dx1 = -1.08f, dy1 = 0.0f, dx2 = -2.07f, dy2 = -0.79f, dx3 = -2.16f, dy3 = -1.87f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.6f, dy1 = -1.63f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.44f, dy1 = -0.6f)
                horizontalLineToRelative(dx = 2.05f)
                arcTo(horizontalEllipseRadius = 1.03f, verticalEllipseRadius = 1.03f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 22.0f, y1 = 12.62f)
            }
        }.build().also { _walletThree = it }
    }

@Suppress("ObjectPropertyName")
private var _walletThree: ImageVector? = null
