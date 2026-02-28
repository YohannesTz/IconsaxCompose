package com.github.yohannestz.iconsax_compose.iconsax.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Crop: ImageVector
    get() {
        val current = _crop
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Crop",
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
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 9.9f, y = 19.0f)
                horizontalLineTo(x = 19.0f)
                verticalLineTo(y = 9.9f)
                curveTo(x1 = 19.0f, y1 = 6.0f, x2 = 18.0f, y2 = 5.0f, x3 = 14.1f, y3 = 5.0f)
                horizontalLineTo(x = 5.0f)
                verticalLineToRelative(dy = 9.1f)
                curveTo(x1 = 5.0f, y1 = 18.0f, x2 = 6.0f, y2 = 19.0f, x3 = 9.9f, y3 = 19.0f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 5.0f, y = 5.0f)
                verticalLineTo(y = 2.0f)
                moveToRelative(dx = 0.0f, dy = 3.0f)
                horizontalLineTo(x = 2.0f)
                moveToRelative(dx = 17.0f, dy = 14.0f)
                verticalLineToRelative(dy = 3.0f)
                moveToRelative(dx = 0.0f, dy = -3.0f)
                horizontalLineToRelative(dx = 3.0f)
            }
        }.build().also { _crop = it }
    }

@Suppress("ObjectPropertyName")
private var _crop: ImageVector? = null
