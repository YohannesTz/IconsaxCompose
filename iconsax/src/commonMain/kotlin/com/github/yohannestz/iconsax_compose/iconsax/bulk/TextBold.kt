package com.github.yohannestz.iconsax_compose.iconsax.bulk

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val TextBold: ImageVector
    get() {
        val current = _textBold
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.TextBold",
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
                moveTo(x = 22.0f, y = 7.81f)
                verticalLineToRelative(dy = 8.38f)
                curveToRelative(dx1 = 0.0f, dy1 = 3.64f, dx2 = -2.17f, dy2 = 5.81f, dx3 = -5.81f, dy3 = 5.81f)
                horizontalLineTo(x = 7.81f)
                lineToRelative(dx = -0.59f, dy = -0.02f)
                arcToRelative(a = 6.0f, b = 6.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -3.09f, dy1 = -1.03f)
                arcToRelative(a = 4.0f, b = 4.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.08f, dy1 = -1.08f)
                arcTo(horizontalEllipseRadius = 6.0f, verticalEllipseRadius = 6.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 2.0f, y1 = 16.19f)
                verticalLineTo(y = 7.81f)
                curveToRelative(dx1 = 0.0f, dy1 = -3.44f, dx2 = 1.94f, dy2 = -5.57f, dx3 = 5.22f, dy3 = -5.78f)
                lineTo(x = 7.81f, y = 2.0f)
                horizontalLineToRelative(dx = 8.38f)
                arcToRelative(a = 6.0f, b = 6.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 3.68f, dy1 = 1.05f)
                arcToRelative(a = 4.0f, b = 4.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.08f, dy1 = 1.08f)
                arcTo(horizontalEllipseRadius = 6.0f, verticalEllipseRadius = 6.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 22.0f, y1 = 7.81f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 15.03f, y = 11.49f)
                arcTo(horizontalEllipseRadius = 3.7f, verticalEllipseRadius = 3.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 16.0f, y1 = 9.0f)
                arcToRelative(a = 3.75f, b = 3.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -3.75f, dy1 = -3.75f)
                horizontalLineTo(x = 9.01f)
                arcTo(horizontalEllipseRadius = 2.0f, verticalEllipseRadius = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 7.0f, y1 = 7.26f)
                verticalLineToRelative(dy = 9.48f)
                curveToRelative(dx1 = 0.0f, dy1 = 1.11f, dx2 = 0.9f, dy2 = 2.01f, dx3 = 2.01f, dy3 = 2.01f)
                horizontalLineToRelative(dx = 4.74f)
                arcToRelative(a = 3.75f, b = 3.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.28f, dy1 = -7.26f)
                moveTo(x = 8.5f, y = 7.26f)
                arcToRelative(a = 0.5f, b = 0.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.51f, dy1 = -0.51f)
                horizontalLineToRelative(dx = 3.24f)
                arcToRelative(a = 2.25f, b = 2.25f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = 4.5f)
                horizontalLineTo(x = 8.5f)
                close()
                moveToRelative(dx = 5.25f, dy = 9.99f)
                horizontalLineTo(x = 9.01f)
                arcToRelative(a = 0.5f, b = 0.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.51f, dy1 = -0.51f)
                verticalLineToRelative(dy = -3.99f)
                horizontalLineToRelative(dx = 5.25f)
                arcToRelative(a = 2.25f, b = 2.25f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = 4.5f)
            }
        }.build().also { _textBold = it }
    }

@Suppress("ObjectPropertyName")
private var _textBold: ImageVector? = null
