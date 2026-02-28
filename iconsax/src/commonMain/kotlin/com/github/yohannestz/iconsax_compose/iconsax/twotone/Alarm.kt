package com.github.yohannestz.iconsax_compose.iconsax.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Alarm: ImageVector
    get() {
        val current = _alarm
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Alarm",
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
                moveTo(x = 2.0f, y = 22.0f)
                horizontalLineToRelative(dx = 20.0f)
                moveTo(x = 12.0f, y = 6.0f)
                arcToRelative(a = 9.0f, b = 9.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -9.0f, dy1 = 9.0f)
                verticalLineToRelative(dy = 7.0f)
                horizontalLineToRelative(dx = 18.0f)
                verticalLineToRelative(dy = -7.0f)
                arcToRelative(a = 9.0f, b = 9.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -9.0f, dy1 = -9.0f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 12.0f, y = 2.0f)
                verticalLineToRelative(dy = 1.0f)
                moveTo(x = 4.0f, y = 4.0f)
                lineToRelative(dx = 1.0f, dy = 1.0f)
                moveToRelative(dx = 15.0f, dy = -1.0f)
                lineToRelative(dx = -1.0f, dy = 1.0f)
            }
        }.build().also { _alarm = it }
    }

@Suppress("ObjectPropertyName")
private var _alarm: ImageVector? = null
