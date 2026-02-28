package com.github.yohannestz.iconsax_compose.iconsax.outline

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
            ) {
                moveTo(x = 12.0f, y = 12.75f)
                horizontalLineTo(x = 4.88f)
                arcTo(horizontalEllipseRadius = 0.76f, verticalEllipseRadius = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 4.13f, y1 = 12.0f)
                verticalLineTo(y = 4.5f)
                arcToRelative(a = 2.75f, b = 2.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 2.75f, dy1 = -2.75f)
                horizontalLineTo(x = 12.0f)
                arcToRelative(a = 5.51f, b = 5.51f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = 11.0f)
                moveToRelative(dx = -6.38f, dy = -1.5f)
                horizontalLineTo(x = 12.0f)
                arcToRelative(a = 4.0f, b = 4.0f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = 0.0f, dy1 = -8.0f)
                horizontalLineTo(x = 6.88f)
                arcTo(horizontalEllipseRadius = 1.25f, verticalEllipseRadius = 1.25f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 5.63f, y1 = 4.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 14.38f, y = 22.25f)
                horizontalLineToRelative(dx = -7.5f)
                arcToRelative(a = 2.75f, b = 2.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -2.75f, dy1 = -2.75f)
                verticalLineTo(y = 12.0f)
                arcToRelative(a = 0.76f, b = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.75f, dy1 = -0.75f)
                horizontalLineToRelative(dx = 9.5f)
                arcToRelative(a = 5.51f, b = 5.51f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = 11.0f)
                moveToRelative(dx = -8.76f, dy = -9.5f)
                verticalLineToRelative(dy = 6.75f)
                arcToRelative(a = 1.25f, b = 1.25f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.25f, dy1 = 1.25f)
                horizontalLineToRelative(dx = 7.5f)
                arcToRelative(a = 4.0f, b = 4.0f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = 0.0f, dy1 = -8.0f)
                close()
            }
        }.build().also { _textBold = it }
    }

@Suppress("ObjectPropertyName")
private var _textBold: ImageVector? = null
