package com.github.yohannestz.iconsax_compose.iconsax.bulk

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Activity: ImageVector
    get() {
        val current = _activity
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Activity",
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
                horizontalLineTo(x = 7.81f)
                curveTo(x1 = 4.17f, y1 = 2.0f, x2 = 2.0f, y2 = 4.17f, x3 = 2.0f, y3 = 7.81f)
                verticalLineToRelative(dy = 8.37f)
                curveTo(x1 = 2.0f, y1 = 19.83f, x2 = 4.17f, y2 = 22.0f, x3 = 7.81f, y3 = 22.0f)
                horizontalLineToRelative(dx = 8.37f)
                curveToRelative(dx1 = 3.64f, dy1 = 0.0f, dx2 = 5.81f, dy2 = -2.17f, dx3 = 5.81f, dy3 = -5.81f)
                verticalLineTo(y = 7.81f)
                curveTo(x1 = 22.0f, y1 = 4.17f, x2 = 19.83f, y2 = 2.0f, x3 = 16.19f, y3 = 2.0f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 7.33f, y = 15.24f)
                arcToRelative(a = 0.7f, b = 0.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.46f, dy1 = -0.16f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.14f, dy1 = -1.05f)
                lineToRelative(dx = 2.38f, dy = -3.1f)
                arcToRelative(a = 1.76f, b = 1.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 2.47f, dy1 = -0.3f)
                lineToRelative(dx = 1.83f, dy = 1.44f)
                arcToRelative(a = 0.2f, b = 0.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.19f, dy1 = 0.05f)
                quadToRelative(dx1 = 0.07f, dy1 = 0.01f, dx2 = 0.17f, dy2 = -0.1f)
                lineToRelative(dx = 2.31f, dy = -2.98f)
                arcToRelative(a = 0.74f, b = 0.74f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.05f, dy1 = -0.13f)
                arcToRelative(a = 0.74f, b = 0.74f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.13f, dy1 = 1.05f)
                lineToRelative(dx = -2.31f, dy = 2.98f)
                arcToRelative(a = 1.7f, b = 1.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.17f, dy1 = 0.66f)
                arcToRelative(a = 1.7f, b = 1.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.3f, dy1 = -0.36f)
                lineToRelative(dx = -1.83f, dy = -1.44f)
                arcToRelative(a = 0.2f, b = 0.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.19f, dy1 = -0.05f)
                quadToRelative(dx1 = -0.07f, dy1 = -0.01f, dx2 = -0.17f, dy2 = 0.1f)
                lineToRelative(dx = -2.38f, dy = 3.09f)
                arcToRelative(a = 0.7f, b = 0.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.58f, dy1 = 0.3f)
            }
        }.build().also { _activity = it }
    }

@Suppress("ObjectPropertyName")
private var _activity: ImageVector? = null
