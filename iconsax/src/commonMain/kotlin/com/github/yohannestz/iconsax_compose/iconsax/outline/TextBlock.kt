package com.github.yohannestz.iconsax_compose.iconsax.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val TextBlock: ImageVector
    get() {
        val current = _textBlock
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.TextBlock",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 15.0f, y = 22.75f)
                horizontalLineTo(x = 9.0f)
                curveToRelative(dx1 = -5.43f, dy1 = 0.0f, dx2 = -7.75f, dy2 = -2.32f, dx3 = -7.75f, dy3 = -7.75f)
                verticalLineTo(y = 9.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -5.43f, dx2 = 2.32f, dy2 = -7.75f, dx3 = 7.75f, dy3 = -7.75f)
                horizontalLineToRelative(dx = 6.0f)
                curveToRelative(dx1 = 5.43f, dy1 = 0.0f, dx2 = 7.75f, dy2 = 2.32f, dx3 = 7.75f, dy3 = 7.75f)
                verticalLineToRelative(dy = 6.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 5.43f, dx2 = -2.32f, dy2 = 7.75f, dx3 = -7.75f, dy3 = 7.75f)
                moveToRelative(dx = -6.0f, dy = -20.0f)
                curveTo(x1 = 4.39f, y1 = 2.75f, x2 = 2.75f, y2 = 4.39f, x3 = 2.75f, y3 = 9.0f)
                verticalLineToRelative(dy = 6.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 4.61f, dx2 = 1.64f, dy2 = 6.25f, dx3 = 6.25f, dy3 = 6.25f)
                horizontalLineToRelative(dx = 6.0f)
                curveToRelative(dx1 = 4.61f, dy1 = 0.0f, dx2 = 6.25f, dy2 = -1.64f, dx3 = 6.25f, dy3 = -6.25f)
                verticalLineTo(y = 9.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -4.61f, dx2 = -1.64f, dy2 = -6.25f, dx3 = -6.25f, dy3 = -6.25f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 7.0f, y = 9.63f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.34f, dy1 = -1.42f)
                arcToRelative(a = 12.0f, b = 12.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 10.67f, dy1 = 0.0f)
                arcToRelative(a = 0.76f, b = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.34f, dy1 = 1.01f)
                arcToRelative(a = 0.76f, b = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.01f, dy1 = 0.34f)
                arcToRelative(a = 10.5f, b = 10.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -9.33f, dy1 = 0.0f)
                arcTo(horizontalEllipseRadius = 1.0f, verticalEllipseRadius = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 7.0f, y1 = 9.63f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 12.0f, y = 17.04f)
                arcToRelative(a = 0.76f, b = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.75f, dy1 = -0.75f)
                verticalLineTo(y = 7.93f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.41f, dx2 = 0.34f, dy2 = -0.75f, dx3 = 0.75f, dy3 = -0.75f)
                reflectiveCurveToRelative(dx1 = 0.75f, dy1 = 0.34f, dx2 = 0.75f, dy2 = 0.75f)
                verticalLineToRelative(dy = 8.37f)
                arcTo(horizontalEllipseRadius = 0.75f, verticalEllipseRadius = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 12.0f, y1 = 17.04f)
            }
        }.build().also { _textBlock = it }
    }

@Suppress("ObjectPropertyName")
private var _textBlock: ImageVector? = null
