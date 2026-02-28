package com.github.yohannestz.iconsax_compose.iconsax.broken

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Spotify: ImageVector
    get() {
        val current = _spotify
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Spotify",
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
                moveTo(x = 6.57f, y = 9.33f)
                arcToRelative(a = 11.5f, b = 11.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 10.92f, dy1 = 1.34f)
                moveToRelative(dx = -9.55f, dy = 1.7f)
                arcToRelative(a = 8.4f, b = 8.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 7.97f, dy1 = 0.99f)
                moveTo(x = 8.83f, y = 15.4f)
                arcToRelative(a = 6.3f, b = 6.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 5.98f, dy1 = 0.73f)
            }
            path(
                stroke = SolidColor(Color(0xFF17191C)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 4.0f, y = 6.0f)
                arcToRelative(a = 10.0f, b = 10.0f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = 3.97f, dy1 = -3.15f)
            }
        }.build().also { _spotify = it }
    }

@Suppress("ObjectPropertyName")
private var _spotify: ImageVector? = null
