package com.github.yohannestz.iconsax_compose.iconsax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Wanchain: ImageVector
    get() {
        val current = _wanchain
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Wanchain",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                moveTo(x = 11.75f, y = 9.43f)
                lineTo(x = 8.5f, y = 15.0f)
                lineToRelative(dx = -0.63f, dy = 1.09f)
                lineToRelative(dx = -2.47f, dy = 4.22f)
                arcToRelative(a = 0.5f, b = 0.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.84f, dy1 = 0.02f)
                lineToRelative(dx = -3.38f, dy = -5.05f)
                arcToRelative(a = 0.5f, b = 0.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = -0.56f)
                lineToRelative(dx = 3.67f, dy = -5.5f)
                arcTo(horizontalEllipseRadius = 0.5f, verticalEllipseRadius = 0.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 5.27f, y1 = 9.0f)
                horizontalLineToRelative(dx = 6.23f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                moveTo(x = 22.84f, y = 14.73f)
                lineToRelative(dx = -6.7f, dy = -11.48f)
                arcTo(horizontalEllipseRadius = 0.5f, verticalEllipseRadius = 0.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 15.71f, y1 = 3.0f)
                horizontalLineTo(x = 8.87f)
                arcToRelative(a = 0.5f, b = 0.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.43f, dy1 = 0.75f)
                lineTo(x = 11.5f, y = 9.0f)
                lineToRelative(dx = 0.25f, dy = 0.43f)
                lineToRelative(dx = 2.81f, dy = 4.82f)
                arcTo(horizontalEllipseRadius = 0.5f, verticalEllipseRadius = 0.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 14.13f, y1 = 15.0f)
                horizontalLineTo(x = 8.5f)
                lineToRelative(dx = -0.63f, dy = 1.09f)
                arcToRelative(a = 0.5f, b = 0.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.84f, dy1 = -0.02f)
                lineToRelative(dx = 3.14f, dy = 4.71f)
                arcTo(horizontalEllipseRadius = 0.5f, verticalEllipseRadius = 0.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 12.27f, y1 = 21.0f)
                horizontalLineToRelative(dx = 6.46f)
                arcToRelative(a = 0.5f, b = 0.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.42f, dy1 = -0.22f)
                lineToRelative(dx = 3.68f, dy = -5.52f)
                arcToRelative(a = 0.5f, b = 0.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.01f, dy1 = -0.53f)
            }
        }.build().also { _wanchain = it }
    }

@Suppress("ObjectPropertyName")
private var _wanchain: ImageVector? = null
