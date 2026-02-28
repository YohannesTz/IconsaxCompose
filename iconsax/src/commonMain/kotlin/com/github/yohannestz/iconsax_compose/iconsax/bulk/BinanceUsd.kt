package com.github.yohannestz.iconsax_compose.iconsax.bulk

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
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
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 11.4f, y = 2.35f)
                lineTo(x = 6.26f, y = 7.5f)
                arcToRelative(a = 0.5f, b = 0.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 0.71f)
                lineToRelative(dx = 1.73f, dy = 1.73f)
                arcToRelative(a = 0.5f, b = 0.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.71f, dy1 = 0.0f)
                lineToRelative(dx = 5.15f, dy = -5.15f)
                arcToRelative(a = 0.5f, b = 0.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = -0.71f)
                lineToRelative(dx = -1.73f, dy = -1.73f)
                arcToRelative(a = 0.53f, b = 0.53f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.72f, dy1 = 0.0f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
                fillAlpha = 0.4f,
                strokeAlpha = 0.4f,
            ) {
                moveTo(x = 15.3f, y = 6.26f)
                lineTo(x = 6.26f, y = 15.3f)
                arcToRelative(a = 0.5f, b = 0.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 0.71f)
                lineToRelative(dx = 1.73f, dy = 1.73f)
                arcToRelative(a = 0.5f, b = 0.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.71f, dy1 = 0.0f)
                lineToRelative(dx = 9.05f, dy = -9.05f)
                arcToRelative(a = 0.5f, b = 0.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = -0.71f)
                lineToRelative(dx = -1.73f, dy = -1.73f)
                arcToRelative(a = 0.5f, b = 0.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.72f, dy1 = 0.01f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 19.21f, y = 10.16f)
                lineToRelative(dx = -9.05f, dy = 9.05f)
                arcToRelative(a = 0.5f, b = 0.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 0.71f)
                lineToRelative(dx = 1.73f, dy = 1.73f)
                arcToRelative(a = 0.5f, b = 0.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.71f, dy1 = 0.0f)
                lineToRelative(dx = 9.05f, dy = -9.05f)
                arcToRelative(a = 0.5f, b = 0.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = -0.7f)
                lineToRelative(dx = -1.73f, dy = -1.74f)
                arcToRelative(a = 0.5f, b = 0.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.71f, dy1 = 0.0f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
                fillAlpha = 0.4f,
                strokeAlpha = 0.4f,
            ) {
                moveTo(x = 4.09f, y = 13.84f)
                lineToRelative(dx = -1.73f, dy = -1.73f)
                arcToRelative(a = 0.5f, b = 0.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = -0.71f)
                lineToRelative(dx = 1.73f, dy = -1.73f)
                arcToRelative(a = 0.5f, b = 0.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.71f, dy1 = 0.0f)
                lineToRelative(dx = 1.73f, dy = 1.73f)
                arcToRelative(a = 0.5f, b = 0.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = 0.71f)
                lineTo(x = 4.8f, y = 13.84f)
                arcToRelative(a = 0.5f, b = 0.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.71f, dy1 = 0.0f)
            }
        }.build().also { _binanceUsd = it }
    }

@Suppress("ObjectPropertyName")
private var _binanceUsd: ImageVector? = null
