package com.github.yohannestz.iconsax_compose.iconsax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val RefreshLeftSquare: ImageVector
    get() {
        val current = _refreshLeftSquare
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.RefreshLeftSquare",
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
                moveTo(x = 12.0f, y = 18.01f)
                arcToRelative(a = 5.76f, b = 5.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -4.78f, dy1 = -8.94f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = true, dx1 = 1.24f, dy1 = 0.83f)
                arcToRelative(a = 4.3f, b = 4.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.71f, dy1 = 2.36f)
                arcTo(horizontalEllipseRadius = 4.26f, verticalEllipseRadius = 4.26f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 12.0f, y1 = 16.51f)
                arcToRelative(a = 4.26f, b = 4.26f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 4.25f, dy1 = -4.25f)
                arcTo(horizontalEllipseRadius = 4.26f, verticalEllipseRadius = 4.26f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 12.0f, y1 = 8.01f)
                quadToRelative(dx1 = -0.28f, dy1 = 0.0f, dx2 = -0.56f, dy2 = 0.04f)
                lineTo(x = 12.0f, y = 8.46f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.16f, dy1 = 1.05f)
                arcToRelative(a = 0.8f, b = 0.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.61f, dy1 = 0.31f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.44f, dy1 = -0.14f)
                lineTo(x = 9.17f, y = 8.25f)
                lineTo(x = 9.15f, y = 8.23f)
                lineTo(x = 9.12f, y = 8.21f)
                quadTo(x1 = 9.08f, y1 = 8.17f, x2 = 9.05f, y2 = 8.12f)
                lineTo(x = 8.96f, y = 8.0f)
                lineTo(x = 8.91f, y = 7.87f)
                quadTo(x1 = 8.89f, y1 = 7.8f, x2 = 8.88f, y2 = 7.73f)
                lineToRelative(dx = 0.01f, dy = -0.14f)
                quadToRelative(dx1 = 0.0f, dy1 = -0.07f, dx2 = 0.02f, dy2 = -0.14f)
                quadToRelative(dx1 = 0.01f, dy1 = -0.07f, dx2 = 0.05f, dy2 = -0.14f)
                quadToRelative(dx1 = 0.02f, dy1 = -0.05f, dx2 = 0.05f, dy2 = -0.11f)
                lineToRelative(dx = 0.03f, dy = -0.02f)
                lineToRelative(dx = 0.02f, dy = -0.03f)
                lineToRelative(dx = 1.67f, dy = -1.91f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.06f, dy1 = -0.07f)
                arcToRelative(a = 0.76f, b = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.07f, dy1 = 1.06f)
                lineToRelative(dx = -0.28f, dy = 0.32f)
                quadToRelative(dx1 = 0.2f, dy1 = -0.02f, dx2 = 0.43f, dy2 = -0.03f)
                arcTo(horizontalEllipseRadius = 5.76f, verticalEllipseRadius = 5.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 12.0f, y1 = 18.01f)
            }
        }.build().also { _refreshLeftSquare = it }
    }

@Suppress("ObjectPropertyName")
private var _refreshLeftSquare: ImageVector? = null
