package com.github.yohannestz.iconsax_compose.iconsax.bold

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
            ) {
                moveTo(x = 18.0f, y = 2.0f)
                horizontalLineTo(x = 6.0f)
                curveTo(x1 = 4.34f, y1 = 2.0f, x2 = 3.0f, y2 = 3.33f, x3 = 3.0f, y3 = 4.97f)
                verticalLineToRelative(dy = 10.91f)
                arcToRelative(a = 3.0f, b = 3.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 3.0f, dy1 = 2.97f)
                horizontalLineToRelative(dx = 0.76f)
                curveToRelative(dx1 = 0.8f, dy1 = 0.0f, dx2 = 1.56f, dy2 = 0.31f, dx3 = 2.12f, dy3 = 0.87f)
                lineToRelative(dx = 1.71f, dy = 1.69f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 2.83f, dy1 = 0.0f)
                lineToRelative(dx = 1.71f, dy = -1.69f)
                arcToRelative(a = 3.0f, b = 3.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 2.12f, dy1 = -0.87f)
                horizontalLineTo(x = 18.0f)
                curveToRelative(dx1 = 1.66f, dy1 = 0.0f, dx2 = 3.0f, dy2 = -1.33f, dx3 = 3.0f, dy3 = -2.97f)
                verticalLineTo(y = 4.97f)
                arcTo(horizontalEllipseRadius = 3.0f, verticalEllipseRadius = 3.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 18.0f, y1 = 2.0f)
                moveToRelative(dx = -6.0f, dy = 3.75f)
                arcToRelative(a = 2.33f, b = 2.33f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = true, dx1 = 0.0f, dy1 = 4.65f)
                arcToRelative(a = 2.33f, b = 2.33f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = -4.65f)
                moveToRelative(dx = 2.68f, dy = 9.31f)
                horizontalLineTo(x = 9.32f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.83f, dy1 = -1.57f)
                arcTo(horizontalEllipseRadius = 4.2f, verticalEllipseRadius = 4.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 12.0f, y1 = 11.8f)
                arcToRelative(a = 4.2f, b = 4.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 3.51f, dy1 = 1.69f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.83f, dy1 = 1.57f)
            }
        }.build().also { _userTag = it }
    }

@Suppress("ObjectPropertyName")
private var _userTag: ImageVector? = null
