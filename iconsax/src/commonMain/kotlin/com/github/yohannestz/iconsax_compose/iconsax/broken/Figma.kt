package com.github.yohannestz.iconsax_compose.iconsax.broken

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Figma: ImageVector
    get() {
        val current = _figma
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Figma",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 12.0f, y = 2.0f)
                horizontalLineTo(x = 8.67f)
                arcToRelative(a = 3.33f, b = 3.33f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = 0.0f, dy1 = 6.66f)
                horizontalLineTo(x = 12.0f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 8.67f, y = 15.33f)
                horizontalLineTo(x = 12.0f)
                verticalLineTo(y = 8.66f)
                horizontalLineTo(x = 8.67f)
                arcToRelative(a = 3.33f, b = 3.33f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -3.33f, dy1 = 3.33f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 12.0f, y = 15.33f)
                horizontalLineTo(x = 8.67f)
                arcTo(horizontalEllipseRadius = 3.33f, verticalEllipseRadius = 3.33f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, x1 = 12.0f, y1 = 18.66f)
                close()
                moveTo(x = 12.0f, y = 2.0f)
                horizontalLineToRelative(dx = 3.33f)
                arcToRelative(a = 3.33f, b = 3.33f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = true, dx1 = 0.0f, dy1 = 6.66f)
                horizontalLineTo(x = 12.0f)
                close()
                moveToRelative(dx = 3.33f, dy = 6.67f)
                arcToRelative(a = 3.33f, b = 3.33f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = true, dx1 = 0.0f, dy1 = 6.66f)
                arcToRelative(a = 3.33f, b = 3.33f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = -6.66f)
                close()
            }
        }.build().also { _figma = it }
    }

@Suppress("ObjectPropertyName")
private var _figma: ImageVector? = null
