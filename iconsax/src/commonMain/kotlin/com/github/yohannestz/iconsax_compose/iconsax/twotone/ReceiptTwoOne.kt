package com.github.yohannestz.iconsax_compose.iconsax.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ReceiptTwoOne: ImageVector
    get() {
        val current = _receiptTwoOne
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.ReceiptTwoOne",
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
                moveTo(x = 6.73f, y = 19.7f)
                arcToRelative(a = 1.76f, b = 1.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 2.79f, dy1 = 0.15f)
                lineToRelative(dx = 1.01f, dy = 1.35f)
                curveToRelative(dx1 = 0.81f, dy1 = 1.07f, dx2 = 2.12f, dy2 = 1.07f, dx3 = 2.93f, dy3 = 0.0f)
                lineToRelative(dx = 1.01f, dy = -1.35f)
                arcToRelative(a = 1.76f, b = 1.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 2.79f, dy1 = -0.15f)
                curveToRelative(dx1 = 1.78f, dy1 = 1.9f, dx2 = 3.23f, dy2 = 1.27f, dx3 = 3.23f, dy3 = -1.39f)
                verticalLineTo(y = 7.04f)
                curveTo(x1 = 20.5f, y1 = 3.01f, x2 = 19.56f, y2 = 2.0f, x3 = 15.78f, y3 = 2.0f)
                horizontalLineTo(x = 8.22f)
                curveTo(x1 = 4.44f, y1 = 2.0f, x2 = 3.5f, y2 = 3.01f, x3 = 3.5f, y3 = 7.04f)
                verticalLineTo(y = 18.3f)
                curveToRelative(dx1 = 0.0f, dy1 = 2.67f, dx2 = 1.46f, dy2 = 3.29f, dx3 = 3.23f, dy3 = 1.4f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                moveTo(x = 8.1f, y = 11.0f)
                close()
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 10.9f, y = 11.0f)
                horizontalLineToRelative(dx = 5.5f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                moveTo(x = 8.1f, y = 7.0f)
                close()
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 10.9f, y = 7.0f)
                horizontalLineToRelative(dx = 5.5f)
            }
        }.build().also { _receiptTwoOne = it }
    }

@Suppress("ObjectPropertyName")
private var _receiptTwoOne: ImageVector? = null
