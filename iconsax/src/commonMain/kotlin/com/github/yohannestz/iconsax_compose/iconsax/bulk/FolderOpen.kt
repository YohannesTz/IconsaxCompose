package com.github.yohannestz.iconsax_compose.iconsax.bulk

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FolderOpen: ImageVector
    get() {
        val current = _folderOpen
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.FolderOpen",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 21.06f, y = 11.82f)
                lineTo(x = 20.9f, y = 11.6f)
                arcToRelative(a = 3.0f, b = 3.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.0f, dy1 = -0.8f)
                arcToRelative(a = 3.4f, b = 3.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.68f, dy1 = -0.45f)
                horizontalLineTo(x = 5.77f)
                arcToRelative(a = 3.4f, b = 3.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -2.72f, dy1 = 1.3f)
                arcToRelative(a = 3.5f, b = 3.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.75f, dy1 = 2.53f)
                lineToRelative(dx = 0.37f, dy = 4.67f)
                curveTo(x1 = 2.8f, y1 = 20.26f, x2 = 2.97f, y2 = 22.0f, x3 = 6.14f, y3 = 22.0f)
                horizontalLineToRelative(dx = 11.72f)
                curveToRelative(dx1 = 3.17f, dy1 = 0.0f, dx2 = 3.33f, dy2 = -1.74f, dx3 = 3.47f, dy3 = -3.16f)
                lineToRelative(dx = 0.37f, dy = -4.65f)
                arcToRelative(a = 3.4f, b = 3.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.64f, dy1 = -2.37f)
                moveToRelative(dx = -6.67f, dy = 5.52f)
                horizontalLineToRelative(dx = -4.8f)
                arcToRelative(a = 0.7f, b = 0.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.7f, dy1 = -0.7f)
                arcToRelative(a = 0.7f, b = 0.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.7f, dy1 = -0.7f)
                horizontalLineToRelative(dx = 4.8f)
                arcToRelative(a = 0.7f, b = 0.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.7f, dy1 = 0.7f)
                arcToRelative(a = 0.7f, b = 0.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.7f, dy1 = 0.7f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
                fillAlpha = 0.4f,
                strokeAlpha = 0.4f,
            ) {
                moveTo(x = 3.38f, y = 11.31f)
                arcToRelative(a = 3.4f, b = 3.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 2.39f, dy1 = -0.96f)
                horizontalLineToRelative(dx = 12.46f)
                arcToRelative(a = 3.4f, b = 3.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 2.39f, dy1 = 0.97f)
                verticalLineToRelative(dy = -1.5f)
                curveToRelative(dx1 = 0.0f, dy1 = -3.57f, dx2 = -1.1f, dy2 = -4.66f, dx3 = -4.66f, dy3 = -4.66f)
                horizontalLineToRelative(dx = -2.38f)
                curveToRelative(dx1 = -0.44f, dy1 = 0.0f, dx2 = -0.45f, dy2 = -0.01f, dx3 = -0.71f, dy3 = -0.35f)
                lineToRelative(dx = -1.2f, dy = -1.61f)
                curveTo(x1 = 11.1f, y1 = 2.46f, x2 = 10.65f, y2 = 2.0f, x3 = 9.22f, y3 = 2.0f)
                horizontalLineTo(x = 8.04f)
                curveTo(x1 = 4.47f, y1 = 2.0f, x2 = 3.38f, y2 = 3.09f, x3 = 3.38f, y3 = 6.66f)
                close()
            }
        }.build().also { _folderOpen = it }
    }

@Suppress("ObjectPropertyName")
private var _folderOpen: ImageVector? = null
