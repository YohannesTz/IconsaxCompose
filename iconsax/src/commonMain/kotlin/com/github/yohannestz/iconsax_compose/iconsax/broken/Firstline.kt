package com.github.yohannestz.iconsax_compose.iconsax.broken

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Firstline: ImageVector
    get() {
        val current = _firstline
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Firstline",
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
                moveTo(x = 14.0f, y = 4.5f)
                horizontalLineToRelative(dx = 7.0f)
                moveToRelative(dx = -7.0f, dy = 5.0f)
                horizontalLineToRelative(dx = 7.0f)
                moveToRelative(dx = -18.0f, dy = 5.0f)
                horizontalLineToRelative(dx = 18.0f)
                moveTo(x = 9.5f, y = 8.43f)
                verticalLineTo(y = 5.57f)
                curveTo(x1 = 9.5f, y1 = 4.45f, x2 = 9.05f, y2 = 4.0f, x3 = 7.92f, y3 = 4.0f)
                horizontalLineTo(x = 5.07f)
                curveTo(x1 = 3.95f, y1 = 4.0f, x2 = 3.5f, y2 = 4.45f, x3 = 3.5f, y3 = 5.57f)
                verticalLineToRelative(dy = 2.85f)
                curveTo(x1 = 3.5f, y1 = 9.55f, x2 = 3.95f, y2 = 10.0f, x3 = 5.07f, y3 = 10.0f)
                horizontalLineToRelative(dx = 2.85f)
                curveTo(x1 = 9.05f, y1 = 10.0f, x2 = 9.5f, y2 = 9.55f, x3 = 9.5f, y3 = 8.43f)
                moveToRelative(dx = 0.55f, dy = 11.07f)
                horizontalLineTo(x = 21.0f)
                moveToRelative(dx = -18.0f, dy = 0.0f)
                horizontalLineToRelative(dx = 2.98f)
            }
        }.build().also { _firstline = it }
    }

@Suppress("ObjectPropertyName")
private var _firstline: ImageVector? = null
