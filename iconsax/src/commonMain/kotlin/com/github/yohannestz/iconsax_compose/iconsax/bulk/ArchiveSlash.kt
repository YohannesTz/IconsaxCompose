package com.github.yohannestz.iconsax_compose.iconsax.bulk

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
                fillAlpha = 0.4f,
                strokeAlpha = 0.4f,
            ) {
                moveTo(x = 20.68f, y = 6.32f)
                verticalLineToRelative(dy = 13.63f)
                curveToRelative(dx1 = 0.0f, dy1 = 1.8f, dx2 = -1.29f, dy2 = 2.56f, dx3 = -2.86f, dy3 = 1.69f)
                lineToRelative(dx = -4.88f, dy = -2.72f)
                arcToRelative(a = 2.2f, b = 2.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.88f, dy1 = 0.0f)
                lineToRelative(dx = -4.88f, dy = 2.72f)
                arcTo(horizontalEllipseRadius = 3.0f, verticalEllipseRadius = 3.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 5.0f, y1 = 22.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 20.12f, y = 3.88f)
                lineTo(x = 3.39f, y = 20.61f)
                arcToRelative(a = 3.0f, b = 3.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.07f, dy1 = -0.66f)
                verticalLineTo(y = 5.86f)
                arcTo(horizontalEllipseRadius = 3.87f, verticalEllipseRadius = 3.87f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 7.18f, y1 = 2.0f)
                horizontalLineToRelative(dx = 9.64f)
                curveToRelative(dx1 = 1.4f, dy1 = 0.0f, dx2 = 2.63f, dy2 = 0.75f, dx3 = 3.3f, dy3 = 1.88f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 21.77f, y = 2.23f)
                arcToRelative(a = 0.77f, b = 0.77f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.09f, dy1 = 0.0f)
                lineTo(x = 2.23f, y = 20.69f)
                arcToRelative(a = 0.77f, b = 0.77f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 1.09f)
                arcToRelative(a = 0.76f, b = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.08f, dy1 = -0.01f)
                lineTo(x = 21.77f, y = 3.3f)
                arcToRelative(a = 0.74f, b = 0.74f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = -1.08f)
            }
        }.build().also { _archiveSlash = it }
    }

@Suppress("ObjectPropertyName")
private var _archiveSlash: ImageVector? = null
