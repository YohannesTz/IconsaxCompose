package com.github.yohannestz.iconsax_compose.iconsax.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Flash: ImageVector
    get() {
        val current = _flash
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Flash",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 9.99f, y = 22.75f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.48f, dy1 = -0.09f)
                curveToRelative(dx1 = -0.4f, dy1 = -0.15f, dx2 = -1.08f, dy2 = -0.64f, dx3 = -1.08f, dy3 = -2.19f)
                verticalLineToRelative(dy = -6.45f)
                horizontalLineTo(x = 6.09f)
                curveToRelative(dx1 = -1.34f, dy1 = 0.0f, dx2 = -1.82f, dy2 = -0.63f, dx3 = -1.99f, dy3 = -1.0f)
                curveToRelative(dx1 = -0.17f, dy1 = -0.38f, dx2 = -0.32f, dy2 = -1.15f, dx3 = 0.56f, dy3 = -2.16f)
                lineToRelative(dx = 7.57f, dy = -8.6f)
                curveToRelative(dx1 = 1.02f, dy1 = -1.16f, dx2 = 1.85f, dy2 = -1.08f, dx3 = 2.25f, dy3 = -0.93f)
                reflectiveCurveToRelative(dx1 = 1.08f, dy1 = 0.64f, dx2 = 1.08f, dy2 = 2.19f)
                verticalLineToRelative(dy = 6.45f)
                horizontalLineToRelative(dx = 2.34f)
                curveToRelative(dx1 = 1.34f, dy1 = 0.0f, dx2 = 1.82f, dy2 = 0.63f, dx3 = 1.99f, dy3 = 1.0f)
                curveToRelative(dx1 = 0.17f, dy1 = 0.38f, dx2 = 0.32f, dy2 = 1.15f, dx3 = -0.56f, dy3 = 2.16f)
                lineToRelative(dx = -7.57f, dy = 8.6f)
                curveToRelative(dx1 = -0.71f, dy1 = 0.81f, dx2 = -1.33f, dy2 = 1.02f, dx3 = -1.77f, dy3 = 1.02f)
                moveToRelative(dx = 3.94f, dy = -20.01f)
                curveToRelative(dx1 = -0.03f, dy1 = 0.04f, dx2 = -0.24f, dy2 = 0.14f, dx3 = -0.57f, dy3 = 0.52f)
                lineToRelative(dx = -7.57f, dy = 8.6f)
                curveToRelative(dx1 = -0.28f, dy1 = 0.32f, dx2 = -0.32f, dy2 = 0.52f, dx3 = -0.32f, dy3 = 0.56f)
                curveToRelative(dx1 = 0.02f, dy1 = 0.01f, dx2 = 0.2f, dy2 = 0.11f, dx3 = 0.62f, dy3 = 0.11f)
                horizontalLineToRelative(dx = 3.09f)
                arcToRelative(a = 0.76f, b = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.75f, dy1 = 0.75f)
                verticalLineToRelative(dy = 7.2f)
                curveToRelative(dx1 = 0.0f, dy1 = 0.5f, dx2 = 0.09f, dy2 = 0.72f, dx3 = 0.13f, dy3 = 0.78f)
                curveToRelative(dx1 = 0.03f, dy1 = -0.04f, dx2 = 0.24f, dy2 = -0.14f, dx3 = 0.57f, dy3 = -0.52f)
                lineToRelative(dx = 7.57f, dy = -8.6f)
                curveToRelative(dx1 = 0.28f, dy1 = -0.32f, dx2 = 0.32f, dy2 = -0.52f, dx3 = 0.32f, dy3 = -0.56f)
                curveToRelative(dx1 = -0.02f, dy1 = -0.01f, dx2 = -0.2f, dy2 = -0.11f, dx3 = -0.62f, dy3 = -0.11f)
                horizontalLineToRelative(dx = -3.09f)
                arcToRelative(a = 0.76f, b = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.75f, dy1 = -0.75f)
                verticalLineToRelative(dy = -7.2f)
                curveToRelative(dx1 = 0.01f, dy1 = -0.5f, dx2 = -0.09f, dy2 = -0.71f, dx3 = -0.13f, dy3 = -0.78f)
            }
        }.build().also { _flash = it }
    }

@Suppress("ObjectPropertyName")
private var _flash: ImageVector? = null
