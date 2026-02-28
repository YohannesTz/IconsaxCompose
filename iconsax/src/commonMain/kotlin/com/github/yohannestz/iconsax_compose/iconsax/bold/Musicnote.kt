package com.github.yohannestz.iconsax_compose.iconsax.bold

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
            ) {
                moveTo(x = 21.72f, y = 6.28f)
                verticalLineToRelative(dy = 1.17f)
                arcToRelative(a = 2.8f, b = 2.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.08f, dy1 = 2.3f)
                arcToRelative(a = 2.5f, b = 2.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.51f, dy1 = 0.48f)
                arcToRelative(a = 3.0f, b = 3.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.03f, dy1 = -0.17f)
                lineToRelative(dx = -5.38f, dy = -1.8f)
                verticalLineTo(y = 18.0f)
                arcToRelative(a = 4.75f, b = 4.75f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = true, dx1 = -1.5f, dy1 = -3.45f)
                verticalLineTo(y = 4.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.97f, dx2 = 0.4f, dy2 = -1.81f, dx3 = 1.09f, dy3 = -2.31f)
                arcToRelative(a = 2.8f, b = 2.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 2.53f, dy1 = -0.3f)
                lineToRelative(dx = 4.42f, dy = 1.48f)
                arcToRelative(a = 3.8f, b = 3.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 2.46f, dy1 = 3.4f)
            }
        }.build().also { _musicnote = it }
    }

@Suppress("ObjectPropertyName")
private var _musicnote: ImageVector? = null
