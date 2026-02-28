package com.github.yohannestz.iconsax_compose.iconsax.broken

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val VoiceCricle: ImageVector
    get() {
        val current = _voiceCricle
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.VoiceCricle",
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
                moveTo(x = 6.0f, y = 9.86f)
                verticalLineToRelative(dy = 4.29f)
                moveToRelative(dx = 3.0f, dy = -5.72f)
                verticalLineToRelative(dy = 7.14f)
                moveToRelative(dx = 3.0f, dy = -0.58f)
                verticalLineToRelative(dy = 2.0f)
                moveTo(x = 12.0f, y = 7.0f)
                verticalLineToRelative(dy = 4.95f)
                moveToRelative(dx = 3.0f, dy = -3.52f)
                verticalLineToRelative(dy = 7.14f)
                moveToRelative(dx = 3.0f, dy = -5.71f)
                verticalLineToRelative(dy = 4.29f)
                moveTo(x = 4.0f, y = 6.0f)
                arcToRelative(a = 10.0f, b = 10.0f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = 3.97f, dy1 = -3.15f)
            }
        }.build().also { _voiceCricle = it }
    }

@Suppress("ObjectPropertyName")
private var _voiceCricle: ImageVector? = null
