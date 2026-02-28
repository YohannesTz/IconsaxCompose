package com.github.yohannestz.iconsax_compose.iconsax.bulk

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
                moveTo(x = 12.0f, y = 6.51f)
                lineToRelative(dx = -0.43f, dy = 0.03f)
                lineToRelative(dx = 0.28f, dy = -0.32f)
                arcToRelative(a = 0.76f, b = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.07f, dy1 = -1.06f)
                arcToRelative(a = 0.76f, b = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.06f, dy1 = 0.07f)
                lineTo(x = 9.05f, y = 7.14f)
                lineTo(x = 9.03f, y = 7.17f)
                lineTo(x = 9.01f, y = 7.19f)
                lineTo(x = 8.96f, y = 7.3f)
                quadTo(x1 = 8.92f, y1 = 7.37f, x2 = 8.9f, y2 = 7.44f)
                lineTo(x = 8.88f, y = 7.58f)
                lineTo(x = 8.87f, y = 7.72f)
                quadToRelative(dx1 = 0.0f, dy1 = 0.07f, dx2 = 0.04f, dy2 = 0.14f)
                lineToRelative(dx = 0.05f, dy = 0.13f)
                lineToRelative(dx = 0.09f, dy = 0.12f)
                quadTo(x1 = 9.09f, y1 = 8.16f, x2 = 9.12f, y2 = 8.2f)
                lineToRelative(dx = 0.03f, dy = 0.02f)
                lineToRelative(dx = 0.02f, dy = 0.02f)
                lineToRelative(dx = 1.94f, dy = 1.42f)
                arcToRelative(a = 0.7f, b = 0.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.44f, dy1 = 0.14f)
                arcToRelative(a = 0.8f, b = 0.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.61f, dy1 = -0.31f)
                arcTo(horizontalEllipseRadius = 0.76f, verticalEllipseRadius = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 12.0f, y1 = 8.44f)
                lineToRelative(dx = -0.56f, dy = -0.41f)
                lineTo(x = 12.0f, y = 7.99f)
                arcToRelative(a = 4.26f, b = 4.26f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 4.25f, dy1 = 4.25f)
                arcTo(horizontalEllipseRadius = 4.26f, verticalEllipseRadius = 4.26f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 12.0f, y1 = 16.49f)
                arcToRelative(a = 4.26f, b = 4.26f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -4.25f, dy1 = -4.25f)
                arcToRelative(a = 4.3f, b = 4.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.71f, dy1 = -2.36f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.21f, dy1 = -1.04f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.04f, dy1 = 0.21f)
                arcTo(horizontalEllipseRadius = 5.75f, verticalEllipseRadius = 5.75f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, x1 = 12.0f, y1 = 6.51f)
            }
        }.build().also { _refreshLeftSquare = it }
    }

@Suppress("ObjectPropertyName")
private var _refreshLeftSquare: ImageVector? = null
