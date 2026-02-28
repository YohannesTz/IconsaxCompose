package com.github.yohannestz.iconsax_compose.iconsax.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ArchiveMinus: ImageVector
    get() {
        val current = _archiveMinus
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.ArchiveMinus",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 14.5f, y = 11.4f)
                horizontalLineToRelative(dx = -5.0f)
                curveToRelative(dx1 = -0.41f, dy1 = 0.0f, dx2 = -0.75f, dy2 = -0.34f, dx3 = -0.75f, dy3 = -0.75f)
                reflectiveCurveTo(x1 = 9.09f, y1 = 9.9f, x2 = 9.5f, y2 = 9.9f)
                horizontalLineToRelative(dx = 5.0f)
                curveToRelative(dx1 = 0.41f, dy1 = 0.0f, dx2 = 0.75f, dy2 = 0.34f, dx3 = 0.75f, dy3 = 0.75f)
                reflectiveCurveToRelative(dx1 = -0.34f, dy1 = 0.75f, dx2 = -0.75f, dy2 = 0.75f)
            }
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
                curveToRelative(dx1 = 0.3f, dy1 = 0.18f, dx2 = 0.77f, dy2 = 0.12f, dx3 = 1.28f, dy3 = -0.17f)
                lineToRelative(dx = 4.88f, dy = -2.71f)
                arcToRelative(a = 2.9f, b = 2.9f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 2.6f, dy1 = 0.0f)
                lineToRelative(dx = 4.88f, dy = 2.71f)
                curveToRelative(dx1 = 0.51f, dy1 = 0.29f, dx2 = 0.98f, dy2 = 0.35f, dx3 = 1.28f, dy3 = 0.17f)
                reflectiveCurveToRelative(dx1 = 0.47f, dy1 = -0.62f, dx2 = 0.47f, dy2 = -1.2f)
                verticalLineTo(y = 5.86f)
                curveToRelative(dx1 = 0.0f, dy1 = -1.71f, dx2 = -1.4f, dy2 = -3.11f, dx3 = -3.11f, dy3 = -3.11f)
                close()
            }
        }.build().also { _archiveMinus = it }
    }

@Suppress("ObjectPropertyName")
private var _archiveMinus: ImageVector? = null
