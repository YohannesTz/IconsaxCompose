package com.github.yohannestz.iconsax_compose.iconsax.broken

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Man: ImageVector
    get() {
        val current = _man
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Man",
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
                moveTo(x = 4.27f, y = 18.68f)
                arcToRelative(a = 7.75f, b = 7.75f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = -1.77f, dy1 = -4.93f)
                moveToRelative(dx = 19.0f, dy = -11.25f)
                lineTo(x = 16.0f, y = 8.0f)
                moveToRelative(dx = -1.0f, dy = -5.5f)
                horizontalLineToRelative(dx = 6.5f)
                verticalLineTo(y = 9.0f)
            }
        }.build().also { _man = it }
    }

@Suppress("ObjectPropertyName")
private var _man: ImageVector? = null
