package com.github.yohannestz.iconsax_compose.iconsax.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaximizeCircle: ImageVector
    get() {
        val current = _maximizeCircle
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.MaximizeCircle",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
                fillAlpha = 0.4f,
                pathFillType = PathFillType.EvenOdd,
                strokeAlpha = 0.4f,
            ) {
                moveTo(x = 16.25f, y = 3.0f)
                arcTo(horizontalEllipseRadius = 0.75f, verticalEllipseRadius = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 17.0f, y1 = 2.25f)
                horizontalLineToRelative(dx = 4.0f)
                arcTo(horizontalEllipseRadius = 0.75f, verticalEllipseRadius = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 21.75f, y1 = 3.0f)
                verticalLineToRelative(dy = 4.0f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.5f, dy1 = 0.0f)
                verticalLineTo(y = 3.75f)
                horizontalLineTo(x = 17.0f)
                arcTo(horizontalEllipseRadius = 0.75f, verticalEllipseRadius = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 16.25f, y1 = 3.0f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
                fillAlpha = 0.4f,
                pathFillType = PathFillType.EvenOdd,
                strokeAlpha = 0.4f,
            ) {
                moveTo(x = 21.53f, y = 2.47f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = 1.06f)
                lineToRelative(dx = -6.0f, dy = 6.0f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = true, dx1 = -1.06f, dy1 = -1.06f)
                lineToRelative(dx = 6.0f, dy = -6.0f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.06f, dy1 = 0.0f)
                moveTo(x = 3.0f, y = 16.25f)
                arcTo(horizontalEllipseRadius = 0.75f, verticalEllipseRadius = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 3.75f, y1 = 17.0f)
                verticalLineToRelative(dy = 3.25f)
                horizontalLineTo(x = 7.0f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = 1.5f)
                horizontalLineTo(x = 3.0f)
                arcTo(horizontalEllipseRadius = 0.75f, verticalEllipseRadius = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 2.25f, y1 = 21.0f)
                verticalLineToRelative(dy = -4.0f)
                arcTo(horizontalEllipseRadius = 0.75f, verticalEllipseRadius = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 3.0f, y1 = 16.25f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
                fillAlpha = 0.4f,
                pathFillType = PathFillType.EvenOdd,
                strokeAlpha = 0.4f,
            ) {
                moveTo(x = 9.53f, y = 14.47f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = 1.06f)
                lineToRelative(dx = -6.0f, dy = 6.0f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.06f, dy1 = -1.06f)
                lineToRelative(dx = 6.0f, dy = -6.0f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.06f, dy1 = 0.0f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(x = 1.25f, y = 12.0f)
                arcTo(horizontalEllipseRadius = 10.75f, verticalEllipseRadius = 10.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 14.17f, y1 = 1.47f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = true, dx1 = -0.3f, dy1 = 1.47f)
                arcTo(horizontalEllipseRadius = 10.0f, verticalEllipseRadius = 10.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 12.0f, y1 = 2.75f)
                arcToRelative(a = 9.25f, b = 9.25f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -9.06f, dy1 = 11.1f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.47f, dy1 = 0.3f)
                arcTo(horizontalEllipseRadius = 11.0f, verticalEllipseRadius = 11.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 1.25f, y1 = 12.0f)
                moveToRelative(dx = 20.4f, dy = -2.73f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.89f, dy1 = 0.58f)
                arcToRelative(a = 10.75f, b = 10.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -12.7f, dy1 = 12.68f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.29f, dy1 = -1.46f)
                arcToRelative(a = 9.25f, b = 9.25f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 10.94f, dy1 = -10.92f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.58f, dy1 = -0.89f)
            }
        }.build().also { _maximizeCircle = it }
    }

@Suppress("ObjectPropertyName")
private var _maximizeCircle: ImageVector? = null
