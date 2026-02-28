package com.github.yohannestz.iconsax_compose.iconsax.broken

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Kanban: ImageVector
    get() {
        val current = _kanban
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Kanban",
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
                moveTo(x = 8.27f, y = 22.0f)
                curveToRelative(dx1 = 1.59f, dy1 = 0.0f, dx2 = 2.23f, dy2 = -0.6f, dx3 = 2.23f, dy3 = -2.1f)
                verticalLineTo(y = 4.1f)
                curveTo(x1 = 10.5f, y1 = 2.6f, x2 = 9.86f, y2 = 2.0f, x3 = 8.27f, y3 = 2.0f)
                horizontalLineTo(x = 4.23f)
                curveTo(x1 = 2.64f, y1 = 2.0f, x2 = 2.0f, y2 = 2.6f, x3 = 2.0f, y3 = 4.1f)
                verticalLineToRelative(dy = 15.8f)
                curveTo(x1 = 2.0f, y1 = 21.4f, x2 = 2.64f, y2 = 22.0f, x3 = 4.23f, y3 = 22.0f)
                moveToRelative(dx = 11.5f, dy = -20.0f)
                curveToRelative(dx1 = -1.59f, dy1 = 0.0f, dx2 = -2.23f, dy2 = 0.6f, dx3 = -2.23f, dy3 = 2.1f)
                verticalLineToRelative(dy = 8.8f)
                curveToRelative(dx1 = 0.0f, dy1 = 1.5f, dx2 = 0.64f, dy2 = 2.1f, dx3 = 2.23f, dy3 = 2.1f)
                horizontalLineToRelative(dx = 4.04f)
                curveToRelative(dx1 = 1.59f, dy1 = 0.0f, dx2 = 2.23f, dy2 = -0.6f, dx3 = 2.23f, dy3 = -2.1f)
                verticalLineTo(y = 4.1f)
                curveTo(x1 = 22.0f, y1 = 2.6f, x2 = 21.36f, y2 = 2.0f, x3 = 19.77f, y3 = 2.0f)
            }
        }.build().also { _kanban = it }
    }

@Suppress("ObjectPropertyName")
private var _kanban: ImageVector? = null
