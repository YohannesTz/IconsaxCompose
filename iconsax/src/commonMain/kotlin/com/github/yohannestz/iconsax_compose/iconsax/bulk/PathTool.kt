package com.github.yohannestz.iconsax_compose.iconsax.bulk

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
                lineToRelative(dx = -2.8f, dy = 1.77f)
                lineToRelative(dx = -5.66f, dy = -5.66f)
                lineToRelative(dx = 1.76f, dy = -2.8f)
                curveToRelative(dx1 = 0.82f, dy1 = -1.29f, dx2 = 2.46f, dy2 = -1.35f, dx3 = 3.67f, dy3 = -0.15f)
                lineToRelative(dx = 3.18f, dy = 3.18f)
                curveToRelative(dx1 = 1.13f, dy1 = 1.13f, dx2 = 1.06f, dy2 = 2.89f, dx3 = -0.15f, dy3 = 3.66f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
                fillAlpha = 0.4f,
                strokeAlpha = 0.4f,
            ) {
                moveTo(x = 14.71f, y = 19.95f)
                lineTo(x = 6.0f, y = 20.98f)
                arcToRelative(a = 3.0f, b = 3.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.59f, dy1 = -0.24f)
                arcToRelative(a = 2.4f, b = 2.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.11f, dy1 = -1.11f)
                arcToRelative(a = 3.0f, b = 3.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.24f, dy1 = -1.58f)
                lineTo(x = 4.1f, y = 9.33f)
                curveToRelative(dx1 = 0.25f, dy1 = -2.18f, dx2 = 1.06f, dy2 = -2.89f, dx3 = 3.36f, dy3 = -2.76f)
                lineToRelative(dx = 4.12f, dy = 0.25f)
                lineToRelative(dx = 5.66f, dy = 5.66f)
                lineToRelative(dx = 0.24f, dy = 4.12f)
                curveToRelative(dx1 = 0.21f, dy1 = 2.3f, dx2 = -0.58f, dy2 = 3.1f, dx3 = -2.77f, dy3 = 3.35f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 7.98f, y = 17.15f)
                lineTo(x = 4.4f, y = 20.73f)
                arcToRelative(a = 2.4f, b = 2.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.11f, dy1 = -1.11f)
                lineToRelative(dx = 3.59f, dy = -3.59f)
                arcToRelative(a = 0.8f, b = 0.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.11f, dy1 = 0.0f)
                arcToRelative(a = 0.8f, b = 0.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.01f, dy1 = 1.12f)
            }
        }.build().also { _pathTool = it }
    }

@Suppress("ObjectPropertyName")
private var _pathTool: ImageVector? = null
