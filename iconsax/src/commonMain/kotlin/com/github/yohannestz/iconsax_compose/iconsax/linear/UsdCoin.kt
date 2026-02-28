package com.github.yohannestz.iconsax_compose.iconsax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val UsdCoin: ImageVector
    get() {
        val current = _usdCoin
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.UsdCoin",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF17191C)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 16.9f, y = 16.9f)
                curveToRelative(dx1 = 2.7f, dy1 = -2.7f, dx2 = 2.7f, dy2 = -7.2f, dx3 = 0.0f, dy3 = -9.9f)
                moveTo(x = 7.1f, y = 7.1f)
                arcToRelative(a = 7.06f, b = 7.06f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 9.9f)
            }
            path(
                stroke = SolidColor(Color(0xFF17191C)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 9.7f, y = 13.6f)
                curveToRelative(dx1 = 0.0f, dy1 = 0.9f, dx2 = 0.7f, dy2 = 1.6f, dx3 = 1.6f, dy3 = 1.6f)
                horizontalLineTo(x = 13.0f)
                curveToRelative(dx1 = 0.7f, dy1 = 0.0f, dx2 = 1.4f, dy2 = -0.6f, dx3 = 1.4f, dy3 = -1.4f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.9f, dx2 = -0.4f, dy2 = -1.2f, dx3 = -0.9f, dy3 = -1.4f)
                lineToRelative(dx = -2.8f, dy = -1.0f)
                curveToRelative(dx1 = -0.7f, dy1 = -0.1f, dx2 = -1.0f, dy2 = -0.4f, dx3 = -1.0f, dy3 = -1.2f)
                reflectiveCurveToRelative(dx1 = 0.6f, dy1 = -1.4f, dx2 = 1.4f, dy2 = -1.4f)
                horizontalLineToRelative(dx = 1.8f)
                curveToRelative(dx1 = 0.9f, dy1 = 0.0f, dx2 = 1.6f, dy2 = 0.7f, dx3 = 1.6f, dy3 = 1.6f)
                moveTo(x = 12.0f, y = 7.8f)
                verticalLineToRelative(dy = 8.4f)
            }
            path(
                stroke = SolidColor(Color(0xFF17191C)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 12.0f, y = 22.0f)
                arcToRelative(a = 10.0f, b = 10.0f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = 0.0f, dy1 = -20.0f)
                arcToRelative(a = 10.0f, b = 10.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 20.0f)
            }
        }.build().also { _usdCoin = it }
    }

@Suppress("ObjectPropertyName")
private var _usdCoin: ImageVector? = null
