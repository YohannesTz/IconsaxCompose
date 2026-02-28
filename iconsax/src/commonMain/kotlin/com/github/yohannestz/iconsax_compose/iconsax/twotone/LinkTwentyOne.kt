package com.github.yohannestz.iconsax_compose.iconsax.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val LinkTwentyOne: ImageVector
    get() {
        val current = _linkTwentyOne
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.LinkTwentyOne",
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
                moveTo(x = 13.06f, y = 10.94f)
                arcToRelative(a = 5.74f, b = 5.74f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = 8.13f)
                arcToRelative(a = 5.75f, b = 5.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -8.13f, dy1 = -8.13f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 10.59f, y = 13.4f)
                arcToRelative(a = 6.01f, b = 6.01f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = true, dx1 = 8.49f, dy1 = 0.0f)
            }
        }.build().also { _linkTwentyOne = it }
    }

@Suppress("ObjectPropertyName")
private var _linkTwentyOne: ImageVector? = null
