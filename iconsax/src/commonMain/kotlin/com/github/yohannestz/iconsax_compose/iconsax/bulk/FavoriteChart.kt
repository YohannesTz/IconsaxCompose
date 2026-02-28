package com.github.yohannestz.iconsax_compose.iconsax.bulk

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FavoriteChart: ImageVector
    get() {
        val current = _favoriteChart
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.FavoriteChart",
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
                moveTo(x = 22.0f, y = 7.81f)
                verticalLineToRelative(dy = 7.35f)
                arcToRelative(a = 4.0f, b = 4.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.97f, dy1 = -0.3f)
                lineToRelative(dx = -0.31f, dy = -0.05f)
                lineToRelative(dx = -0.26f, dy = -0.54f)
                curveToRelative(dx1 = -0.55f, dy1 = -1.12f, dx2 = -1.45f, dy2 = -1.77f, dx3 = -2.46f, dy3 = -1.77f)
                reflectiveCurveToRelative(dx1 = -1.91f, dy1 = 0.65f, dx2 = -2.46f, dy2 = 1.77f)
                lineToRelative(dx = -0.27f, dy = 0.54f)
                lineToRelative(dx = -0.3f, dy = 0.05f)
                curveToRelative(dx1 = -1.19f, dy1 = 0.2f, dx2 = -2.05f, dy2 = 0.86f, dx3 = -2.36f, dy3 = 1.8f)
                curveToRelative(dx1 = -0.3f, dy1 = 0.95f, dx2 = 0.01f, dy2 = 1.99f, dx3 = 0.86f, dy3 = 2.85f)
                lineToRelative(dx = 0.31f, dy = 0.31f)
                lineToRelative(dx = -0.03f, dy = 0.12f)
                arcTo(horizontalEllipseRadius = 3.5f, verticalEllipseRadius = 3.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 13.82f, y1 = 22.0f)
                horizontalLineTo(x = 7.81f)
                curveTo(x1 = 4.17f, y1 = 22.0f, x2 = 2.0f, y2 = 19.83f, x3 = 2.0f, y3 = 16.19f)
                verticalLineTo(y = 7.81f)
                curveTo(x1 = 2.0f, y1 = 4.17f, x2 = 4.17f, y2 = 2.0f, x3 = 7.81f, y3 = 2.0f)
                horizontalLineToRelative(dx = 8.38f)
                curveTo(x1 = 19.83f, y1 = 2.0f, x2 = 22.0f, y2 = 4.17f, x3 = 22.0f, y3 = 7.81f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 19.12f, y = 14.94f)
                lineToRelative(dx = 0.32f, dy = 0.65f)
                arcToRelative(a = 1.4f, b = 1.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.91f, dy1 = 0.68f)
                lineToRelative(dx = 0.43f, dy = 0.07f)
                curveToRelative(dx1 = 1.31f, dy1 = 0.22f, dx2 = 1.61f, dy2 = 1.18f, dx3 = 0.68f, dy3 = 2.12f)
                lineToRelative(dx = -0.4f, dy = 0.4f)
                arcToRelative(a = 1.4f, b = 1.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.33f, dy1 = 1.17f)
                lineToRelative(dx = 0.05f, dy = 0.24f)
                curveToRelative(dx1 = 0.36f, dy1 = 1.58f, dx2 = -0.48f, dy2 = 2.2f, dx3 = -1.85f, dy3 = 1.36f)
                lineToRelative(dx = -0.29f, dy = -0.18f)
                arcToRelative(a = 1.4f, b = 1.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.28f, dy1 = 0.0f)
                lineToRelative(dx = -0.29f, dy = 0.18f)
                curveToRelative(dx1 = -1.38f, dy1 = 0.83f, dx2 = -2.21f, dy2 = 0.22f, dx3 = -1.85f, dy3 = -1.36f)
                lineToRelative(dx = 0.05f, dy = -0.24f)
                arcToRelative(a = 1.4f, b = 1.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.33f, dy1 = -1.17f)
                lineToRelative(dx = -0.4f, dy = -0.4f)
                curveToRelative(dx1 = -0.93f, dy1 = -0.95f, dx2 = -0.63f, dy2 = -1.9f, dx3 = 0.68f, dy3 = -2.12f)
                lineToRelative(dx = 0.43f, dy = -0.07f)
                arcToRelative(a = 1.4f, b = 1.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.91f, dy1 = -0.68f)
                lineToRelative(dx = 0.32f, dy = -0.65f)
                curveToRelative(dx1 = 0.62f, dy1 = -1.25f, dx2 = 1.62f, dy2 = -1.25f, dx3 = 2.24f, dy3 = 0.0f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(x = 16.13f, y = 7.92f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.13f, dy1 = 1.05f)
                lineToRelative(dx = -2.31f, dy = 2.99f)
                arcToRelative(a = 1.76f, b = 1.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -2.46f, dy1 = 0.3f)
                lineTo(x = 9.66f, y = 10.8f)
                arcToRelative(a = 0.25f, b = 0.25f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.36f, dy1 = 0.05f)
                lineToRelative(dx = -2.38f, dy = 3.09f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = true, dx1 = -1.18f, dy1 = -0.92f)
                lineToRelative(dx = 2.38f, dy = -3.09f)
                arcToRelative(a = 1.75f, b = 1.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 2.46f, dy1 = -0.31f)
                lineToRelative(dx = 1.83f, dy = 1.44f)
                arcToRelative(a = 0.26f, b = 0.26f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.36f, dy1 = -0.04f)
                lineToRelative(dx = 2.3f, dy = -2.98f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.06f, dy1 = -0.13f)
            }
        }.build().also { _favoriteChart = it }
    }

@Suppress("ObjectPropertyName")
private var _favoriteChart: ImageVector? = null
