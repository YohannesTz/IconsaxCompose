package com.github.yohannestz.iconsax_compose.iconsax.broken

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val NoteSquare: ImageVector
    get() {
        val current = _noteSquare
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.NoteSquare",
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
                moveTo(x = 2.0f, y = 13.01f)
                verticalLineToRelative(dy = 2.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 5.0f, dx2 = 2.0f, dy2 = 7.0f, dx3 = 7.0f, dy3 = 7.0f)
                horizontalLineToRelative(dx = 2.0f)
                moveTo(x = 22.0f, y = 10.0f)
                verticalLineTo(y = 9.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -5.0f, dx2 = -2.0f, dy2 = -7.0f, dx3 = -7.0f, dy3 = -7.0f)
                horizontalLineTo(x = 9.0f)
                curveTo(x1 = 4.0f, y1 = 2.0f, x2 = 2.0f, y2 = 4.0f, x3 = 2.0f, y3 = 9.0f)
                moveToRelative(dx = 13.51f, dy = 13.0f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = 0.0f, dy1 = -4.0f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 4.0f)
                moveToRelative(dx = 2.0f, dy = -2.0f)
                verticalLineToRelative(dy = -6.99f)
                moveToRelative(dx = 1.31f, dy = -0.94f)
                lineToRelative(dx = 2.21f, dy = 0.74f)
                arcTo(horizontalEllipseRadius = 1.5f, verticalEllipseRadius = 1.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 22.0f, y1 = 14.16f)
                verticalLineToRelative(dy = 0.6f)
                curveToRelative(dx1 = 0.0f, dy1 = 0.75f, dx2 = -0.59f, dy2 = 1.18f, dx3 = -1.3f, dy3 = 0.94f)
                lineToRelative(dx = -2.22f, dy = -0.74f)
                arcToRelative(a = 1.5f, b = 1.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.97f, dy1 = -1.35f)
                verticalLineToRelative(dy = -0.59f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.77f, dx2 = 0.6f, dy2 = -1.19f, dx3 = 1.31f, dy3 = -0.95f)
            }
        }.build().also { _noteSquare = it }
    }

@Suppress("ObjectPropertyName")
private var _noteSquare: ImageVector? = null
