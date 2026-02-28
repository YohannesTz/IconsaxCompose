package com.github.yohannestz.iconsax_compose.iconsax.bulk

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Folder: ImageVector
    get() {
        val current = _folder
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Folder",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 22.0f, y = 11.07f)
                verticalLineToRelative(dy = 5.58f)
                curveTo(x1 = 22.0f, y1 = 19.6f, x2 = 19.6f, y2 = 22.0f, x3 = 16.65f, y3 = 22.0f)
                horizontalLineToRelative(dx = -9.3f)
                arcTo(horizontalEllipseRadius = 5.36f, verticalEllipseRadius = 5.36f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 2.0f, y1 = 16.65f)
                verticalLineToRelative(dy = -7.2f)
                horizontalLineToRelative(dx = 19.74f)
                arcToRelative(a = 5.0f, b = 5.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.25f, dy1 = 1.4f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
                fillAlpha = 0.4f,
                strokeAlpha = 0.4f,
            ) {
                moveTo(x = 21.74f, y = 9.44f)
                horizontalLineTo(x = 2.0f)
                verticalLineTo(y = 6.42f)
                arcTo(horizontalEllipseRadius = 4.4f, verticalEllipseRadius = 4.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 6.42f, y1 = 2.0f)
                horizontalLineToRelative(dx = 2.33f)
                curveToRelative(dx1 = 1.63f, dy1 = 0.0f, dx2 = 2.14f, dy2 = 0.53f, dx3 = 2.79f, dy3 = 1.4f)
                lineToRelative(dx = 1.4f, dy = 1.86f)
                curveToRelative(dx1 = 0.31f, dy1 = 0.41f, dx2 = 0.35f, dy2 = 0.47f, dx3 = 0.93f, dy3 = 0.47f)
                horizontalLineToRelative(dx = 2.79f)
                arcToRelative(a = 5.3f, b = 5.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 5.08f, dy1 = 3.71f)
            }
        }.build().also { _folder = it }
    }

@Suppress("ObjectPropertyName")
private var _folder: ImageVector? = null
