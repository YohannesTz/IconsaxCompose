package com.github.yohannestz.iconsax_compose.iconsax.broken

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val BookSquare: ImageVector
    get() {
        val current = _bookSquare
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.BookSquare",
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
                moveTo(x = 2.0f, y = 13.02f)
                verticalLineTo(y = 15.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 5.0f, dx2 = 2.0f, dy2 = 7.0f, dx3 = 7.0f, dy3 = 7.0f)
                horizontalLineToRelative(dx = 6.0f)
                curveToRelative(dx1 = 5.0f, dy1 = 0.0f, dx2 = 7.0f, dy2 = -2.0f, dx3 = 7.0f, dy3 = -7.0f)
                verticalLineTo(y = 9.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -5.0f, dx2 = -2.0f, dy2 = -7.0f, dx3 = -7.0f, dy3 = -7.0f)
                horizontalLineTo(x = 9.0f)
                curveTo(x1 = 4.0f, y1 = 2.0f, x2 = 2.0f, y2 = 4.0f, x3 = 2.0f, y3 = 9.0f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 18.38f, y = 15.27f)
                verticalLineTo(y = 7.58f)
                arcTo(horizontalEllipseRadius = 1.25f, verticalEllipseRadius = 1.25f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 17.0f, y1 = 6.31f)
                horizontalLineToRelative(dx = -0.04f)
                arcToRelative(a = 12.0f, b = 12.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -4.51f, dy1 = 1.51f)
                lineTo(x = 12.34f, y = 7.9f)
                arcToRelative(a = 0.7f, b = 0.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.68f, dy1 = 0.0f)
                lineTo(x = 11.5f, y = 7.8f)
                arcTo(horizontalEllipseRadius = 12.0f, verticalEllipseRadius = 12.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 7.0f, y1 = 6.3f)
                arcToRelative(a = 1.26f, b = 1.26f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.38f, dy1 = 1.27f)
                verticalLineToRelative(dy = 7.7f)
                arcToRelative(a = 1.3f, b = 1.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.11f, dy1 = 1.26f)
                lineToRelative(dx = 0.18f, dy = 0.03f)
                arcToRelative(a = 16.0f, b = 16.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 4.74f, dy1 = 1.56f)
                lineToRelative(dx = 0.03f, dy = 0.01f)
                arcToRelative(a = 0.7f, b = 0.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.61f, dy1 = 0.0f)
                arcToRelative(a = 16.0f, b = 16.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 4.76f, dy1 = -1.57f)
                lineToRelative(dx = 0.21f, dy = -0.03f)
                arcToRelative(a = 1.3f, b = 1.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.12f, dy1 = -1.26f)
                moveTo(x = 12.0f, y = 8.1f)
                verticalLineToRelative(dy = 9.56f)
            }
        }.build().also { _bookSquare = it }
    }

@Suppress("ObjectPropertyName")
private var _bookSquare: ImageVector? = null
