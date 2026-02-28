package com.github.yohannestz.iconsax_compose.iconsax.bulk

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ClipboardClose: ImageVector
    get() {
        val current = _clipboardClose
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.ClipboardClose",
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
                moveToRelative(dx = 0.18f, dy = 13.62f)
                lineToRelative(dx = -1.45f, dy = -1.45f)
                lineToRelative(dx = 1.4f, dy = -1.4f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = -1.06f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.06f, dy1 = 0.0f)
                lineToRelative(dx = -1.4f, dy = 1.4f)
                lineToRelative(dx = -1.45f, dy = -1.45f)
                arcToRelative(a = 0.76f, b = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.06f, dy1 = 0.0f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 1.06f)
                lineToRelative(dx = 1.45f, dy = 1.45f)
                lineToRelative(dx = -1.49f, dy = 1.49f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 1.06f)
                quadToRelative(dx1 = 0.24f, dy1 = 0.22f, dx2 = 0.53f, dy2 = 0.22f)
                curveToRelative(dx1 = 0.29f, dy1 = 0.0f, dx2 = 0.38f, dy2 = -0.07f, dx3 = 0.53f, dy3 = -0.22f)
                lineToRelative(dx = 1.49f, dy = -1.5f)
                lineToRelative(dx = 1.45f, dy = 1.46f)
                quadTo(x1 = 13.71f, y1 = 16.9f, x2 = 14.0f, y2 = 16.9f)
                curveToRelative(dx1 = 0.29f, dy1 = 0.0f, dx2 = 0.38f, dy2 = -0.07f, dx3 = 0.53f, dy3 = -0.22f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = -1.06f)
            }
        }.build().also { _clipboardClose = it }
    }

@Suppress("ObjectPropertyName")
private var _clipboardClose: ImageVector? = null
