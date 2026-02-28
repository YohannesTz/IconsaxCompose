package com.github.yohannestz.iconsax_compose.iconsax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val BitcoinConvert: ImageVector
    get() {
        val current = _bitcoinConvert
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.BitcoinConvert",
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
                moveTo(x = 23.0f, y = 15.97f)
                arcToRelative(a = 7.0f, b = 7.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -7.0f, dy1 = 7.0f)
                lineToRelative(dx = 1.05f, dy = -1.75f)
                moveTo(x = 1.0f, y = 7.97f)
                arcToRelative(a = 7.0f, b = 7.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 7.0f, dy1 = -7.0f)
                lineTo(x = 6.95f, y = 2.72f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 6.62f, y = 13.07f)
                horizontalLineToRelative(dx = 2.81f)
                arcToRelative(a = 1.17f, b = 1.17f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.13f, dy1 = 1.13f)
                curveToRelative(dx1 = 0.0f, dy1 = 0.62f, dx2 = -0.5f, dy2 = 1.13f, dx3 = -1.13f, dy3 = 1.13f)
                horizontalLineTo(x = 6.62f)
                close()
                moveToRelative(dx = 0.0f, dy = 2.26f)
                horizontalLineToRelative(dx = 3.22f)
                curveToRelative(dx1 = 0.71f, dy1 = 0.0f, dx2 = 1.29f, dy2 = 0.5f, dx3 = 1.29f, dy3 = 1.13f)
                reflectiveCurveToRelative(dx1 = -0.58f, dy1 = 1.13f, dx2 = -1.29f, dy2 = 1.13f)
                horizontalLineTo(x = 6.62f)
                close()
                moveToRelative(dx = 1.8f, dy = 2.25f)
                verticalLineToRelative(dy = 1.12f)
                moveToRelative(dx = 0.0f, dy = -6.75f)
                verticalLineToRelative(dy = 1.12f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 14.85f, y = 15.33f)
                arcToRelative(a = 6.17f, b = 6.17f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = true, dx1 = -6.17f, dy1 = -6.17f)
                lineToRelative(dx = 0.48f, dy = 0.02f)
                arcToRelative(a = 6.2f, b = 6.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 5.68f, dy1 = 5.68f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 21.5f, y = 8.67f)
                arcToRelative(a = 6.17f, b = 6.17f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -6.17f, dy1 = 6.17f)
                horizontalLineToRelative(dx = -0.49f)
                arcToRelative(a = 6.2f, b = 6.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -5.68f, dy1 = -5.68f)
                verticalLineTo(y = 8.67f)
                arcToRelative(a = 6.17f, b = 6.17f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = true, dx1 = 12.34f, dy1 = 0.0f)
            }
        }.build().also { _bitcoinConvert = it }
    }

@Suppress("ObjectPropertyName")
private var _bitcoinConvert: ImageVector? = null
