package com.github.yohannestz.iconsax_compose.iconsax.bulk

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Zel: ImageVector
    get() {
        val current = _zel
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Zel",
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
                moveTo(x = 12.0f, y = 22.0f)
                arcToRelative(a = 10.0f, b = 10.0f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = 0.0f, dy1 = -20.0f)
                arcToRelative(a = 10.0f, b = 10.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 20.0f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 10.5f, y = 11.46f)
                verticalLineToRelative(dy = 2.57f)
                arcToRelative(a = 0.5f, b = 0.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.25f, dy1 = 0.43f)
                lineToRelative(dx = -2.0f, dy = 1.15f)
                arcToRelative(a = 0.5f, b = 0.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.5f, dy1 = 0.0f)
                lineToRelative(dx = -2.0f, dy = -1.15f)
                arcToRelative(a = 0.5f, b = 0.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.25f, dy1 = -0.43f)
                verticalLineToRelative(dy = -2.28f)
                arcToRelative(a = 0.5f, b = 0.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.25f, dy1 = -0.43f)
                lineToRelative(dx = 2.0f, dy = -1.15f)
                arcToRelative(a = 0.5f, b = 0.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.5f, dy1 = 0.0f)
                lineToRelative(dx = 1.0f, dy = 0.58f)
                close()
                moveToRelative(dx = 8.0f, dy = 0.29f)
                verticalLineToRelative(dy = 2.28f)
                arcToRelative(a = 0.5f, b = 0.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.25f, dy1 = 0.43f)
                lineToRelative(dx = -2.0f, dy = 1.15f)
                arcToRelative(a = 0.5f, b = 0.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.5f, dy1 = 0.0f)
                lineToRelative(dx = -2.0f, dy = -1.15f)
                arcToRelative(a = 0.5f, b = 0.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.25f, dy1 = -0.43f)
                verticalLineToRelative(dy = -2.57f)
                lineToRelative(dx = 1.25f, dy = -0.71f)
                lineToRelative(dx = 1.0f, dy = -0.58f)
                arcToRelative(a = 0.5f, b = 0.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.5f, dy1 = 0.0f)
                lineToRelative(dx = 2.0f, dy = 1.15f)
                arcToRelative(a = 0.5f, b = 0.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.25f, dy1 = 0.43f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 14.75f, y = 9.62f)
                verticalLineToRelative(dy = 1.13f)
                lineToRelative(dx = -1.25f, dy = 0.71f)
                verticalLineToRelative(dy = 1.73f)
                lineToRelative(dx = -1.25f, dy = 0.72f)
                arcToRelative(a = 0.5f, b = 0.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.5f, dy1 = 0.0f)
                lineToRelative(dx = -1.25f, dy = -0.72f)
                verticalLineToRelative(dy = -1.73f)
                lineToRelative(dx = -1.25f, dy = -0.71f)
                verticalLineTo(y = 9.62f)
                arcTo(horizontalEllipseRadius = 0.5f, verticalEllipseRadius = 0.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 9.5f, y1 = 9.19f)
                lineToRelative(dx = 2.25f, dy = -1.29f)
                arcToRelative(a = 0.5f, b = 0.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.5f, dy1 = 0.0f)
                lineToRelative(dx = 2.25f, dy = 1.29f)
                arcToRelative(a = 0.5f, b = 0.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.25f, dy1 = 0.43f)
            }
        }.build().also { _zel = it }
    }

@Suppress("ObjectPropertyName")
private var _zel: ImageVector? = null
