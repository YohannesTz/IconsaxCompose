package com.github.yohannestz.iconsax_compose.iconsax.bulk

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val PresentionChart: ImageVector
    get() {
        val current = _presentionChart
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.PresentionChart",
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
                moveTo(x = 21.0f, y = 2.0f)
                verticalLineToRelative(dy = 12.1f)
                curveToRelative(dx1 = 0.0f, dy1 = 1.9f, dx2 = -1.0f, dy2 = 2.9f, dx3 = -2.9f, dy3 = 2.9f)
                horizontalLineTo(x = 5.9f)
                curveTo(x1 = 4.0f, y1 = 17.0f, x2 = 3.0f, y2 = 16.0f, x3 = 3.0f, y3 = 14.1f)
                verticalLineTo(y = 2.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 22.0f, y = 2.75f)
                horizontalLineTo(x = 2.0f)
                curveTo(x1 = 1.59f, y1 = 2.75f, x2 = 1.25f, y2 = 2.41f, x3 = 1.25f, y3 = 2.0f)
                reflectiveCurveTo(x1 = 1.59f, y1 = 1.25f, x2 = 2.0f, y2 = 1.25f)
                horizontalLineToRelative(dx = 20.0f)
                curveToRelative(dx1 = 0.41f, dy1 = 0.0f, dx2 = 0.75f, dy2 = 0.34f, dx3 = 0.75f, dy3 = 0.75f)
                reflectiveCurveTo(x1 = 22.41f, y1 = 2.75f, x2 = 22.0f, y2 = 2.75f)
                moveToRelative(dx = -5.33f, dy = 19.59f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.0f, dy1 = 0.33f)
                lineTo(x = 12.0f, y = 20.84f)
                lineToRelative(dx = -3.67f, dy = 1.83f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.0f, dy1 = -0.33f)
                arcToRelative(a = 0.74f, b = 0.74f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.34f, dy1 = -1.01f)
                lineToRelative(dx = 3.58f, dy = -1.79f)
                verticalLineTo(y = 17.0f)
                horizontalLineToRelative(dx = 1.5f)
                verticalLineToRelative(dy = 2.54f)
                lineToRelative(dx = 3.58f, dy = 1.79f)
                arcToRelative(a = 0.74f, b = 0.74f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.34f, dy1 = 1.01f)
                moveTo(x = 7.5f, y = 11.75f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.48f, dy1 = -1.33f)
                lineToRelative(dx = 3.15f, dy = -2.63f)
                arcToRelative(a = 1.3f, b = 1.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.01f, dy1 = -0.28f)
                arcToRelative(a = 1.2f, b = 1.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.86f, dy1 = 0.6f)
                lineToRelative(dx = 1.05f, dy = 1.75f)
                lineToRelative(dx = 2.93f, dy = -2.44f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.06f, dy1 = 0.1f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.1f, dy1 = 1.06f)
                lineToRelative(dx = -3.15f, dy = 2.63f)
                arcToRelative(a = 1.3f, b = 1.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.01f, dy1 = 0.28f)
                arcToRelative(a = 1.2f, b = 1.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.86f, dy1 = -0.6f)
                lineToRelative(dx = -1.05f, dy = -1.75f)
                lineToRelative(dx = -2.93f, dy = 2.44f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.48f, dy1 = 0.17f)
            }
        }.build().also { _presentionChart = it }
    }

@Suppress("ObjectPropertyName")
private var _presentionChart: ImageVector? = null
