package com.github.yohannestz.iconsax_compose.iconsax.broken

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Note: ImageVector
    get() {
        val current = _note
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Note",
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
                moveToRelative(dx = -9.0f, dy = 8.0f)
                horizontalLineToRelative(dx = 8.0f)
                moveToRelative(dx = -8.0f, dy = 4.0f)
                horizontalLineToRelative(dx = 5.0f)
                moveTo(x = 3.0f, y = 9.65f)
                curveToRelative(dx1 = 0.0f, dy1 = -4.7f, dx2 = 1.67f, dy2 = -5.96f, dx3 = 5.0f, dy3 = -6.15f)
                horizontalLineToRelative(dx = 8.0f)
                curveToRelative(dx1 = 3.33f, dy1 = 0.18f, dx2 = 5.0f, dy2 = 1.45f, dx3 = 5.0f, dy3 = 6.15f)
                verticalLineToRelative(dy = 6.18f)
                curveToRelative(dx1 = 0.0f, dy1 = 4.12f, dx2 = -1.0f, dy2 = 6.18f, dx3 = -6.0f, dy3 = 6.18f)
                horizontalLineTo(x = 9.0f)
                curveToRelative(dx1 = -5.0f, dy1 = 0.0f, dx2 = -6.0f, dy2 = -2.06f, dx3 = -6.0f, dy3 = -6.18f)
                verticalLineToRelative(dy = -2.02f)
            }
        }.build().also { _note = it }
    }

@Suppress("ObjectPropertyName")
private var _note: ImageVector? = null
