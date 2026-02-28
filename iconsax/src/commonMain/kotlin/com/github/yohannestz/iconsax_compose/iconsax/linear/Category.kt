package com.github.yohannestz.iconsax_compose.iconsax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Category: ImageVector
    get() {
        val current = _category
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Category",
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
                moveTo(x = 5.0f, y = 10.0f)
                horizontalLineToRelative(dx = 2.0f)
                quadToRelative(dx1 = 3.0f, dy1 = 0.0f, dx2 = 3.0f, dy2 = -3.0f)
                verticalLineTo(y = 5.0f)
                quadToRelative(dx1 = 0.0f, dy1 = -3.0f, dx2 = -3.0f, dy2 = -3.0f)
                horizontalLineTo(x = 5.0f)
                quadTo(x1 = 2.0f, y1 = 2.0f, x2 = 2.0f, y2 = 5.0f)
                verticalLineToRelative(dy = 2.0f)
                quadToRelative(dx1 = 0.0f, dy1 = 3.0f, dx2 = 3.0f, dy2 = 3.0f)
                moveToRelative(dx = 12.0f, dy = 0.0f)
                horizontalLineToRelative(dx = 2.0f)
                quadToRelative(dx1 = 3.0f, dy1 = 0.0f, dx2 = 3.0f, dy2 = -3.0f)
                verticalLineTo(y = 5.0f)
                quadToRelative(dx1 = 0.0f, dy1 = -3.0f, dx2 = -3.0f, dy2 = -3.0f)
                horizontalLineToRelative(dx = -2.0f)
                quadToRelative(dx1 = -3.0f, dy1 = 0.0f, dx2 = -3.0f, dy2 = 3.0f)
                verticalLineToRelative(dy = 2.0f)
                quadToRelative(dx1 = 0.0f, dy1 = 3.0f, dx2 = 3.0f, dy2 = 3.0f)
                moveToRelative(dx = 0.0f, dy = 12.0f)
                horizontalLineToRelative(dx = 2.0f)
                quadToRelative(dx1 = 3.0f, dy1 = 0.0f, dx2 = 3.0f, dy2 = -3.0f)
                verticalLineToRelative(dy = -2.0f)
                quadToRelative(dx1 = 0.0f, dy1 = -3.0f, dx2 = -3.0f, dy2 = -3.0f)
                horizontalLineToRelative(dx = -2.0f)
                quadToRelative(dx1 = -3.0f, dy1 = 0.0f, dx2 = -3.0f, dy2 = 3.0f)
                verticalLineToRelative(dy = 2.0f)
                quadToRelative(dx1 = 0.0f, dy1 = 3.0f, dx2 = 3.0f, dy2 = 3.0f)
                moveTo(x = 5.0f, y = 22.0f)
                horizontalLineToRelative(dx = 2.0f)
                quadToRelative(dx1 = 3.0f, dy1 = 0.0f, dx2 = 3.0f, dy2 = -3.0f)
                verticalLineToRelative(dy = -2.0f)
                quadToRelative(dx1 = 0.0f, dy1 = -3.0f, dx2 = -3.0f, dy2 = -3.0f)
                horizontalLineTo(x = 5.0f)
                quadToRelative(dx1 = -3.0f, dy1 = 0.0f, dx2 = -3.0f, dy2 = 3.0f)
                verticalLineToRelative(dy = 2.0f)
                quadToRelative(dx1 = 0.0f, dy1 = 3.0f, dx2 = 3.0f, dy2 = 3.0f)
            }
        }.build().also { _category = it }
    }

@Suppress("ObjectPropertyName")
private var _category: ImageVector? = null
