package com.github.yohannestz.iconsax_compose.iconsax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Airplane: ImageVector
    get() {
        val current = _airplane
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Airplane",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 20.05f, y = 10.63f)
                lineToRelative(dx = -4.67f, dy = -2.01f)
                lineToRelative(dx = -1.04f, dy = -0.44f)
                arcToRelative(a = 0.6f, b = 0.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.3f, dy1 = -0.47f)
                verticalLineTo(y = 4.65f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.96f, dx2 = -0.71f, dy2 = -2.1f, dx3 = -1.57f, dy3 = -2.54f)
                arcToRelative(a = 1.1f, b = 1.1f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.96f, dy1 = 0.0f)
                arcToRelative(a = 3.2f, b = 3.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.56f, dy1 = 2.55f)
                verticalLineToRelative(dy = 3.06f)
                arcToRelative(a = 0.6f, b = 0.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.3f, dy1 = 0.47f)
                lineToRelative(dx = -5.7f, dy = 2.45f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.14f, dy1 = 1.73f)
                verticalLineToRelative(dy = 1.32f)
                curveToRelative(dx1 = 0.0f, dy1 = 0.85f, dx2 = 0.64f, dy2 = 1.27f, dx3 = 1.43f, dy3 = 0.93f)
                lineToRelative(dx = 5.0f, dy = -2.16f)
                curveToRelative(dx1 = 0.4f, dy1 = -0.17f, dx2 = 0.72f, dy2 = 0.04f, dx3 = 0.72f, dy3 = 0.47f)
                verticalLineToRelative(dy = 2.9f)
                arcToRelative(a = 1.2f, b = 1.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.3f, dy1 = 0.73f)
                lineToRelative(dx = -2.31f, dy = 2.33f)
                curveTo(x1 = 7.1f, y1 = 19.13f, x2 = 7.0f, y2 = 19.59f, x3 = 7.1f, y3 = 19.94f)
                lineToRelative(dx = 0.45f, dy = 1.36f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.4f, dy1 = 0.59f)
                lineToRelative(dx = 2.38f, dy = -2.0f)
                arcToRelative(a = 1.04f, b = 1.04f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.3f, dy1 = 0.0f)
                lineToRelative(dx = 2.39f, dy = 2.0f)
                arcToRelative(a = 1.02f, b = 1.02f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.42f, dy1 = -0.6f)
                lineToRelative(dx = 0.45f, dy = -1.35f)
                arcToRelative(a = 1.1f, b = 1.1f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.24f, dy1 = -1.05f)
                lineToRelative(dx = -2.32f, dy = -2.33f)
                arcToRelative(a = 1.1f, b = 1.1f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.3f, dy1 = -0.72f)
                verticalLineToRelative(dy = -2.91f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.43f, dx2 = 0.3f, dy2 = -0.63f, dx3 = 0.7f, dy3 = -0.47f)
                lineToRelative(dx = 5.02f, dy = 2.16f)
                curveToRelative(dx1 = 0.79f, dy1 = 0.34f, dx2 = 1.43f, dy2 = -0.08f, dx3 = 1.43f, dy3 = -0.93f)
                verticalLineToRelative(dy = -1.32f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.14f, dy1 = -1.74f)
            }
        }.build().also { _airplane = it }
    }

@Suppress("ObjectPropertyName")
private var _airplane: ImageVector? = null
