package com.github.yohannestz.iconsax_compose.iconsax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Video: ImageVector
    get() {
        val current = _video
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Video",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 21.15f, y = 6.17f)
                curveToRelative(dx1 = -0.41f, dy1 = -0.22f, dx2 = -1.27f, dy2 = -0.45f, dx3 = -2.44f, dy3 = 0.37f)
                lineToRelative(dx = -1.47f, dy = 1.04f)
                curveToRelative(dx1 = -0.11f, dy1 = -3.11f, dx2 = -1.46f, dy2 = -4.33f, dx3 = -4.74f, dy3 = -4.33f)
                horizontalLineToRelative(dx = -6.0f)
                curveTo(x1 = 3.08f, y1 = 3.25f, x2 = 1.75f, y2 = 4.58f, x3 = 1.75f, y3 = 8.0f)
                verticalLineToRelative(dy = 8.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 2.3f, dx2 = 1.25f, dy2 = 4.75f, dx3 = 4.75f, dy3 = 4.75f)
                horizontalLineToRelative(dx = 6.0f)
                curveToRelative(dx1 = 3.28f, dy1 = 0.0f, dx2 = 4.63f, dy2 = -1.22f, dx3 = 4.74f, dy3 = -4.33f)
                lineToRelative(dx = 1.47f, dy = 1.04f)
                arcToRelative(a = 2.8f, b = 2.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.59f, dy1 = 0.58f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.85f, dy1 = -0.21f)
                curveToRelative(dx1 = 0.41f, dy1 = -0.21f, dx2 = 1.1f, dy2 = -0.78f, dx3 = 1.1f, dy3 = -2.21f)
                verticalLineTo(y = 8.38f)
                curveToRelative(dx1 = 0.0f, dy1 = -1.43f, dx2 = -0.69f, dy2 = -2.0f, dx3 = -1.1f, dy3 = -2.21f)
                moveTo(x = 11.0f, y = 11.38f)
                arcToRelative(a = 1.88f, b = 1.88f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = -3.76f)
                arcToRelative(a = 1.88f, b = 1.88f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = 3.76f)
            }
        }.build().also { _video = it }
    }

@Suppress("ObjectPropertyName")
private var _video: ImageVector? = null
