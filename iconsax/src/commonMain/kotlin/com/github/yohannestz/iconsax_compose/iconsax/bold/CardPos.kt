package com.github.yohannestz.iconsax_compose.iconsax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val CardPos: ImageVector
    get() {
        val current = _cardPos
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.CardPos",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 22.0f, y = 21.25f)
                arcTo(horizontalEllipseRadius = 0.76f, verticalEllipseRadius = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 21.25f, y1 = 22.0f)
                horizontalLineTo(x = 2.75f)
                curveTo(x1 = 2.34f, y1 = 22.0f, x2 = 2.0f, y2 = 21.66f, x3 = 2.0f, y3 = 21.25f)
                reflectiveCurveToRelative(dx1 = 0.34f, dy1 = -0.75f, dx2 = 0.75f, dy2 = -0.75f)
                horizontalLineToRelative(dx = 18.5f)
                arcTo(horizontalEllipseRadius = 0.76f, verticalEllipseRadius = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 22.0f, y1 = 21.25f)
                moveTo(x = 15.4f, y = 4.52f)
                lineTo(x = 4.64f, y = 15.26f)
                arcToRelative(a = 1.03f, b = 1.03f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.47f, dy1 = 0.0f)
                arcToRelative(a = 3.6f, b = 3.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = -5.05f)
                lineToRelative(dx = 7.14f, dy = -7.15f)
                arcToRelative(a = 3.57f, b = 3.57f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 5.06f, dy1 = 0.0f)
                arcToRelative(a = 1.03f, b = 1.03f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.01f, dy1 = 1.46f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 20.82f, y = 8.49f)
                lineToRelative(dx = -3.05f, dy = -3.05f)
                arcToRelative(a = 1.03f, b = 1.03f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.47f, dy1 = 0.0f)
                lineTo(x = 5.56f, y = 16.18f)
                arcToRelative(a = 1.03f, b = 1.03f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 1.47f)
                lineToRelative(dx = 3.05f, dy = 3.06f)
                arcToRelative(a = 3.6f, b = 3.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 5.06f, dy1 = 0.0f)
                lineToRelative(dx = 7.14f, dy = -7.15f)
                arcToRelative(a = 3.56f, b = 3.56f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.01f, dy1 = -5.07f)
                moveToRelative(dx = -8.06f, dy = 9.03f)
                lineToRelative(dx = -1.2f, dy = 1.22f)
                arcToRelative(a = 0.66f, b = 0.66f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.93f, dy1 = 0.0f)
                arcToRelative(a = 0.66f, b = 0.66f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = -0.92f)
                lineToRelative(dx = 1.22f, dy = -1.22f)
                arcToRelative(a = 0.67f, b = 0.67f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.91f, dy1 = 0.0f)
                arcToRelative(a = 0.66f, b = 0.66f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = 0.92f)
                moveToRelative(dx = 3.97f, dy = -3.97f)
                lineTo(x = 14.3f, y = 16.0f)
                arcToRelative(a = 0.7f, b = 0.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.92f, dy1 = 0.0f)
                arcToRelative(a = 0.66f, b = 0.66f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = -0.92f)
                lineToRelative(dx = 2.45f, dy = -2.45f)
                arcToRelative(a = 0.67f, b = 0.67f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.91f, dy1 = 0.0f)
                arcToRelative(a = 0.66f, b = 0.66f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = 0.92f)
            }
        }.build().also { _cardPos = it }
    }

@Suppress("ObjectPropertyName")
private var _cardPos: ImageVector? = null
