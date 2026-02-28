package com.github.yohannestz.iconsax_compose.iconsax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Twitch: ImageVector
    get() {
        val current = _twitch
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Twitch",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF17191C)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 4.5f, y = 2.0f)
                horizontalLineToRelative(dx = 17.0f)
                verticalLineToRelative(dy = 12.0f)
                lineToRelative(dx = -5.0f, dy = 5.0f)
                horizontalLineToRelative(dx = -5.0f)
                lineToRelative(dx = -2.0f, dy = 3.0f)
                horizontalLineToRelative(dx = -3.0f)
                verticalLineToRelative(dy = -3.0f)
                horizontalLineToRelative(dx = -4.0f)
                verticalLineTo(y = 5.0f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF17191C)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 11.0f, y = 7.0f)
                horizontalLineTo(x = 9.0f)
                verticalLineToRelative(dy = 6.0f)
                horizontalLineToRelative(dx = 2.0f)
                close()
                moveToRelative(dx = 5.0f, dy = 0.0f)
                horizontalLineToRelative(dx = -2.0f)
                verticalLineToRelative(dy = 6.0f)
                horizontalLineToRelative(dx = 2.0f)
                close()
            }
        }.build().also { _twitch = it }
    }

@Suppress("ObjectPropertyName")
private var _twitch: ImageVector? = null
