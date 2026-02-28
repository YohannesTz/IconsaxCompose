package com.github.yohannestz.iconsax_compose.iconsax.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ArchiveBook: ImageVector
    get() {
        val current = _archiveBook
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.ArchiveBook",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 16.0f, y = 22.75f)
                horizontalLineTo(x = 8.0f)
                curveToRelative(dx1 = -3.65f, dy1 = 0.0f, dx2 = -5.75f, dy2 = -2.1f, dx3 = -5.75f, dy3 = -5.75f)
                verticalLineTo(y = 7.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -3.65f, dx2 = 2.1f, dy2 = -5.75f, dx3 = 5.75f, dy3 = -5.75f)
                horizontalLineToRelative(dx = 8.0f)
                curveToRelative(dx1 = 3.65f, dy1 = 0.0f, dx2 = 5.75f, dy2 = 2.1f, dx3 = 5.75f, dy3 = 5.75f)
                verticalLineToRelative(dy = 10.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 3.65f, dx2 = -2.1f, dy2 = 5.75f, dx3 = -5.75f, dy3 = 5.75f)
                moveToRelative(dx = -8.0f, dy = -20.0f)
                curveTo(x1 = 5.14f, y1 = 2.75f, x2 = 3.75f, y2 = 4.14f, x3 = 3.75f, y3 = 7.0f)
                verticalLineToRelative(dy = 10.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 2.86f, dx2 = 1.39f, dy2 = 4.25f, dx3 = 4.25f, dy3 = 4.25f)
                horizontalLineToRelative(dx = 8.0f)
                quadToRelative(dx1 = 4.27f, dy1 = 0.02f, dx2 = 4.25f, dy2 = -4.25f)
                verticalLineTo(y = 7.0f)
                quadTo(x1 = 20.27f, y1 = 2.73f, x2 = 16.0f, y2 = 2.75f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 9.0f, y = 11.11f)
                arcToRelative(a = 1.24f, b = 1.24f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.25f, dy1 = -1.24f)
                verticalLineTo(y = 2.0f)
                arcTo(horizontalEllipseRadius = 0.76f, verticalEllipseRadius = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 8.5f, y1 = 1.25f)
                horizontalLineToRelative(dx = 7.0f)
                arcTo(horizontalEllipseRadius = 0.76f, verticalEllipseRadius = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 16.25f, y1 = 2.0f)
                verticalLineToRelative(dy = 7.86f)
                arcToRelative(a = 1.25f, b = 1.25f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -2.1f, dy1 = 0.91f)
                lineTo(x = 12.0f, y = 8.8f)
                lineToRelative(dx = -2.15f, dy = 1.98f)
                arcTo(horizontalEllipseRadius = 1.3f, verticalEllipseRadius = 1.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 9.0f, y1 = 11.11f)
                moveToRelative(dx = 3.0f, dy = -3.9f)
                quadToRelative(dx1 = 0.47f, dy1 = 0.0f, dx2 = 0.85f, dy2 = 0.33f)
                lineToRelative(dx = 1.9f, dy = 1.75f)
                verticalLineTo(y = 2.75f)
                horizontalLineToRelative(dx = -5.5f)
                verticalLineToRelative(dy = 6.54f)
                lineToRelative(dx = 1.9f, dy = -1.75f)
                arcTo(horizontalEllipseRadius = 1.3f, verticalEllipseRadius = 1.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 12.0f, y1 = 7.21f)
                moveToRelative(dx = 5.5f, dy = 7.54f)
                horizontalLineToRelative(dx = -4.25f)
                curveToRelative(dx1 = -0.41f, dy1 = 0.0f, dx2 = -0.75f, dy2 = -0.34f, dx3 = -0.75f, dy3 = -0.75f)
                reflectiveCurveToRelative(dx1 = 0.34f, dy1 = -0.75f, dx2 = 0.75f, dy2 = -0.75f)
                horizontalLineToRelative(dx = 4.25f)
                curveToRelative(dx1 = 0.41f, dy1 = 0.0f, dx2 = 0.75f, dy2 = 0.34f, dx3 = 0.75f, dy3 = 0.75f)
                reflectiveCurveToRelative(dx1 = -0.34f, dy1 = 0.75f, dx2 = -0.75f, dy2 = 0.75f)
                moveToRelative(dx = 0.0f, dy = 4.0f)
                horizontalLineTo(x = 9.0f)
                curveToRelative(dx1 = -0.41f, dy1 = 0.0f, dx2 = -0.75f, dy2 = -0.34f, dx3 = -0.75f, dy3 = -0.75f)
                reflectiveCurveTo(x1 = 8.59f, y1 = 17.25f, x2 = 9.0f, y2 = 17.25f)
                horizontalLineToRelative(dx = 8.5f)
                curveToRelative(dx1 = 0.41f, dy1 = 0.0f, dx2 = 0.75f, dy2 = 0.34f, dx3 = 0.75f, dy3 = 0.75f)
                reflectiveCurveToRelative(dx1 = -0.34f, dy1 = 0.75f, dx2 = -0.75f, dy2 = 0.75f)
            }
        }.build().also { _archiveBook = it }
    }

@Suppress("ObjectPropertyName")
private var _archiveBook: ImageVector? = null
