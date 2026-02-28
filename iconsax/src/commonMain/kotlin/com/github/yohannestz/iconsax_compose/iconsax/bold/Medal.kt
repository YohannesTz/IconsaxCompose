package com.github.yohannestz.iconsax_compose.iconsax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Medal: ImageVector
    get() {
        val current = _medal
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Medal",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 12.0f, y = 15.0f)
                curveToRelative(dx1 = 3.73f, dy1 = 0.0f, dx2 = 6.75f, dy2 = -2.91f, dx3 = 6.75f, dy3 = -6.5f)
                reflectiveCurveTo(x1 = 15.73f, y1 = 2.0f, x2 = 12.0f, y2 = 2.0f)
                reflectiveCurveTo(x1 = 5.25f, y1 = 4.91f, x2 = 5.25f, y2 = 8.5f)
                reflectiveCurveTo(x1 = 8.27f, y1 = 15.0f, x2 = 12.0f, y2 = 15.0f)
                moveToRelative(dx = 3.79f, dy = 0.61f)
                curveToRelative(dx1 = 0.33f, dy1 = -0.17f, dx2 = 0.71f, dy2 = 0.08f, dx3 = 0.71f, dy3 = 0.45f)
                verticalLineToRelative(dy = 4.85f)
                curveToRelative(dx1 = 0.0f, dy1 = 0.9f, dx2 = -0.63f, dy2 = 1.34f, dx3 = -1.41f, dy3 = 0.97f)
                lineToRelative(dx = -2.68f, dy = -1.27f)
                arcToRelative(a = 1.2f, b = 1.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.82f, dy1 = 0.0f)
                lineToRelative(dx = -2.68f, dy = 1.27f)
                curveTo(x1 = 8.13f, y1 = 22.24f, x2 = 7.5f, y2 = 21.8f, x3 = 7.5f, y3 = 20.9f)
                lineToRelative(dx = 0.02f, dy = -4.84f)
                arcToRelative(a = 0.5f, b = 0.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.71f, dy1 = -0.45f)
                arcToRelative(a = 8.46f, b = 8.46f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 7.56f, dy1 = 0.0f)
            }
        }.build().also { _medal = it }
    }

@Suppress("ObjectPropertyName")
private var _medal: ImageVector? = null
