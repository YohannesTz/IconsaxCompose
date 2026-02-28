package com.github.yohannestz.iconsax_compose.iconsax.broken

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
                moveTo(x = 2.3f, y = 5.64f)
                horizontalLineToRelative(dx = 7.28f)
                moveToRelative(dx = 4.84f, dy = 9.69f)
                horizontalLineToRelative(dx = 7.28f)
                moveToRelative(dx = -7.28f, dy = 6.06f)
                horizontalLineToRelative(dx = 7.28f)
                moveTo(x = 20.96f, y = 5.64f)
                horizontalLineToRelative(dx = 0.74f)
                moveToRelative(dx = -7.28f, dy = 0.0f)
                horizontalLineToRelative(dx = 3.27f)
                moveToRelative(dx = 0.4f, dy = 3.63f)
                verticalLineTo(y = 2.0f)
                moveTo(x = 9.58f, y = 14.73f)
                lineToRelative(dx = -1.43f, dy = 1.42f)
                moveTo(x = 2.3f, y = 22.0f)
                lineToRelative(dx = 3.51f, dy = -3.51f)
                moveTo(x = 9.58f, y = 22.0f)
                lineTo(x = 2.3f, y = 14.73f)
            }
        }.build().also { _math = it }
    }

@Suppress("ObjectPropertyName")
private var _math: ImageVector? = null
