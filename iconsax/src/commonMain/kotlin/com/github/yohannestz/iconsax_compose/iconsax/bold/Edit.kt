package com.github.yohannestz.iconsax_compose.iconsax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Edit: ImageVector
    get() {
        val current = _edit
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Edit",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
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
                moveToRelative(dx = -5.24f, dy = 15.51f)
                arcToRelative(a = 2.6f, b = 2.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.24f, dy1 = 0.63f)
                lineToRelative(dx = -2.46f, dy = 0.35f)
                lineToRelative(dx = -0.27f, dy = 0.02f)
                arcToRelative(a = 1.5f, b = 1.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.06f, dy1 = -0.41f)
                arcToRelative(a = 1.5f, b = 1.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.39f, dy1 = -1.34f)
                lineToRelative(dx = 0.35f, dy = -2.46f)
                arcToRelative(a = 2.5f, b = 2.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.63f, dy1 = -1.24f)
                lineToRelative(dx = 4.46f, dy = -4.46f)
                arcToRelative(a = 8.0f, b = 8.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.6f, dy1 = 1.29f)
                arcToRelative(a = 5.0f, b = 5.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.62f, dy1 = 0.87f)
                lineToRelative(dx = 0.11f, dy = 0.14f)
                arcToRelative(a = 7.0f, b = 7.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.79f, dy1 = 0.79f)
                lineToRelative(dx = 0.13f, dy = 0.12f)
                lineToRelative(dx = 0.43f, dy = 0.33f)
                arcToRelative(a = 4.0f, b = 4.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.49f, dy1 = 0.32f)
                quadToRelative(dx1 = 0.3f, dy1 = 0.18f, dx2 = 0.64f, dy2 = 0.34f)
                lineToRelative(dx = 0.65f, dy = 0.26f)
                close()
                moveToRelative(dx = 6.42f, dy = -6.42f)
                lineToRelative(dx = -0.92f, dy = 0.93f)
                arcToRelative(a = 0.3f, b = 0.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.22f, dy1 = 0.09f)
                lineToRelative(dx = -0.09f, dy = -0.01f)
                arcToRelative(a = 6.2f, b = 6.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -4.23f, dy1 = -4.23f)
                arcToRelative(a = 0.3f, b = 0.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.08f, dy1 = -0.3f)
                lineToRelative(dx = 0.93f, dy = -0.93f)
                curveToRelative(dx1 = 1.52f, dy1 = -1.52f, dx2 = 2.97f, dy2 = -1.49f, dx3 = 4.46f, dy3 = 0.0f)
                quadToRelative(dx1 = 1.14f, dy1 = 1.13f, dx2 = 1.13f, dy2 = 2.25f)
                quadToRelative(dx1 = 0.0f, dy1 = 1.07f, dx2 = -1.14f, dy2 = 2.2f)
            }
        }.build().also { _edit = it }
    }

@Suppress("ObjectPropertyName")
private var _edit: ImageVector? = null
