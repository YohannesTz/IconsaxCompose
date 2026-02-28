package com.github.yohannestz.iconsax_compose.iconsax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val WalletRemove: ImageVector
    get() {
        val current = _walletRemove
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.WalletRemove",
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
                moveTo(x = 22.0f, y = 12.0f)
                verticalLineToRelative(dy = 5.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 3.0f, dx2 = -2.0f, dy2 = 5.0f, dx3 = -5.0f, dy3 = 5.0f)
                horizontalLineTo(x = 7.63f)
                arcTo(horizontalEllipseRadius = 3.92f, verticalEllipseRadius = 3.92f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 9.0f, y1 = 19.0f)
                arcToRelative(a = 4.0f, b = 4.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -7.0f, dy1 = -2.64f)
                verticalLineTo(y = 12.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -2.72f, dx2 = 1.64f, dy2 = -4.62f, dx3 = 4.19f, dy3 = -4.94f)
                arcTo(horizontalEllipseRadius = 5.0f, verticalEllipseRadius = 5.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 7.0f, y1 = 7.0f)
                horizontalLineToRelative(dx = 10.0f)
                arcToRelative(a = 5.0f, b = 5.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.75f, dy1 = 0.05f)
                curveTo(x1 = 20.33f, y1 = 7.35f, x2 = 22.0f, y2 = 9.26f, x3 = 22.0f, y3 = 12.0f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
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
                moveTo(x = 22.0f, y = 12.5f)
                horizontalLineToRelative(dx = -3.0f)
                curveToRelative(dx1 = -1.1f, dy1 = 0.0f, dx2 = -2.0f, dy2 = 0.9f, dx3 = -2.0f, dy3 = 2.0f)
                reflectiveCurveToRelative(dx1 = 0.9f, dy1 = 2.0f, dx2 = 2.0f, dy2 = 2.0f)
                horizontalLineToRelative(dx = 3.0f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 9.0f, y = 19.0f)
                arcToRelative(a = 4.0f, b = 4.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.37f, dy1 = 3.0f)
                arcTo(horizontalEllipseRadius = 4.0f, verticalEllipseRadius = 4.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 5.0f, y1 = 23.0f)
                arcToRelative(a = 4.0f, b = 4.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -3.42f, dy1 = -1.94f)
                arcTo(horizontalEllipseRadius = 4.0f, verticalEllipseRadius = 4.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 1.0f, y1 = 19.0f)
                arcToRelative(a = 4.0f, b = 4.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.0f, dy1 = -2.64f)
                arcTo(horizontalEllipseRadius = 3.98f, verticalEllipseRadius = 3.98f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 9.0f, y1 = 19.0f)
                moveToRelative(dx = -2.93f, dy = 1.04f)
                lineToRelative(dx = -2.1f, dy = -2.11f)
                moveToRelative(dx = 2.07f, dy = 0.03f)
                lineToRelative(dx = -2.11f, dy = 2.11f)
            }
        }.build().also { _walletRemove = it }
    }

@Suppress("ObjectPropertyName")
private var _walletRemove: ImageVector? = null
