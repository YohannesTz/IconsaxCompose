package com.github.yohannestz.iconsax_compose.iconsax.bulk

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SimcardOne: ImageVector
    get() {
        val current = _simcardOne
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.SimcardOne",
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
                moveTo(x = 19.54f, y = 6.54f)
                lineToRelative(dx = -3.07f, dy = -3.07f)
                arcTo(horizontalEllipseRadius = 5.0f, verticalEllipseRadius = 5.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 12.93f, y1 = 2.0f)
                horizontalLineTo(x = 8.0f)
                curveTo(x1 = 5.0f, y1 = 2.0f, x2 = 3.0f, y2 = 4.0f, x3 = 3.0f, y3 = 7.0f)
                verticalLineToRelative(dy = 10.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 3.0f, dx2 = 2.0f, dy2 = 5.0f, dx3 = 5.0f, dy3 = 5.0f)
                horizontalLineToRelative(dx = 8.0f)
                curveToRelative(dx1 = 3.0f, dy1 = 0.0f, dx2 = 5.0f, dy2 = -2.0f, dx3 = 5.0f, dy3 = -5.0f)
                verticalLineToRelative(dy = -6.93f)
                arcToRelative(a = 5.0f, b = 5.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.46f, dy1 = -3.53f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 11.5f, y = 13.25f)
                verticalLineTo(y = 9.5f)
                horizontalLineTo(x = 10.0f)
                arcToRelative(a = 3.0f, b = 3.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -3.0f, dy1 = 3.0f)
                verticalLineToRelative(dy = 1.0f)
                horizontalLineToRelative(dx = 4.25f)
                arcToRelative(a = 0.25f, b = 0.25f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.25f, dy1 = -0.25f)
                moveToRelative(dx = 1.25f, dy = 0.25f)
                horizontalLineTo(x = 17.0f)
                verticalLineToRelative(dy = -1.0f)
                arcToRelative(a = 3.0f, b = 3.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -3.0f, dy1 = -3.0f)
                horizontalLineToRelative(dx = -1.5f)
                verticalLineToRelative(dy = 3.75f)
                arcToRelative(a = 0.25f, b = 0.25f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.25f, dy1 = 0.25f)
                moveToRelative(dx = -1.5f, dy = 1.0f)
                horizontalLineTo(x = 7.0f)
                verticalLineToRelative(dy = 1.0f)
                arcToRelative(a = 3.0f, b = 3.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 3.0f, dy1 = 3.0f)
                horizontalLineToRelative(dx = 1.5f)
                verticalLineToRelative(dy = -3.75f)
                arcToRelative(a = 0.25f, b = 0.25f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.25f, dy1 = -0.25f)
                moveToRelative(dx = 1.25f, dy = 0.25f)
                verticalLineToRelative(dy = 3.75f)
                horizontalLineTo(x = 14.0f)
                arcToRelative(a = 3.0f, b = 3.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 3.0f, dy1 = -3.0f)
                verticalLineToRelative(dy = -1.0f)
                horizontalLineToRelative(dx = -4.25f)
                arcToRelative(a = 0.25f, b = 0.25f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.25f, dy1 = 0.25f)
            }
        }.build().also { _simcardOne = it }
    }

@Suppress("ObjectPropertyName")
private var _simcardOne: ImageVector? = null
