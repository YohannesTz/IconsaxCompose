package com.github.yohannestz.iconsax_compose.iconsax.bulk

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ArchiveAdd: ImageVector
    get() {
        val current = _archiveAdd
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.ArchiveAdd",
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
                moveTo(x = 16.82f, y = 2.0f)
                horizontalLineTo(x = 7.18f)
                arcToRelative(a = 3.87f, b = 3.87f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -3.86f, dy1 = 3.86f)
                verticalLineToRelative(dy = 14.09f)
                curveToRelative(dx1 = 0.0f, dy1 = 1.8f, dx2 = 1.29f, dy2 = 2.56f, dx3 = 2.87f, dy3 = 1.69f)
                lineToRelative(dx = 4.88f, dy = -2.71f)
                arcToRelative(a = 2.1f, b = 2.1f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.87f, dy1 = 0.0f)
                lineToRelative(dx = 4.88f, dy = 2.71f)
                curveToRelative(dx1 = 1.58f, dy1 = 0.88f, dx2 = 2.87f, dy2 = 0.12f, dx3 = 2.87f, dy3 = -1.69f)
                verticalLineTo(y = 5.86f)
                arcTo(horizontalEllipseRadius = 3.9f, verticalEllipseRadius = 3.9f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 16.82f, y1 = 2.0f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 14.5f, y = 9.9f)
                horizontalLineToRelative(dx = -1.75f)
                verticalLineTo(y = 8.21f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.41f, dx2 = -0.34f, dy2 = -0.75f, dx3 = -0.75f, dy3 = -0.75f)
                reflectiveCurveToRelative(dx1 = -0.75f, dy1 = 0.34f, dx2 = -0.75f, dy2 = 0.75f)
                verticalLineTo(y = 9.9f)
                horizontalLineTo(x = 9.5f)
                curveToRelative(dx1 = -0.41f, dy1 = 0.0f, dx2 = -0.75f, dy2 = 0.34f, dx3 = -0.75f, dy3 = 0.75f)
                reflectiveCurveTo(x1 = 9.09f, y1 = 11.4f, x2 = 9.5f, y2 = 11.4f)
                horizontalLineToRelative(dx = 1.75f)
                verticalLineToRelative(dy = 1.81f)
                curveToRelative(dx1 = 0.0f, dy1 = 0.41f, dx2 = 0.34f, dy2 = 0.75f, dx3 = 0.75f, dy3 = 0.75f)
                reflectiveCurveToRelative(dx1 = 0.75f, dy1 = -0.34f, dx2 = 0.75f, dy2 = -0.75f)
                verticalLineTo(y = 11.4f)
                horizontalLineToRelative(dx = 1.75f)
                curveToRelative(dx1 = 0.41f, dy1 = 0.0f, dx2 = 0.75f, dy2 = -0.34f, dx3 = 0.75f, dy3 = -0.75f)
                reflectiveCurveTo(x1 = 14.91f, y1 = 9.9f, x2 = 14.5f, y2 = 9.9f)
            }
        }.build().also { _archiveAdd = it }
    }

@Suppress("ObjectPropertyName")
private var _archiveAdd: ImageVector? = null
