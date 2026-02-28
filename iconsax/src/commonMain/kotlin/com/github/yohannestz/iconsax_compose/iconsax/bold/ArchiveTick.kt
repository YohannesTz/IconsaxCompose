package com.github.yohannestz.iconsax_compose.iconsax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ArchiveTick: ImageVector
    get() {
        val current = _archiveTick
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.ArchiveTick",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 16.82f, y = 1.91f)
                horizontalLineTo(x = 7.18f)
                arcToRelative(a = 3.9f, b = 3.9f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -3.86f, dy1 = 3.86f)
                verticalLineToRelative(dy = 14.09f)
                curveToRelative(dx1 = 0.0f, dy1 = 1.8f, dx2 = 1.29f, dy2 = 2.56f, dx3 = 2.87f, dy3 = 1.69f)
                lineToRelative(dx = 4.88f, dy = -2.71f)
                arcToRelative(a = 2.1f, b = 2.1f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.87f, dy1 = 0.0f)
                lineToRelative(dx = 4.88f, dy = 2.71f)
                curveToRelative(dx1 = 1.58f, dy1 = 0.88f, dx2 = 2.87f, dy2 = 0.12f, dx3 = 2.87f, dy3 = -1.69f)
                verticalLineTo(y = 5.77f)
                arcToRelative(a = 3.9f, b = 3.9f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -3.87f, dy1 = -3.86f)
                moveToRelative(dx = -1.2f, dy = 7.12f)
                lineToRelative(dx = -4.0f, dy = 4.0f)
                quadToRelative(dx1 = -0.23f, dy1 = 0.22f, dx2 = -0.53f, dy2 = 0.22f)
                curveToRelative(dx1 = -0.3f, dy1 = 0.0f, dx2 = -0.38f, dy2 = -0.07f, dx3 = -0.53f, dy3 = -0.22f)
                lineToRelative(dx = -1.5f, dy = -1.5f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = -1.06f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.06f, dy1 = 0.0f)
                lineToRelative(dx = 0.97f, dy = 0.97f)
                lineToRelative(dx = 3.47f, dy = -3.47f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.06f, dy1 = 0.0f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = 1.06f)
            }
        }.build().also { _archiveTick = it }
    }

@Suppress("ObjectPropertyName")
private var _archiveTick: ImageVector? = null
