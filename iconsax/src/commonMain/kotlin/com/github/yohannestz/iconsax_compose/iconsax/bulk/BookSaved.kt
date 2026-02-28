package com.github.yohannestz.iconsax_compose.iconsax.bulk

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val BookSaved: ImageVector
    get() {
        val current = _bookSaved
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.BookSaved",
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
                moveTo(x = 12.0f, y = 5.3f)
                verticalLineToRelative(dy = 16.03f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.49f, dy1 = -0.1f)
                lineToRelative(dx = 0.04f, dy = -0.03f)
                arcToRelative(a = 26.0f, b = 26.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 7.44f, dy1 = -2.44f)
                lineToRelative(dx = 0.29f, dy = -0.04f)
                arcTo(horizontalEllipseRadius = 2.05f, verticalEllipseRadius = 2.05f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 22.0f, y1 = 16.74f)
                verticalLineTo(y = 4.66f)
                arcToRelative(a = 1.97f, b = 1.97f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -2.16f, dy1 = -1.99f)
                arcToRelative(a = 19.0f, b = 19.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -7.06f, dy1 = 2.34f)
                lineToRelative(dx = -0.25f, dy = 0.15f)
                arcTo(horizontalEllipseRadius = 1.0f, verticalEllipseRadius = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 12.0f, y1 = 5.3f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 2.0f, y = 4.67f)
                verticalLineToRelative(dy = 12.07f)
                arcToRelative(a = 2.05f, b = 2.05f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.74f, dy1 = 1.98f)
                lineToRelative(dx = 0.33f, dy = 0.04f)
                arcToRelative(a = 26.0f, b = 26.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 7.46f, dy1 = 2.46f)
                arcTo(horizontalEllipseRadius = 1.0f, verticalEllipseRadius = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 12.0f, y1 = 21.33f)
                verticalLineTo(y = 5.3f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.53f, dy1 = -0.14f)
                lineTo(x = 11.3f, y = 5.05f)
                arcToRelative(a = 19.0f, b = 19.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -7.07f, dy1 = -2.37f)
                horizontalLineTo(x = 4.17f)
                arcTo(horizontalEllipseRadius = 1.97f, verticalEllipseRadius = 1.97f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 2.0f, y1 = 4.67f)
                moveToRelative(dx = 17.0f, dy = -1.89f)
                verticalLineToRelative(dy = 4.3f)
                arcToRelative(a = 0.5f, b = 0.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.78f, dy1 = 0.41f)
                lineTo(x = 17.0f, y = 6.7f)
                lineToRelative(dx = -1.22f, dy = 0.8f)
                arcTo(horizontalEllipseRadius = 0.5f, verticalEllipseRadius = 0.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 15.0f, y1 = 7.07f)
                verticalLineTo(y = 3.92f)
                arcToRelative(a = 20.0f, b = 20.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 4.0f, dy1 = -1.14f)
            }
        }.build().also { _bookSaved = it }
    }

@Suppress("ObjectPropertyName")
private var _bookSaved: ImageVector? = null
