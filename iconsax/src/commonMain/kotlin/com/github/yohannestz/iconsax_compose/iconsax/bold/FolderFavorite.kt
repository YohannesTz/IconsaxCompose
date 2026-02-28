package com.github.yohannestz.iconsax_compose.iconsax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FolderFavorite: ImageVector
    get() {
        val current = _folderFavorite
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.FolderFavorite",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 21.02f, y = 8.0f)
                curveToRelative(dx1 = 0.4f, dy1 = 0.56f, dx2 = -0.08f, dy2 = 1.25f, dx3 = -0.77f, dy3 = 1.25f)
                horizontalLineTo(x = 3.0f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.0f, dy1 = -1.0f)
                verticalLineTo(y = 6.42f)
                arcTo(horizontalEllipseRadius = 4.4f, verticalEllipseRadius = 4.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 6.42f, y1 = 2.0f)
                horizontalLineToRelative(dx = 2.32f)
                curveToRelative(dx1 = 1.63f, dy1 = 0.0f, dx2 = 2.14f, dy2 = 0.53f, dx3 = 2.79f, dy3 = 1.4f)
                lineToRelative(dx = 1.4f, dy = 1.86f)
                curveToRelative(dx1 = 0.31f, dy1 = 0.41f, dx2 = 0.35f, dy2 = 0.46f, dx3 = 0.93f, dy3 = 0.46f)
                horizontalLineToRelative(dx = 2.79f)
                curveToRelative(dx1 = 1.8f, dy1 = 0.0f, dx2 = 3.4f, dy2 = 0.9f, dx3 = 4.37f, dy3 = 2.27f)
                moveToRelative(dx = 0.96f, dy = 3.75f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.0f, dy1 = -1.0f)
                horizontalLineTo(x = 3.0f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.0f, dy1 = 1.0f)
                verticalLineToRelative(dy = 4.9f)
                curveTo(x1 = 2.0f, y1 = 19.6f, x2 = 4.4f, y2 = 22.0f, x3 = 7.35f, y3 = 22.0f)
                horizontalLineToRelative(dx = 9.3f)
                curveTo(x1 = 19.6f, y1 = 22.0f, x2 = 22.0f, y2 = 19.6f, x3 = 22.0f, y3 = 16.65f)
                close()
                moveToRelative(dx = -7.44f, dy = 5.22f)
                lineToRelative(dx = -2.15f, dy = 1.88f)
                arcToRelative(a = 0.6f, b = 0.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.78f, dy1 = 0.0f)
                lineToRelative(dx = -2.15f, dy = -1.88f)
                arcToRelative(a = 1.7f, b = 1.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.2f, dy1 = -2.33f)
                arcToRelative(a = 1.7f, b = 1.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 2.34f, dy1 = -0.3f)
                lineToRelative(dx = 0.4f, dy = 0.3f)
                lineToRelative(dx = 0.4f, dy = -0.3f)
                arcToRelative(a = 1.7f, b = 1.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 2.34f, dy1 = 0.3f)
                arcToRelative(a = 1.7f, b = 1.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.2f, dy1 = 2.33f)
            }
        }.build().also { _folderFavorite = it }
    }

@Suppress("ObjectPropertyName")
private var _folderFavorite: ImageVector? = null
