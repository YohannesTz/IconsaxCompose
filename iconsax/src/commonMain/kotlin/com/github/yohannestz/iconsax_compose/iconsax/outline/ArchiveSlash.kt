package com.github.yohannestz.iconsax_compose.iconsax.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ArchiveSlash: ImageVector
    get() {
        val current = _archiveSlash
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.ArchiveSlash",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 2.0f, y = 22.75f)
                arcToRelative(a = 0.7f, b = 0.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.53f, dy1 = -0.22f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = -1.06f)
                lineToRelative(dx = 20.0f, dy = -20.0f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.06f, dy1 = 0.0f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = 1.06f)
                lineToRelative(dx = -20.0f, dy = 20.0f)
                arcTo(horizontalEllipseRadius = 0.7f, verticalEllipseRadius = 0.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 2.0f, y1 = 22.75f)
                moveToRelative(dx = 16.88f, dy = 0.0f)
                arcToRelative(a = 4.0f, b = 4.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.76f, dy1 = -0.5f)
                lineToRelative(dx = -6.52f, dy = -4.07f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = true, dx1 = 0.79f, dy1 = -1.27f)
                lineToRelative(dx = 6.49f, dy = 4.05f)
                curveToRelative(dx1 = 0.56f, dy1 = 0.31f, dx2 = 1.12f, dy2 = 0.38f, dx3 = 1.48f, dy3 = 0.17f)
                reflectiveCurveToRelative(dx1 = 0.57f, dy1 = -0.73f, dx2 = 0.57f, dy2 = -1.42f)
                verticalLineToRelative(dy = -11.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.41f, dx2 = 0.34f, dy2 = -0.75f, dx3 = 0.75f, dy3 = -0.75f)
                reflectiveCurveToRelative(dx1 = 0.75f, dy1 = 0.34f, dx2 = 0.75f, dy2 = 0.75f)
                verticalLineToRelative(dy = 11.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 1.23f, dx2 = -0.48f, dy2 = 2.22f, dx3 = -1.31f, dy3 = 2.71f)
                arcToRelative(a = 2.4f, b = 2.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.24f, dy1 = 0.33f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 3.32f, y = 20.7f)
                arcToRelative(a = 0.76f, b = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.75f, dy1 = -0.75f)
                verticalLineTo(y = 5.86f)
                arcToRelative(a = 4.6f, b = 4.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 4.61f, dy1 = -4.61f)
                horizontalLineToRelative(dx = 9.65f)
                curveToRelative(dx1 = 1.39f, dy1 = 0.0f, dx2 = 2.7f, dy2 = 0.62f, dx3 = 3.58f, dy3 = 1.71f)
                arcToRelative(a = 0.76f, b = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.11f, dy1 = 1.06f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.05f, dy1 = -0.11f)
                arcToRelative(a = 3.1f, b = 3.1f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -2.42f, dy1 = -1.16f)
                horizontalLineTo(x = 7.18f)
                arcToRelative(a = 3.1f, b = 3.1f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -3.11f, dy1 = 3.11f)
                verticalLineToRelative(dy = 14.09f)
                arcToRelative(a = 0.76f, b = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.75f, dy1 = 0.75f)
            }
        }.build().also { _archiveSlash = it }
    }

@Suppress("ObjectPropertyName")
private var _archiveSlash: ImageVector? = null
