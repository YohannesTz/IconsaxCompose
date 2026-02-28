package com.github.yohannestz.iconsax_compose.iconsax.broken

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val TriangleLogo: ImageVector
    get() {
        val current = _triangleLogo
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.TriangleLogo",
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
                moveTo(x = 10.9f, y = 2.0f)
                lineToRelative(dx = -10.0f, dy = 10.0f)
                lineToRelative(dx = 10.0f, dy = 10.0f)
                verticalLineToRelative(dy = -4.0f)
                lineToRelative(dx = -6.0f, dy = -6.0f)
                lineToRelative(dx = 6.0f, dy = -6.0f)
                close()
                moveToRelative(dx = 8.06f, dy = 6.06f)
                lineTo(x = 22.9f, y = 12.0f)
                lineToRelative(dx = -10.0f, dy = 10.0f)
                verticalLineToRelative(dy = -4.0f)
                lineToRelative(dx = 6.0f, dy = -6.0f)
                lineToRelative(dx = -6.0f, dy = -6.0f)
                verticalLineTo(y = 2.0f)
                lineToRelative(dx = 3.04f, dy = 3.04f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 10.9f, y = 9.0f)
                lineToRelative(dx = -3.0f, dy = 3.0f)
                lineToRelative(dx = 3.0f, dy = 3.0f)
                close()
            }
        }.build().also { _triangleLogo = it }
    }

@Suppress("ObjectPropertyName")
private var _triangleLogo: ImageVector? = null
