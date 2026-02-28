package com.github.yohannestz.iconsax_compose.iconsax.broken

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val BitcoinRefresh: ImageVector
    get() {
        val current = _bitcoinRefresh
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.BitcoinRefresh",
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
                moveTo(x = 4.47f, y = 11.42f)
                lineTo(x = 2.73f, y = 9.68f)
                lineTo(x = 1.0f, y = 11.42f)
                moveToRelative(dx = 18.53f, dy = 1.16f)
                lineToRelative(dx = 1.74f, dy = 1.74f)
                lineToRelative(dx = 1.74f, dy = -1.74f)
                moveTo(x = 12.0f, y = 2.74f)
                arcTo(horizontalEllipseRadius = 9.3f, verticalEllipseRadius = 9.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 4.77f, y1 = 6.2f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 21.26f, y = 14.32f)
                verticalLineTo(y = 12.0f)
                arcTo(horizontalEllipseRadius = 9.3f, verticalEllipseRadius = 9.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 16.0f, y1 = 3.64f)
                moveToRelative(dx = -4.0f, dy = 17.62f)
                arcToRelative(a = 9.3f, b = 9.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 7.23f, dy1 = -3.47f)
                moveTo(x = 2.74f, y = 9.68f)
                verticalLineTo(y = 12.0f)
                arcToRelative(a = 9.3f, b = 9.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 5.19f, dy1 = 8.32f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 9.0f, y = 8.5f)
                horizontalLineToRelative(dx = 4.38f)
                arcToRelative(a = 1.8f, b = 1.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.75f, dy1 = 1.75f)
                arcTo(horizontalEllipseRadius = 1.75f, verticalEllipseRadius = 1.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 13.38f, y1 = 12.0f)
                horizontalLineTo(x = 9.0f)
                close()
                moveTo(x = 9.0f, y = 12.0f)
                horizontalLineToRelative(dx = 5.0f)
                curveToRelative(dx1 = 1.1f, dy1 = 0.0f, dx2 = 2.0f, dy2 = 0.78f, dx3 = 2.0f, dy3 = 1.75f)
                reflectiveCurveToRelative(dx1 = -0.9f, dy1 = 1.75f, dx2 = -2.0f, dy2 = 1.75f)
                horizontalLineTo(x = 9.0f)
                close()
                moveToRelative(dx = 2.8f, dy = 3.5f)
                verticalLineToRelative(dy = 1.75f)
                moveToRelative(dx = 0.0f, dy = -10.5f)
                verticalLineTo(y = 8.5f)
            }
        }.build().also { _bitcoinRefresh = it }
    }

@Suppress("ObjectPropertyName")
private var _bitcoinRefresh: ImageVector? = null
