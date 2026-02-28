package com.github.yohannestz.iconsax_compose.iconsax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val PathTool: ImageVector
    get() {
        val current = _pathTool
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.PathTool",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 20.02f, y = 10.7f)
                lineToRelative(dx = -2.12f, dy = 1.34f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.24f, dy1 = -0.14f)
                lineToRelative(dx = -4.53f, dy = -4.53f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.14f, dy1 = -1.24f)
                lineToRelative(dx = 1.34f, dy = -2.12f)
                curveToRelative(dx1 = 0.82f, dy1 = -1.29f, dx2 = 2.46f, dy2 = -1.35f, dx3 = 3.67f, dy3 = -0.15f)
                lineToRelative(dx = 3.18f, dy = 3.18f)
                curveToRelative(dx1 = 1.12f, dy1 = 1.13f, dx2 = 1.05f, dy2 = 2.89f, dx3 = -0.16f, dy3 = 3.66f)
                moveToRelative(dx = -5.31f, dy = 9.25f)
                lineToRelative(dx = -8.72f, dy = 1.02f)
                lineToRelative(dx = -0.23f, dy = 0.02f)
                curveToRelative(dx1 = -0.68f, dy1 = 0.04f, dx2 = -0.85f, dy2 = -0.77f, dx3 = -0.37f, dy3 = -1.25f)
                lineToRelative(dx = 2.6f, dy = -2.6f)
                arcToRelative(a = 0.76f, b = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = -1.1f)
                arcToRelative(a = 0.8f, b = 0.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.12f, dy1 = 0.0f)
                lineToRelative(dx = -2.59f, dy = 2.59f)
                curveTo(x1 = 3.8f, y1 = 19.1f, x2 = 3.0f, y2 = 18.94f, x3 = 3.03f, y3 = 18.26f)
                lineToRelative(dx = 0.02f, dy = -0.22f)
                lineToRelative(dx = 1.03f, dy = -8.72f)
                curveToRelative(dx1 = 0.26f, dy1 = -2.18f, dx2 = 1.06f, dy2 = -2.9f, dx3 = 3.36f, dy3 = -2.76f)
                lineToRelative(dx = 1.5f, dy = 0.09f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.3f, dy1 = 0.59f)
                lineToRelative(dx = 6.55f, dy = 6.55f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.58f, dy1 = 1.3f)
                lineToRelative(dx = 0.1f, dy = 1.5f)
                curveToRelative(dx1 = 0.22f, dy1 = 2.3f, dx2 = -0.57f, dy2 = 3.1f, dx3 = -2.76f, dy3 = 3.36f)
                close()
            }
        }.build().also { _pathTool = it }
    }

@Suppress("ObjectPropertyName")
private var _pathTool: ImageVector? = null
