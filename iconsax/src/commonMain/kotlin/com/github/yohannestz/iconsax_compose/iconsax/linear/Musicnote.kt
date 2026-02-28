package com.github.yohannestz.iconsax_compose.iconsax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Musicnote: ImageVector
    get() {
        val current = _musicnote
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Musicnote",
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
                moveTo(x = 7.97f, y = 22.0f)
                arcToRelative(a = 4.0f, b = 4.0f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = 0.0f, dy1 = -8.0f)
                arcToRelative(a = 4.0f, b = 4.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 8.0f)
                moveToRelative(dx = 4.0f, dy = -4.0f)
                verticalLineTo(y = 4.0f)
                moveToRelative(dx = 2.64f, dy = -1.89f)
                lineToRelative(dx = 4.42f, dy = 1.47f)
                arcToRelative(a = 3.0f, b = 3.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.95f, dy1 = 2.7f)
                verticalLineToRelative(dy = 1.17f)
                curveToRelative(dx1 = 0.0f, dy1 = 1.53f, dx2 = -1.18f, dy2 = 2.38f, dx3 = -2.63f, dy3 = 1.9f)
                lineToRelative(dx = -4.42f, dy = -1.47f)
                arcToRelative(a = 3.0f, b = 3.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.95f, dy1 = -2.7f)
                verticalLineTo(y = 4.0f)
                curveToRelative(dx1 = -0.01f, dy1 = -1.52f, dx2 = 1.18f, dy2 = -2.38f, dx3 = 2.63f, dy3 = -1.89f)
            }
        }.build().also { _musicnote = it }
    }

@Suppress("ObjectPropertyName")
private var _musicnote: ImageVector? = null
