package com.github.yohannestz.iconsax_compose.iconsax.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val NoteRemove: ImageVector
    get() {
        val current = _noteRemove
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.NoteRemove",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 7.0f, y = 14.0f)
                horizontalLineToRelative(dx = 5.0f)
                moveTo(x = 7.0f, y = 5.96f)
                lineTo(x = 3.25f, y = 2.21f)
                moveToRelative(dx = 3.71f, dy = 0.04f)
                lineTo(x = 3.21f, y = 6.0f)
                moveTo(x = 7.0f, y = 10.0f)
                horizontalLineToRelative(dx = 8.0f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 10.0f, y = 2.0f)
                horizontalLineToRelative(dx = 6.0f)
                curveToRelative(dx1 = 3.33f, dy1 = 0.18f, dx2 = 5.0f, dy2 = 1.41f, dx3 = 5.0f, dy3 = 5.99f)
                verticalLineTo(y = 16.0f)
                moveTo(x = 3.0f, y = 9.01f)
                verticalLineToRelative(dy = 6.97f)
                curveTo(x1 = 3.0f, y1 = 20.0f, x2 = 4.0f, y2 = 22.0f, x3 = 9.0f, y3 = 22.0f)
                horizontalLineToRelative(dx = 6.0f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 21.0f, y = 16.0f)
                lineToRelative(dx = -6.0f, dy = 6.0f)
                verticalLineToRelative(dy = -3.0f)
                quadToRelative(dx1 = 0.0f, dy1 = -3.0f, dx2 = 3.0f, dy2 = -3.0f)
                close()
            }
        }.build().also { _noteRemove = it }
    }

@Suppress("ObjectPropertyName")
private var _noteRemove: ImageVector? = null
