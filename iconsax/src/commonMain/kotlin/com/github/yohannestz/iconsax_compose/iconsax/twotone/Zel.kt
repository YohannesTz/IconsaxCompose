package com.github.yohannestz.iconsax_compose.iconsax.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Zel: ImageVector
    get() {
        val current = _zel
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Zel",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 0.4f,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 10.5f, y = 11.46f)
                verticalLineToRelative(dy = 2.85f)
                lineTo(x = 8.0f, y = 15.75f)
                lineToRelative(dx = -2.5f, dy = -1.44f)
                verticalLineToRelative(dy = -2.85f)
                lineTo(x = 8.0f, y = 10.02f)
                lineToRelative(dx = 1.25f, dy = 0.72f)
                close()
                moveToRelative(dx = 8.0f, dy = 0.0f)
                verticalLineToRelative(dy = 2.85f)
                lineTo(x = 16.0f, y = 15.75f)
                lineToRelative(dx = -2.5f, dy = -1.44f)
                verticalLineToRelative(dy = -2.85f)
                lineToRelative(dx = 1.25f, dy = -0.72f)
                lineTo(x = 16.0f, y = 10.02f)
                close()
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 0.4f,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 14.75f, y = 9.33f)
                verticalLineToRelative(dy = 1.41f)
                lineToRelative(dx = -1.25f, dy = 0.72f)
                verticalLineToRelative(dy = 1.73f)
                lineTo(x = 12.0f, y = 14.05f)
                lineToRelative(dx = -1.5f, dy = -0.86f)
                verticalLineToRelative(dy = -1.73f)
                lineToRelative(dx = -1.25f, dy = -0.72f)
                verticalLineTo(y = 9.33f)
                lineTo(x = 12.0f, y = 7.75f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 12.0f, y = 22.0f)
                arcToRelative(a = 10.0f, b = 10.0f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = 0.0f, dy1 = -20.0f)
                arcToRelative(a = 10.0f, b = 10.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 20.0f)
                close()
            }
        }.build().also { _zel = it }
    }

@Suppress("ObjectPropertyName")
private var _zel: ImageVector? = null
