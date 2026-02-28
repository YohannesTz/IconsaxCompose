package com.github.yohannestz.iconsax_compose.iconsax.broken

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val EmptyWallet: ImageVector
    get() {
        val current = _emptyWallet
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.EmptyWallet",
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
                moveTo(x = 2.5f, y = 14.07f)
                verticalLineToRelative(dy = -2.56f)
                arcToRelative(a = 3.77f, b = 3.77f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 3.76f, dy1 = -3.76f)
                horizontalLineToRelative(dx = 11.48f)
                arcToRelative(a = 3.77f, b = 3.77f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 3.76f, dy1 = 3.76f)
                verticalLineToRelative(dy = 1.44f)
                horizontalLineToRelative(dx = -2.02f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.44f, dy1 = 0.6f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.6f, dy1 = 1.63f)
                curveToRelative(dx1 = 0.09f, dy1 = 1.08f, dx2 = 1.08f, dy2 = 1.87f, dx3 = 2.16f, dy3 = 1.87f)
                horizontalLineToRelative(dx = 1.9f)
                verticalLineToRelative(dy = 1.19f)
                arcTo(horizontalEllipseRadius = 3.77f, verticalEllipseRadius = 3.77f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 17.74f, y1 = 22.0f)
                horizontalLineTo(x = 6.26f)
                arcToRelative(a = 3.77f, b = 3.77f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -3.76f, dy1 = -3.76f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 12.28f, y = 2.17f)
                arcToRelative(a = 1.9f, b = 1.9f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 2.57f, dy1 = 1.78f)
                verticalLineToRelative(dy = 3.8f)
                moveTo(x = 2.5f, y = 12.41f)
                verticalLineTo(y = 7.84f)
                arcToRelative(a = 2.85f, b = 2.85f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.84f, dy1 = -2.67f)
                lineToRelative(dx = 3.97f, dy = -1.5f)
                moveToRelative(dx = 14.25f, dy = 10.3f)
                verticalLineToRelative(dy = 2.06f)
                curveToRelative(dx1 = 0.0f, dy1 = 0.55f, dx2 = -0.44f, dy2 = 1.0f, dx3 = -1.0f, dy3 = 1.02f)
                horizontalLineTo(x = 19.6f)
                curveToRelative(dx1 = -1.08f, dy1 = 0.0f, dx2 = -2.07f, dy2 = -0.79f, dx3 = -2.16f, dy3 = -1.87f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.6f, dy1 = -1.63f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.44f, dy1 = -0.6f)
                horizontalLineToRelative(dx = 2.08f)
                arcToRelative(a = 1.03f, b = 1.03f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.0f, dy1 = 1.02f)
                moveTo(x = 7.0f, y = 12.0f)
                horizontalLineToRelative(dx = 7.0f)
            }
        }.build().also { _emptyWallet = it }
    }

@Suppress("ObjectPropertyName")
private var _emptyWallet: ImageVector? = null
