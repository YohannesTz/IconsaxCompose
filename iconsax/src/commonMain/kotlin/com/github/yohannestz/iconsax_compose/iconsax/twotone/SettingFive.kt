package com.github.yohannestz.iconsax_compose.iconsax.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SettingFive: ImageVector
    get() {
        val current = _settingFive
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.SettingFive",
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
                moveTo(x = 19.0f, y = 7.0f)
                verticalLineTo(y = 2.0f)
                moveToRelative(dx = -7.0f, dy = 20.0f)
                verticalLineToRelative(dy = -5.0f)
                moveTo(x = 5.0f, y = 7.0f)
                verticalLineTo(y = 2.0f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 5.0f, y = 22.0f)
                verticalLineTo(y = 11.0f)
                moveToRelative(dx = -2.0f, dy = 0.0f)
                horizontalLineToRelative(dx = 4.0f)
                moveToRelative(dx = 12.0f, dy = 11.0f)
                verticalLineTo(y = 11.0f)
                moveToRelative(dx = -2.0f, dy = 0.0f)
                horizontalLineToRelative(dx = 4.0f)
                moveToRelative(dx = -9.0f, dy = 2.0f)
                verticalLineTo(y = 2.0f)
                moveToRelative(dx = -2.0f, dy = 11.0f)
                horizontalLineToRelative(dx = 4.0f)
            }
        }.build().also { _settingFive = it }
    }

@Suppress("ObjectPropertyName")
private var _settingFive: ImageVector? = null
