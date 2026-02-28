package com.github.yohannestz.iconsax_compose.iconsax.broken

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Calendar: ImageVector
    get() {
        val current = _calendar
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Calendar",
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
                moveTo(x = 8.0f, y = 2.0f)
                verticalLineToRelative(dy = 3.0f)
                moveToRelative(dx = 8.0f, dy = -3.0f)
                verticalLineToRelative(dy = 3.0f)
                moveTo(x = 3.5f, y = 9.09f)
                horizontalLineToRelative(dx = 17.0f)
                moveTo(x = 3.0f, y = 13.01f)
                verticalLineTo(y = 8.5f)
                curveToRelative(dx1 = 0.0f, dy1 = -3.0f, dx2 = 1.5f, dy2 = -5.0f, dx3 = 5.0f, dy3 = -5.0f)
                horizontalLineToRelative(dx = 8.0f)
                curveToRelative(dx1 = 3.5f, dy1 = 0.0f, dx2 = 5.0f, dy2 = 2.0f, dx3 = 5.0f, dy3 = 5.0f)
                verticalLineTo(y = 17.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 3.0f, dx2 = -1.5f, dy2 = 5.0f, dx3 = -5.0f, dy3 = 5.0f)
                horizontalLineTo(x = 8.0f)
                curveToRelative(dx1 = -3.5f, dy1 = 0.0f, dx2 = -5.0f, dy2 = -2.0f, dx3 = -5.0f, dy3 = -5.0f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                moveTo(x = 15.7f, y = 13.7f)
                close()
                moveToRelative(dx = 0.0f, dy = 3.0f)
                close()
                moveToRelative(dx = -3.7f, dy = -3.0f)
                close()
                moveToRelative(dx = 0.0f, dy = 3.0f)
                close()
                moveToRelative(dx = -3.7f, dy = -3.0f)
                close()
                moveToRelative(dx = 0.0f, dy = 3.0f)
                close()
            }
        }.build().also { _calendar = it }
    }

@Suppress("ObjectPropertyName")
private var _calendar: ImageVector? = null
