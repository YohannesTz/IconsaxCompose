package com.github.yohannestz.iconsax_compose.iconsax.broken

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Trash: ImageVector
    get() {
        val current = _trash
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Trash",
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
                moveTo(x = 21.0f, y = 5.98f)
                arcToRelative(a = 102.0f, b = 102.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -10.02f, dy1 = -0.5f)
                quadToRelative(dx1 = -2.97f, dy1 = 0.0f, dx2 = -5.94f, dy2 = 0.3f)
                lineTo(x = 3.0f, y = 5.98f)
                moveToRelative(dx = 5.5f, dy = -1.01f)
                lineToRelative(dx = 0.22f, dy = -1.31f)
                curveTo(x1 = 8.88f, y1 = 2.71f, x2 = 9.0f, y2 = 2.0f, x3 = 10.69f, y3 = 2.0f)
                horizontalLineToRelative(dx = 2.62f)
                curveToRelative(dx1 = 1.69f, dy1 = 0.0f, dx2 = 1.82f, dy2 = 0.75f, dx3 = 1.97f, dy3 = 1.67f)
                lineToRelative(dx = 0.22f, dy = 1.3f)
                moveTo(x = 15.21f, y = 22.0f)
                horizontalLineTo(x = 8.79f)
                curveTo(x1 = 6.0f, y1 = 22.0f, x2 = 5.91f, y2 = 20.78f, x3 = 5.8f, y3 = 19.21f)
                lineTo(x = 5.15f, y = 9.14f)
                moveToRelative(dx = 13.7f, dy = 0.0f)
                lineTo(x = 18.2f, y = 19.21f)
                moveToRelative(dx = -7.87f, dy = -2.71f)
                horizontalLineToRelative(dx = 3.33f)
                moveToRelative(dx = -0.84f, dy = -4.0f)
                horizontalLineToRelative(dx = 1.68f)
                moveToRelative(dx = -5.0f, dy = 0.0f)
                horizontalLineToRelative(dx = 0.83f)
            }
        }.build().also { _trash = it }
    }

@Suppress("ObjectPropertyName")
private var _trash: ImageVector? = null
