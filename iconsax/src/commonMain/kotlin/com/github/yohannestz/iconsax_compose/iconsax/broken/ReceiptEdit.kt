package com.github.yohannestz.iconsax_compose.iconsax.broken

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ReceiptEdit: ImageVector
    get() {
        val current = _receiptEdit
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.ReceiptEdit",
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
                moveTo(x = 3.5f, y = 11.0f)
                verticalLineToRelative(dy = 7.3f)
                curveToRelative(dx1 = 0.0f, dy1 = 2.66f, dx2 = 1.46f, dy2 = 3.29f, dx3 = 3.23f, dy3 = 1.39f)
                lineToRelative(dx = 0.01f, dy = -0.01f)
                arcToRelative(a = 1.76f, b = 1.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 2.78f, dy1 = 0.15f)
                lineToRelative(dx = 1.01f, dy = 1.35f)
                moveToRelative(dx = 9.97f, dy = -9.88f)
                verticalLineTo(y = 7.04f)
                curveTo(x1 = 20.5f, y1 = 3.01f, x2 = 19.56f, y2 = 2.0f, x3 = 15.78f, y3 = 2.0f)
                horizontalLineTo(x = 8.22f)
                curveTo(x1 = 4.44f, y1 = 2.0f, x2 = 3.5f, y2 = 3.01f, x3 = 3.5f, y3 = 7.04f)
                moveTo(x = 8.0f, y = 7.0f)
                horizontalLineToRelative(dx = 4.5f)
                moveTo(x = 15.0f, y = 7.0f)
                horizontalLineToRelative(dx = 2.0f)
                moveToRelative(dx = -8.0f, dy = 4.0f)
                horizontalLineToRelative(dx = 6.0f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 18.21f, y = 14.77f)
                lineToRelative(dx = -3.54f, dy = 3.54f)
                arcToRelative(a = 1.2f, b = 1.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.3f, dy1 = 0.59f)
                lineToRelative(dx = -0.19f, dy = 1.35f)
                curveToRelative(dx1 = -0.07f, dy1 = 0.49f, dx2 = 0.27f, dy2 = 0.83f, dx3 = 0.76f, dy3 = 0.76f)
                lineToRelative(dx = 1.35f, dy = -0.2f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.6f, dy1 = -0.3f)
                lineToRelative(dx = 3.53f, dy = -3.53f)
                curveToRelative(dx1 = 0.61f, dy1 = -0.61f, dx2 = 0.9f, dy2 = -1.32f, dx3 = 0.0f, dy3 = -2.22f)
                curveToRelative(dx1 = -0.89f, dy1 = -0.9f, dx2 = -1.6f, dy2 = -0.6f, dx3 = -2.2f, dy3 = 0.0f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 17.7f, y = 15.28f)
                arcToRelative(a = 3.2f, b = 3.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 2.22f, dy1 = 2.22f)
            }
        }.build().also { _receiptEdit = it }
    }

@Suppress("ObjectPropertyName")
private var _receiptEdit: ImageVector? = null
