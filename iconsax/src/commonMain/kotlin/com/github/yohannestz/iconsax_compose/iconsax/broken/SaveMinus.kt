package com.github.yohannestz.iconsax_compose.iconsax.broken

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SaveMinus: ImageVector
    get() {
        val current = _saveMinus
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.SaveMinus",
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
                moveTo(x = 2.0f, y = 20.35f)
                curveToRelative(dx1 = 0.0f, dy1 = 1.45f, dx2 = 1.04f, dy2 = 2.06f, dx3 = 2.31f, dy3 = 1.36f)
                lineToRelative(dx = 3.93f, dy = -2.2f)
                arcToRelative(a = 1.8f, b = 1.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.52f, dy1 = 0.0f)
                lineToRelative(dx = 3.93f, dy = 2.2f)
                curveTo(x1 = 14.96f, y1 = 22.4f, x2 = 16.0f, y2 = 21.8f, x3 = 16.0f, y3 = 20.35f)
                verticalLineTo(y = 8.99f)
                curveToRelative(dx1 = 0.0f, dy1 = -1.71f, dx2 = -1.4f, dy2 = -3.11f, dx3 = -3.11f, dy3 = -3.11f)
                horizontalLineTo(x = 5.11f)
                arcTo(horizontalEllipseRadius = 3.1f, verticalEllipseRadius = 3.1f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 2.0f, y1 = 8.98f)
                verticalLineToRelative(dy = 6.53f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 22.0f, y = 5.11f)
                verticalLineToRelative(dy = 11.36f)
                curveToRelative(dx1 = 0.0f, dy1 = 1.45f, dx2 = -1.04f, dy2 = 2.06f, dx3 = -2.31f, dy3 = 1.36f)
                lineTo(x = 16.0f, y = 15.77f)
                verticalLineTo(y = 8.99f)
                curveToRelative(dx1 = 0.0f, dy1 = -1.71f, dx2 = -1.4f, dy2 = -3.11f, dx3 = -3.11f, dy3 = -3.11f)
                horizontalLineTo(x = 8.0f)
                verticalLineTo(y = 5.11f)
                curveTo(x1 = 8.0f, y1 = 3.4f, x2 = 9.4f, y2 = 2.0f, x3 = 11.11f, y3 = 2.0f)
                horizontalLineToRelative(dx = 7.78f)
                curveTo(x1 = 20.6f, y1 = 2.0f, x2 = 22.0f, y2 = 3.4f, x3 = 22.0f, y3 = 5.11f)
                moveTo(x = 7.0f, y = 12.0f)
                horizontalLineToRelative(dx = 4.0f)
            }
        }.build().also { _saveMinus = it }
    }

@Suppress("ObjectPropertyName")
private var _saveMinus: ImageVector? = null
