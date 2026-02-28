package com.github.yohannestz.iconsax_compose.iconsax.bulk

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SidebarTop: ImageVector
    get() {
        val current = _sidebarTop
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.SidebarTop",
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
                moveTo(x = 7.81f, y = 22.0f)
                horizontalLineToRelative(dx = 8.38f)
                curveToRelative(dx1 = 3.64f, dy1 = 0.0f, dx2 = 5.81f, dy2 = -2.17f, dx3 = 5.81f, dy3 = -5.81f)
                verticalLineTo(y = 7.81f)
                lineToRelative(dx = -0.02f, dy = -0.59f)
                arcToRelative(a = 6.0f, b = 6.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.03f, dy1 = -3.09f)
                arcToRelative(a = 4.0f, b = 4.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.08f, dy1 = -1.08f)
                arcTo(horizontalEllipseRadius = 6.0f, verticalEllipseRadius = 6.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 16.19f, y1 = 2.0f)
                horizontalLineTo(x = 7.81f)
                curveTo(x1 = 4.37f, y1 = 2.0f, x2 = 2.24f, y2 = 3.94f, x3 = 2.03f, y3 = 7.22f)
                lineTo(x = 2.0f, y = 7.81f)
                verticalLineToRelative(dy = 8.38f)
                arcToRelative(a = 6.0f, b = 6.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.05f, dy1 = 3.68f)
                arcToRelative(a = 4.0f, b = 4.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.08f, dy1 = 1.08f)
                arcTo(horizontalEllipseRadius = 6.0f, verticalEllipseRadius = 6.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 7.81f, y1 = 22.0f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 2.0f, y = 8.72f)
                horizontalLineToRelative(dx = 20.0f)
                verticalLineTo(y = 7.8f)
                lineToRelative(dx = -0.02f, dy = -0.6f)
                horizontalLineTo(x = 2.03f)
                lineTo(x = 2.0f, y = 7.82f)
                close()
                moveToRelative(dx = 13.31f, dy = 6.25f)
                arcToRelative(a = 0.7f, b = 0.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.22f, dy1 = -0.53f)
                lineToRelative(dx = -2.56f, dy = -2.56f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.06f, dy1 = 0.0f)
                lineToRelative(dx = -2.56f, dy = 2.56f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 1.06f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.06f, dy1 = 0.0f)
                lineTo(x = 12.0f, y = 13.48f)
                lineToRelative(dx = 2.03f, dy = 2.03f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.28f, dy1 = -0.54f)
            }
        }.build().also { _sidebarTop = it }
    }

@Suppress("ObjectPropertyName")
private var _sidebarTop: ImageVector? = null
