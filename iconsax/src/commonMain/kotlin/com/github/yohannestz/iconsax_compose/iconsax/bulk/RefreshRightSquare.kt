package com.github.yohannestz.iconsax_compose.iconsax.bulk

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val RefreshRightSquare: ImageVector
    get() {
        val current = _refreshRightSquare
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.RefreshRightSquare",
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
                moveTo(x = 16.19f, y = 2.0f)
                horizontalLineTo(x = 7.82f)
                curveTo(x1 = 4.17f, y1 = 2.0f, x2 = 2.0f, y2 = 4.17f, x3 = 2.0f, y3 = 7.81f)
                verticalLineToRelative(dy = 8.37f)
                curveToRelative(dx1 = 0.0f, dy1 = 3.64f, dx2 = 2.17f, dy2 = 5.81f, dx3 = 5.81f, dy3 = 5.81f)
                horizontalLineToRelative(dx = 8.37f)
                curveToRelative(dx1 = 3.64f, dy1 = 0.0f, dx2 = 5.81f, dy2 = -2.17f, dx3 = 5.81f, dy3 = -5.81f)
                verticalLineTo(y = 7.81f)
                curveTo(x1 = 22.0f, y1 = 4.17f, x2 = 19.83f, y2 = 2.0f, x3 = 16.19f, y3 = 2.0f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 16.78f, y = 9.07f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.04f, dy1 = -0.21f)
                arcToRelative(a = 0.76f, b = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.21f, dy1 = 1.04f)
                arcToRelative(a = 4.26f, b = 4.26f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -3.54f, dy1 = 6.61f)
                arcToRelative(a = 4.26f, b = 4.26f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -4.25f, dy1 = -4.25f)
                arcToRelative(a = 4.26f, b = 4.26f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 4.25f, dy1 = -4.25f)
                quadToRelative(dx1 = 0.28f, dy1 = 0.0f, dx2 = 0.56f, dy2 = 0.04f)
                lineTo(x = 12.0f, y = 8.46f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.16f, dy1 = 1.05f)
                arcToRelative(a = 0.8f, b = 0.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.61f, dy1 = 0.31f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.44f, dy1 = -0.14f)
                lineToRelative(dx = 1.94f, dy = -1.42f)
                lineToRelative(dx = 0.02f, dy = -0.02f)
                lineToRelative(dx = 0.03f, dy = -0.02f)
                lineToRelative(dx = 0.07f, dy = -0.09f)
                quadTo(x1 = 15.0f, y1 = 8.08f, x2 = 15.04f, y2 = 8.01f)
                lineToRelative(dx = 0.05f, dy = -0.13f)
                lineToRelative(dx = 0.04f, dy = -0.14f)
                quadToRelative(dx1 = 0.01f, dy1 = -0.07f, dx2 = -0.01f, dy2 = -0.14f)
                quadToRelative(dx1 = 0.0f, dy1 = -0.07f, dx2 = -0.02f, dy2 = -0.14f)
                reflectiveQuadToRelative(dx1 = -0.06f, dy1 = -0.14f)
                quadToRelative(dx1 = -0.02f, dy1 = -0.05f, dx2 = -0.05f, dy2 = -0.11f)
                lineToRelative(dx = -0.02f, dy = -0.02f)
                lineToRelative(dx = -0.02f, dy = -0.03f)
                lineToRelative(dx = -1.67f, dy = -1.91f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.06f, dy1 = -0.07f)
                arcToRelative(a = 0.76f, b = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.07f, dy1 = 1.06f)
                lineToRelative(dx = 0.28f, dy = 0.32f)
                quadTo(x1 = 12.23f, y1 = 6.54f, x2 = 12.0f, y2 = 6.53f)
                arcToRelative(a = 5.76f, b = 5.76f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = 4.78f, dy1 = 2.54f)
            }
        }.build().also { _refreshRightSquare = it }
    }

@Suppress("ObjectPropertyName")
private var _refreshRightSquare: ImageVector? = null
