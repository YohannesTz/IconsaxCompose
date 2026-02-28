package com.github.yohannestz.iconsax_compose.iconsax.bold

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
                moveToRelative(dx = 6.17f, dy = -8.74f)
                curveToRelative(dx1 = 0.04f, dy1 = 0.38f, dx2 = -0.38f, dy2 = 0.64f, dx3 = -0.74f, dy3 = 0.51f)
                arcToRelative(a = 5.0f, b = 5.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.6f, dy1 = -0.25f)
                horizontalLineTo(x = 5.78f)
                arcToRelative(a = 5.0f, b = 5.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.62f, dy1 = 0.26f)
                curveTo(x1 = 3.8f, y1 = 9.24f, x2 = 3.38f, y2 = 9.0f, x3 = 3.38f, y3 = 8.62f)
                verticalLineTo(y = 6.66f)
                curveTo(x1 = 3.38f, y1 = 3.09f, x2 = 4.47f, y2 = 2.0f, x3 = 8.04f, y3 = 2.0f)
                horizontalLineToRelative(dx = 1.18f)
                curveToRelative(dx1 = 1.43f, dy1 = 0.0f, dx2 = 1.88f, dy2 = 0.46f, dx3 = 2.46f, dy3 = 1.21f)
                lineToRelative(dx = 1.2f, dy = 1.6f)
                curveToRelative(dx1 = 0.25f, dy1 = 0.34f, dx2 = 0.26f, dy2 = 0.36f, dx3 = 0.7f, dy3 = 0.36f)
                horizontalLineToRelative(dx = 2.38f)
                curveToRelative(dx1 = 3.13f, dy1 = 0.0f, dx2 = 4.35f, dy2 = 0.84f, dx3 = 4.6f, dy3 = 3.43f)
            }
        }.build().also { _folderOpen = it }
    }

@Suppress("ObjectPropertyName")
private var _folderOpen: ImageVector? = null
