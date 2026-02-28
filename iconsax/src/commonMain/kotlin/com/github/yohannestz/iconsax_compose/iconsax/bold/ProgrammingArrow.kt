package com.github.yohannestz.iconsax_compose.iconsax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ProgrammingArrow: ImageVector
    get() {
        val current = _programmingArrow
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.ProgrammingArrow",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 5.75f, y = 16.11f)
                verticalLineTo(y = 7.89f)
                arcTo(horizontalEllipseRadius = 3.0f, verticalEllipseRadius = 3.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 8.0f, y1 = 5.0f)
                arcToRelative(a = 3.0f, b = 3.0f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = -3.75f, dy1 = 2.89f)
                verticalLineToRelative(dy = 8.21f)
                arcTo(horizontalEllipseRadius = 3.0f, verticalEllipseRadius = 3.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 5.0f, y1 = 22.0f)
                arcToRelative(a = 3.0f, b = 3.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.75f, dy1 = -5.89f)
                moveToRelative(dx = 14.0f, dy = 0.0f)
                verticalLineTo(y = 6.5f)
                arcTo(horizontalEllipseRadius = 2.75f, verticalEllipseRadius = 2.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 17.0f, y1 = 3.75f)
                horizontalLineToRelative(dx = -2.93f)
                lineToRelative(dx = 1.41f, dy = -1.17f)
                arcToRelative(a = 0.76f, b = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.1f, dy1 = -1.06f)
                arcToRelative(a = 0.76f, b = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.06f, dy1 = -0.1f)
                lineToRelative(dx = -3.0f, dy = 2.5f)
                arcToRelative(a = 0.76f, b = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 1.16f)
                lineToRelative(dx = 3.0f, dy = 2.5f)
                arcTo(horizontalEllipseRadius = 0.7f, verticalEllipseRadius = 0.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 15.0f, y1 = 7.75f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.48f, dy1 = -1.33f)
                lineToRelative(dx = -1.41f, dy = -1.17f)
                horizontalLineTo(x = 17.0f)
                arcToRelative(a = 1.25f, b = 1.25f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.25f, dy1 = 1.25f)
                verticalLineToRelative(dy = 9.61f)
                arcTo(horizontalEllipseRadius = 3.0f, verticalEllipseRadius = 3.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 16.0f, y1 = 19.0f)
                arcToRelative(a = 3.0f, b = 3.0f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = 3.75f, dy1 = -2.89f)
            }
        }.build().also { _programmingArrow = it }
    }

@Suppress("ObjectPropertyName")
private var _programmingArrow: ImageVector? = null
