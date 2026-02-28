package com.github.yohannestz.iconsax_compose.iconsax.linear

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
                stroke = SolidColor(Color(0xFF17191C)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 12.0f, y = 22.0f)
                arcToRelative(a = 10.0f, b = 10.0f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = 0.0f, dy1 = -20.0f)
                arcToRelative(a = 10.0f, b = 10.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 20.0f)
            }
            path(
                stroke = SolidColor(Color(0xFF17191C)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 6.6f, y = 9.3f)
                curveToRelative(dx1 = 3.6f, dy1 = -1.4f, dx2 = 7.7f, dy2 = -0.9f, dx3 = 10.9f, dy3 = 1.3f)
                moveToRelative(dx = -9.6f, dy = 1.8f)
                curveToRelative(dx1 = 2.7f, dy1 = -1.0f, dx2 = 5.7f, dy2 = -0.7f, dx3 = 8.0f, dy3 = 1.0f)
                moveToRelative(dx = -7.1f, dy = 2.0f)
                curveToRelative(dx1 = 2.0f, dy1 = -0.8f, dx2 = 4.2f, dy2 = -0.5f, dx3 = 6.0f, dy3 = 0.7f)
            }
        }.build().also { _spotify = it }
    }

@Suppress("ObjectPropertyName")
private var _spotify: ImageVector? = null
