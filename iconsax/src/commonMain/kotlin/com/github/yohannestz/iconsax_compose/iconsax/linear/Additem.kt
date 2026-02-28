package com.github.yohannestz.iconsax_compose.iconsax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Additem: ImageVector
    get() {
        val current = _additem
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Additem",
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
                moveTo(x = 8.0f, y = 16.0f)
                horizontalLineTo(x = 5.43f)
                quadTo(x1 = 2.0f, y1 = 16.0f, x2 = 2.0f, y2 = 12.57f)
                verticalLineTo(y = 5.43f)
                quadTo(x1 = 2.0f, y1 = 2.0f, x2 = 5.43f, y2 = 2.0f)
                horizontalLineTo(x = 10.0f)
                quadToRelative(dx1 = 3.43f, dy1 = 0.0f, dx2 = 3.43f, dy2 = 3.43f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 18.57f, y = 22.0f)
                horizontalLineTo(x = 14.0f)
                quadToRelative(dx1 = -3.43f, dy1 = 0.0f, dx2 = -3.43f, dy2 = -3.43f)
                verticalLineToRelative(dy = -7.14f)
                quadTo(x1 = 10.57f, y1 = 8.0f, x2 = 14.0f, y2 = 8.0f)
                horizontalLineToRelative(dx = 4.57f)
                quadTo(x1 = 22.0f, y1 = 8.0f, x2 = 22.0f, y2 = 11.43f)
                verticalLineToRelative(dy = 7.14f)
                quadTo(x1 = 22.0f, y1 = 22.0f, x2 = 18.57f, y2 = 22.0f)
                moveToRelative(dx = -3.7f, dy = -7.0f)
                horizontalLineToRelative(dx = 3.26f)
                moveToRelative(dx = -1.63f, dy = 1.63f)
                verticalLineToRelative(dy = -3.26f)
            }
        }.build().also { _additem = it }
    }

@Suppress("ObjectPropertyName")
private var _additem: ImageVector? = null
