package com.github.yohannestz.iconsax_compose.iconsax.linear

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
                stroke = SolidColor(Color(0xFF17191C)),
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 10.5f, y = 11.5f)
                verticalLineToRelative(dy = 2.8f)
                lineTo(x = 8.0f, y = 15.8f)
                lineToRelative(dx = -2.5f, dy = -1.5f)
                verticalLineToRelative(dy = -2.8f)
                lineTo(x = 8.0f, y = 10.0f)
                lineToRelative(dx = 1.2f, dy = 0.7f)
                close()
                moveToRelative(dx = 8.0f, dy = 0.0f)
                verticalLineToRelative(dy = 2.8f)
                lineTo(x = 16.0f, y = 15.8f)
                lineToRelative(dx = -2.5f, dy = -1.5f)
                verticalLineToRelative(dy = -2.8f)
                lineToRelative(dx = 1.3f, dy = -0.8f)
                lineTo(x = 16.0f, y = 10.0f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF17191C)),
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 14.8f, y = 9.3f)
                verticalLineToRelative(dy = 1.4f)
                lineToRelative(dx = -1.3f, dy = 0.8f)
                verticalLineToRelative(dy = 1.7f)
                lineTo(x = 12.0f, y = 14.1f)
                lineToRelative(dx = -1.5f, dy = -0.9f)
                verticalLineToRelative(dy = -1.7f)
                lineToRelative(dx = -1.3f, dy = -0.8f)
                verticalLineTo(y = 9.3f)
                lineTo(x = 12.0f, y = 7.8f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF17191C)),
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
