package com.github.yohannestz.iconsax_compose.iconsax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ProgrammingArrows: ImageVector
    get() {
        val current = _programmingArrows
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.ProgrammingArrows",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 19.73f, y = 16.1f)
                lineToRelative(dx = 0.02f, dy = -0.1f)
                verticalLineTo(y = 6.5f)
                arcTo(horizontalEllipseRadius = 2.75f, verticalEllipseRadius = 2.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 17.0f, y1 = 3.75f)
                horizontalLineToRelative(dx = -3.93f)
                lineToRelative(dx = 1.41f, dy = -1.17f)
                arcToRelative(a = 0.76f, b = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.1f, dy1 = -1.06f)
                arcToRelative(a = 0.76f, b = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.06f, dy1 = -0.1f)
                lineToRelative(dx = -3.0f, dy = 2.5f)
                arcToRelative(a = 0.76f, b = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 1.16f)
                lineToRelative(dx = 3.0f, dy = 2.5f)
                arcTo(horizontalEllipseRadius = 0.7f, verticalEllipseRadius = 0.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 14.0f, y1 = 7.75f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.48f, dy1 = -1.33f)
                lineToRelative(dx = -1.41f, dy = -1.17f)
                horizontalLineTo(x = 17.0f)
                arcToRelative(a = 1.25f, b = 1.25f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.25f, dy1 = 1.25f)
                verticalLineTo(y = 16.0f)
                lineToRelative(dx = 0.02f, dy = 0.1f)
                arcToRelative(a = 3.0f, b = 3.0f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = 1.46f, dy1 = 0.0f)
                moveToRelative(dx = -6.25f, dy = 2.82f)
                lineToRelative(dx = -3.0f, dy = -2.5f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.06f, dy1 = 0.1f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.1f, dy1 = 1.06f)
                lineToRelative(dx = 1.41f, dy = 1.17f)
                horizontalLineTo(x = 7.0f)
                arcToRelative(a = 1.25f, b = 1.25f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.25f, dy1 = -1.25f)
                verticalLineTo(y = 8.0f)
                lineTo(x = 5.73f, y = 7.9f)
                arcToRelative(a = 3.0f, b = 3.0f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = -1.46f, dy1 = 0.0f)
                lineTo(x = 4.25f, y = 8.0f)
                verticalLineToRelative(dy = 9.5f)
                arcTo(horizontalEllipseRadius = 2.75f, verticalEllipseRadius = 2.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 7.0f, y1 = 20.25f)
                horizontalLineToRelative(dx = 3.93f)
                lineToRelative(dx = -1.41f, dy = 1.17f)
                arcToRelative(a = 0.76f, b = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.1f, dy1 = 1.06f)
                arcToRelative(a = 0.7f, b = 0.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.58f, dy1 = 0.27f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.48f, dy1 = -0.17f)
                lineToRelative(dx = 3.0f, dy = -2.5f)
                arcToRelative(a = 0.76f, b = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = -1.16f)
            }
        }.build().also { _programmingArrows = it }
    }

@Suppress("ObjectPropertyName")
private var _programmingArrows: ImageVector? = null
