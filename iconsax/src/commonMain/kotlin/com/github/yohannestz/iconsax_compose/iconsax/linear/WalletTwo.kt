package com.github.yohannestz.iconsax_compose.iconsax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
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
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 13.0f, y = 9.0f)
                horizontalLineTo(x = 7.0f)
                moveToRelative(dx = 15.0f, dy = 1.97f)
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
                moveTo(x = 17.48f, y = 10.55f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.6f, dy1 = 1.63f)
                curveToRelative(dx1 = 0.09f, dy1 = 1.08f, dx2 = 1.08f, dy2 = 1.87f, dx3 = 2.16f, dy3 = 1.87f)
                horizontalLineTo(x = 21.0f)
                verticalLineToRelative(dy = 1.45f)
                curveToRelative(dx1 = 0.0f, dy1 = 3.0f, dx2 = -2.0f, dy2 = 5.0f, dx3 = -5.0f, dy3 = 5.0f)
                horizontalLineTo(x = 7.0f)
                curveToRelative(dx1 = -3.0f, dy1 = 0.0f, dx2 = -5.0f, dy2 = -2.0f, dx3 = -5.0f, dy3 = -5.0f)
                verticalLineToRelative(dy = -7.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -2.72f, dx2 = 1.64f, dy2 = -4.62f, dx3 = 4.19f, dy3 = -4.94f)
                arcTo(horizontalEllipseRadius = 5.0f, verticalEllipseRadius = 5.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 7.0f, y1 = 3.5f)
                horizontalLineToRelative(dx = 9.0f)
                arcToRelative(a = 5.0f, b = 5.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.75f, dy1 = 0.05f)
                curveTo(x1 = 19.33f, y1 = 3.85f, x2 = 21.0f, y2 = 5.76f, x3 = 21.0f, y3 = 8.5f)
                verticalLineToRelative(dy = 1.45f)
                horizontalLineToRelative(dx = -2.08f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.44f, dy1 = 0.6f)
            }
        }.build().also { _walletTwo = it }
    }

@Suppress("ObjectPropertyName")
private var _walletTwo: ImageVector? = null
