package com.github.yohannestz.iconsax_compose.iconsax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val BinanceUsd: ImageVector
    get() {
        val current = _binanceUsd
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.BinanceUsd",
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
                moveTo(x = 11.4f, y = 2.4f)
                lineTo(x = 6.3f, y = 7.5f)
                arcToRelative(a = 0.5f, b = 0.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 0.7f)
                lineTo(x = 8.0f, y = 9.9f)
                curveToRelative(dx1 = 0.2f, dy1 = 0.2f, dx2 = 0.5f, dy2 = 0.2f, dx3 = 0.7f, dy3 = 0.0f)
                lineToRelative(dx = 5.1f, dy = -5.1f)
                curveToRelative(dx1 = 0.2f, dy1 = -0.2f, dx2 = 0.2f, dy2 = -0.5f, dx3 = 0.0f, dy3 = -0.7f)
                lineToRelative(dx = -1.7f, dy = -1.7f)
                arcToRelative(a = 0.5f, b = 0.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.7f, dy1 = 0.0f)
                moveToRelative(dx = 3.9f, dy = 3.9f)
                lineToRelative(dx = -9.0f, dy = 9.0f)
                arcToRelative(a = 0.5f, b = 0.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 0.7f)
                lineTo(x = 8.0f, y = 17.7f)
                curveToRelative(dx1 = 0.2f, dy1 = 0.2f, dx2 = 0.5f, dy2 = 0.2f, dx3 = 0.7f, dy3 = 0.0f)
                lineToRelative(dx = 9.0f, dy = -9.0f)
                curveToRelative(dx1 = 0.2f, dy1 = -0.2f, dx2 = 0.2f, dy2 = -0.5f, dx3 = 0.0f, dy3 = -0.7f)
                lineTo(x = 16.0f, y = 6.3f)
                arcToRelative(a = 0.5f, b = 0.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.7f, dy1 = 0.0f)
                moveToRelative(dx = 3.9f, dy = 3.9f)
                lineToRelative(dx = -9.0f, dy = 9.0f)
                arcToRelative(a = 0.5f, b = 0.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 0.7f)
                lineToRelative(dx = 1.7f, dy = 1.7f)
                curveToRelative(dx1 = 0.2f, dy1 = 0.2f, dx2 = 0.5f, dy2 = 0.2f, dx3 = 0.7f, dy3 = 0.0f)
                lineToRelative(dx = 9.0f, dy = -9.0f)
                curveToRelative(dx1 = 0.2f, dy1 = -0.2f, dx2 = 0.2f, dy2 = -0.5f, dx3 = 0.0f, dy3 = -0.7f)
                lineToRelative(dx = -1.7f, dy = -1.7f)
                arcToRelative(a = 0.5f, b = 0.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.7f, dy1 = 0.0f)
                moveTo(x = 4.1f, y = 13.8f)
                lineToRelative(dx = -1.7f, dy = -1.7f)
                arcToRelative(a = 0.5f, b = 0.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = -0.7f)
                lineToRelative(dx = 1.7f, dy = -1.7f)
                curveToRelative(dx1 = 0.2f, dy1 = -0.2f, dx2 = 0.5f, dy2 = -0.2f, dx3 = 0.7f, dy3 = 0.0f)
                lineToRelative(dx = 1.7f, dy = 1.7f)
                curveToRelative(dx1 = 0.2f, dy1 = 0.2f, dx2 = 0.2f, dy2 = 0.5f, dx3 = 0.0f, dy3 = 0.7f)
                lineToRelative(dx = -1.7f, dy = 1.7f)
                arcToRelative(a = 0.5f, b = 0.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.7f, dy1 = 0.0f)
            }
        }.build().also { _binanceUsd = it }
    }

@Suppress("ObjectPropertyName")
private var _binanceUsd: ImageVector? = null
