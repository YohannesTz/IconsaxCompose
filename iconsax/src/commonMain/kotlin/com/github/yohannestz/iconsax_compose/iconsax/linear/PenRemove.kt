package com.github.yohannestz.iconsax_compose.iconsax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val PenRemove: ImageVector
    get() {
        val current = _penRemove
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.PenRemove",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 21.19f, y = 8.04f)
                lineToRelative(dx = -3.18f, dy = -3.18f)
                curveToRelative(dx1 = -1.2f, dy1 = -1.2f, dx2 = -2.85f, dy2 = -1.14f, dx3 = -3.66f, dy3 = 0.15f)
                lineToRelative(dx = -1.77f, dy = 2.8f)
                lineToRelative(dx = 5.67f, dy = 5.67f)
                lineToRelative(dx = 2.8f, dy = -1.77f)
                curveToRelative(dx1 = 1.21f, dy1 = -0.77f, dx2 = 1.28f, dy2 = -2.54f, dx3 = 0.14f, dy3 = -3.67f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 18.25f, y = 13.47f)
                lineToRelative(dx = 0.24f, dy = 4.12f)
                curveToRelative(dx1 = 0.23f, dy1 = 2.3f, dx2 = -0.57f, dy2 = 3.1f, dx3 = -2.75f, dy3 = 3.36f)
                lineToRelative(dx = -8.72f, dy = 1.03f)
                curveToRelative(dx1 = -1.84f, dy1 = 0.21f, dx2 = -3.16f, dy2 = -1.11f, dx3 = -2.94f, dy3 = -2.94f)
                lineToRelative(dx = 0.98f, dy = -8.28f)
                moveToRelative(dx = 7.52f, dy = -2.95f)
                lineTo(x = 10.83f, y = 7.7f)
                moveTo(x = 5.28f, y = 20.78f)
                lineToRelative(dx = 3.18f, dy = -3.19f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 11.0f, y = 6.5f)
                arcToRelative(a = 4.0f, b = 4.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.17f, dy1 = 1.2f)
                arcToRelative(a = 4.5f, b = 4.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.37f, dy1 = 2.18f)
                arcToRelative(a = 4.4f, b = 4.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -4.4f, dy1 = 0.88f)
                arcToRelative(a = 4.5f, b = 4.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -2.41f, dy1 = -1.94f)
                arcTo(horizontalEllipseRadius = 4.5f, verticalEllipseRadius = 4.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 2.0f, y1 = 6.5f)
                arcToRelative(a = 4.5f, b = 4.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.69f, dy1 = -3.51f)
                arcTo(horizontalEllipseRadius = 4.5f, verticalEllipseRadius = 4.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 11.0f, y1 = 6.5f)
                moveToRelative(dx = -2.84f, dy = 0.0f)
                horizontalLineTo(x = 4.8f)
            }
        }.build().also { _penRemove = it }
    }

@Suppress("ObjectPropertyName")
private var _penRemove: ImageVector? = null
