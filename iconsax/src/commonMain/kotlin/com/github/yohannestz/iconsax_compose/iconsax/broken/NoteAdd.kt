package com.github.yohannestz.iconsax_compose.iconsax.broken

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val NoteAdd: ImageVector
    get() {
        val current = _noteAdd
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.NoteAdd",
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
                moveTo(x = 9.56f, y = 18.0f)
                verticalLineToRelative(dy = -5.0f)
                moveTo(x = 12.0f, y = 15.5f)
                horizontalLineTo(x = 7.0f)
                moveTo(x = 8.0f, y = 2.0f)
                verticalLineToRelative(dy = 3.0f)
                moveToRelative(dx = 8.0f, dy = -3.0f)
                verticalLineToRelative(dy = 3.0f)
                moveTo(x = 2.94f, y = 9.83f)
                curveToRelative(dx1 = -0.1f, dy1 = -4.7f, dx2 = 1.55f, dy2 = -6.0f, dx3 = 4.87f, dy3 = -6.25f)
                lineToRelative(dx = 8.0f, dy = -0.16f)
                curveToRelative(dx1 = 3.34f, dy1 = 0.12f, dx2 = 5.03f, dy2 = 1.35f, dx3 = 5.13f, dy3 = 6.05f)
                lineToRelative(dx = 0.13f, dy = 6.17f)
                curveToRelative(dx1 = 0.08f, dy1 = 4.12f, dx2 = -0.87f, dy2 = 6.2f, dx3 = -5.87f, dy3 = 6.3f)
                lineToRelative(dx = -6.0f, dy = 0.12f)
                curveToRelative(dx1 = -5.0f, dy1 = 0.1f, dx2 = -6.04f, dy2 = -1.94f, dx3 = -6.12f, dy3 = -6.05f)
                lineTo(x = 3.04f, y = 13.9f)
            }
        }.build().also { _noteAdd = it }
    }

@Suppress("ObjectPropertyName")
private var _noteAdd: ImageVector? = null
