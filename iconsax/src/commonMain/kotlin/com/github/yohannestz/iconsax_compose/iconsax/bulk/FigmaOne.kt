package com.github.yohannestz.iconsax_compose.iconsax.bulk

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FigmaOne: ImageVector
    get() {
        val current = _figmaOne
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.FigmaOne",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 12.0f, y = 2.0f)
                horizontalLineTo(x = 8.67f)
                arcToRelative(a = 3.33f, b = 3.33f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = 0.0f, dy1 = 6.66f)
                horizontalLineTo(x = 12.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
                fillAlpha = 0.4f,
                strokeAlpha = 0.4f,
            ) {
                moveTo(x = 12.0f, y = 8.67f)
                horizontalLineTo(x = 8.67f)
                arcToRelative(a = 3.33f, b = 3.33f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = 0.0f, dy1 = 6.66f)
                horizontalLineTo(x = 12.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 12.0f, y = 15.33f)
                horizontalLineTo(x = 8.67f)
                arcTo(horizontalEllipseRadius = 3.33f, verticalEllipseRadius = 3.33f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, x1 = 12.0f, y1 = 18.66f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
                fillAlpha = 0.4f,
                strokeAlpha = 0.4f,
            ) {
                moveTo(x = 12.0f, y = 2.0f)
                horizontalLineToRelative(dx = 3.33f)
                arcToRelative(a = 3.33f, b = 3.33f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = true, dx1 = 0.0f, dy1 = 6.66f)
                horizontalLineTo(x = 12.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 15.33f, y = 8.67f)
                arcToRelative(a = 3.33f, b = 3.33f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = true, dx1 = 0.0f, dy1 = 6.66f)
                arcToRelative(a = 3.33f, b = 3.33f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = -6.66f)
            }
        }.build().also { _figmaOne = it }
    }

@Suppress("ObjectPropertyName")
private var _figmaOne: ImageVector? = null
