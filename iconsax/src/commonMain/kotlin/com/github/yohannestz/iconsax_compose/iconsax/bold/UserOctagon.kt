package com.github.yohannestz.iconsax_compose.iconsax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val UserOctagon: ImageVector
    get() {
        val current = _userOctagon
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.UserOctagon",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 19.51f, y = 5.85f)
                lineToRelative(dx = -5.94f, dy = -3.43f)
                arcToRelative(a = 3.2f, b = 3.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -3.15f, dy1 = 0.0f)
                lineTo(x = 4.5f, y = 5.85f)
                arcToRelative(a = 3.2f, b = 3.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.57f, dy1 = 2.73f)
                verticalLineToRelative(dy = 6.84f)
                curveToRelative(dx1 = 0.0f, dy1 = 1.12f, dx2 = 0.6f, dy2 = 2.16f, dx3 = 1.57f, dy3 = 2.73f)
                lineToRelative(dx = 5.94f, dy = 3.43f)
                arcToRelative(a = 3.2f, b = 3.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 3.15f, dy1 = 0.0f)
                lineToRelative(dx = 5.94f, dy = -3.43f)
                arcToRelative(a = 3.2f, b = 3.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.57f, dy1 = -2.73f)
                verticalLineTo(y = 8.58f)
                arcToRelative(a = 3.2f, b = 3.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.58f, dy1 = -2.73f)
                moveToRelative(dx = -7.5f, dy = 1.49f)
                arcToRelative(a = 2.33f, b = 2.33f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = true, dx1 = 0.0f, dy1 = 4.65f)
                arcToRelative(a = 2.33f, b = 2.33f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = -4.65f)
                moveToRelative(dx = 2.67f, dy = 9.32f)
                horizontalLineTo(x = 9.32f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.83f, dy1 = -1.57f)
                arcTo(horizontalEllipseRadius = 4.2f, verticalEllipseRadius = 4.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 12.0f, y1 = 13.4f)
                arcToRelative(a = 4.2f, b = 4.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 3.51f, dy1 = 1.69f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.83f, dy1 = 1.57f)
            }
        }.build().also { _userOctagon = it }
    }

@Suppress("ObjectPropertyName")
private var _userOctagon: ImageVector? = null
