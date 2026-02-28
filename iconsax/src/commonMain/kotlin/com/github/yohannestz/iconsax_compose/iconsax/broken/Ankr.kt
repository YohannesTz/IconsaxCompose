package com.github.yohannestz.iconsax_compose.iconsax.broken

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
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 8.99f, y = 3.5f)
                lineTo(x = 12.0f, y = 2.0f)
                lineToRelative(dx = 8.89f, dy = 4.44f)
                verticalLineToRelative(dy = 3.34f)
                moveToRelative(dx = -17.78f, dy = 0.0f)
                verticalLineTo(y = 6.44f)
                lineToRelative(dx = 1.84f, dy = -0.9f)
                moveToRelative(dx = -1.84f, dy = 8.68f)
                verticalLineToRelative(dy = 3.34f)
                lineTo(x = 12.0f, y = 22.0f)
                lineToRelative(dx = 8.89f, dy = -4.44f)
                verticalLineToRelative(dy = -3.34f)
                moveTo(x = 12.0f, y = 22.0f)
                verticalLineToRelative(dy = -5.56f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 12.0f, y = 16.44f)
                arcToRelative(a = 4.44f, b = 4.44f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = 0.0f, dy1 = -8.88f)
                arcToRelative(a = 4.44f, b = 4.44f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 8.88f)
                close()
            }
        }.build().also { _ankr = it }
    }

@Suppress("ObjectPropertyName")
private var _ankr: ImageVector? = null
