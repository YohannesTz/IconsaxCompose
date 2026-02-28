package com.github.yohannestz.iconsax_compose.iconsax.bulk

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ShapesOne: ImageVector
    get() {
        val current = _shapesOne
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.ShapesOne",
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
                moveTo(x = 11.75f, y = 7.0f)
                horizontalLineTo(x = 7.0f)
                arcToRelative(a = 5.0f, b = 5.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -5.0f, dy1 = 5.0f)
                verticalLineToRelative(dy = 5.0f)
                arcToRelative(a = 5.0f, b = 5.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 5.0f, dy1 = 5.0f)
                horizontalLineToRelative(dx = 5.0f)
                arcToRelative(a = 5.0f, b = 5.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 5.0f, dy1 = -5.0f)
                verticalLineToRelative(dy = -4.75f)
                curveTo(x1 = 17.0f, y1 = 9.35f, x2 = 14.65f, y2 = 7.0f, x3 = 11.75f, y3 = 7.0f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 16.5f, y = 2.0f)
                arcToRelative(a = 5.5f, b = 5.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -5.47f, dy1 = 5.0f)
                horizontalLineToRelative(dx = 0.72f)
                curveTo(x1 = 14.65f, y1 = 7.0f, x2 = 17.0f, y2 = 9.35f, x3 = 17.0f, y3 = 12.25f)
                verticalLineToRelative(dy = 0.72f)
                arcTo(horizontalEllipseRadius = 5.5f, verticalEllipseRadius = 5.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 16.5f, y1 = 2.0f)
            }
        }.build().also { _shapesOne = it }
    }

@Suppress("ObjectPropertyName")
private var _shapesOne: ImageVector? = null
