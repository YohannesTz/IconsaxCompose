package com.github.yohannestz.iconsax_compose.iconsax.broken

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gemini: ImageVector
    get() {
        val current = _gemini
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Gemini",
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
                moveTo(x = 2.0f, y = 2.0f)
                arcToRelative(a = 19.5f, b = 19.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 20.0f, dy1 = 0.0f)
                moveTo(x = 2.0f, y = 22.0f)
                arcToRelative(a = 19.5f, b = 19.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 20.0f, dy1 = 0.0f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 6.87f, y = 7.51f)
                arcToRelative(a = 17.7f, b = 17.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.53f, dy1 = 12.9f)
                moveToRelative(dx = 13.33f, dy = 0.0f)
                arcToRelative(a = 17.7f, b = 17.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.1f, dy1 = -16.6f)
                lineToRelative(dx = 0.13f, dy = -0.23f)
            }
        }.build().also { _gemini = it }
    }

@Suppress("ObjectPropertyName")
private var _gemini: ImageVector? = null
