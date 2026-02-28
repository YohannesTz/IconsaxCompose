package com.github.yohannestz.iconsax_compose.iconsax.bulk

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
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
                fill = SolidColor(Color(0xFF292D32)),
                fillAlpha = 0.4f,
                strokeAlpha = 0.4f,
            ) {
                moveTo(x = 19.26f, y = 2.87f)
                lineTo(x = 14.84f, y = 1.4f)
                arcToRelative(a = 2.8f, b = 2.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -2.53f, dy1 = 0.3f)
                arcToRelative(a = 2.8f, b = 2.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.08f, dy1 = 2.31f)
                verticalLineToRelative(dy = 3.77f)
                lineToRelative(dx = 6.88f, dy = 2.29f)
                arcToRelative(a = 3.0f, b = 3.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.02f, dy1 = 0.17f)
                arcToRelative(a = 2.6f, b = 2.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.51f, dy1 = -0.47f)
                arcToRelative(a = 2.8f, b = 2.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.08f, dy1 = -2.31f)
                verticalLineTo(y = 6.28f)
                curveToRelative(dx1 = 0.0f, dy1 = -1.43f, dx2 = -1.1f, dy2 = -2.96f, dx3 = -2.46f, dy3 = -3.41f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 12.72f, y = 8.27f)
                verticalLineTo(y = 18.0f)
                arcToRelative(a = 4.75f, b = 4.75f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = true, dx1 = -1.5f, dy1 = -3.45f)
                verticalLineTo(y = 7.77f)
                close()
            }
        }.build().also { _musicnote = it }
    }

@Suppress("ObjectPropertyName")
private var _musicnote: ImageVector? = null
