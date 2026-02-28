package com.github.yohannestz.iconsax_compose.iconsax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Math: ImageVector
    get() {
        val current = _math
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Math",
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
                moveTo(x = 14.42f, y = 5.64f)
                horizontalLineToRelative(dx = 7.28f)
                moveToRelative(dx = -19.4f, dy = 0.0f)
                horizontalLineToRelative(dx = 7.28f)
                moveToRelative(dx = 4.84f, dy = 9.69f)
                horizontalLineToRelative(dx = 7.28f)
                moveToRelative(dx = -7.28f, dy = 6.06f)
                horizontalLineToRelative(dx = 7.28f)
                moveTo(x = 18.09f, y = 9.27f)
                verticalLineTo(y = 2.0f)
                moveTo(x = 2.3f, y = 22.0f)
                lineToRelative(dx = 7.28f, dy = -7.27f)
                moveToRelative(dx = 0.0f, dy = 7.27f)
                lineTo(x = 2.3f, y = 14.73f)
            }
        }.build().also { _math = it }
    }

@Suppress("ObjectPropertyName")
private var _math: ImageVector? = null
