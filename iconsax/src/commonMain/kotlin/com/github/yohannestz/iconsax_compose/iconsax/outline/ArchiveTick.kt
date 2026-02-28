package com.github.yohannestz.iconsax_compose.iconsax.outline

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
                moveTo(x = 4.93f, y = 22.75f)
                arcToRelative(a = 2.3f, b = 2.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.16f, dy1 = -0.3f)
                curveTo(x1 = 3.0f, y1 = 22.0f, x2 = 2.56f, y2 = 21.09f, x3 = 2.56f, y3 = 19.96f)
                verticalLineTo(y = 5.86f)
                arcToRelative(a = 4.6f, b = 4.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 4.61f, dy1 = -4.61f)
                horizontalLineToRelative(dx = 9.65f)
                arcToRelative(a = 4.6f, b = 4.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 4.61f, dy1 = 4.61f)
                verticalLineToRelative(dy = 14.09f)
                curveToRelative(dx1 = 0.0f, dy1 = 1.13f, dx2 = -0.44f, dy2 = 2.04f, dx3 = -1.21f, dy3 = 2.49f)
                reflectiveCurveToRelative(dx1 = -1.78f, dy1 = 0.4f, dx2 = -2.77f, dy2 = -0.15f)
                lineToRelative(dx = -4.88f, dy = -2.71f)
                arcToRelative(a = 1.4f, b = 1.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.15f, dy1 = 0.0f)
                lineToRelative(dx = -4.88f, dy = 2.71f)
                arcToRelative(a = 3.4f, b = 3.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.61f, dy1 = 0.46f)
                moveToRelative(dx = 2.25f, dy = -20.0f)
                arcToRelative(a = 3.1f, b = 3.1f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -3.11f, dy1 = 3.11f)
                verticalLineToRelative(dy = 14.09f)
                curveToRelative(dx1 = 0.0f, dy1 = 0.59f, dx2 = 0.17f, dy2 = 1.03f, dx3 = 0.47f, dy3 = 1.2f)
                reflectiveCurveToRelative(dx1 = 0.77f, dy1 = 0.12f, dx2 = 1.28f, dy2 = -0.17f)
                lineToRelative(dx = 4.88f, dy = -2.71f)
                arcToRelative(a = 2.9f, b = 2.9f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 2.6f, dy1 = 0.0f)
                lineToRelative(dx = 4.88f, dy = 2.71f)
                curveToRelative(dx1 = 0.51f, dy1 = 0.29f, dx2 = 0.98f, dy2 = 0.35f, dx3 = 1.28f, dy3 = 0.17f)
                reflectiveCurveToRelative(dx1 = 0.47f, dy1 = -0.62f, dx2 = 0.47f, dy2 = -1.2f)
                verticalLineTo(y = 5.86f)
                curveToRelative(dx1 = 0.0f, dy1 = -1.71f, dx2 = -1.4f, dy2 = -3.11f, dx3 = -3.11f, dy3 = -3.11f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 11.09f, y = 13.25f)
                arcToRelative(a = 0.7f, b = 0.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.53f, dy1 = -0.22f)
                lineToRelative(dx = -1.5f, dy = -1.5f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = -1.06f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.06f, dy1 = 0.0f)
                lineToRelative(dx = 0.97f, dy = 0.97f)
                lineToRelative(dx = 3.47f, dy = -3.47f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.06f, dy1 = 0.0f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = 1.06f)
                lineToRelative(dx = -4.0f, dy = 4.0f)
                arcToRelative(a = 0.7f, b = 0.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.53f, dy1 = 0.22f)
            }
        }.build().also { _archiveTick = it }
    }

@Suppress("ObjectPropertyName")
private var _archiveTick: ImageVector? = null
