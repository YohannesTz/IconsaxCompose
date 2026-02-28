package com.github.yohannestz.iconsax_compose.iconsax.broken

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val WatchStatus: ImageVector
    get() {
        val current = _watchStatus
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.WatchStatus",
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
                moveTo(x = 5.0f, y = 12.22f)
                verticalLineToRelative(dy = 3.28f)
                quadTo(x1 = 5.0f, y1 = 19.0f, x2 = 8.5f, y2 = 19.0f)
                horizontalLineToRelative(dx = 7.0f)
                quadToRelative(dx1 = 3.5f, dy1 = 0.0f, dx2 = 3.5f, dy2 = -3.5f)
                verticalLineToRelative(dy = -7.0f)
                quadTo(x1 = 19.0f, y1 = 5.0f, x2 = 15.5f, y2 = 5.0f)
                horizontalLineToRelative(dx = -7.0f)
                quadTo(x1 = 5.0f, y1 = 5.0f, x2 = 5.0f, y2 = 8.5f)
                moveTo(x = 12.0f, y = 2.0f)
                horizontalLineTo(x = 8.0f)
                moveToRelative(dx = 8.0f, dy = 0.0f)
                horizontalLineToRelative(dx = -1.0f)
                moveToRelative(dx = 1.0f, dy = 20.0f)
                horizontalLineTo(x = 8.0f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 12.0f, y = 14.0f)
                verticalLineToRelative(dy = -4.0f)
                moveToRelative(dx = 3.0f, dy = 4.0f)
                verticalLineToRelative(dy = -2.0f)
                moveToRelative(dx = -6.0f, dy = 2.0f)
                verticalLineToRelative(dy = -1.0f)
            }
        }.build().also { _watchStatus = it }
    }

@Suppress("ObjectPropertyName")
private var _watchStatus: ImageVector? = null
