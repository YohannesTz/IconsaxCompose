package com.github.yohannestz.iconsax_compose.iconsax.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Health: ImageVector
    get() {
        val current = _health
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Health",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 14.97f, y = 22.75f)
                horizontalLineToRelative(dx = -6.0f)
                curveToRelative(dx1 = -5.43f, dy1 = 0.0f, dx2 = -7.75f, dy2 = -2.32f, dx3 = -7.75f, dy3 = -7.75f)
                verticalLineTo(y = 9.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -5.43f, dx2 = 2.32f, dy2 = -7.75f, dx3 = 7.75f, dy3 = -7.75f)
                horizontalLineToRelative(dx = 6.0f)
                curveToRelative(dx1 = 5.43f, dy1 = 0.0f, dx2 = 7.75f, dy2 = 2.32f, dx3 = 7.75f, dy3 = 7.75f)
                verticalLineToRelative(dy = 6.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 5.43f, dx2 = -2.31f, dy2 = 7.75f, dx3 = -7.75f, dy3 = 7.75f)
                moveToRelative(dx = -6.0f, dy = -20.0f)
                curveTo(x1 = 4.36f, y1 = 2.75f, x2 = 2.72f, y2 = 4.39f, x3 = 2.72f, y3 = 9.0f)
                verticalLineToRelative(dy = 6.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 4.61f, dx2 = 1.64f, dy2 = 6.25f, dx3 = 6.25f, dy3 = 6.25f)
                horizontalLineToRelative(dx = 6.0f)
                curveToRelative(dx1 = 4.61f, dy1 = 0.0f, dx2 = 6.25f, dy2 = -1.64f, dx3 = 6.25f, dy3 = -6.25f)
                verticalLineTo(y = 9.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -4.61f, dx2 = -1.64f, dy2 = -6.25f, dx3 = -6.25f, dy3 = -6.25f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 11.45f, y = 18.06f)
                curveToRelative(dx1 = -0.24f, dy1 = 0.0f, dx2 = -0.82f, dy2 = -0.09f, dx3 = -1.16f, dy3 = -0.96f)
                lineToRelative(dx = -1.14f, dy = -2.88f)
                arcToRelative(a = 1.4f, b = 1.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.16f, dy1 = -0.79f)
                lineToRelative(dx = -6.0f, dy = 0.02f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = true, dx1 = 0.0f, dy1 = -1.5f)
                lineToRelative(dx = 6.0f, dy = -0.02f)
                horizontalLineTo(x = 8.0f)
                arcToRelative(a = 2.9f, b = 2.9f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 2.56f, dy1 = 1.74f)
                lineToRelative(dx = 0.91f, dy = 2.3f)
                lineToRelative(dx = 2.06f, dy = -5.22f)
                curveToRelative(dx1 = 0.31f, dy1 = -0.78f, dx2 = 0.86f, dy2 = -0.89f, dx3 = 1.09f, dy3 = -0.91f)
                curveToRelative(dx1 = 0.23f, dy1 = -0.01f, dx2 = 0.79f, dy2 = 0.04f, dx3 = 1.18f, dy3 = 0.78f)
                lineToRelative(dx = 1.04f, dy = 1.97f)
                arcToRelative(a = 1.5f, b = 1.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.11f, dy1 = 0.67f)
                horizontalLineToRelative(dx = 4.06f)
                curveToRelative(dx1 = 0.41f, dy1 = 0.0f, dx2 = 0.75f, dy2 = 0.34f, dx3 = 0.75f, dy3 = 0.75f)
                reflectiveCurveToRelative(dx1 = -0.34f, dy1 = 0.75f, dx2 = -0.75f, dy2 = 0.75f)
                horizontalLineToRelative(dx = -4.06f)
                arcToRelative(a = 2.9f, b = 2.9f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -2.43f, dy1 = -1.47f)
                lineToRelative(dx = -0.78f, dy = -1.48f)
                lineToRelative(dx = -2.1f, dy = 5.29f)
                curveToRelative(dx1 = -0.37f, dy1 = 0.86f, dx2 = -0.96f, dy2 = 0.96f, dx3 = -1.19f, dy3 = 0.96f)
            }
        }.build().also { _health = it }
    }

@Suppress("ObjectPropertyName")
private var _health: ImageVector? = null
