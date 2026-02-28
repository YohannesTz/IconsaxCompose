package com.github.yohannestz.iconsax_compose.iconsax.bulk

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val UserTag: ImageVector
    get() {
        val current = _userTag
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.UserTag",
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
                moveTo(x = 18.0f, y = 18.86f)
                horizontalLineToRelative(dx = -0.76f)
                arcToRelative(a = 3.0f, b = 3.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -2.12f, dy1 = 0.87f)
                lineToRelative(dx = -1.71f, dy = 1.7f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -2.83f, dy1 = 0.0f)
                lineToRelative(dx = -1.71f, dy = -1.7f)
                arcToRelative(a = 3.0f, b = 3.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -2.12f, dy1 = -0.87f)
                horizontalLineTo(x = 6.0f)
                curveToRelative(dx1 = -1.66f, dy1 = 0.0f, dx2 = -3.0f, dy2 = -1.33f, dx3 = -3.0f, dy3 = -2.97f)
                verticalLineTo(y = 5.0f)
                arcTo(horizontalEllipseRadius = 3.0f, verticalEllipseRadius = 3.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 6.0f, y1 = 2.0f)
                horizontalLineToRelative(dx = 12.0f)
                curveToRelative(dx1 = 1.66f, dy1 = 0.0f, dx2 = 3.0f, dy2 = 1.33f, dx3 = 3.0f, dy3 = 2.97f)
                verticalLineTo(y = 15.9f)
                arcToRelative(a = 3.0f, b = 3.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -3.0f, dy1 = 2.97f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 12.0f, y = 10.41f)
                arcToRelative(a = 2.33f, b = 2.33f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = 0.0f, dy1 = -4.66f)
                arcToRelative(a = 2.33f, b = 2.33f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 4.66f)
                moveToRelative(dx = 2.68f, dy = 4.65f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.83f, dy1 = -1.57f)
                arcToRelative(a = 4.2f, b = 4.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -3.5f, dy1 = -1.69f)
                arcToRelative(a = 4.2f, b = 4.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -3.52f, dy1 = 1.69f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.83f, dy1 = 1.57f)
                close()
            }
        }.build().also { _userTag = it }
    }

@Suppress("ObjectPropertyName")
private var _userTag: ImageVector? = null
