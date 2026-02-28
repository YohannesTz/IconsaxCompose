package com.github.yohannestz.iconsax_compose.iconsax.broken

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ShopRemove: ImageVector
    get() {
        val current = _shopRemove
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.ShopRemove",
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
                moveTo(x = 20.21f, y = 19.67f)
                curveTo(x1 = 19.29f, y1 = 21.3f, x2 = 17.54f, y2 = 22.0f, x3 = 14.72f, y3 = 22.0f)
                horizontalLineTo(x = 9.33f)
                quadToRelative(dx1 = -0.87f, dy1 = 0.0f, dx2 = -1.6f, dy2 = -0.1f)
                moveToRelative(dx = 13.28f, dy = -10.68f)
                verticalLineToRelative(dy = 4.49f)
                moveTo(x = 3.04f, y = 15.5f)
                verticalLineToRelative(dy = -4.3f)
                moveTo(x = 12.03f, y = 12.0f)
                arcToRelative(a = 2.96f, b = 2.96f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 3.0f, dy1 = -3.32f)
                lineTo(x = 14.36f, y = 2.0f)
                horizontalLineTo(x = 9.69f)
                lineTo(x = 9.02f, y = 8.68f)
                arcTo(horizontalEllipseRadius = 2.97f, verticalEllipseRadius = 2.97f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 12.03f, y1 = 12.0f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 18.33f, y = 12.0f)
                curveToRelative(dx1 = 2.02f, dy1 = 0.0f, dx2 = 3.5f, dy2 = -1.64f, dx3 = 3.3f, dy3 = -3.65f)
                lineTo(x = 21.35f, y = 5.6f)
                curveTo(x1 = 20.99f, y1 = 3.0f, x2 = 19.99f, y2 = 2.0f, x3 = 17.37f, y3 = 2.0f)
                horizontalLineToRelative(dx = -3.05f)
                lineToRelative(dx = 0.7f, dy = 7.01f)
                arcTo(horizontalEllipseRadius = 3.4f, verticalEllipseRadius = 3.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 18.33f, y1 = 12.0f)
                moveTo(x = 2.64f, y = 5.6f)
                lineTo(x = 2.36f, y = 8.35f)
                arcTo(horizontalEllipseRadius = 3.26f, verticalEllipseRadius = 3.26f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 5.66f, y1 = 12.0f)
                arcToRelative(a = 3.4f, b = 3.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 3.3f, dy1 = -2.99f)
                lineTo(x = 9.18f, y = 6.8f)
                lineTo(x = 9.66f, y = 2.0f)
                horizontalLineTo(x = 6.61f)
                arcToRelative(a = 5.0f, b = 5.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -2.19f, dy1 = 0.39f)
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
                arcToRelative(a = 3.94f, b = 3.94f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -5.66f, dy1 = -0.41f)
                lineTo(x = 1.9f, y = 21.51f)
                arcTo(horizontalEllipseRadius = 3.92f, verticalEllipseRadius = 3.92f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 1.0f, y1 = 19.0f)
                arcToRelative(a = 3.97f, b = 3.97f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 4.0f, dy1 = -4.0f)
                arcToRelative(a = 4.0f, b = 4.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 2.93f, dy1 = 1.28f)
                arcTo(horizontalEllipseRadius = 4.0f, verticalEllipseRadius = 4.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 9.0f, y1 = 19.0f)
                moveToRelative(dx = -2.51f, dy = -0.02f)
                horizontalLineTo(x = 3.51f)
            }
        }.build().also { _shopRemove = it }
    }

@Suppress("ObjectPropertyName")
private var _shopRemove: ImageVector? = null
