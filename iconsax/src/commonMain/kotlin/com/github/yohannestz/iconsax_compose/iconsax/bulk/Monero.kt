package com.github.yohannestz.iconsax_compose.iconsax.bulk

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Monero: ImageVector
    get() {
        val current = _monero
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Monero",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 21.54f, y = 15.0f)
                arcToRelative(a = 10.01f, b = 10.01f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -19.07f, dy1 = 0.04f)
                horizontalLineToRelative(dx = 0.58f)
                lineTo(x = 7.0f, y = 15.0f)
                verticalLineToRelative(dy = -3.24f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.75f, dy1 = -0.65f)
                lineTo(x = 12.0f, y = 15.0f)
                lineToRelative(dx = 3.25f, dy = -3.9f)
                arcTo(horizontalEllipseRadius = 1.0f, verticalEllipseRadius = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 17.0f, y1 = 11.77f)
                verticalLineTo(y = 15.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
                fillAlpha = 0.4f,
                strokeAlpha = 0.4f,
            ) {
                moveTo(x = 22.0f, y = 12.0f)
                arcToRelative(a = 10.0f, b = 10.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.46f, dy1 = 3.0f)
                horizontalLineTo(x = 17.0f)
                verticalLineToRelative(dy = -3.24f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.75f, dy1 = -0.65f)
                lineTo(x = 12.0f, y = 15.0f)
                lineToRelative(dx = -3.25f, dy = -3.89f)
                arcTo(horizontalEllipseRadius = 1.0f, verticalEllipseRadius = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 7.0f, y1 = 11.76f)
                verticalLineTo(y = 15.0f)
                lineToRelative(dx = -3.95f, dy = 0.04f)
                horizontalLineTo(x = 2.47f)
                arcTo(horizontalEllipseRadius = 10.0f, verticalEllipseRadius = 10.0f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = true, x1 = 22.0f, y1 = 12.0f)
            }
        }.build().also { _monero = it }
    }

@Suppress("ObjectPropertyName")
private var _monero: ImageVector? = null
