package com.github.yohannestz.iconsax_compose.iconsax.bulk

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Airpod: ImageVector
    get() {
        val current = _airpod
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Airpod",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
                fillAlpha = 0.4f,
                strokeAlpha = 0.4f,
            ) {
                moveTo(x = 21.5f, y = 6.5f)
                verticalLineToRelative(dy = 11.0f)
                arcTo(horizontalEllipseRadius = 4.5f, verticalEllipseRadius = 4.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 17.0f, y1 = 22.0f)
                horizontalLineTo(x = 7.0f)
                arcToRelative(a = 4.5f, b = 4.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -4.5f, dy1 = -4.5f)
                verticalLineToRelative(dy = -11.0f)
                arcTo(horizontalEllipseRadius = 4.5f, verticalEllipseRadius = 4.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 7.0f, y1 = 2.0f)
                horizontalLineToRelative(dx = 10.0f)
                arcToRelative(a = 4.5f, b = 4.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 4.5f, dy1 = 4.5f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 21.5f, y = 8.17f)
                verticalLineToRelative(dy = 1.5f)
                horizontalLineToRelative(dx = -4.13f)
                arcToRelative(a = 2.4f, b = 2.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -2.29f, dy1 = 1.67f)
                horizontalLineTo(x = 8.92f)
                arcToRelative(a = 2.4f, b = 2.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -2.3f, dy1 = -1.67f)
                horizontalLineTo(x = 2.5f)
                verticalLineToRelative(dy = -1.5f)
                horizontalLineToRelative(dx = 4.13f)
                arcTo(horizontalEllipseRadius = 2.4f, verticalEllipseRadius = 2.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 8.92f, y1 = 6.5f)
                horizontalLineToRelative(dx = 6.15f)
                arcToRelative(a = 2.4f, b = 2.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 2.3f, dy1 = 1.67f)
                close()
            }
        }.build().also { _airpod = it }
    }

@Suppress("ObjectPropertyName")
private var _airpod: ImageVector? = null
