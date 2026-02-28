package com.github.yohannestz.iconsax_compose.iconsax.broken

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val WanchainOne: ImageVector
    get() {
        val current = _wanchainOne
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.WanchainOne",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 16.5f, y = 8.85f)
                lineTo(x = 12.0f, y = 6.15f)
                lineToRelative(dx = -4.5f, dy = 2.7f)
                moveToRelative(dx = 9.0f, dy = 2.34f)
                verticalLineTo(y = 9.0f)
                moveToRelative(dx = -9.0f, dy = 0.0f)
                verticalLineToRelative(dy = 6.15f)
                lineToRelative(dx = 4.5f, dy = -2.7f)
                lineToRelative(dx = 4.5f, dy = 2.7f)
                moveToRelative(dx = -2.25f, dy = 1.05f)
                lineTo(x = 12.0f, y = 17.7f)
                lineToRelative(dx = -2.25f, dy = -1.5f)
            }
            path(
                stroke = SolidColor(Color(0xFF17191C)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 4.0f, y = 6.0f)
                arcToRelative(a = 10.0f, b = 10.0f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = 3.97f, dy1 = -3.15f)
            }
        }.build().also { _wanchainOne = it }
    }

@Suppress("ObjectPropertyName")
private var _wanchainOne: ImageVector? = null
