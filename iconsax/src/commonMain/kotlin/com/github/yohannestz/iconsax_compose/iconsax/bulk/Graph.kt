package com.github.yohannestz.iconsax_compose.iconsax.bulk

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Graph: ImageVector
    get() {
        val current = _graph
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Graph",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 21.67f, y = 6.95f)
                arcToRelative(a = 7.0f, b = 7.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -4.62f, dy1 = -4.62f)
                curveToRelative(dx1 = -1.65f, dy1 = -0.48f, dx2 = -2.79f, dy2 = -0.44f, dx3 = -3.58f, dy3 = 0.15f)
                curveToRelative(dx1 = -0.95f, dy1 = 0.71f, dx2 = -1.06f, dy2 = 1.99f, dx3 = -1.06f, dy3 = 2.9f)
                verticalLineToRelative(dy = 2.49f)
                quadToRelative(dx1 = 0.01f, dy1 = 3.7f, dx2 = 3.32f, dy2 = 3.71f)
                horizontalLineToRelative(dx = 2.87f)
                curveToRelative(dx1 = 0.9f, dy1 = 0.0f, dx2 = 2.19f, dy2 = -0.11f, dx3 = 2.9f, dy3 = -1.06f)
                curveToRelative(dx1 = 0.61f, dy1 = -0.78f, dx2 = 0.66f, dy2 = -1.92f, dx3 = 0.17f, dy3 = -3.57f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
                fillAlpha = 0.4f,
                strokeAlpha = 0.4f,
            ) {
                moveTo(x = 18.91f, y = 13.36f)
                arcToRelative(a = 1.4f, b = 1.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.03f, dy1 = -0.47f)
                horizontalLineTo(x = 14.3f)
                arcToRelative(a = 3.2f, b = 3.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -3.19f, dy1 = -3.19f)
                verticalLineTo(y = 6.12f)
                arcToRelative(a = 1.37f, b = 1.37f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.54f, dy1 = -1.36f)
                arcTo(horizontalEllipseRadius = 8.7f, verticalEllipseRadius = 8.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 3.65f, y1 = 8.3f)
                arcToRelative(a = 8.64f, b = 8.64f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = 15.59f, dy1 = 6.14f)
                arcToRelative(a = 1.3f, b = 1.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.33f, dy1 = -1.07f)
            }
        }.build().also { _graph = it }
    }

@Suppress("ObjectPropertyName")
private var _graph: ImageVector? = null
