package com.github.yohannestz.iconsax_compose.iconsax.broken

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Task: ImageVector
    get() {
        val current = _task
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Task",
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
                moveTo(x = 11.0f, y = 19.5f)
                horizontalLineToRelative(dx = 10.0f)
                moveToRelative(dx = -1.0f, dy = -7.0f)
                horizontalLineToRelative(dx = 1.0f)
                moveToRelative(dx = -10.0f, dy = 0.0f)
                horizontalLineToRelative(dx = 5.49f)
                moveTo(x = 11.0f, y = 5.5f)
                horizontalLineToRelative(dx = 10.0f)
                moveToRelative(dx = -18.0f, dy = 0.0f)
                lineToRelative(dx = 1.0f, dy = 1.0f)
                lineToRelative(dx = 3.0f, dy = -3.0f)
                moveToRelative(dx = -4.0f, dy = 9.0f)
                lineToRelative(dx = 1.0f, dy = 1.0f)
                lineToRelative(dx = 3.0f, dy = -3.0f)
                moveToRelative(dx = -4.0f, dy = 9.0f)
                lineToRelative(dx = 1.0f, dy = 1.0f)
                lineToRelative(dx = 3.0f, dy = -3.0f)
            }
        }.build().also { _task = it }
    }

@Suppress("ObjectPropertyName")
private var _task: ImageVector? = null
