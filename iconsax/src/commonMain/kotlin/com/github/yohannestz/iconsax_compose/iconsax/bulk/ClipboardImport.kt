package com.github.yohannestz.iconsax_compose.iconsax.bulk

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ClipboardImport: ImageVector
    get() {
        val current = _clipboardImport
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.ClipboardImport",
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
                moveTo(x = 16.24f, y = 3.65f)
                horizontalLineTo(x = 7.76f)
                arcToRelative(a = 4.47f, b = 4.47f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -4.47f, dy1 = 4.47f)
                verticalLineToRelative(dy = 9.4f)
                arcTo(horizontalEllipseRadius = 4.5f, verticalEllipseRadius = 4.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 7.76f, y1 = 22.0f)
                horizontalLineToRelative(dx = 8.47f)
                arcToRelative(a = 4.47f, b = 4.47f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 4.47f, dy1 = -4.47f)
                verticalLineTo(y = 8.12f)
                arcToRelative(a = 4.46f, b = 4.46f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -4.46f, dy1 = -4.47f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 14.35f, y = 2.0f)
                horizontalLineToRelative(dx = -4.7f)
                arcToRelative(a = 1.9f, b = 1.9f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.89f, dy1 = 1.88f)
                verticalLineToRelative(dy = 0.94f)
                arcTo(horizontalEllipseRadius = 1.9f, verticalEllipseRadius = 1.9f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 9.64f, y1 = 6.7f)
                horizontalLineToRelative(dx = 4.71f)
                arcToRelative(a = 1.9f, b = 1.9f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.88f, dy1 = -1.88f)
                verticalLineTo(y = 3.88f)
                arcTo(horizontalEllipseRadius = 1.87f, verticalEllipseRadius = 1.87f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 14.35f, y1 = 2.0f)
                moveTo(x = 15.0f, y = 13.25f)
                arcTo(horizontalEllipseRadius = 0.76f, verticalEllipseRadius = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 14.25f, y1 = 14.0f)
                verticalLineToRelative(dy = 1.2f)
                lineToRelative(dx = -4.72f, dy = -4.73f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.06f, dy1 = 0.0f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 1.06f)
                lineToRelative(dx = 4.72f, dy = 4.72f)
                horizontalLineTo(x = 12.0f)
                curveToRelative(dx1 = -0.41f, dy1 = 0.0f, dx2 = -0.75f, dy2 = 0.34f, dx3 = -0.75f, dy3 = 0.75f)
                reflectiveCurveToRelative(dx1 = 0.34f, dy1 = 0.75f, dx2 = 0.75f, dy2 = 0.75f)
                horizontalLineToRelative(dx = 3.0f)
                arcTo(horizontalEllipseRadius = 0.76f, verticalEllipseRadius = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 15.75f, y1 = 17.0f)
                verticalLineToRelative(dy = -3.0f)
                arcTo(horizontalEllipseRadius = 0.76f, verticalEllipseRadius = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 15.0f, y1 = 13.25f)
            }
        }.build().also { _clipboardImport = it }
    }

@Suppress("ObjectPropertyName")
private var _clipboardImport: ImageVector? = null
