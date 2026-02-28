package com.github.yohannestz.iconsax_compose.iconsax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MagicStar: ImageVector
    get() {
        val current = _magicStar
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.MagicStar",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 17.29f, y = 4.14f)
                lineToRelative(dx = -0.07f, dy = 3.79f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.74f, dy1 = 1.52f)
                lineToRelative(dx = 2.48f, dy = 1.88f)
                curveToRelative(dx1 = 1.59f, dy1 = 1.2f, dx2 = 1.33f, dy2 = 2.67f, dx3 = -0.57f, dy3 = 3.27f)
                lineToRelative(dx = -3.23f, dy = 1.01f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.25f, dy1 = 1.31f)
                lineToRelative(dx = -0.77f, dy = 2.94f)
                curveToRelative(dx1 = -0.61f, dy1 = 2.32f, dx2 = -2.13f, dy2 = 2.55f, dx3 = -3.39f, dy3 = 0.51f)
                lineToRelative(dx = -1.76f, dy = -2.85f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.68f, dy1 = -0.88f)
                lineToRelative(dx = -3.34f, dy = 0.17f)
                curveToRelative(dx1 = -2.39f, dy1 = 0.12f, dx2 = -3.07f, dy2 = -1.26f, dx3 = -1.51f, dy3 = -3.08f)
                lineToRelative(dx = 1.98f, dy = -2.3f)
                curveTo(x1 = 5.29f, y1 = 11.0f, x2 = 5.46f, y2 = 10.2f, x3 = 5.29f, y3 = 9.66f)
                lineTo(x = 4.27f, y = 6.42f)
                curveToRelative(dx1 = -0.59f, dy1 = -1.9f, dx2 = 0.47f, dy2 = -2.95f, dx3 = 2.36f, dy3 = -2.33f)
                lineToRelative(dx = 2.95f, dy = 0.97f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.67f, dy1 = -0.26f)
                lineToRelative(dx = 3.08f, dy = -2.22f)
                curveToRelative(dx1 = 1.67f, dy1 = -1.19f, dx2 = 3.0f, dy2 = -0.49f, dx3 = 2.96f, dy3 = 1.56f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 21.44f, y = 20.47f)
                lineToRelative(dx = -3.03f, dy = -3.03f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.06f, dy1 = 0.0f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 1.06f)
                lineToRelative(dx = 3.03f, dy = 3.03f)
                quadToRelative(dx1 = 0.23f, dy1 = 0.22f, dx2 = 0.53f, dy2 = 0.22f)
                curveToRelative(dx1 = 0.3f, dy1 = 0.0f, dx2 = 0.38f, dy2 = -0.07f, dx3 = 0.53f, dy3 = -0.22f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = -1.06f)
            }
        }.build().also { _magicStar = it }
    }

@Suppress("ObjectPropertyName")
private var _magicStar: ImageVector? = null
