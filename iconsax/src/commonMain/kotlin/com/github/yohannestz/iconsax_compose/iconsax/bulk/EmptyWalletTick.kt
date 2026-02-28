package com.github.yohannestz.iconsax_compose.iconsax.bulk

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val EmptyWalletTick: ImageVector
    get() {
        val current = _emptyWalletTick
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.EmptyWalletTick",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 5.0f, y = 15.0f)
                arcToRelative(a = 4.0f, b = 4.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -2.5f, dy1 = 0.88f)
                arcTo(horizontalEllipseRadius = 4.0f, verticalEllipseRadius = 4.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 1.0f, y1 = 19.0f)
                arcToRelative(a = 4.0f, b = 4.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.58f, dy1 = 2.06f)
                arcTo(horizontalEllipseRadius = 4.0f, verticalEllipseRadius = 4.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 5.0f, y1 = 23.0f)
                arcToRelative(a = 4.0f, b = 4.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 2.63f, dy1 = -1.0f)
                arcTo(horizontalEllipseRadius = 3.92f, verticalEllipseRadius = 3.92f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 9.0f, y1 = 19.0f)
                arcToRelative(a = 4.0f, b = 4.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -4.0f, dy1 = -4.0f)
                moveToRelative(dx = 2.07f, dy = 3.57f)
                lineToRelative(dx = -2.13f, dy = 1.97f)
                arcToRelative(a = 0.8f, b = 0.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.51f, dy1 = 0.2f)
                arcToRelative(a = 0.7f, b = 0.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.53f, dy1 = -0.22f)
                lineToRelative(dx = -0.99f, dy = -0.99f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = -1.06f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.06f, dy1 = 0.0f)
                lineToRelative(dx = 0.48f, dy = 0.48f)
                lineToRelative(dx = 1.6f, dy = -1.48f)
                curveToRelative(dx1 = 0.3f, dy1 = -0.28f, dx2 = 0.78f, dy2 = -0.26f, dx3 = 1.06f, dy3 = 0.04f)
                reflectiveCurveToRelative(dx1 = 0.26f, dy1 = 0.78f, dx2 = -0.04f, dy2 = 1.06f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
                fillAlpha = 0.4f,
                strokeAlpha = 0.4f,
            ) {
                moveTo(x = 19.48f, y = 12.95f)
                horizontalLineToRelative(dx = 2.02f)
                verticalLineToRelative(dy = -1.44f)
                arcToRelative(a = 3.77f, b = 3.77f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -3.76f, dy1 = -3.76f)
                horizontalLineTo(x = 6.26f)
                arcToRelative(a = 3.77f, b = 3.77f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -3.76f, dy1 = 3.76f)
                verticalLineToRelative(dy = 4.37f)
                arcTo(horizontalEllipseRadius = 4.0f, verticalEllipseRadius = 4.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 9.0f, y1 = 19.0f)
                arcToRelative(a = 4.0f, b = 4.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.37f, dy1 = 3.0f)
                horizontalLineToRelative(dx = 10.11f)
                arcToRelative(a = 3.77f, b = 3.77f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 3.76f, dy1 = -3.76f)
                verticalLineToRelative(dy = -1.19f)
                horizontalLineToRelative(dx = -1.9f)
                curveToRelative(dx1 = -1.08f, dy1 = 0.0f, dx2 = -2.07f, dy2 = -0.79f, dx3 = -2.16f, dy3 = -1.87f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.6f, dy1 = -1.63f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.44f, dy1 = -0.6f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 14.85f, y = 3.95f)
                verticalLineToRelative(dy = 3.8f)
                horizontalLineTo(x = 6.26f)
                arcToRelative(a = 3.77f, b = 3.77f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -3.76f, dy1 = 3.76f)
                verticalLineTo(y = 7.84f)
                arcToRelative(a = 2.85f, b = 2.85f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.84f, dy1 = -2.67f)
                lineToRelative(dx = 7.94f, dy = -3.0f)
                arcToRelative(a = 1.9f, b = 1.9f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 2.57f, dy1 = 1.78f)
                moveToRelative(dx = 7.7f, dy = 10.02f)
                verticalLineToRelative(dy = 2.06f)
                curveToRelative(dx1 = 0.0f, dy1 = 0.55f, dx2 = -0.43f, dy2 = 1.0f, dx3 = -1.0f, dy3 = 1.02f)
                horizontalLineTo(x = 19.6f)
                curveToRelative(dx1 = -1.08f, dy1 = 0.0f, dx2 = -2.07f, dy2 = -0.79f, dx3 = -2.16f, dy3 = -1.87f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.6f, dy1 = -1.63f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.44f, dy1 = -0.6f)
                horizontalLineToRelative(dx = 2.08f)
                arcToRelative(a = 1.03f, b = 1.03f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.0f, dy1 = 1.02f)
                moveTo(x = 14.0f, y = 12.75f)
                horizontalLineTo(x = 7.0f)
                curveToRelative(dx1 = -0.41f, dy1 = 0.0f, dx2 = -0.75f, dy2 = -0.34f, dx3 = -0.75f, dy3 = -0.75f)
                reflectiveCurveTo(x1 = 6.59f, y1 = 11.25f, x2 = 7.0f, y2 = 11.25f)
                horizontalLineToRelative(dx = 7.0f)
                curveToRelative(dx1 = 0.41f, dy1 = 0.0f, dx2 = 0.75f, dy2 = 0.34f, dx3 = 0.75f, dy3 = 0.75f)
                reflectiveCurveToRelative(dx1 = -0.34f, dy1 = 0.75f, dx2 = -0.75f, dy2 = 0.75f)
            }
        }.build().also { _emptyWalletTick = it }
    }

@Suppress("ObjectPropertyName")
private var _emptyWalletTick: ImageVector? = null
