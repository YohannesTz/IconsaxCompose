package com.github.yohannestz.iconsax_compose.iconsax.broken

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ReceiptDiscount: ImageVector
    get() {
        val current = _receiptDiscount
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.ReceiptDiscount",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 22.0f, y = 6.0f)
                verticalLineToRelative(dy = 2.42f)
                curveTo(x1 = 22.0f, y1 = 10.0f, x2 = 21.0f, y2 = 11.0f, x3 = 19.42f, y3 = 11.0f)
                horizontalLineTo(x = 16.0f)
                verticalLineTo(y = 4.01f)
                arcTo(horizontalEllipseRadius = 2.0f, verticalEllipseRadius = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 18.02f, y1 = 2.0f)
                arcTo(horizontalEllipseRadius = 4.0f, verticalEllipseRadius = 4.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 22.0f, y1 = 6.0f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 10.97f, y = 9.03f)
                lineToRelative(dx = 0.76f, dy = -0.76f)
                moveToRelative(dx = -5.46f, dy = 5.46f)
                lineToRelative(dx = 2.22f, dy = -2.22f)
                lineTo(x = 9.0f, y = 11.0f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 2.0f, y = 11.0f)
                verticalLineToRelative(dy = 10.0f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.6f, dy1 = 0.8f)
                lineToRelative(dx = 1.71f, dy = -1.28f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.32f, dy1 = 0.1f)
                lineToRelative(dx = 1.66f, dy = 1.67f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.42f, dy1 = 0.0f)
                lineToRelative(dx = 1.68f, dy = -1.68f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.3f, dy1 = -0.09f)
                lineToRelative(dx = 1.71f, dy = 1.28f)
                arcTo(horizontalEllipseRadius = 1.0f, verticalEllipseRadius = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 16.0f, y1 = 21.0f)
                verticalLineTo(y = 4.0f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 2.0f, dy1 = -2.0f)
                horizontalLineTo(x = 6.0f)
                curveTo(x1 = 3.0f, y1 = 2.0f, x2 = 2.0f, y2 = 3.79f, x3 = 2.0f, y3 = 6.0f)
                verticalLineToRelative(dy = 1.0f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                moveTo(x = 11.92f, y = 13.5f)
                horizontalLineToRelative(dx = 0.01f)
                moveToRelative(dx = -5.74f, dy = -5.0f)
                horizontalLineTo(x = 6.2f)
            }
        }.build().also { _receiptDiscount = it }
    }

@Suppress("ObjectPropertyName")
private var _receiptDiscount: ImageVector? = null
