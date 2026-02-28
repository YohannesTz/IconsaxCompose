package com.github.yohannestz.iconsax_compose.iconsax.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val WalletSearch: ImageVector
    get() {
        val current = _walletSearch
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.WalletSearch",
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
                moveTo(x = 12.0f, y = 22.0f)
                horizontalLineToRelative(dx = 5.0f)
                curveToRelative(dx1 = 3.0f, dy1 = 0.0f, dx2 = 5.0f, dy2 = -2.0f, dx3 = 5.0f, dy3 = -5.0f)
                verticalLineToRelative(dy = -5.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -2.7f, dx2 = -1.7f, dy2 = -4.7f, dx3 = -4.2f, dy3 = -5.0f)
                horizontalLineTo(x = 7.0f)
                curveTo(x1 = 6.7f, y1 = 7.0f, x2 = 6.5f, y2 = 7.0f, x3 = 6.2f, y3 = 7.1f)
                curveTo(x1 = 3.6f, y1 = 7.4f, x2 = 2.0f, y2 = 9.3f, x3 = 2.0f, y3 = 12.0f)
                verticalLineToRelative(dy = 1.0f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 17.8f, y = 7.0f)
                horizontalLineTo(x = 7.0f)
                curveTo(x1 = 6.7f, y1 = 7.0f, x2 = 6.5f, y2 = 7.0f, x3 = 6.2f, y3 = 7.1f)
                curveToRelative(dx1 = 0.1f, dy1 = -0.3f, dx2 = 0.3f, dy2 = -0.5f, dx3 = 0.6f, dy3 = -0.8f)
                lineTo(x = 10.0f, y = 3.0f)
                arcToRelative(a = 3.5f, b = 3.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 5.0f, dy1 = 0.0f)
                lineToRelative(dx = 1.8f, dy = 1.8f)
                curveToRelative(dx1 = 0.6f, dy1 = 0.6f, dx2 = 0.9f, dy2 = 1.4f, dx3 = 1.0f, dy3 = 2.2f)
                moveToRelative(dx = 4.2f, dy = 5.5f)
                horizontalLineToRelative(dx = -3.0f)
                curveToRelative(dx1 = -1.1f, dy1 = 0.0f, dx2 = -2.0f, dy2 = 0.9f, dx3 = -2.0f, dy3 = 2.0f)
                reflectiveCurveToRelative(dx1 = 0.9f, dy1 = 2.0f, dx2 = 2.0f, dy2 = 2.0f)
                horizontalLineToRelative(dx = 3.0f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 5.8f, y = 21.4f)
                arcToRelative(a = 3.2f, b = 3.2f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = 0.0f, dy1 = -6.4f)
                arcToRelative(a = 3.2f, b = 3.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 6.4f)
                moveTo(x = 2.0f, y = 22.0f)
                lineToRelative(dx = 1.0f, dy = -1.0f)
            }
        }.build().also { _walletSearch = it }
    }

@Suppress("ObjectPropertyName")
private var _walletSearch: ImageVector? = null
