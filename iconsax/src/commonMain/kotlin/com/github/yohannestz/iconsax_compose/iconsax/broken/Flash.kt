package com.github.yohannestz.iconsax_compose.iconsax.broken

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Flash: ImageVector
    get() {
        val current = _flash
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Flash",
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
                moveTo(x = 14.82f, y = 7.02f)
                verticalLineToRelative(dy = -3.5f)
                curveToRelative(dx1 = 0.0f, dy1 = -1.68f, dx2 = -0.91f, dy2 = -2.02f, dx3 = -2.02f, dy3 = -0.76f)
                lineToRelative(dx = -7.57f, dy = 8.6f)
                curveToRelative(dx1 = -0.93f, dy1 = 1.05f, dx2 = -0.54f, dy2 = 1.92f, dx3 = 0.87f, dy3 = 1.92f)
                horizontalLineToRelative(dx = 3.09f)
                verticalLineToRelative(dy = 7.2f)
                curveToRelative(dx1 = 0.0f, dy1 = 1.68f, dx2 = 0.91f, dy2 = 2.02f, dx3 = 2.02f, dy3 = 0.76f)
                lineToRelative(dx = 7.57f, dy = -8.6f)
                curveToRelative(dx1 = 0.93f, dy1 = -1.05f, dx2 = 0.54f, dy2 = -1.92f, dx3 = -0.87f, dy3 = -1.92f)
                horizontalLineToRelative(dx = -3.09f)
            }
        }.build().also { _flash = it }
    }

@Suppress("ObjectPropertyName")
private var _flash: ImageVector? = null
