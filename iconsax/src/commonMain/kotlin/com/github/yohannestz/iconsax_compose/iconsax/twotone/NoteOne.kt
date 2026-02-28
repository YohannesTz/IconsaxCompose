package com.github.yohannestz.iconsax_compose.iconsax.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val NoteOne: ImageVector
    get() {
        val current = _noteOne
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.NoteOne",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 8.0f, y = 2.0f)
                verticalLineToRelative(dy = 3.0f)
                moveToRelative(dx = 8.0f, dy = -3.0f)
                verticalLineToRelative(dy = 3.0f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 7.0f, y = 13.0f)
                horizontalLineToRelative(dx = 8.0f)
                moveToRelative(dx = -8.0f, dy = 4.0f)
                horizontalLineToRelative(dx = 5.0f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 16.0f, y = 3.5f)
                curveToRelative(dx1 = 3.33f, dy1 = 0.18f, dx2 = 5.0f, dy2 = 1.45f, dx3 = 5.0f, dy3 = 6.15f)
                verticalLineToRelative(dy = 6.18f)
                curveToRelative(dx1 = 0.0f, dy1 = 4.12f, dx2 = -1.0f, dy2 = 6.18f, dx3 = -6.0f, dy3 = 6.18f)
                horizontalLineTo(x = 9.0f)
                curveToRelative(dx1 = -5.0f, dy1 = 0.0f, dx2 = -6.0f, dy2 = -2.06f, dx3 = -6.0f, dy3 = -6.18f)
                verticalLineTo(y = 9.65f)
                curveToRelative(dx1 = 0.0f, dy1 = -4.7f, dx2 = 1.67f, dy2 = -5.96f, dx3 = 5.0f, dy3 = -6.15f)
                close()
            }
        }.build().also { _noteOne = it }
    }

@Suppress("ObjectPropertyName")
private var _noteOne: ImageVector? = null
