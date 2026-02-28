package com.github.yohannestz.iconsax_compose.iconsax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val More: ImageVector
    get() {
        val current = _more
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.More",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 16.19f, y = 2.0f)
                horizontalLineTo(x = 7.81f)
                curveTo(x1 = 4.17f, y1 = 2.0f, x2 = 2.0f, y2 = 4.17f, x3 = 2.0f, y3 = 7.81f)
                verticalLineToRelative(dy = 8.37f)
                curveTo(x1 = 2.0f, y1 = 19.83f, x2 = 4.17f, y2 = 22.0f, x3 = 7.81f, y3 = 22.0f)
                horizontalLineToRelative(dx = 8.37f)
                curveToRelative(dx1 = 3.64f, dy1 = 0.0f, dx2 = 5.81f, dy2 = -2.17f, dx3 = 5.81f, dy3 = -5.81f)
                verticalLineTo(y = 7.81f)
                curveTo(x1 = 22.0f, y1 = 4.17f, x2 = 19.83f, y2 = 2.0f, x3 = 16.19f, y3 = 2.0f)
                moveTo(x = 7.0f, y = 13.31f)
                arcTo(horizontalEllipseRadius = 1.3f, verticalEllipseRadius = 1.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 5.69f, y1 = 12.0f)
                arcTo(horizontalEllipseRadius = 1.3f, verticalEllipseRadius = 1.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 7.0f, y1 = 10.69f)
                arcTo(horizontalEllipseRadius = 1.3f, verticalEllipseRadius = 1.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 8.31f, y1 = 12.0f)
                arcTo(horizontalEllipseRadius = 1.3f, verticalEllipseRadius = 1.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 7.0f, y1 = 13.31f)
                moveToRelative(dx = 5.0f, dy = 0.0f)
                arcTo(horizontalEllipseRadius = 1.3f, verticalEllipseRadius = 1.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 10.69f, y1 = 12.0f)
                arcTo(horizontalEllipseRadius = 1.3f, verticalEllipseRadius = 1.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 12.0f, y1 = 10.69f)
                arcTo(horizontalEllipseRadius = 1.3f, verticalEllipseRadius = 1.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 13.31f, y1 = 12.0f)
                arcTo(horizontalEllipseRadius = 1.3f, verticalEllipseRadius = 1.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 12.0f, y1 = 13.31f)
                moveToRelative(dx = 5.0f, dy = 0.0f)
                arcTo(horizontalEllipseRadius = 1.3f, verticalEllipseRadius = 1.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 15.69f, y1 = 12.0f)
                arcTo(horizontalEllipseRadius = 1.3f, verticalEllipseRadius = 1.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 17.0f, y1 = 10.69f)
                arcTo(horizontalEllipseRadius = 1.3f, verticalEllipseRadius = 1.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 18.31f, y1 = 12.0f)
                arcTo(horizontalEllipseRadius = 1.3f, verticalEllipseRadius = 1.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 17.0f, y1 = 13.31f)
            }
        }.build().also { _more = it }
    }

@Suppress("ObjectPropertyName")
private var _more: ImageVector? = null
