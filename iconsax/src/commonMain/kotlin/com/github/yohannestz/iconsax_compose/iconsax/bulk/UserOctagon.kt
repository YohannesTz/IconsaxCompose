package com.github.yohannestz.iconsax_compose.iconsax.bulk

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
                fillAlpha = 0.4f,
                strokeAlpha = 0.4f,
            ) {
                moveTo(x = 21.08f, y = 8.58f)
                verticalLineToRelative(dy = 6.84f)
                curveToRelative(dx1 = 0.0f, dy1 = 1.12f, dx2 = -0.6f, dy2 = 2.16f, dx3 = -1.57f, dy3 = 2.73f)
                lineToRelative(dx = -5.94f, dy = 3.43f)
                arcToRelative(a = 3.2f, b = 3.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -3.15f, dy1 = 0.0f)
                lineToRelative(dx = -5.94f, dy = -3.43f)
                arcToRelative(a = 3.2f, b = 3.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.57f, dy1 = -2.73f)
                verticalLineTo(y = 8.58f)
                curveToRelative(dx1 = 0.0f, dy1 = -1.12f, dx2 = 0.6f, dy2 = -2.16f, dx3 = 1.57f, dy3 = -2.73f)
                lineToRelative(dx = 5.94f, dy = -3.43f)
                arcToRelative(a = 3.2f, b = 3.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 3.15f, dy1 = 0.0f)
                lineToRelative(dx = 5.94f, dy = 3.43f)
                arcToRelative(a = 3.2f, b = 3.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.57f, dy1 = 2.73f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 12.0f, y = 12.0f)
                arcToRelative(a = 2.33f, b = 2.33f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = 0.0f, dy1 = -4.66f)
                arcTo(horizontalEllipseRadius = 2.33f, verticalEllipseRadius = 2.33f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 12.0f, y1 = 12.0f)
                moveToRelative(dx = 2.68f, dy = 4.66f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.83f, dy1 = -1.57f)
                arcToRelative(a = 4.2f, b = 4.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -3.5f, dy1 = -1.7f)
                arcToRelative(a = 4.2f, b = 4.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -3.52f, dy1 = 1.7f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.83f, dy1 = 1.57f)
                close()
            }
        }.build().also { _userOctagon = it }
    }

@Suppress("ObjectPropertyName")
private var _userOctagon: ImageVector? = null
