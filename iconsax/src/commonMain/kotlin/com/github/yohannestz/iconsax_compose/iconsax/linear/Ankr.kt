package com.github.yohannestz.iconsax_compose.iconsax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Ankr: ImageVector
    get() {
        val current = _ankr
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Ankr",
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
                moveTo(x = 3.1f, y = 9.8f)
                verticalLineTo(y = 6.4f)
                lineTo(x = 12.0f, y = 2.0f)
                lineToRelative(dx = 8.9f, dy = 4.4f)
                verticalLineToRelative(dy = 3.4f)
                moveTo(x = 3.1f, y = 14.2f)
                verticalLineToRelative(dy = 3.4f)
                lineTo(x = 12.0f, y = 22.0f)
                lineToRelative(dx = 8.9f, dy = -4.4f)
                verticalLineToRelative(dy = -3.4f)
                moveTo(x = 12.0f, y = 22.0f)
                verticalLineToRelative(dy = -5.6f)
            }
            path(
                stroke = SolidColor(Color(0xFF17191C)),
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 12.0f, y = 16.4f)
                arcToRelative(a = 4.4f, b = 4.4f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = 0.0f, dy1 = -8.8f)
                arcToRelative(a = 4.4f, b = 4.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 8.8f)
                close()
            }
        }.build().also { _ankr = it }
    }

@Suppress("ObjectPropertyName")
private var _ankr: ImageVector? = null
